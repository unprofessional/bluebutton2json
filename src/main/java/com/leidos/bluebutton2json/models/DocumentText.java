package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class DocumentText {

    @JacksonXmlProperty(isAttribute = true)
    private String mediaType;

    private GenericReference reference;

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType;
    }

    public GenericReference getReference() {
        return reference;
    }

    public void setReference(GenericReference reference) {
        this.reference = reference;
    }

}
