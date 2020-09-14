package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class GenericComponent {

    @JacksonXmlProperty(isAttribute = true)
    private String classCode;

    @JacksonXmlProperty(isAttribute = true)
    private String moodCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> id;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> code;

    @JacksonXmlProperty(isAttribute = true)
    private GenericCode statusCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> priorityCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<TimeSimple> effectiveTime;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Author> author;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Performer> performer;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericParticipant> participant;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericReference> reference;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> value;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericSubComponent> component;

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getMoodCode() {
        return moodCode;
    }

    public void setMoodCode(String moodCode) {
        this.moodCode = moodCode;
    }

    public List<GenericId> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<GenericId> templateId) {
        this.templateId = templateId;
    }

    public List<GenericId> getId() {
        return id;
    }

    public void setId(List<GenericId> id) {
        this.id = id;
    }

    public List<GenericCode> getCode() {
        return code;
    }

    public void setCode(List<GenericCode> code) {
        this.code = code;
    }

    public GenericCode getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(GenericCode statusCode) {
        this.statusCode = statusCode;
    }

    public List<TimeSimple> getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(List<TimeSimple> effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public List<Performer> getPerformer() {
        return performer;
    }

    public void setPerformer(List<Performer> performer) {
        this.performer = performer;
    }

    public List<GenericParticipant> getParticipant() {
        return participant;
    }

    public void setParticipant(List<GenericParticipant> participant) {
        this.participant = participant;
    }

    public List<GenericReference> getReference() {
        return reference;
    }

    public void setReference(List<GenericReference> reference) {
        this.reference = reference;
    }

    public List<GenericCode> getValue() {
        return value;
    }

    public void setValue(List<GenericCode> value) {
        this.value = value;
    }

    public List<GenericSubComponent> getComponent() {
        return component;
    }

    public void setComponent(List<GenericSubComponent> component) {
        this.component = component;
    }

    public List<GenericCode> getPriorityCode() {
        return priorityCode;
    }

    public void setPriorityCode(List<GenericCode> priorityCode) {
        this.priorityCode = priorityCode;
    }

}
