package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Performer {

    @JacksonXmlProperty(isAttribute = true)
    private String typeCode;

    private GenericCode functionCode;

    private GenericAssignedEntity assignedEntity;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public GenericCode getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(GenericCode functionCode) {
        this.functionCode = functionCode;
    }

    public GenericAssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    public void setAssignedEntity(GenericAssignedEntity assignedEntity) {
        this.assignedEntity = assignedEntity;
    }

}
