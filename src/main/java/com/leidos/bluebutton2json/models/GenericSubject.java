package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class GenericSubject {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    private GenericCode administrativeGenderCode;

    private TimeSimple birthTime;

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public GenericCode getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }

    public void setAdministrativeGenderCode(GenericCode administrativeGenderCode) {
        this.administrativeGenderCode = administrativeGenderCode;
    }

    public TimeSimple getBirthTime() {
        return birthTime;
    }

    public void setBirthTime(TimeSimple birthTime) {
        this.birthTime = birthTime;
    }

}
