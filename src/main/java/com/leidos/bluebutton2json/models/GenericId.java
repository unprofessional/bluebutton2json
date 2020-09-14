package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericId {

    @JacksonXmlProperty(isAttribute = true)
    private String nullFlavor;

    @JacksonXmlProperty(localName = "extension", isAttribute = true)
    private String extension;
    @JacksonXmlProperty(localName = "root", isAttribute = true)
    private String root;

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public String getNullFlavor() {
        return nullFlavor;
    }

    public void setNullFlavor(String nullFlavor) {
        this.nullFlavor = nullFlavor;
    }

}