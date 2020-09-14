package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "section")
@JsonIgnoreProperties(value = { "text" })
public class ClinicalDocumentComponentSection {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    private GenericCode code;
    private String title;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<ClinicalDocumentComponentSectionEntry> entry;

    public List<GenericId> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<GenericId> templateId) {
        this.templateId = templateId;
    }

    public GenericCode getCode() {
        return code;
    }

    public void setCode(GenericCode code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ClinicalDocumentComponentSectionEntry> getEntry() {
        return entry;
    }

    public void setEntry(List<ClinicalDocumentComponentSectionEntry> entry) {
        this.entry = entry;
    }

}
