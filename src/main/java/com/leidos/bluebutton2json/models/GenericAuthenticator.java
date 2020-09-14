package com.leidos.bluebutton2json.models;

public class GenericAuthenticator {

    private TimeSimple time;

    private GenericCode signatureCode;

    private GenericAssignedEntity assignedEntity;

    public TimeSimple getTime() {
        return time;
    }

    public void setTime(TimeSimple time) {
        this.time = time;
    }

    public GenericCode getSignatureCode() {
        return signatureCode;
    }

    public void setSignatureCode(GenericCode signatureCode) {
        this.signatureCode = signatureCode;
    }

    public GenericAssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    public void setAssignedEntity(GenericAssignedEntity assignedEntity) {
        this.assignedEntity = assignedEntity;
    }

}
