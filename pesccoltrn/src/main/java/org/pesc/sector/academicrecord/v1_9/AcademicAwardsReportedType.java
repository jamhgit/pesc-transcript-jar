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
 * <p>Java class for AcademicAwardsReportedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicAwardsReportedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicAwardTitle" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicAwardTitleType" minOccurs="0"/>
 *         &lt;element name="AcademicAwardDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicAwardDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicAwardsReportedType", propOrder = {
    "academicAwardTitle",
    "academicAwardDate"
})
public class AcademicAwardsReportedType {

    @XmlElement(name = "AcademicAwardTitle")
    protected String academicAwardTitle;
    @XmlElement(name = "AcademicAwardDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar academicAwardDate;

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

}
