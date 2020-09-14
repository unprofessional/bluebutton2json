package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericParticipantRole {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    private GenericCode code;

    private GenericPerson playingEntity;

    private GenericEntity playingDevice;

    private GenericEntity scopingEntity;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Addr> addr;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Telecom> telecom;

    private GenericAssignedEntity associatedEntity;

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public GenericCode getCode() {
        return code;
    }

    public void setCode(GenericCode code) {
        this.code = code;
    }

    public GenericPerson getPlayingEntity() {
        return playingEntity;
    }

    public void setPlayingEntity(GenericPerson playingEntity) {
        this.playingEntity = playingEntity;
    }

    public GenericEntity getPlayingDevice() {
        return playingDevice;
    }

    public void setPlayingDevice(GenericEntity playingDevice) {
        this.playingDevice = playingDevice;
    }

    public GenericEntity getScopingEntity() {
        return scopingEntity;
    }

    public void setScopingEntity(GenericEntity scopingEntity) {
        this.scopingEntity = scopingEntity;
    }

    public List<Addr> getAddr() {
        return addr;
    }

    public void setAddr(List<Addr> addr) {
        this.addr = addr;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public GenericAssignedEntity getAssociatedEntity() {
        return associatedEntity;
    }

    public void setAssociatedEntity(GenericAssignedEntity associatedEntity) {
        this.associatedEntity = associatedEntity;
    }

    public List<GenericId> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<GenericId> templateId) {
        this.templateId = templateId;
    }

}
