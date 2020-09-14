package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Addr {

    @JacksonXmlProperty(isAttribute = true)
    private String use;

    @JacksonXmlProperty(isAttribute = true)
    private String nullFlavor;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> country;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> state;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> city;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> postalCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<String> streetAddressLine;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public List<String> getCountry() {
        return country;
    }

    public void setCountry(List<String> country) {
        this.country = country;
    }

    public List<String> getState() {
        return state;
    }

    public void setState(List<String> state) {
        this.state = state;
    }

    public List<String> getCity() {
        return city;
    }

    public void setCity(List<String> city) {
        this.city = city;
    }

    public List<String> getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(List<String> postalCode) {
        this.postalCode = postalCode;
    }

    public List<String> getStreetAddressLine() {
        return streetAddressLine;
    }

    public void setStreetAddressLine(List<String> streetAddressLine) {
        this.streetAddressLine = streetAddressLine;
    }

    public String getNullFlavor() {
        return nullFlavor;
    }

    public void setNullFlavor(String nullFlavor) {
        this.nullFlavor = nullFlavor;
    }

}
