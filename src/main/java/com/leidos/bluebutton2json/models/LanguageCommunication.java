package com.leidos.bluebutton2json.models;

public class LanguageCommunication {

    private GenericCode languageCode;
    private GenericCode modeCode;
    private GenericCode proficiencyLevelCode;
    private PreferenceInd preferenceInd;

    public GenericCode getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(GenericCode languageCode) {
        this.languageCode = languageCode;
    }

    public GenericCode getModeCode() {
        return modeCode;
    }

    public void setModeCode(GenericCode modeCode) {
        this.modeCode = modeCode;
    }

    public GenericCode getProficiencyLevelCode() {
        return proficiencyLevelCode;
    }

    public void setProficiencyLevelCode(GenericCode proficiencyLevelCode) {
        this.proficiencyLevelCode = proficiencyLevelCode;
    }

    public PreferenceInd getPreferenceInd() {
        return preferenceInd;
    }

    public void setPreferenceInd(PreferenceInd preferenceInd) {
        this.preferenceInd = preferenceInd;
    }

}
