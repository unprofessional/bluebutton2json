package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class GenericSubComponent {

    private Observation observation;

    private Act act;

    private Supply supply;

    private String typeCode;

    private boolean inversionInd;

    private GenericNumberValue sequenceNumber;

    private Procedure procedure;

    private Encounter encounter;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> entryRelationship;

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public boolean isInversionInd() {
        return inversionInd;
    }

    public void setInversionInd(boolean inversionInd) {
        this.inversionInd = inversionInd;
    }

    public List<GenericSubComponent> getEntryRelationship() {
        return entryRelationship;
    }

    public void setEntryRelationship(List<GenericSubComponent> entryRelationship) {
        this.entryRelationship = entryRelationship;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public GenericNumberValue getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(GenericNumberValue sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

}
