package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "clinicalDocument")
@JsonPropertyOrder({
    "realmCode", "typeId", "templateId", "id", "code", "title", "effectiveTime", "confidentialityCode",
    "languageCode", "versionNumber", "recordTarget", "author", "dataEnterer", "informant", "custodian",
    "legalAuthenticator", "authenticator", "participant", "documentationOf", "component"
})
public class ClinicalDocument {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> realmCode;
    
    private GenericId typeId;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericId> templateId;

    private GenericId id;
    private GenericCode code;  
    private String title;
    private EffectiveTime effectiveTime;
    private ConfidentialityCode confidentialityCode;
    private LanguageCode languageCode;
    private VersionNumber versionNumber;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<RecordTarget> recordTarget;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Author> author;

    private DataEnterer dataEnterer;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Informant> informant;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Custodian> custodian;

    private GenericAuthenticator legalAuthenticator;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericAuthenticator> authenticator;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericParticipant> participant;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<DocumentationOf> documentationOf;

    @JacksonXmlElementWrapper(useWrapping = false)
    private ClinicalDocumentComponentWrapper component;

    public List<GenericCode> getRealmCode() {
        return realmCode;
    }

    public void setRealmCode(List<GenericCode> realmCode) {
        this.realmCode = realmCode;
    }

    public GenericId getTypeId() {
        return typeId;
    }

    public void setTypeId(GenericId typeId) {
        this.typeId = typeId;
    }

    public List<GenericId> getTemplateId() {
        return templateId;
    }

    public void setTemplateId(List<GenericId> templateId) {
        this.templateId = templateId;
    }

    public GenericId getId() {
        return id;
    }

    public void setId(GenericId id) {
        this.id = id;
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

    public EffectiveTime getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(EffectiveTime effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public ConfidentialityCode getConfidentialityCode() {
        return confidentialityCode;
    }

    public void setConfidentialityCode(ConfidentialityCode confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

    public LanguageCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(LanguageCode languageCode) {
        this.languageCode = languageCode;
    }

    public VersionNumber getVersionNumber() {
        return versionNumber;
    }

    public void setVersionNumber(VersionNumber versionNumber) {
        this.versionNumber = versionNumber;
    }

    public List<RecordTarget> getRecordTarget() {
        return recordTarget;
    }

    public void setRecordTarget(List<RecordTarget> recordTarget) {
        this.recordTarget = recordTarget;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public DataEnterer getDataEnterer() {
        return dataEnterer;
    }

    public void setDataEnterer(DataEnterer dataEnterer) {
        this.dataEnterer = dataEnterer;
    }

    public List<Informant> getInformant() {
        return informant;
    }

    public void setInformant(List<Informant> informant) {
        this.informant = informant;
    }

    public List<Custodian> getCustodian() {
        return custodian;
    }

    public void setCustodian(List<Custodian> custodian) {
        this.custodian = custodian;
    }

    public GenericAuthenticator getLegalAuthenticator() {
        return legalAuthenticator;
    }

    public void setLegalAuthenticator(GenericAuthenticator legalAuthenticator) {
        this.legalAuthenticator = legalAuthenticator;
    }

    public List<GenericAuthenticator> getAuthenticator() {
        return authenticator;
    }

    public void setAuthenticator(List<GenericAuthenticator> authenticator) {
        this.authenticator = authenticator;
    }

    public List<GenericParticipant> getParticipant() {
        return participant;
    }

    public void setParticipant(List<GenericParticipant> participant) {
        this.participant = participant;
    }

    public List<DocumentationOf> getDocumentationOf() {
        return documentationOf;
    }

    public void setDocumentationOf(List<DocumentationOf> documentationOf) {
        this.documentationOf = documentationOf;
    }

    public ClinicalDocumentComponentWrapper getComponent() {
        return component;
    }

    public void setComponent(ClinicalDocumentComponentWrapper component) {
        this.component = component;
    }
    
}