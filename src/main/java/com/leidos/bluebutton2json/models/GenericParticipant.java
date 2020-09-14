package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericParticipant {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    private TimeSimple time;

    private GenericParticipantRole participantRole;

    @JacksonXmlProperty(isAttribute = true)
    private String typeCode;
    
    private GenericAssignedEntity associatedEntity;

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

    public GenericParticipantRole getParticipantRole() {
        return participantRole;
    }

    public void setParticipantRole(GenericParticipantRole participantRole) {
        this.participantRole = participantRole;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public GenericAssignedEntity getAssociatedEntity() {
        return associatedEntity;
    }

    public void setAssociatedEntity(GenericAssignedEntity associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

}
