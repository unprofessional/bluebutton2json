package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericAssignedEntity {

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    private GenericCode code;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Addr> addr;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Telecom> telecom;
    
    private GenericPerson assignedPerson;
    private GenericPerson relatedPerson;
    private GenericPerson associatedPerson;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericOrganization> representedOrganization;

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

    public GenericCode getCode() {
        return code;
    }

    public void setCode(GenericCode code) {
        this.code = code;
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

    public GenericPerson getAssignedPerson() {
        return assignedPerson;
    }

    public void setAssignedPerson(GenericPerson assignedPerson) {
        this.assignedPerson = assignedPerson;
    }

    public GenericPerson getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(GenericPerson relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

    public GenericPerson getAssociatedPerson() {
        return associatedPerson;
    }

    public void setAssociatedPerson(GenericPerson associatedPerson) {
        this.associatedPerson = associatedPerson;
    }

    public List<GenericOrganization> getRepresentedOrganization() {
        return representedOrganization;
    }

    public void setRepresentedOrganization(List<GenericOrganization> representedOrganization) {
        this.representedOrganization = representedOrganization;
    }

}
