package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

public class ManufacturedMaterial {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> code;

    private String lotNumberText;

    public List<GenericCode> getCode() {
        return code;
    }

    public void setCode(List<GenericCode> code) {
        this.code = code;
    }

    public String getLotNumberText() {
        return lotNumberText;
    }

    public void setLotNumberText(String lotNumberText) {
        this.lotNumberText = lotNumberText;
    }

}
