//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.sector.admissionsrecord.v1_3;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.HighSchoolSubjectAreaCodeType;


/**
 * <p>Java class for HighSchoolSubjectAreaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighSchoolSubjectAreaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HighSchoolSubjectAreaCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}HighSchoolSubjectAreaCodeType" minOccurs="0"/>
 *         &lt;element name="CourseCreditValue" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCreditValueType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighSchoolSubjectAreaType", propOrder = {
    "highSchoolSubjectAreaCode",
    "courseCreditValue"
})
public class HighSchoolSubjectAreaType {

    @XmlElement(name = "HighSchoolSubjectAreaCode")
    @XmlSchemaType(name = "string")
    protected HighSchoolSubjectAreaCodeType highSchoolSubjectAreaCode;
    @XmlElement(name = "CourseCreditValue")
    protected BigDecimal courseCreditValue;

    /**
     * Gets the value of the highSchoolSubjectAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link HighSchoolSubjectAreaCodeType }
     *     
     */
    public HighSchoolSubjectAreaCodeType getHighSchoolSubjectAreaCode() {
        return highSchoolSubjectAreaCode;
    }

    /**
     * Sets the value of the highSchoolSubjectAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link HighSchoolSubjectAreaCodeType }
     *     
     */
    public void setHighSchoolSubjectAreaCode(HighSchoolSubjectAreaCodeType value) {
        this.highSchoolSubjectAreaCode = value;
    }

    /**
     * Gets the value of the courseCreditValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseCreditValue() {
        return courseCreditValue;
    }

    /**
     * Sets the value of the courseCreditValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseCreditValue(BigDecimal value) {
        this.courseCreditValue = value;
    }

}