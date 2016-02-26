//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.AcademicHonorsType;
import org.pesc.core.coremain.v1_14.StudentLevelType;


/**
 * Transfer Credit Type
 * 
 * <p>Java class for TransferCreditType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransferCreditType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransferCoursesAccepted" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}CourseType" minOccurs="0"/>
 *         &lt;element name="TransferCreditHoursAccepted" type="{urn:org:pesc:core:CoreMain:v1.14.0}TransferCreditHoursAcceptedType" minOccurs="0"/>
 *         &lt;element name="TransferCreditHoursAppliedtoDegree" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}TransferCreditType" minOccurs="0"/>
 *         &lt;element name="TransferStudentLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}StudentLevelType" minOccurs="0"/>
 *         &lt;element name="TransferStudentHonors" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicHonorsType" minOccurs="0"/>
 *         &lt;element name="TransferStudentSummary" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}AcademicSummaryFType" minOccurs="0"/>
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
@XmlType(name = "TransferCreditType", propOrder = {
    "transferCoursesAccepted",
    "transferCreditHoursAccepted",
    "transferCreditHoursAppliedtoDegree",
    "transferStudentLevel",
    "transferStudentHonors",
    "transferStudentSummary",
    "noteMessage"
})
public class TransferCreditType {

    @XmlElement(name = "TransferCoursesAccepted")
    protected CourseType transferCoursesAccepted;
    @XmlElement(name = "TransferCreditHoursAccepted")
    protected BigDecimal transferCreditHoursAccepted;
    @XmlElement(name = "TransferCreditHoursAppliedtoDegree")
    protected TransferCreditType transferCreditHoursAppliedtoDegree;
    @XmlElement(name = "TransferStudentLevel")
    protected StudentLevelType transferStudentLevel;
    @XmlElement(name = "TransferStudentHonors")
    protected AcademicHonorsType transferStudentHonors;
    @XmlElement(name = "TransferStudentSummary")
    protected AcademicSummaryFType transferStudentSummary;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the transferCoursesAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link CourseType }
     *     
     */
    public CourseType getTransferCoursesAccepted() {
        return transferCoursesAccepted;
    }

    /**
     * Sets the value of the transferCoursesAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseType }
     *     
     */
    public void setTransferCoursesAccepted(CourseType value) {
        this.transferCoursesAccepted = value;
    }

    /**
     * Gets the value of the transferCreditHoursAccepted property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTransferCreditHoursAccepted() {
        return transferCreditHoursAccepted;
    }

    /**
     * Sets the value of the transferCreditHoursAccepted property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTransferCreditHoursAccepted(BigDecimal value) {
        this.transferCreditHoursAccepted = value;
    }

    /**
     * Gets the value of the transferCreditHoursAppliedtoDegree property.
     * 
     * @return
     *     possible object is
     *     {@link TransferCreditType }
     *     
     */
    public TransferCreditType getTransferCreditHoursAppliedtoDegree() {
        return transferCreditHoursAppliedtoDegree;
    }

    /**
     * Sets the value of the transferCreditHoursAppliedtoDegree property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferCreditType }
     *     
     */
    public void setTransferCreditHoursAppliedtoDegree(TransferCreditType value) {
        this.transferCreditHoursAppliedtoDegree = value;
    }

    /**
     * Gets the value of the transferStudentLevel property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLevelType }
     *     
     */
    public StudentLevelType getTransferStudentLevel() {
        return transferStudentLevel;
    }

    /**
     * Sets the value of the transferStudentLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLevelType }
     *     
     */
    public void setTransferStudentLevel(StudentLevelType value) {
        this.transferStudentLevel = value;
    }

    /**
     * Gets the value of the transferStudentHonors property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicHonorsType }
     *     
     */
    public AcademicHonorsType getTransferStudentHonors() {
        return transferStudentHonors;
    }

    /**
     * Sets the value of the transferStudentHonors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicHonorsType }
     *     
     */
    public void setTransferStudentHonors(AcademicHonorsType value) {
        this.transferStudentHonors = value;
    }

    /**
     * Gets the value of the transferStudentSummary property.
     * 
     * @return
     *     possible object is
     *     {@link AcademicSummaryFType }
     *     
     */
    public AcademicSummaryFType getTransferStudentSummary() {
        return transferStudentSummary;
    }

    /**
     * Sets the value of the transferStudentSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcademicSummaryFType }
     *     
     */
    public void setTransferStudentSummary(AcademicSummaryFType value) {
        this.transferStudentSummary = value;
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