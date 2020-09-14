package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ServiceEvent {

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    private TimeSimple effectiveTime;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Performer> performer;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public TimeSimple getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(TimeSimple effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public List<Performer> getPerformer() {
        return performer;
    }

    public void setPerformer(List<Performer> performer) {
        this.performer = performer;
    }

}
