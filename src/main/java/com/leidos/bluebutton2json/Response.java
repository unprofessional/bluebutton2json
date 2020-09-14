/* Amplify Params - DO NOT EDIT
	ENV
	REGION
Amplify Params - DO NOT EDIT */

package com.leidos.bluebutton2json;
        
public class Response {

	private boolean success;
	private String message;
	private String bucket;
	private String inputKey;
	private String outputkey;

	public Response() { }

	public Response(boolean success, String message, String bucket, String inputKey, String outputKey) {
		this.success = success;
		this.message = message;
		this.bucket = bucket;
		this.inputKey = inputKey;
		this.outputkey = outputKey;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getBucket() {
		return bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getInputKey() {
		return inputKey;
	}

	public void setInputKey(String inputKey) {
		this.inputKey = inputKey;
	}

	public String getOutputkey() {
		return outputkey;
	}

	public void setOutputkey(String outputkey) {
		this.outputkey = outputkey;
	}

}
