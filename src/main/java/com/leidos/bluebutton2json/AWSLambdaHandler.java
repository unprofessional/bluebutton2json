/* Amplify Params - DO NOT EDIT
	ENV
	REGION
Amplify Params - DO NOT EDIT */

package com.leidos.bluebutton2json;

import java.net.URLDecoder;
import java.util.Arrays;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

public class AWSLambdaHandler implements RequestHandler<S3Event, Response> {

    private String bucketName = "UNKNOWN_DEFAULT_BUCKET_NAME";
    private String key = "UNKNOWN_DEFAULT_KEY";
    private String region = "UNKNOWN_DEFAULT_REGION"; // "us-east-1";

    private static final String[] WHITELIST = {
        "public/1/original/",
        "public/templates/",
    };

    @Override
    public Response handleRequest(S3Event s3Event, Context context) {

        LambdaLogger logger = context.getLogger();

        this.bucketName = s3Event.getRecords().get(0).getS3().getBucket().getName();
        this.key = s3Event.getRecords().get(0).getS3().getObject().getKey();
        this.region = System.getenv("AWS_REGION");//"us-east-1";

        logger.log("this.bucketName: " + this.bucketName);
        logger.log("this.key: " + this.key);
        logger.log("this.region: " + this.region);

        String[] pathParts = this.key.split("/");
        String fileName = pathParts[pathParts.length - 1];
        String path = "";
        for(int i = 0; i < pathParts.length - 1; i++) {
            path += pathParts[i] + "/";
        }

        logger.log("fileName: " + fileName);
        logger.log("path: " + path);

        AmazonS3 amazonS3Client = buildClient();
        Response awsResponse = new Response(true, "initial", this.bucketName, this.key, "na");

        String[] fileNameParts = fileName.split("\\.");
        String fileExtension = fileNameParts[fileNameParts.length - 1];
        logger.log("fileExtension: " + fileExtension);

        boolean hasXmlFileExtension = "xml".equals(fileExtension);
        boolean isWhitelisted = Arrays.stream(WHITELIST).anyMatch(path::equals);

        // ideal success scenario
        if(isWhitelisted && hasXmlFileExtension) {
            logger.log("path '" + path + "' is whitelisted, executing function...");
            try {
                String formattedKey = URLDecoder.decode(this.key.replace('+', ' '), "UTF-8");
                logger.log("formattedKey: " + formattedKey);

                String myS3FileString = amazonS3Client.getObjectAsString(bucketName, key);

                CDALoader cdaLoader = new CDALoader();
                String jsonResult = null;
                jsonResult = cdaLoader.getResource(myS3FileString, "jackson");

                awsResponse.setSuccess(true); // etc
                awsResponse.setMessage(jsonResult);

                putS3Object(s3Event, jsonResult, awsResponse);

                return awsResponse;
            } catch (Exception e) {
                System.err.println("Exception: " + e);
                awsResponse.setSuccess(false);
                awsResponse.setMessage("ERROR: " + e);
                return awsResponse;
            }

        }
        if(!isWhitelisted) {
            logger.log("path '" + path + "' does not exist in the whitelist, doing nothing...");
            awsResponse.setSuccess(false);
            awsResponse.setMessage("ERROR: Path '" + path + "' not accepted.");
            return awsResponse;
        }
        if(!hasXmlFileExtension) {
            logger.log("fileExtension '." + fileExtension + "' is not an accepted file type.");
            awsResponse.setSuccess(false);
            awsResponse.setMessage("ERROR: File extension '." + fileExtension + "' not accepted.");
            return awsResponse;
        }
        // default case:
        logger.log("Something went wrong...");
        awsResponse.setSuccess(false);
        awsResponse.setMessage("ERROR: Something went wrong");
        return awsResponse;

    }

    private AmazonS3 buildClient() {
        return AmazonS3ClientBuilder.standard()
            .withRegion(this.region)
            .withCredentials(DefaultAWSCredentialsProviderChain.getInstance())
            .build();
    }

    /**
	 * Method used to write an object to an S3Bucket
	 * @param req
	 * @param json
	 * @param res
	 */
	private void putS3Object(S3Event req, String json, Response res) {
		if (req.getRecords()!=null && !req.getRecords().isEmpty())
		{
			String bucketName = req.getRecords().get(0).getS3().getBucket().getName();
			String key = req.getRecords().get(0).getS3().getObject().getKey();

			//String outputKey = key.replace("cda.xml.orig","cda.json");
            //Form the output filename from the original file

			String inputFileName = key.split("/")[3];
			String outputFileName = inputFileName.split("\\.")[0] + ".json";
			String outputKey = key.replace(inputFileName, outputFileName);
            res.setOutputkey(outputKey);

            AmazonS3 s3Client = buildClient();
			s3Client.putObject(bucketName, outputKey, json);
        }
        // TODO: error checking if we have no record???
	}

}
