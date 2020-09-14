package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class Supply extends GenericComponent {

    private QuantitySimple quantity;

    private QuantitySimple repeatNumber;

    private Product product;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> entryRelationship;

    public QuantitySimple getQuantity() {
        return quantity;
    }

    public void setQuantity(QuantitySimple quantity) {
        this.quantity = quantity;
    }

    public QuantitySimple getRepeatNumber() {
        return repeatNumber;
    }

    public void setRepeatNumber(QuantitySimple repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public List<GenericSubComponent> getEntryRelationship() {
        return entryRelationship;
    }

    public void setEntryRelationship(List<GenericSubComponent> entryRelationship) {
        this.entryRelationship = entryRelationship;
    }

}