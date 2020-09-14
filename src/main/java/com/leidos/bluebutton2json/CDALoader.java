package com.leidos.bluebutton2json;

import java.io.IOException;
import java.io.Writer;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactoryConfigurationError;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.leidos.bluebutton2json.models.ClinicalDocument;
import com.leidos.bluebutton2json.models.GenericId;
import com.leidos.bluebutton2json.utils.XMLDocumentTool;

import org.json.JSONObject;
import org.xml.sax.SAXException;

public class CDALoader {

    public String getResource(String cdaXml, String jsonLibOption) throws IOException, ParserConfigurationException,
            SAXException, TransformerFactoryConfigurationError, TransformerException {
            
        // BEGIN PARSING XML STRING AND REMOVE PROBLEMATIC SECTIONS
        Writer writer = XMLDocumentTool.getWriterForDocument(cdaXml);

        // BEGIN XML MAPPING
        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        SimpleModule module = new SimpleModule("configModule", com.fasterxml.jackson.core.Version.unknownVersion());
        xmlMapper.registerModule(module);
        String inputXml = writer.toString();
        ClinicalDocument testDoc = xmlMapper.readValue(inputXml, ClinicalDocument.class);

        // TODO: validate the ClinicalDocument
        boolean hasTemplateIds = null != testDoc.getTemplateId();
        List<GenericId> templateIds = testDoc.getTemplateId();

        boolean hasValidTemplateIds = true;
        if(hasTemplateIds) {
            for(GenericId templateId : templateIds) {
                if(templateId.getRoot() == "") {
                    hasValidTemplateIds = false;
                }
            }
        }

        String result = null;
        if(hasTemplateIds && hasValidTemplateIds) {
            // do something
            // BEGIN JSON MAPPING
            if("org.json".equals(jsonLibOption)) {
                // removes the null fields... but has properties out of order
                JSONObject testDocJSONObject = new JSONObject(testDoc);
                result = testDocJSONObject.toString(4);
            } else if("jackson".equals(jsonLibOption)) {
                // properties in order but yields null fields...
                // TODO: look into the jackson mapper future that omits null fields
                ObjectMapper jsonMapper = new ObjectMapper();
                jsonMapper.setSerializationInclusion(Include.NON_NULL);
                result = jsonMapper.writeValueAsString(testDoc);
            } else {
                JSONObject testDocJSONObject = new JSONObject(testDoc);
                result = testDocJSONObject.toString(4);
            }
        }
        else {
            // do nothing
            // TODO: return error JSON
            JSONObject errorObject = new JSONObject();
            errorObject.put("error", "NOT_VALID_CDA");
            errorObject.put("message", "ClinicalDocument has missing or invalid templateId!");
            result = errorObject.toString(4);
        }
        return result;
    }

}