package com.leidos.bluebutton2json.models;

public class Informant {

    private GenericAssignedEntity assignedEntity;
    private GenericAssignedEntity relatedEntity;

    public GenericAssignedEntity getAssignedEntity() {
        return assignedEntity;
    }

    public void setAssignedEntity(GenericAssignedEntity assignedEntity) {
        this.assignedEntity = assignedEntity;
    }

    public GenericAssignedEntity getRelatedEntity() {
        return relatedEntity;
    }

    public void setRelatedEntity(GenericAssignedEntity relatedEntity) {
        this.relatedEntity = relatedEntity;
    }

}
