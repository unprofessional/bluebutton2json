package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericReference {

    private SeperatableInd seperatableInd;

    private ExternalDocument externalDocument;

    @JacksonXmlProperty(isAttribute = true)
    private String typeCode;

    @JacksonXmlProperty(isAttribute = true)
    private String value;

    public SeperatableInd getSeperatableInd() {
        return seperatableInd;
    }

    public void setSeperatableInd(SeperatableInd seperatableInd) {
        this.seperatableInd = seperatableInd;
    }

    public ExternalDocument getExternalDocument() {
        return externalDocument;
    }

    public void setExternalDocument(ExternalDocument externalDocument) {
        this.externalDocument = externalDocument;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
