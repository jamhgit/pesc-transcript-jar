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


/**
 * <p>Java class for I94DetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="I94DetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="I94AdmissionNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}I94AdmissionNumberType" minOccurs="0"/>
 *         &lt;element name="I94PortOfEntryCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}I94PortOfEntryCodeType" minOccurs="0"/>
 *         &lt;element name="I94DateOfEntry" type="{urn:org:pesc:core:CoreMain:v1.14.0}I94DateOfEntryType" minOccurs="0"/>
 *         &lt;element name="I94ExpirationDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}I94ExpirationDateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "I94DetailType", propOrder = {
    "i94AdmissionNumber",
    "i94PortOfEntryCode",
    "i94DateOfEntry",
    "i94ExpirationDate"
})
public class I94DetailType {

    @XmlElement(name = "I94AdmissionNumber")
    protected String i94AdmissionNumber;
    @XmlElement(name = "I94PortOfEntryCode")
    protected String i94PortOfEntryCode;
    @XmlElement(name = "I94DateOfEntry")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar i94DateOfEntry;
    @XmlElement(name = "I94ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar i94ExpirationDate;

    /**
     * Gets the value of the i94AdmissionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI94AdmissionNumber() {
        return i94AdmissionNumber;
    }

    /**
     * Sets the value of the i94AdmissionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI94AdmissionNumber(String value) {
        this.i94AdmissionNumber = value;
    }

    /**
     * Gets the value of the i94PortOfEntryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getI94PortOfEntryCode() {
        return i94PortOfEntryCode;
    }

    /**
     * Sets the value of the i94PortOfEntryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setI94PortOfEntryCode(String value) {
        this.i94PortOfEntryCode = value;
    }

    /**
     * Gets the value of the i94DateOfEntry property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getI94DateOfEntry() {
        return i94DateOfEntry;
    }

    /**
     * Sets the value of the i94DateOfEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setI94DateOfEntry(XMLGregorianCalendar value) {
        this.i94DateOfEntry = value;
    }

    /**
     * Gets the value of the i94ExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getI94ExpirationDate() {
        return i94ExpirationDate;
    }

    /**
     * Sets the value of the i94ExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setI94ExpirationDate(XMLGregorianCalendar value) {
        this.i94ExpirationDate = value;
    }

}