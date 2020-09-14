package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class QualifierSimple {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> name;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> value;

    public List<GenericCode> getName() {
        return name;
    }

    public void setName(List<GenericCode> name) {
        this.name = name;
    }

    public List<GenericCode> getValue() {
        return value;
    }

    public void setValue(List<GenericCode> value) {
        this.value = value;
    }

}