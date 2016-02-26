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
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.AcademicSessionDetailType;
import org.pesc.core.coremain.v1_14.StudentLevelType;
import org.pesc.core.coremain.v1_14.UserDefinedExtensionsType;


/**
 * <p>Java class for AcademicSessionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicSessionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicSessionDetail" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicSessionDetailType"/>
 *         &lt;element name="School" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}SchoolType" minOccurs="0"/>
 *         &lt;element name="StudentLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}StudentLevelType" minOccurs="0"/>
 *         &lt;element name="AcademicProgram" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AcademicProgramType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicAward" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AcademicAwardType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Course" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}CourseType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicSummary" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AcademicSummaryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.14.0}UserDefinedExtensionsType" minOccurs="0"/>
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
@XmlType(name = "AcademicSessionType", propOrder = {
    "academicSessionDetail",
    "school",
    "studentLevel",
    "academicProgram",
    "academicAward",
    "course",
    "academicSummary",
    "userDefinedExtensions",
    "noteMessage"
})
public class AcademicSessionType {

    @XmlElement(name = "AcademicSessionDetail", required = true)
    protected AcademicSessionDetailType academicSessionDetail;
    @XmlElement(name = "School")
    protected SchoolType school;
    @XmlElement(name = "StudentLevel")
    protected StudentLevelType studentLevel;
    @XmlElement(name = "AcademicProgram")
    protected List<AcademicProgramType> academicProgram;
    @XmlElement(name = "AcademicAward")
    protected List<AcademicAwardType> academicAward;
    @XmlElement(name = "Course")
    protected List<CourseType> course;
    @XmlElement(name = "AcademicSummary")
    protected List<AcademicSummaryType> academicSummary;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the academicSessionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSessionDetailType }
     *     
     */
    public AcademicSessionDetailType getAcademicSessionDetail() {
        return academicSessionDetail;
    }

    /**
     * Sets the value of the academicSessionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSessionDetailType }
     *     
     */
    public void setAcademicSessionDetail(AcademicSessionDetailType value) {
        this.academicSessionDetail = value;
    }

    /**
     * Gets the value of the school property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolType }
     *     
     */
    public SchoolType getSchool() {
        return school;
    }

    /**
     * Sets the value of the school property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolType }
     *     
     */
    public void setSchool(SchoolType value) {
        this.school = value;
    }

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
     * Gets the value of the academicProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicProgramType }
     * 
     * 
     */
    public List<AcademicProgramType> getAcademicProgram() {
        if (academicProgram == null) {
            academicProgram = new ArrayList<AcademicProgramType>();
        }
        return this.academicProgram;
    }

    /**
     * Gets the value of the academicAward property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicAward property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicAward().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicAwardType }
     * 
     * 
     */
    public List<AcademicAwardType> getAcademicAward() {
        if (academicAward == null) {
            academicAward = new ArrayList<AcademicAwardType>();
        }
        return this.academicAward;
    }

    /**
     * Gets the value of the course property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the course property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseType }
     * 
     * 
     */
    public List<CourseType> getCourse() {
        if (course == null) {
            course = new ArrayList<CourseType>();
        }
        return this.course;
    }

    /**
     * Gets the value of the academicSummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicSummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicSummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicSummaryType }
     * 
     * 
     */
    public List<AcademicSummaryType> getAcademicSummary() {
        if (academicSummary == null) {
            academicSummary = new ArrayList<AcademicSummaryType>();
        }
        return this.academicSummary;
    }

    /**
     * Gets the value of the userDefinedExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public UserDefinedExtensionsType getUserDefinedExtensions() {
        return userDefinedExtensions;
    }

    /**
     * Sets the value of the userDefinedExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public void setUserDefinedExtensions(UserDefinedExtensionsType value) {
        this.userDefinedExtensions = value;
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
