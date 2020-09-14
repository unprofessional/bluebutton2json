package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Specimen {

    @JacksonXmlProperty(isAttribute = true)
    private String typeCode;

    private SpecimenRole specimenRole;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public SpecimenRole getSpecimenRole() {
        return specimenRole;
    }

    public void setSpecimenRole(SpecimenRole specimenRole) {
        this.specimenRole = specimenRole;
    }

}
