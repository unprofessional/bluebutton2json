package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class ObservationRange {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericValue> value;

    public List<GenericValue> getValue() {
        return value;
    }

    public void setValue(List<GenericValue> value) {
        this.value = value;
    }

}
