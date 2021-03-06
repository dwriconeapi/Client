package org.ricone.api.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "localId", "stateProvinceId", "ncesId", "leaName", "address", "phoneNumber", "otherPhoneNumbers"})
@JsonRootName(value = "xLea")
public class XLea {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("localId")
    private String localId;
    @JsonProperty("stateProvinceId")
    private String stateProvinceId;
    @JsonProperty("ncesId")
    private String ncesId;
    @JsonProperty("leaName")
    private String leaName;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("phoneNumber")
    private PhoneNumber phoneNumber;
    @JsonProperty("otherPhoneNumbers")
    private OtherPhoneNumbers otherPhoneNumbers;

    public XLea() {
    }

    public XLea(String refId, String localId, String stateProvinceId, String ncesId, String leaName, Address address, PhoneNumber phoneNumber, OtherPhoneNumbers otherPhoneNumbers) {
        super();
        this.refId = refId;
        this.localId = localId;
        this.stateProvinceId = stateProvinceId;
        this.ncesId = ncesId;
        this.leaName = leaName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    public String getRefId() {
        return refId;
    }

    @JsonProperty("@refId")
    public void setRefId(String refId) {
        this.refId = refId;
    }

    @JsonProperty("localId")
    public String getLocalId() {
        return localId;
    }

    @JsonProperty("localId")
    public void setLocalId(String localId) {
        this.localId = localId;
    }

    @JsonProperty("stateProvinceId")
    public String getStateProvinceId() {
        return stateProvinceId;
    }

    @JsonProperty("stateProvinceId")
    public void setStateProvinceId(String stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    @JsonProperty("ncesId")
    public String getNcesId() {
        return ncesId;
    }

    @JsonProperty("ncesId")
    public void setNcesId(String ncesId) {
        this.ncesId = ncesId;
    }

    @JsonProperty("leaName")
    public String getLeaName() {
        return leaName;
    }

    @JsonProperty("leaName")
    public void setLeaName(String leaName) {
        this.leaName = leaName;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("phoneNumber")
    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phoneNumber")
    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("otherPhoneNumbers")
    public OtherPhoneNumbers getOtherPhoneNumbers() {
        return otherPhoneNumbers;
    }

    @JsonProperty("otherPhoneNumbers")
    public void setOtherPhoneNumbers(OtherPhoneNumbers otherPhoneNumbers) {
        this.otherPhoneNumbers = otherPhoneNumbers;
    }

    @Override
    public String toString() {
        return "XLea{" + "refId='" + refId + '\'' + ", localId='" + localId + '\'' + ", stateProvinceId='" + stateProvinceId + '\'' + ", ncesId='" + ncesId + '\'' + ", leaName='" + leaName + '\'' + ", address=" + address + ", phoneNumber=" + phoneNumber + ", otherPhoneNumbers=" + otherPhoneNumbers + '}';
    }
}