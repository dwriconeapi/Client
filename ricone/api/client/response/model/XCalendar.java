/*
 * RIC One File Bridge
 * Version: 1.0.0 Build 20170604-1
 * Copyright © 2017 New York State Education Department
 * Created At Northeastern Regional Information Center By Daniel Whitehouse
 */

package org.ricone.api.client.response.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@refId", "schoolRefId", "schoolYear", "sessions"})
@JsonRootName(value = "xCalendar")
public class XCalendar {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("schoolYear")
    private String schoolYear;
    @JsonProperty("sessions")
    private Sessions sessions;

    public XCalendar() {
    }

    public XCalendar(String refId, String schoolRefId, String schoolYear, Sessions sessions) {
        super();
        this.refId = refId;
        this.schoolRefId = schoolRefId;
        this.schoolYear = schoolYear;
        this.sessions = sessions;
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

    @JsonProperty("schoolRefId")
    public String getSchoolRefId() {
        return schoolRefId;
    }

    @JsonProperty("schoolRefId")
    public void setSchoolRefId(String schoolRefId) {
        this.schoolRefId = schoolRefId;
    }

    @JsonProperty("schoolYear")
    public String getSchoolYear() {
        return schoolYear;
    }

    @JsonProperty("schoolYear")
    public void setSchoolYear(String schoolYear) {
        this.schoolYear = schoolYear;
    }

    @JsonProperty("sessions")
    public Sessions getSessions() {
        return sessions;
    }

    @JsonProperty("sessions")
    public void setSessions(Sessions sessions) {
        this.sessions = sessions;
    }

    @Override
    public String toString() {
        return "XCalendar{" + "refId='" + refId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolYear='" + schoolYear + '\'' + ", sessions=" + sessions + '}';
    }
}