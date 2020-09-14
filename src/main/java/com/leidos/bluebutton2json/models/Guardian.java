package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Guardian {

    @JacksonXmlProperty(localName = "code")
    private GenericCode code;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Addr> addr;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Telecom> telecom;

    private GenericPerson guardianPerson;

    public GenericCode getCode() {
        return code;
    }

    public void setCode(GenericCode code) {
        this.code = code;
    }

    
    public List<Addr> getAddr() {
        return addr;
    }

    public void setAddr(List<Addr> addr) {
        this.addr = addr;
    }

    public List<Telecom> getTelecom() {
        return telecom;
    }

    public void setTelecom(List<Telecom> telecom) {
        this.telecom = telecom;
    }

    public GenericPerson getGuardianPerson() {
        return guardianPerson;
    }

    public void setGuardianPerson(GenericPerson guardianPerson) {
        this.guardianPerson = guardianPerson;
    }

}
