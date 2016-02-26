//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_14.AttendanceType;
import org.pesc.core.coremain.v1_14.DegreeSeekingStatusCodeType;
import org.pesc.core.coremain.v1_14.StudentLevelType;


/**
 * <p>Java class for EnrollmentStatusCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnrollmentStatusCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}StudentLevelType" minOccurs="0"/>
 *         &lt;element name="Attendance" type="{urn:org:pesc:core:CoreMain:v1.14.0}AttendanceType" minOccurs="0"/>
 *         &lt;element name="DegreeSeekingStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}DegreeSeekingStatusCodeType" minOccurs="0"/>
 *         &lt;element name="ProgramLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}ProgramLevelType" minOccurs="0"/>
 *         &lt;element name="AcademicProgram" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}AcademicProgramType" minOccurs="0"/>
 *         &lt;element name="EnrollDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}EnrollDateType" minOccurs="0"/>
 *         &lt;element name="ExitDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}ExitDateType" minOccurs="0"/>
 *         &lt;element name="EligibilityEndDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}EligibilityEndDateType" minOccurs="0"/>
 *         &lt;element name="AnticipatedGraduationDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}AnticipatedGraduationDateType" minOccurs="0"/>
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
@XmlType(name = "EnrollmentStatusCodeType", propOrder = {
    "studentLevel",
    "attendance",
    "degreeSeekingStatusCode",
    "programLevel",
    "academicProgram",
    "enrollDate",
    "exitDate",
    "eligibilityEndDate",
    "anticipatedGraduationDate",
    "noteMessage"
})
public class EnrollmentStatusCodeType {

    @XmlElement(name = "StudentLevel")
    protected StudentLevelType studentLevel;
    @XmlElement(name = "Attendance")
    protected AttendanceType attendance;
    @XmlElement(name = "DegreeSeekingStatusCode")
    @XmlSchemaType(name = "string")
    protected DegreeSeekingStatusCodeType degreeSeekingStatusCode;
    @XmlElement(name = "ProgramLevel")
    protected String programLevel;
    @XmlElement(name = "AcademicProgram")
    protected AcademicProgramType academicProgram;
    @XmlElement(name = "EnrollDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enrollDate;
    @XmlElement(name = "ExitDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar exitDate;
    @XmlElement(name = "EligibilityEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eligibilityEndDate;
    @XmlElement(name = "AnticipatedGraduationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar anticipatedGraduationDate;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the studentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLevelType }
     *     
     */
    public StudentLevelType getStudentLevel() {
        return studentLevel;
    }

    /**
     * Sets the value of the studentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLevelType }
     *     
     */
    public void setStudentLevel(StudentLevelType value) {
        this.studentLevel = value;
    }

    /**
     * Gets the value of the attendance property.
     * 
     * @return
     *     possible object is
     *     {@link AttendanceType }
     *     
     */
    public AttendanceType getAttendance() {
        return attendance;
    }

    /**
     * Sets the value of the attendance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttendanceType }
     *     
     */
    public void setAttendance(AttendanceType value) {
        this.attendance = value;
    }

    /**
     * Gets the value of the degreeSeekingStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link DegreeSeekingStatusCodeType }
     *     
     */
    public DegreeSeekingStatusCodeType getDegreeSeekingStatusCode() {
        return degreeSeekingStatusCode;
    }

    /**
     * Sets the value of the degreeSeekingStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link DegreeSeekingStatusCodeType }
     *     
     */
    public void setDegreeSeekingStatusCode(DegreeSeekingStatusCodeType value) {
        this.degreeSeekingStatusCode = value;
    }

    /**
     * Gets the value of the programLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramLevel() {
        return programLevel;
    }

    /**
     * Sets the value of the programLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramLevel(String value) {
        this.programLevel = value;
    }

    /**
     * Gets the value of the academicProgram property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicProgramType }
     *     
     */
    public AcademicProgramType getAcademicProgram() {
        return academicProgram;
    }

    /**
     * Sets the value of the academicProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicProgramType }
     *     
     */
    public void setAcademicProgram(AcademicProgramType value) {
        this.academicProgram = value;
    }

    /**
     * Gets the value of the enrollDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollDate() {
        return enrollDate;
    }

    /**
     * Sets the value of the enrollDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollDate(XMLGregorianCalendar value) {
        this.enrollDate = value;
    }

    /**
     * Gets the value of the exitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExitDate() {
        return exitDate;
    }

    /**
     * Sets the value of the exitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExitDate(XMLGregorianCalendar value) {
        this.exitDate = value;
    }

    /**
     * Gets the value of the eligibilityEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEligibilityEndDate() {
        return eligibilityEndDate;
    }

    /**
     * Sets the value of the eligibilityEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEligibilityEndDate(XMLGregorianCalendar value) {
        this.eligibilityEndDate = value;
    }

    /**
     * Gets the value of the anticipatedGraduationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnticipatedGraduationDate() {
        return anticipatedGraduationDate;
    }

    /**
     * Sets the value of the anticipatedGraduationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnticipatedGraduationDate(XMLGregorianCalendar value) {
        this.anticipatedGraduationDate = value;
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
