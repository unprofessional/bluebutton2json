package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericCode {

    @JacksonXmlProperty(localName = "code", isAttribute = true)
    private String code;
    @JacksonXmlProperty(localName = "codeSystem", isAttribute = true)
    private String codeSystem;
    @JacksonXmlProperty(localName = "codeSystemName", isAttribute = true)
    private String codeSystemName;
    @JacksonXmlProperty(localName = "displayName", isAttribute = true)
    private String displayName;

    // TODO: xsi-type for the data-type... namespaces?

    @JacksonXmlProperty(localName = "type", isAttribute = true)
    private String type;

    @JacksonXmlProperty(localName = "value", isAttribute = true)
    private String value;

    @JacksonXmlProperty(localName = "unit", isAttribute = true)
    private String unit;

    // TODO: pull out to same level like we did with Given/Family textValue?
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Translation> translation;

    private OriginalText originalText;

    @JacksonXmlProperty(isAttribute = true)
    private String nullFlavor;

    // @JacksonXmlElementWrapper(useWrapping = false)
    // private List<QualifierSimple> qualifier;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public List<Translation> getTranslation() {
        return translation;
    }

    public void setTranslation(List<Translation> translation) {
        this.translation = translation;
    }

    public OriginalText getOriginalText() {
        return originalText;
    }

    public void setOriginalText(OriginalText originalText) {
        this.originalText = originalText;
    }

    public String getNullFlavor() {
        return nullFlavor;
    }

    public void setNullFlavor(String nullFlavor) {
        this.nullFlavor = nullFlavor;
    }

    // public List<QualifierSimple> getQualifier() {
    //     return qualifier;
    // }

    // public void setQualifier(List<QualifierSimple> qualifier) {
    //     this.qualifier = qualifier;
    // }

}