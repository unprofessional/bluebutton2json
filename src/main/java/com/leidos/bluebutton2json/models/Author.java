package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Author {

    @JacksonXmlProperty(isAttribute = true)
    private String typeCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    private TimeSimple time;

    private GenericAssignedEntity assignedAuthor;

    public List<GenericId> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<GenericId> templateId) {
        this.templateId = templateId;
    }

    public TimeSimple getTime() {
        return time;
    }

    public void setTime(TimeSimple time) {
        this.time = time;
    }

    public GenericAssignedEntity getAssignedAuthor() {
        return assignedAuthor;
    }

    public void setAssignedAuthor(GenericAssignedEntity assignedAuthor) {
        this.assignedAuthor = assignedAuthor;
    }

}
