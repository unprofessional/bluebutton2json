package com.leidos.bluebutton2json.models;

public class ProviderOrganization {

    private GenericId id;
    private String name;
    private Telecom telecom;
    private Addr addr;

    public GenericId getId() {
        return id;
    }

    public void setId(GenericId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Telecom getTelecom() {
        return telecom;
    }

    public void setTelecom(Telecom telecom) {
        this.telecom = telecom;
    }

    public Addr getAddr() {
        return addr;
    }

    public void setAddr(Addr addr) {
        this.addr = addr;
    }

}
