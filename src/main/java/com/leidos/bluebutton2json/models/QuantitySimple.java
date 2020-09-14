package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class QuantitySimple {

    @JacksonXmlProperty(isAttribute = true)
    private String value;

    @JacksonXmlProperty(isAttribute = true)
    private String unit;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

}
