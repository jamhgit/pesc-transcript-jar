//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.CourseRepeatabilityCodeType;


/**
 * <p>Java class for CourseRepeatabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseRepeatabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseRepeatabilityIndicator">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:org:pesc:core:CoreMain:v1.14.0}CourseRepeatabilityCodeType">
 *               &lt;enumeration value="No"/>
 *               &lt;enumeration value="Yes"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CourseRepeatabilityMaximumCredit" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseRepeatabilityMaxCreditType"/>
 *         &lt;element name="CourseRepeatabilityMaximumNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseRepeatabilityMaxNumberType"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.14.0}NoteMessageType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseRepeatabilityType", propOrder = {
    "courseRepeatabilityIndicator",
    "courseRepeatabilityMaximumCredit",
    "courseRepeatabilityMaximumNumber",
    "noteMessage"
})
public class CourseRepeatabilityType {

    @XmlElement(name = "CourseRepeatabilityIndicator", required = true)
    protected CourseRepeatabilityCodeType courseRepeatabilityIndicator;
    @XmlElement(name = "CourseRepeatabilityMaximumCredit", required = true)
    protected BigDecimal courseRepeatabilityMaximumCredit;
    @XmlElement(name = "CourseRepeatabilityMaximumNumber", required = true)
    protected BigInteger courseRepeatabilityMaximumNumber;
    @XmlElement(name = "NoteMessage")
    protected String noteMessage;

    /**
     * Gets the value of the courseRepeatabilityIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link CourseRepeatabilityCodeType }
     *     
     */
    public CourseRepeatabilityCodeType getCourseRepeatabilityIndicator() {
        return courseRepeatabilityIndicator;
    }

    /**
     * Sets the value of the courseRepeatabilityIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseRepeatabilityCodeType }
     *     
     */
    public void setCourseRepeatabilityIndicator(CourseRepeatabilityCodeType value) {
        this.courseRepeatabilityIndicator = value;
    }

    /**
     * Gets the value of the courseRepeatabilityMaximumCredit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseRepeatabilityMaximumCredit() {
        return courseRepeatabilityMaximumCredit;
    }

    /**
     * Sets the value of the courseRepeatabilityMaximumCredit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseRepeatabilityMaximumCredit(BigDecimal value) {
        this.courseRepeatabilityMaximumCredit = value;
    }

    /**
     * Gets the value of the courseRepeatabilityMaximumNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCourseRepeatabilityMaximumNumber() {
        return courseRepeatabilityMaximumNumber;
    }

    /**
     * Sets the value of the courseRepeatabilityMaximumNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCourseRepeatabilityMaximumNumber(BigInteger value) {
        this.courseRepeatabilityMaximumNumber = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * Sets the value of the noteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMessage(String value) {
        this.noteMessage = value;
    }

}
