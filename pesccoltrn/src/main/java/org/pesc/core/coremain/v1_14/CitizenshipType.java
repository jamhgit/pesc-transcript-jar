//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CitizenshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CitizenshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CitizenshipStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CitizenshipStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CitizenshipCountryCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CitizenshipCountryCodeType" minOccurs="0"/>
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
@XmlType(name = "CitizenshipType", propOrder = {
    "citizenshipStatusCode",
    "citizenshipCountryCode",
    "noteMessage"
})
public class CitizenshipType {

    @XmlElement(name = "CitizenshipStatusCode")
    @XmlSchemaType(name = "string")
    protected CitizenshipStatusCodeType citizenshipStatusCode;
    @XmlElement(name = "CitizenshipCountryCode")
    @XmlSchemaType(name = "string")
    protected CountryCodeType citizenshipCountryCode;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the citizenshipStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CitizenshipStatusCodeType }
     *     
     */
    public CitizenshipStatusCodeType getCitizenshipStatusCode() {
        return citizenshipStatusCode;
    }

    /**
     * Sets the value of the citizenshipStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CitizenshipStatusCodeType }
     *     
     */
    public void setCitizenshipStatusCode(CitizenshipStatusCodeType value) {
        this.citizenshipStatusCode = value;
    }

    /**
     * Gets the value of the citizenshipCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCitizenshipCountryCode() {
        return citizenshipCountryCode;
    }

    /**
     * Sets the value of the citizenshipCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCitizenshipCountryCode(CountryCodeType value) {
        this.citizenshipCountryCode = value;
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
