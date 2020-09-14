package com.leidos.bluebutton2json.models;

public class ExternalDocument {

    private GenericId id;

    private DocumentText text;

    public GenericId getId() {
        return id;
    }

    public void setId(GenericId id) {
        this.id = id;
    }

    public DocumentText getText() {
        return text;
    }

    public void setText(DocumentText text) {
        this.text = text;
    }

}
