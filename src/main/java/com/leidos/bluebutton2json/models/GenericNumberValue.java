package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericNumberValue {

    @JacksonXmlProperty(isAttribute = true)
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}