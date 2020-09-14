package com.leidos.bluebutton2json.models;

import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Patient {

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Name> name;

    private GenericCode administrativeGenderCode;

    @JacksonXmlProperty(isAttribute = true)
    private String birthtime;

    private GenericCode maritalStatusCode;
    private GenericCode religiousAffiliationCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<GenericCode> raceCode;

    // @JacksonXmlProperty(localName = "sdtc:raceCode")
    // @JacksonXmlElementWrapper(useWrapping = false)
    // private List<GenericCode> sdtcRaceCode;
    
    private GenericCode ethnicGroupCode;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<Guardian> guardian;

    private Birthplace birthplace;

    @JacksonXmlElementWrapper(useWrapping = false)
    private List<LanguageCommunication> languageCommunication;

    public List<Name> getName() {
        return name;
    }

    public void setName(List<Name> name) {
        this.name = name;
    }

    public GenericCode getAdministrativeGenderCode() {
        return administrativeGenderCode;
    }

    public void setAdministrativeGenderCode(GenericCode administrativeGenderCode) {
        this.administrativeGenderCode = administrativeGenderCode;
    }

    public String getBirthtime() {
        return birthtime;
    }

    public void setBirthtime(String birthtime) {
        this.birthtime = birthtime;
    }

    public GenericCode getMaritalStatusCode() {
        return maritalStatusCode;
    }

    public void setMaritalStatusCode(GenericCode maritalStatusCode) {
        this.maritalStatusCode = maritalStatusCode;
    }

    public GenericCode getReligiousAffiliationCode() {
        return religiousAffiliationCode;
    }

    public void setReligiousAffiliationCode(GenericCode religiousAffiliationCode) {
        this.religiousAffiliationCode = religiousAffiliationCode;
    }

    public List<GenericCode> getRaceCode() {
        return raceCode;
    }

    public void setRaceCode(List<GenericCode> raceCode) {
        this.raceCode = raceCode;
    }

    // public List<GenericCode> getSdtcRaceCode() {
    //     return sdtcRaceCode;
    // }

    // public void setSdtcRaceCode(List<GenericCode> sdtcRaceCode) {
    //     this.sdtcRaceCode = sdtcRaceCode;
    // }

    public GenericCode getEthnicGroupCode() {
        return ethnicGroupCode;
    }

    public void setEthnicGroupCode(GenericCode ethnicGroupCode) {
        this.ethnicGroupCode = ethnicGroupCode;
    }

    public List<Guardian> getGuardian() {
        return guardian;
    }

    public void setGuardian(List<Guardian> guardian) {
        this.guardian = guardian;
    }

    public Birthplace getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(Birthplace birthplace) {
        this.birthplace = birthplace;
    }

    public List<LanguageCommunication> getLanguageCommunication() {
        return languageCommunication;
    }

    public void setLanguageCommunication(List<LanguageCommunication> languageCommunication) {
        this.languageCommunication = languageCommunication;
    }

}
