package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

public class OriginalText {

    @JacksonXmlText
    private String textValue;

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

    // private GenericReference reference;

    // public GenericReference getReference() {
    //     return reference;
    // }

    // public void setReference(GenericReference reference) {
    //     this.reference = reference;
    // }

}