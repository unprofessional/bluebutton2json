package com.leidos.bluebutton2json.models;

public class GenericValue {

    private QuantitySimple low;

    private QuantitySimple high;

    public QuantitySimple getLow() {
        return low;
    }

    public void setLow(QuantitySimple low) {
        this.low = low;
    }

    public QuantitySimple getHigh() {
        return high;
    }

    public void setHigh(QuantitySimple high) {
        this.high = high;
    }

}
