package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;
import com.leidos.bluebutton2json.models.interfaces.BaseName;

public class NameTextValue implements BaseName {

    @JacksonXmlText
    private String textValue;

    public String getTextValue() {
        return textValue;
    }

    public void setTextValue(String textValue) {
        this.textValue = textValue;
    }

}