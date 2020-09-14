package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class PatientRole {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;
    
    private Addr addr;
    private Telecom telecom;
    private Patient patient;
    private ProviderOrganization providerOrganization;

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

    public Telecom getTelecom() {
        return telecom;
    }

    public void setTelecom(Telecom telecom) {
        this.telecom = telecom;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public ProviderOrganization getProviderOrganization() {
        return providerOrganization;
    }

    public void setProviderOrganization(ProviderOrganization providerOrganization) {
        this.providerOrganization = providerOrganization;
    }

}