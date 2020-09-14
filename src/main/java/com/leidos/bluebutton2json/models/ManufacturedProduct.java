package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ManufacturedProduct {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    private ManufacturedMaterial manufacturedMaterial;

    private GenericOrganization manufacturerOrganization;

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    public List<GenericId> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<GenericId> templateId) {
        this.templateId = templateId;
    }

    public ManufacturedMaterial getManufacturedMaterial() {
        return manufacturedMaterial;
    }

    public void setManufacturedMaterial(ManufacturedMaterial manufacturedMaterial) {
        this.manufacturedMaterial = manufacturedMaterial;
    }

    public GenericOrganization getManufacturerOrganization() {
        return manufacturerOrganization;
    }

    public void setManufacturerOrganization(GenericOrganization manufacturerOrganization) {
        this.manufacturerOrganization = manufacturerOrganization;
    }

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

}
