package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Observation extends GenericComponent {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> entryRelationship;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> methodCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> targetSiteCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> interpretationCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ReferenceRange> referenceRange;

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

    public List<GenericCode> getTargetSiteCode() {
        return targetSiteCode;
    }

    public void setTargetSiteCode(List<GenericCode> targetSiteCode) {
        this.targetSiteCode = targetSiteCode;
    }

    public List<GenericCode> getInterpretationCode() {
        return interpretationCode;
    }

    public void setInterpretationCode(List<GenericCode> interpretationCode) {
        this.interpretationCode = interpretationCode;
    }

    public List<ReferenceRange> getReferenceRange() {
        return referenceRange;
    }

    public void setReferenceRange(List<ReferenceRange> referenceRange) {
        this.referenceRange = referenceRange;
    }

}