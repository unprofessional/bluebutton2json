package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Procedure extends GenericComponent {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> targetSiteCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Specimen> specimen;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> entryRelationship;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> methodCode;

    public List<GenericCode> getTargetSiteCode() {
        return targetSiteCode;
    }

    public void setTargetSiteCode(List<GenericCode> targetSiteCode) {
        this.targetSiteCode = targetSiteCode;
    }

    public List<Specimen> getSpecimen() {
        return specimen;
    }

    public void setSpecimen(List<Specimen> specimen) {
        this.specimen = specimen;
    }

    public List<GenericSubComponent> getEntryRelationship() {
        return entryRelationship;
    }

    public void setEntryRelationship(List<GenericSubComponent> entryRelationship) {
        this.entryRelationship = entryRelationship;
    }

    public List<GenericCode> getMethodCode() {
        return methodCode;
    }

    public void setMethodCode(List<GenericCode> methodCode) {
        this.methodCode = methodCode;
    }

}