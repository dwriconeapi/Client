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
@JsonPropertyOrder({"@refId", "schoolRefId", "schoolCourseId", "leaCourseId", "otherIds", "courseTitle", "description", "subject", "applicableEducationLevels", "scedCourseCode", "scedCourseLevelCode", "scedCourseSubjectAreaCode"})
@JsonRootName(value = "xCourse")
public class XCourse {
    @JsonProperty("@refId")
    @JacksonXmlProperty(localName = "refId", isAttribute = true)
    private String refId;
    @JsonProperty("schoolRefId")
    private String schoolRefId;
    @JsonProperty("schoolCourseId")
    private String schoolCourseId;
    @JsonProperty("leaCourseId")
    private String leaCourseId;
    @JsonProperty("otherIds")
    private OtherIds otherIds;
    @JsonProperty("courseTitle")
    private String courseTitle;
    @JsonProperty("description")
    private String description;
    @JsonProperty("subject")
    private String subject;
    @JsonProperty("applicableEducationLevels")
    private ApplicableEducationLevels applicableEducationLevels;
    @JsonProperty("scedCourseCode")
    private String scedCourseCode;
    @JsonProperty("scedCourseLevelCode")
    private String scedCourseLevelCode;
    @JsonProperty("scedCourseSubjectAreaCode")
    private String scedCourseSubjectAreaCode;


    public XCourse() {
    }

    public XCourse(String refId, String schoolRefId, String schoolCourseId, String leaCourseId, OtherIds otherIds, String courseTitle, String description, String subject, ApplicableEducationLevels applicableEducationLevels) {
        super();
        this.refId = refId;
        this.schoolRefId = schoolRefId;
        this.schoolCourseId = schoolCourseId;
        this.leaCourseId = leaCourseId;
        this.otherIds = otherIds;
        this.courseTitle = courseTitle;
        this.description = description;
        this.subject = subject;
        this.applicableEducationLevels = applicableEducationLevels;
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

    @JsonProperty("schoolCourseId")
    public String getSchoolCourseId() {
        return schoolCourseId;
    }

    @JsonProperty("schoolCourseId")
    public void setSchoolCourseId(String schoolCourseId) {
        this.schoolCourseId = schoolCourseId;
    }

    @JsonProperty("leaCourseId")
    public String getLeaCourseId() {
        return leaCourseId;
    }

    @JsonProperty("leaCourseId")
    public void setLeaCourseId(String leaCourseId) {
        this.leaCourseId = leaCourseId;
    }

    @JsonProperty("otherIds")
    public OtherIds getOtherIds() {
        return otherIds;
    }

    @JsonProperty("otherIds")
    public void setOtherIds(OtherIds otherIds) {
        this.otherIds = otherIds;
    }

    @JsonProperty("courseTitle")
    public String getCourseTitle() {
        return courseTitle;
    }

    @JsonProperty("courseTitle")
    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("subject")
    public String getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @JsonProperty("applicableEducationLevels")
    public ApplicableEducationLevels getApplicableEducationLevels() {
        return applicableEducationLevels;
    }

    @JsonProperty("applicableEducationLevels")
    public void setApplicableEducationLevels(ApplicableEducationLevels applicableEducationLevels) {
        this.applicableEducationLevels = applicableEducationLevels;
    }

    @JsonProperty("scedCourseCode")
    public String getScedCourseCode() {
        return scedCourseCode;
    }

    @JsonProperty("scedCourseCode")
    public void setScedCourseCode(String scedCourseCode) {
        this.scedCourseCode = scedCourseCode;
    }

    @JsonProperty("scedCourseLevelCode")
    public String getScedCourseLevelCode() {
        return scedCourseLevelCode;
    }

    @JsonProperty("scedCourseLevelCode")
    public void setScedCourseLevelCode(String scedCourseLevelCode) {
        this.scedCourseLevelCode = scedCourseLevelCode;
    }

    @JsonProperty("scedCourseSubjectAreaCode")
    public String getScedCourseSubjectAreaCode() {
        return scedCourseSubjectAreaCode;
    }

    @JsonProperty("scedCourseSubjectAreaCode")
    public void setScedCourseSubjectAreaCode(String scedCourseSubjectAreaCode) {
        this.scedCourseSubjectAreaCode = scedCourseSubjectAreaCode;
    }

    @Override
    public String toString() {
        return "XCourse{" + "refId='" + refId + '\'' + ", schoolRefId='" + schoolRefId + '\'' + ", schoolCourseId='" + schoolCourseId + '\'' + ", leaCourseId='" + leaCourseId + '\'' + ", otherIds=" + otherIds + ", courseTitle='" + courseTitle + '\'' + ", description='" + description + '\'' + ", subject='" + subject + '\'' + ", applicableEducationLevels=" + applicableEducationLevels + ", scedCourseCode='" + scedCourseCode + '\'' + ", scedCourseLevelCode='" + scedCourseLevelCode + '\'' + ", scedCourseSubjectAreaCode='" + scedCourseSubjectAreaCode + '\'' + '}';
    }
}