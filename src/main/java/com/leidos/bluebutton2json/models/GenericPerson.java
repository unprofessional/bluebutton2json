package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericPerson {

    private GenericCode code;

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    // @JacksonXmlElementWrapper(useWrapping = false)
    // private List<Name> name;

    // TODO: this is a bandaid measure for now...
    @JacksonXmlElementWrapper(useWrapping = false)
	private List<Object> name;
	
	private TimeSimple birthTime;

	public GenericCode getCode() {
		return code;
	}

	public void setCode(GenericCode code) {
		this.code = code;
	}

	public String getClassCode() {
		return classCode;
	}

	public void setClassCode(String classCode) {
		this.classCode = classCode;
	}

    public List<Object> getName() {
        return name;
    }

    public void setName(List<Object> name) {
        this.name = name;
    }

	public TimeSimple getBirthTime() {
		return birthTime;
	}

	public void setBirthTime(TimeSimple birthTime) {
		this.birthTime = birthTime;
	}

}
