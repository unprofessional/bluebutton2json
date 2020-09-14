package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class ConfidentialityCode {

    @JacksonXmlProperty(localName = "code", isAttribute = true)
    private String code;
    @JacksonXmlProperty(localName = "displayName", isAttribute = true)
    private String displayName;
    @JacksonXmlProperty(localName = "codeSystem", isAttribute = true)
    private String codeSystem;
    @JacksonXmlProperty(localName = "codeSystemName", isAttribute = true)
    private String codeSystemName;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getCodeSystem() {
        return codeSystem;
    }

    public void setCodeSystem(String codeSystem) {
        this.codeSystem = codeSystem;
    }

    public String getCodeSystemName() {
        return codeSystemName;
    }

    public void setCodeSystemName(String codeSystemName) {
        this.codeSystemName = codeSystemName;
    }

}