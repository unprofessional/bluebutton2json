package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class ReferenceRange {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ObservationRange> observationRange;

    public List<ObservationRange> getObservationRange() {
        return observationRange;
    }

    public void setObservationRange(List<ObservationRange> observationRange) {
        this.observationRange = observationRange;
    }

}
