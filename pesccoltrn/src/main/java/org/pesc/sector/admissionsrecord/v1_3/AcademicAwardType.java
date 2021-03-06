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
import org.pesc.core.coremain.v1_14.AcademicDegreeRequirementType;
import org.pesc.core.coremain.v1_14.AcademicHonorsType;


/**
 * <p>Java class for AcademicAwardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicAwardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicAwardLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicAwardLevelType" minOccurs="0"/>
 *         &lt;element name="AcademicAwardDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicAwardDateType" minOccurs="0"/>
 *         &lt;element name="AcademicAwardTitle" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicAwardTitleType" minOccurs="0"/>
 *         &lt;element name="AcademicHonors" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicHonorsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicCompletionIndicator" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicCompletionIndicatorType" minOccurs="0"/>
 *         &lt;element name="AcademicCompletionDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicCompletionDateType" minOccurs="0"/>
 *         &lt;element name="AcademicAwardProgram" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AcademicProgramType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicDegreeRequirement" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicDegreeRequirementType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicSummary" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}AcademicSummaryType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AcademicAwardType", propOrder = {
    "academicAwardLevel",
    "academicAwardDate",
    "academicAwardTitle",
    "academicHonors",
    "academicCompletionIndicator",
    "academicCompletionDate",
    "academicAwardProgram",
    "academicDegreeRequirement",
    "academicSummary",
    "noteMessage"
})
public class AcademicAwardType {

    @XmlElement(name = "AcademicAwardLevel")
    protected String academicAwardLevel;
    @XmlElement(name = "AcademicAwardDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar academicAwardDate;
    @XmlElement(name = "AcademicAwardTitle")
    protected String academicAwardTitle;
    @XmlElement(name = "AcademicHonors")
    protected List<AcademicHonorsType> academicHonors;
    @XmlElement(name = "AcademicCompletionIndicator")
    protected Boolean academicCompletionIndicator;
    @XmlElement(name = "AcademicCompletionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar academicCompletionDate;
    @XmlElement(name = "AcademicAwardProgram")
    protected List<AcademicProgramType> academicAwardProgram;
    @XmlElement(name = "AcademicDegreeRequirement")
    protected List<AcademicDegreeRequirementType> academicDegreeRequirement;
    @XmlElement(name = "AcademicSummary")
    protected List<AcademicSummaryType> academicSummary;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the academicAwardLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAwardLevel() {
        return academicAwardLevel;
    }

    /**
     * Sets the value of the academicAwardLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAwardLevel(String value) {
        this.academicAwardLevel = value;
    }

    /**
     * Gets the value of the academicAwardDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicAwardDate() {
        return academicAwardDate;
    }

    /**
     * Sets the value of the academicAwardDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicAwardDate(XMLGregorianCalendar value) {
        this.academicAwardDate = value;
    }

    /**
     * Gets the value of the academicAwardTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicAwardTitle() {
        return academicAwardTitle;
    }

    /**
     * Sets the value of the academicAwardTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicAwardTitle(String value) {
        this.academicAwardTitle = value;
    }

    /**
     * Gets the value of the academicHonors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicHonors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicHonors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicHonorsType }
     * 
     * 
     */
    public List<AcademicHonorsType> getAcademicHonors() {
        if (academicHonors == null) {
            academicHonors = new ArrayList<AcademicHonorsType>();
        }
        return this.academicHonors;
    }

    /**
     * Gets the value of the academicCompletionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcademicCompletionIndicator() {
        return academicCompletionIndicator;
    }

    /**
     * Sets the value of the academicCompletionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcademicCompletionIndicator(Boolean value) {
        this.academicCompletionIndicator = value;
    }

    /**
     * Gets the value of the academicCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAcademicCompletionDate() {
        return academicCompletionDate;
    }

    /**
     * Sets the value of the academicCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAcademicCompletionDate(XMLGregorianCalendar value) {
        this.academicCompletionDate = value;
    }

    /**
     * Gets the value of the academicAwardProgram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicAwardProgram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicAwardProgram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicProgramType }
     * 
     * 
     */
    public List<AcademicProgramType> getAcademicAwardProgram() {
        if (academicAwardProgram == null) {
            academicAwardProgram = new ArrayList<AcademicProgramType>();
        }
        return this.academicAwardProgram;
    }

    /**
     * Gets the value of the academicDegreeRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicDegreeRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicDegreeRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicDegreeRequirementType }
     * 
     * 
     */
    public List<AcademicDegreeRequirementType> getAcademicDegreeRequirement() {
        if (academicDegreeRequirement == null) {
            academicDegreeRequirement = new ArrayList<AcademicDegreeRequirementType>();
        }
        return this.academicDegreeRequirement;
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
