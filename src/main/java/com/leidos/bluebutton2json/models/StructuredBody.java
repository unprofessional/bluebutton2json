package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class StructuredBody {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ClinicalDocumentComponent> component;

    public List<ClinicalDocumentComponent> getComponent() {
        return component;
    }

    public void setComponent(List<ClinicalDocumentComponent> component) {
        this.component = component;
    }

}
