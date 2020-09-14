package com.leidos.bluebutton2json;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.leidos.bluebutton2json.models.ClinicalDocument;
import com.leidos.bluebutton2json.models.Family;
import com.leidos.bluebutton2json.models.Name;
import com.leidos.bluebutton2json.models.Patient;
import com.leidos.bluebutton2json.models.PatientRole;
import com.leidos.bluebutton2json.models.RecordTarget;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.xml.sax.SAXException;

public class CDALoaderTest extends CDALoader {

    @Test
    public void testGetResource() throws JSONException, IOException, ParserConfigurationException, SAXException,
            TransformerFactoryConfigurationError, TransformerException {

        String path = "test-c-cda-r2-1-ccd.xml";
        String parserOption = "jackson";

        String cdaXml = getResourceFileAsString(path);

        CDALoader cdaLoader = new CDALoader();
        String result = cdaLoader.getResource(cdaXml, parserOption);

        if ("jackson".equals(parserOption)) {
            ObjectMapper jsonMapper = new ObjectMapper();
            jsonMapper.setSerializationInclusion(Include.NON_NULL);
            try {
                ClinicalDocument clinicalDocument = jsonMapper.readValue(result, ClinicalDocument.class);
                String title = clinicalDocument.getTitle();
                List<RecordTarget> recordTargets = clinicalDocument.getRecordTarget();
                PatientRole patientRole = recordTargets.get(0).getPatientRole();
                Patient patient = patientRole.getPatient();
                List<Name> names = patient.getName();
                List<Family> familyNames = names.get(0).getFamily();
                String familyName = familyNames.get(0).getTextValue();

                assertEquals("Patient Chart Summary", title);
                assertEquals("Betterhalf", familyName);
            } catch (JsonProcessingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        else {
            JSONObject jsonObject = new JSONObject(result);

            // test with family name
            // recordTarget[0].patientRole.patient.name[0].family[0]
            String familyName = "";
            familyName = jsonObject
                .getJSONArray("recordTarget").getJSONObject(0)
                .getJSONObject("patientRole")
                .getJSONObject("patient")
                .getJSONArray("name").getJSONObject(0)
                .getJSONArray("family").getString(0);
                
            // NOTE: if the element is not a string, the test will fail anyway
            assertEquals("Betterhalf", familyName);
        }

    }

    /**
     * Reads given resource file as a string.
     *
     * @param fileName path to the resource file
     * @return the file's contents
     * @throws IOException if read fails for any reason
     */
    public static String getResourceFileAsString(String fileName) throws IOException {
        InputStream is = getResourceFileAsInputStream(fileName);
        String content;
        if (is != null) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            content = (String) reader.lines().collect(Collectors.joining(System.lineSeparator()));
            reader.close();
            return content;
        } else {
            return null;
        }
    }
    
    public static InputStream getResourceFileAsInputStream(String fileName) {
        ClassLoader classLoader =  new CDALoaderTest().getClass().getClassLoader();
        return classLoader.getResourceAsStream(fileName);
    }
}