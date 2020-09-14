package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class RelatedSubject {

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> code;

    private GenericSubject subject;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public List<GenericCode> getCode() {
        return code;
    }

    public void setCode(List<GenericCode> code) {
        this.code = code;
    }

    public GenericSubject getSubject() {
        return subject;
    }

    public void setSubject(GenericSubject subject) {
        this.subject = subject;
    }

}
