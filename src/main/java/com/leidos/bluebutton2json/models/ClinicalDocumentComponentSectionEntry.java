package com.leidos.bluebutton2json.models;

public class ClinicalDocumentComponentSectionEntry {

    private Organizer organizer;

    private Act act;

    private Encounter encounter;

    private SubstanceAdministration substanceAdministration;

    private Supply supply;

    private String typeCode;

    private Procedure procedure;

    private Observation observation;

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    public void setSubstanceAdministration(SubstanceAdministration substanceAdministration) {
        this.substanceAdministration = substanceAdministration;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    public Observation getObservation() {
        return observation;
    }

    public void setObservation(Observation observation) {
        this.observation = observation;
    }

}
