//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.sector.admissionsrecord.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.AcademicProgramDegreeLevelType;
import org.pesc.core.coremain.v1_14.PlannedEnrollmentStatusType;
import org.pesc.core.coremain.v1_14.ProgramSecondarySchoolCodeType;


/**
 * <p>Java class for AcademicProgramType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicProgramType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicProgramCodeGroup" minOccurs="0"/>
 *         &lt;element name="AcademicProgramCampus" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicProgramCampusType" minOccurs="0"/>
 *         &lt;element name="PlannedEnrollmentStatus" type="{urn:org:pesc:core:CoreMain:v1.14.0}PlannedEnrollmentStatusType" minOccurs="0"/>
 *         &lt;element name="AcademicProgramDegreeLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicProgramDegreeLevelType" minOccurs="0"/>
 *         &lt;element name="AcademicProgramPriority" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicProgramPriorityType" minOccurs="0"/>
 *         &lt;element name="ApplicationQuestion" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AdmissionsApplicationQuestionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicProgramDetail" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AcademicProgramDetailType" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.14.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicProgramType", propOrder = {
    "programSecondarySchoolCode",
    "programCIPCode",
    "programHEGISCode",
    "programCSISCode",
    "programUSISCode",
    "programESISCode",
    "programLocalCode",
    "academicProgramCampus",
    "plannedEnrollmentStatus",
    "academicProgramDegreeLevel",
    "academicProgramPriority",
    "applicationQuestion",
    "academicProgramDetail",
    "noteMessage"
})
public class AcademicProgramType {

    @XmlElement(name = "ProgramSecondarySchoolCode")
    @XmlSchemaType(name = "string")
    protected ProgramSecondarySchoolCodeType programSecondarySchoolCode;
    @XmlElement(name = "ProgramCIPCode")
    protected String programCIPCode;
    @XmlElement(name = "ProgramHEGISCode")
    protected String programHEGISCode;
    @XmlElement(name = "ProgramCSISCode")
    protected String programCSISCode;
    @XmlElement(name = "ProgramUSISCode")
    protected String programUSISCode;
    @XmlElement(name = "ProgramESISCode")
    protected String programESISCode;
    @XmlElement(name = "ProgramLocalCode")
    protected String programLocalCode;
    @XmlElement(name = "AcademicProgramCampus")
    protected String academicProgramCampus;
    @XmlElement(name = "PlannedEnrollmentStatus")
    @XmlSchemaType(name = "string")
    protected PlannedEnrollmentStatusType plannedEnrollmentStatus;
    @XmlElement(name = "AcademicProgramDegreeLevel")
    @XmlSchemaType(name = "string")
    protected AcademicProgramDegreeLevelType academicProgramDegreeLevel;
    @XmlElement(name = "AcademicProgramPriority")
    protected Integer academicProgramPriority;
    @XmlElement(name = "ApplicationQuestion")
    protected List<AdmissionsApplicationQuestionType> applicationQuestion;
    @XmlElement(name = "AcademicProgramDetail")
    protected AcademicProgramDetailType academicProgramDetail;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the programSecondarySchoolCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramSecondarySchoolCodeType }
     *     
     */
    public ProgramSecondarySchoolCodeType getProgramSecondarySchoolCode() {
        return programSecondarySchoolCode;
    }

    /**
     * Sets the value of the programSecondarySchoolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramSecondarySchoolCodeType }
     *     
     */
    public void setProgramSecondarySchoolCode(ProgramSecondarySchoolCodeType value) {
        this.programSecondarySchoolCode = value;
    }

    /**
     * Gets the value of the programCIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCIPCode() {
        return programCIPCode;
    }

    /**
     * Sets the value of the programCIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCIPCode(String value) {
        this.programCIPCode = value;
    }

    /**
     * Gets the value of the programHEGISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramHEGISCode() {
        return programHEGISCode;
    }

    /**
     * Sets the value of the programHEGISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramHEGISCode(String value) {
        this.programHEGISCode = value;
    }

    /**
     * Gets the value of the programCSISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCSISCode() {
        return programCSISCode;
    }

    /**
     * Sets the value of the programCSISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCSISCode(String value) {
        this.programCSISCode = value;
    }

    /**
     * Gets the value of the programUSISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramUSISCode() {
        return programUSISCode;
    }

    /**
     * Sets the value of the programUSISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramUSISCode(String value) {
        this.programUSISCode = value;
    }

    /**
     * Gets the value of the programESISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramESISCode() {
        return programESISCode;
    }

    /**
     * Sets the value of the programESISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramESISCode(String value) {
        this.programESISCode = value;
    }

    /**
     * Gets the value of the programLocalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramLocalCode() {
        return programLocalCode;
    }

    /**
     * Sets the value of the programLocalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramLocalCode(String value) {
        this.programLocalCode = value;
    }

    /**
     * Gets the value of the academicProgramCampus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicProgramCampus() {
        return academicProgramCampus;
    }

    /**
     * Sets the value of the academicProgramCampus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicProgramCampus(String value) {
        this.academicProgramCampus = value;
    }

    /**
     * Gets the value of the plannedEnrollmentStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PlannedEnrollmentStatusType }
     *     
     */
    public PlannedEnrollmentStatusType getPlannedEnrollmentStatus() {
        return plannedEnrollmentStatus;
    }

    /**
     * Sets the value of the plannedEnrollmentStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlannedEnrollmentStatusType }
     *     
     */
    public void setPlannedEnrollmentStatus(PlannedEnrollmentStatusType value) {
        this.plannedEnrollmentStatus = value;
    }

    /**
     * Gets the value of the academicProgramDegreeLevel property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicProgramDegreeLevelType }
     *     
     */
    public AcademicProgramDegreeLevelType getAcademicProgramDegreeLevel() {
        return academicProgramDegreeLevel;
    }

    /**
     * Sets the value of the academicProgramDegreeLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicProgramDegreeLevelType }
     *     
     */
    public void setAcademicProgramDegreeLevel(AcademicProgramDegreeLevelType value) {
        this.academicProgramDegreeLevel = value;
    }

    /**
     * Gets the value of the academicProgramPriority property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAcademicProgramPriority() {
        return academicProgramPriority;
    }

    /**
     * Sets the value of the academicProgramPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAcademicProgramPriority(Integer value) {
        this.academicProgramPriority = value;
    }

    /**
     * Gets the value of the applicationQuestion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicationQuestion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicationQuestion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdmissionsApplicationQuestionType }
     * 
     * 
     */
    public List<AdmissionsApplicationQuestionType> getApplicationQuestion() {
        if (applicationQuestion == null) {
            applicationQuestion = new ArrayList<AdmissionsApplicationQuestionType>();
        }
        return this.applicationQuestion;
    }

    /**
     * Gets the value of the academicProgramDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicProgramDetailType }
     *     
     */
    public AcademicProgramDetailType getAcademicProgramDetail() {
        return academicProgramDetail;
    }

    /**
     * Sets the value of the academicProgramDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicProgramDetailType }
     *     
     */
    public void setAcademicProgramDetail(AcademicProgramDetailType value) {
        this.academicProgramDetail = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessage() {
        if (noteMessage == null) {
            noteMessage = new ArrayList<String>();
        }
        return this.noteMessage;
    }

}