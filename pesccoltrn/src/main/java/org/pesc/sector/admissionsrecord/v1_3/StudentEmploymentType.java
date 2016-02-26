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
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_14.EmploymentStatusCodeType;
import org.pesc.core.coremain.v1_14.FamilyEmployedCodeType;
import org.pesc.core.coremain.v1_14.OrganizationEntityType;


/**
 * <p>Java class for StudentEmploymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentEmploymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Employer" type="{urn:org:pesc:core:CoreMain:v1.14.0}OrganizationEntityType" minOccurs="0"/>
 *         &lt;element name="EmploymentBeginYearMonth" type="{urn:org:pesc:core:CoreMain:v1.14.0}EmploymentBeginYearMonthType" minOccurs="0"/>
 *         &lt;element name="EmploymentEndYearMonth" type="{urn:org:pesc:core:CoreMain:v1.14.0}EmploymentEndYearMonthType" minOccurs="0"/>
 *         &lt;element name="PositionTitle" type="{urn:org:pesc:core:CoreMain:v1.14.0}PositionTitleType" minOccurs="0"/>
 *         &lt;element name="SchoolAppliedEmployedCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}FamilyEmployedCodeType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="StateProvinceEmployedCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}FamilyEmployedCodeType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="EmploymentStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}EmploymentStatusCodeType" minOccurs="0"/>
 *         &lt;element name="EmploymentWeeklyHours" type="{urn:org:pesc:core:CoreMain:v1.14.0}WeeklyHoursType" minOccurs="0"/>
 *         &lt;element name="JobDescription" type="{urn:org:pesc:core:CoreMain:v1.14.0}JobDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "StudentEmploymentType", propOrder = {
    "employer",
    "employmentBeginYearMonth",
    "employmentEndYearMonth",
    "positionTitle",
    "schoolAppliedEmployedCode",
    "stateProvinceEmployedCode",
    "employmentStatusCode",
    "employmentWeeklyHours",
    "jobDescription",
    "noteMessage"
})
public class StudentEmploymentType {

    @XmlElement(name = "Employer")
    protected OrganizationEntityType employer;
    @XmlElement(name = "EmploymentBeginYearMonth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar employmentBeginYearMonth;
    @XmlElement(name = "EmploymentEndYearMonth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar employmentEndYearMonth;
    @XmlElement(name = "PositionTitle")
    protected String positionTitle;
    @XmlElement(name = "SchoolAppliedEmployedCode")
    @XmlSchemaType(name = "string")
    protected List<FamilyEmployedCodeType> schoolAppliedEmployedCode;
    @XmlElement(name = "StateProvinceEmployedCode")
    @XmlSchemaType(name = "string")
    protected List<FamilyEmployedCodeType> stateProvinceEmployedCode;
    @XmlElement(name = "EmploymentStatusCode")
    @XmlSchemaType(name = "string")
    protected EmploymentStatusCodeType employmentStatusCode;
    @XmlElement(name = "EmploymentWeeklyHours")
    protected Integer employmentWeeklyHours;
    @XmlElement(name = "JobDescription")
    protected List<String> jobDescription;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the employer property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationEntityType }
     *     
     */
    public OrganizationEntityType getEmployer() {
        return employer;
    }

    /**
     * Sets the value of the employer property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationEntityType }
     *     
     */
    public void setEmployer(OrganizationEntityType value) {
        this.employer = value;
    }

    /**
     * Gets the value of the employmentBeginYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmploymentBeginYearMonth() {
        return employmentBeginYearMonth;
    }

    /**
     * Sets the value of the employmentBeginYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmploymentBeginYearMonth(XMLGregorianCalendar value) {
        this.employmentBeginYearMonth = value;
    }

    /**
     * Gets the value of the employmentEndYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmploymentEndYearMonth() {
        return employmentEndYearMonth;
    }

    /**
     * Sets the value of the employmentEndYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmploymentEndYearMonth(XMLGregorianCalendar value) {
        this.employmentEndYearMonth = value;
    }

    /**
     * Gets the value of the positionTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionTitle() {
        return positionTitle;
    }

    /**
     * Sets the value of the positionTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionTitle(String value) {
        this.positionTitle = value;
    }

    /**
     * Gets the value of the schoolAppliedEmployedCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolAppliedEmployedCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolAppliedEmployedCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyEmployedCodeType }
     * 
     * 
     */
    public List<FamilyEmployedCodeType> getSchoolAppliedEmployedCode() {
        if (schoolAppliedEmployedCode == null) {
            schoolAppliedEmployedCode = new ArrayList<FamilyEmployedCodeType>();
        }
        return this.schoolAppliedEmployedCode;
    }

    /**
     * Gets the value of the stateProvinceEmployedCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateProvinceEmployedCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateProvinceEmployedCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyEmployedCodeType }
     * 
     * 
     */
    public List<FamilyEmployedCodeType> getStateProvinceEmployedCode() {
        if (stateProvinceEmployedCode == null) {
            stateProvinceEmployedCode = new ArrayList<FamilyEmployedCodeType>();
        }
        return this.stateProvinceEmployedCode;
    }

    /**
     * Gets the value of the employmentStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link EmploymentStatusCodeType }
     *     
     */
    public EmploymentStatusCodeType getEmploymentStatusCode() {
        return employmentStatusCode;
    }

    /**
     * Sets the value of the employmentStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmploymentStatusCodeType }
     *     
     */
    public void setEmploymentStatusCode(EmploymentStatusCodeType value) {
        this.employmentStatusCode = value;
    }

    /**
     * Gets the value of the employmentWeeklyHours property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEmploymentWeeklyHours() {
        return employmentWeeklyHours;
    }

    /**
     * Sets the value of the employmentWeeklyHours property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEmploymentWeeklyHours(Integer value) {
        this.employmentWeeklyHours = value;
    }

    /**
     * Gets the value of the jobDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jobDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJobDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getJobDescription() {
        if (jobDescription == null) {
            jobDescription = new ArrayList<String>();
        }
        return this.jobDescription;
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