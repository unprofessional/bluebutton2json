package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.leidos.bluebutton2json.models.interfaces.BaseName;

public class Name implements BaseName {

    @JacksonXmlProperty(isAttribute = true)
    private String use;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Given> given;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Family> family;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Suffix> prefix;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Suffix> suffix;

	public String getUse() {
		return use;
	}

	public void setUse(String use) {
		this.use = use;
	}

	public List<Given> getGiven() {
		return given;
	}

	public void setGiven(List<Given> given) {
		this.given = given;
	}

	public List<Family> getFamily() {
		return family;
	}

	public void setFamily(List<Family> family) {
		this.family = family;
	}

	public List<Suffix> getPrefix() {
		return prefix;
	}

	public void setPrefix(List<Suffix> prefix) {
		this.prefix = prefix;
	}

	public List<Suffix> getSuffix() {
		return suffix;
	}

	public void setSuffix(List<Suffix> suffix) {
		this.suffix = suffix;
	}

}
