package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Telecom {

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

    @JacksonXmlProperty(localName = "use", isAttribute = true)
    private String use;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

}
