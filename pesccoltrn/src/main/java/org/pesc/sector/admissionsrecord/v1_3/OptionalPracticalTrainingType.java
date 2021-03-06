//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.sector.admissionsrecord.v1_3;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_14.OPTStatusCodeType;
import org.pesc.core.coremain.v1_14.TrainingLevelCodeType;


/**
 * <p>Java class for OptionalPracticalTrainingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OptionalPracticalTrainingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolName" type="{urn:org:pesc:core:CoreMain:v1.14.0}TrainingSchoolNameType" minOccurs="0"/>
 *         &lt;element name="BeginDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}BeginDateType" minOccurs="0"/>
 *         &lt;element name="EndDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}EndDateType" minOccurs="0"/>
 *         &lt;element name="OPTStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}OPTStatusCodeType" minOccurs="0"/>
 *         &lt;element name="OPTTrainingLevelCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}TrainingLevelCodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionalPracticalTrainingType", propOrder = {
    "schoolName",
    "beginDate",
    "endDate",
    "optStatusCode",
    "optTrainingLevelCode"
})
public class OptionalPracticalTrainingType {

    @XmlElement(name = "SchoolName")
    protected String schoolName;
    @XmlElement(name = "BeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar beginDate;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "OPTStatusCode")
    @XmlSchemaType(name = "string")
    protected OPTStatusCodeType optStatusCode;
    @XmlElement(name = "OPTTrainingLevelCode")
    @XmlSchemaType(name = "string")
    protected TrainingLevelCodeType optTrainingLevelCode;

    /**
     * Gets the value of the schoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * Sets the value of the schoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolName(String value) {
        this.schoolName = value;
    }

    /**
     * Gets the value of the beginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginDate() {
        return beginDate;
    }

    /**
     * Sets the value of the beginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginDate(XMLGregorianCalendar value) {
        this.beginDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the optStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OPTStatusCodeType }
     *     
     */
    public OPTStatusCodeType getOPTStatusCode() {
        return optStatusCode;
    }

    /**
     * Sets the value of the optStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTStatusCodeType }
     *     
     */
    public void setOPTStatusCode(OPTStatusCodeType value) {
        this.optStatusCode = value;
    }

    /**
     * Gets the value of the optTrainingLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link TrainingLevelCodeType }
     *     
     */
    public TrainingLevelCodeType getOPTTrainingLevelCode() {
        return optTrainingLevelCode;
    }

    /**
     * Sets the value of the optTrainingLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrainingLevelCodeType }
     *     
     */
    public void setOPTTrainingLevelCode(TrainingLevelCodeType value) {
        this.optTrainingLevelCode = value;
    }

}
