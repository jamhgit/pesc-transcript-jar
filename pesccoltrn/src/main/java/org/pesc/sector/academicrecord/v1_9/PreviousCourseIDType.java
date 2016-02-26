//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PreviousCourseIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousCourseIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseSubjectAbbreviation" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseSubjectAbbreviationType"/>
 *         &lt;element name="CourseNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseNumberType"/>
 *         &lt;element name="CourseEffectiveDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseEffectiveDateType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreviousCourseIDType", propOrder = {
    "courseSubjectAbbreviation",
    "courseNumber",
    "courseEffectiveDate"
})
public class PreviousCourseIDType {

    @XmlElement(name = "CourseSubjectAbbreviation", required = true)
    protected String courseSubjectAbbreviation;
    @XmlElement(name = "CourseNumber", required = true)
    protected String courseNumber;
    @XmlElement(name = "CourseEffectiveDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar courseEffectiveDate;

    /**
     * Gets the value of the courseSubjectAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSubjectAbbreviation() {
        return courseSubjectAbbreviation;
    }

    /**
     * Sets the value of the courseSubjectAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSubjectAbbreviation(String value) {
        this.courseSubjectAbbreviation = value;
    }

    /**
     * Gets the value of the courseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Sets the value of the courseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNumber(String value) {
        this.courseNumber = value;
    }

    /**
     * Gets the value of the courseEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCourseEffectiveDate() {
        return courseEffectiveDate;
    }

    /**
     * Sets the value of the courseEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCourseEffectiveDate(XMLGregorianCalendar value) {
        this.courseEffectiveDate = value;
    }

}