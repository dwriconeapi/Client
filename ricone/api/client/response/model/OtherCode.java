/*
 * RIC One File Bridge
 * Version: 1.0.0 Build 20170604-1
 * Copyright © 2017 New York State Education Department
 * Created At Northeastern Regional Information Center By Daniel Whitehouse
 */

package org.ricone.api.client.response.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"codesetName", "otherCodeValue"})
public class OtherCode {

    @JsonProperty("codesetName")
    private String codesetName;
    @JsonProperty("otherCodeValue")
    private String otherCodeValue;

    public OtherCode() {
    }

    public OtherCode(String codesetName, String otherCodeValue) {
        super();
        this.codesetName = codesetName;
        this.otherCodeValue = otherCodeValue;
    }

    @JsonProperty("codesetName")
    public String getCodesetName() {
        return codesetName;
    }

    @JsonProperty("codesetName")
    public void setCodesetName(String codesetName) {
        this.codesetName = codesetName;
    }

    @JsonProperty("otherCodeValue")
    public String getOtherCodeValue() {
        return otherCodeValue;
    }

    @JsonProperty("otherCodeValue")
    public void setOtherCodeValue(String otherCodeValue) {
        this.otherCodeValue = otherCodeValue;
    }

    @Override
    public String toString() {
        return "OtherCode{" + "codesetName='" + codesetName + '\'' + ", otherCodeValue='" + otherCodeValue + '\'' + '}';
    }
}