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
import org.pesc.core.coremain.v1_14.AgencyCodeType;
import org.pesc.core.coremain.v1_14.CountryCodeType;
import org.pesc.core.coremain.v1_14.StateProvinceCodeType;


/**
 * <p>Java class for AgencyIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgencyIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgencyAssignedID" type="{urn:org:pesc:core:CoreMain:v1.14.0}AgencyAssignedIDType" minOccurs="0"/>
 *         &lt;element name="AgencyCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}AgencyCodeType" minOccurs="0"/>
 *         &lt;element name="AgencyName" type="{urn:org:pesc:core:CoreMain:v1.14.0}AgencyNameType" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CountryCodeType" minOccurs="0"/>
 *         &lt;element name="StateProvinceCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}StateProvinceCodeType" minOccurs="0"/>
 *         &lt;element name="OtherAgency" type="{urn:org:pesc:core:CoreMain:v1.14.0}OtherAgencyType" minOccurs="0"/>
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
@XmlType(name = "AgencyIdentifierType", propOrder = {
    "agencyAssignedID",
    "agencyCode",
    "agencyName",
    "countryCode",
    "stateProvinceCode",
    "otherAgency",
    "noteMessage"
})
public class AgencyIdentifierType {

    @XmlElement(name = "AgencyAssignedID")
    protected String agencyAssignedID;
    @XmlElement(name = "AgencyCode")
    @XmlSchemaType(name = "string")
    protected AgencyCodeType agencyCode;
    @XmlElement(name = "AgencyName")
    protected String agencyName;
    @XmlElement(name = "CountryCode")
    @XmlSchemaType(name = "string")
    protected CountryCodeType countryCode;
    @XmlElement(name = "StateProvinceCode")
    @XmlSchemaType(name = "token")
    protected StateProvinceCodeType stateProvinceCode;
    @XmlElement(name = "OtherAgency")
    protected String otherAgency;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

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
     * Gets the value of the agencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link AgencyCodeType }
     *     
     */
    public AgencyCodeType getAgencyCode() {
        return agencyCode;
    }

    /**
     * Sets the value of the agencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AgencyCodeType }
     *     
     */
    public void setAgencyCode(AgencyCodeType value) {
        this.agencyCode = value;
    }

    /**
     * Gets the value of the agencyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * Sets the value of the agencyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyName(String value) {
        this.agencyName = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link CountryCodeType }
     *     
     */
    public CountryCodeType getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryCodeType }
     *     
     */
    public void setCountryCode(CountryCodeType value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the stateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceCodeType }
     *     
     */
    public StateProvinceCodeType getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Sets the value of the stateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceCodeType }
     *     
     */
    public void setStateProvinceCode(StateProvinceCodeType value) {
        this.stateProvinceCode = value;
    }

    /**
     * Gets the value of the otherAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherAgency() {
        return otherAgency;
    }

    /**
     * Sets the value of the otherAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherAgency(String value) {
        this.otherAgency = value;
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
