package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class SubstanceAdministration extends GenericComponent {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> routeCode;

    private QuantitySimple doseQuantity;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> administrationUnitCode;

    private Consumable consumable;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> entryRelationship;

    @JacksonXmlProperty(isAttribute = true)
    private boolean negationInd;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Precondition> precondition;

    public List<GenericCode> getRouteCode() {
        return routeCode;
    }

    public void setRouteCode(List<GenericCode> routeCode) {
        this.routeCode = routeCode;
    }

    public QuantitySimple getDoseQuantity() {
        return doseQuantity;
    }

    public void setDoseQuantity(QuantitySimple doseQuantity) {
        this.doseQuantity = doseQuantity;
    }

    public Consumable getConsumable() {
        return consumable;
    }

    public void setConsumable(Consumable consumable) {
        this.consumable = consumable;
    }

    public List<GenericSubComponent> getEntryRelationship() {
        return entryRelationship;
    }

    public void setEntryRelationship(List<GenericSubComponent> entryRelationship) {
        this.entryRelationship = entryRelationship;
    }

    public boolean isNegationInd() {
        return negationInd;
    }

    public void setNegationInd(boolean negationInd) {
        this.negationInd = negationInd;
    }

    public List<GenericCode> getAdministrationUnitCode() {
        return administrationUnitCode;
    }

    public void setAdministrationUnitCode(List<GenericCode> administrationUnitCode) {
        this.administrationUnitCode = administrationUnitCode;
    }

    public List<Precondition> getPrecondition() {
        return precondition;
    }

    public void setPrecondition(List<Precondition> precondition) {
        this.precondition = precondition;
    }

}