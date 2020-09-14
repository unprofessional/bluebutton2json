package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SpecimenRole {

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    private GenericEntity specimenPlayingRole;

    private GenericEntity specimenPlayingEntity;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public GenericEntity getSpecimenPlayingRole() {
        return specimenPlayingRole;
    }

    public void setSpecimenPlayingRole(GenericEntity specimenPlayingRole) {
        this.specimenPlayingRole = specimenPlayingRole;
    }

    public GenericEntity getSpecimenPlayingEntity() {
        return specimenPlayingEntity;
    }

    public void setSpecimenPlayingEntity(GenericEntity specimenPlayingEntity) {
        this.specimenPlayingEntity = specimenPlayingEntity;
    }

}
