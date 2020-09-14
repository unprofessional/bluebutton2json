package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Encounter extends GenericComponent {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> entryRelationship;

    public List<GenericSubComponent> getEntryRelationship() {
        return entryRelationship;
    }

    public void setEntryRelationship(List<GenericSubComponent> entryRelationship) {
        this.entryRelationship = entryRelationship;
    }

}