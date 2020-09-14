package com.leidos.bluebutton2json.models;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class TimeSimple {

    @JacksonXmlProperty(isAttribute = true)
    private String value;

    @JacksonXmlProperty(isAttribute = true)
    private String type;

    @JacksonXmlProperty(isAttribute = true)
    private String operator;

    @JacksonXmlProperty(isAttribute = true)
    private boolean institutionSpecified;

    private TimeSimpleLow low;

    private TimeSimpleHigh high;

    private QuantitySimple period;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public TimeSimpleLow getLow() {
        return low;
    }

    public void setLow(TimeSimpleLow low) {
        this.low = low;
    }

    public TimeSimpleHigh getHigh() {
        return high;
    }

    public void setHigh(TimeSimpleHigh high) {
        this.high = high;
    }


    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public boolean isInstitutionSpecified() {
        return institutionSpecified;
    }

    public void setInstitutionSpecified(boolean institutionSpecified) {
        this.institutionSpecified = institutionSpecified;
    }

    public QuantitySimple getPeriod() {
        return period;
    }

    public void setPeriod(QuantitySimple period) {
        this.period = period;
    }

    public class TimeSimpleLow {

        @JacksonXmlProperty(isAttribute = true)
        private String nullFlavor;

        @JacksonXmlProperty(isAttribute = true)
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getNullFlavor() {
            return nullFlavor;
        }

        public void setNullFlavor(String nullFlavor) {
            this.nullFlavor = nullFlavor;
        }
    }

    public class TimeSimpleHigh {

        @JacksonXmlProperty(isAttribute = true)
        private String nullFlavor;

        @JacksonXmlProperty(isAttribute = true)
        private String value;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getNullFlavor() {
            return nullFlavor;
        }

        public void setNullFlavor(String nullFlavor) {
            this.nullFlavor = nullFlavor;
        }
    }

}
