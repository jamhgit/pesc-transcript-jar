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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * A code that uniquely identifies a examinee
 * 
 * <p>Java class for StudentIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StudentIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolAssignedPersonID" type="{urn:org:pesc:core:CoreMain:v1.14.0}SchoolAssignedPersonIDType" minOccurs="0"/>
 *         &lt;element name="SIN" type="{urn:org:pesc:core:CoreMain:v1.14.0}SINIDType" minOccurs="0"/>
 *         &lt;element name="NSN" type="{urn:org:pesc:core:CoreMain:v1.14.0}NSNIDType" minOccurs="0"/>
 *         &lt;element name="AgencyAssignedID" type="{urn:org:pesc:core:CoreMain:v1.14.0}AgencyAssignedIDType" minOccurs="0"/>
 *         &lt;element name="RecipientAssignedID" type="{urn:org:pesc:core:CoreMain:v1.14.0}RecipientAssignedIDType" minOccurs="0"/>
 *         &lt;element name="SSN" type="{urn:org:pesc:core:CoreMain:v1.14.0}SSNType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StudentIdentificationType", propOrder = {
    "schoolAssignedPersonID",
    "sin",
    "nsn",
    "agencyAssignedID",
    "recipientAssignedID",
    "ssn"
})
public class StudentIdentificationType {

    @XmlElement(name = "SchoolAssignedPersonID")
    protected String schoolAssignedPersonID;
    @XmlElement(name = "SIN")
    protected String sin;
    @XmlElement(name = "NSN")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nsn;
    @XmlElement(name = "AgencyAssignedID")
    protected String agencyAssignedID;
    @XmlElement(name = "RecipientAssignedID")
    protected String recipientAssignedID;
    @XmlElement(name = "SSN")
    protected String ssn;

    /**
     * Gets the value of the schoolAssignedPersonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchoolAssignedPersonID() {
        return schoolAssignedPersonID;
    }

    /**
     * Sets the value of the schoolAssignedPersonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchoolAssignedPersonID(String value) {
        this.schoolAssignedPersonID = value;
    }

    /**
     * Gets the value of the sin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIN() {
        return sin;
    }

    /**
     * Sets the value of the sin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIN(String value) {
        this.sin = value;
    }

    /**
     * Gets the value of the nsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNSN() {
        return nsn;
    }

    /**
     * Sets the value of the nsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNSN(String value) {
        this.nsn = value;
    }

    /**
     * Gets the value of the agencyAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyAssignedID() {
        return agencyAssignedID;
    }

    /**
     * Sets the value of the agencyAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyAssignedID(String value) {
        this.agencyAssignedID = value;
    }

    /**
     * Gets the value of the recipientAssignedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientAssignedID() {
        return recipientAssignedID;
    }

    /**
     * Sets the value of the recipientAssignedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientAssignedID(String value) {
        this.recipientAssignedID = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

}
