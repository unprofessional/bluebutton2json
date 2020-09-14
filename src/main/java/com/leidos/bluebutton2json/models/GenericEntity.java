package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class GenericEntity {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> code;

    private String desc;

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public List<GenericCode> getCode() {
        return code;
    }

    public void setCode(List<GenericCode> code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
