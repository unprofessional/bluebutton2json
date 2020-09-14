package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericOrganization {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> name;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Telecom> telecom;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Addr> addr;

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public List<Addr> getAddr() {
        return addr;
    }

    public void setAddr(List<Addr> addr) {
        this.addr = addr;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

}
