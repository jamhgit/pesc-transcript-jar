//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DriversLicenseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DriversLicenseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DriversLicenseState" type="{urn:org:pesc:core:CoreMain:v1.14.0}StateProvinceCodeType" minOccurs="0"/>
 *         &lt;element name="DriversLicenseNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}DriversLicenseNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DriversLicenseType", propOrder = {
    "driversLicenseState",
    "driversLicenseNumber"
})
public class DriversLicenseType {

    @XmlElement(name = "DriversLicenseState")
    @XmlSchemaType(name = "token")
    protected StateProvinceCodeType driversLicenseState;
    @XmlElement(name = "DriversLicenseNumber", required = true)
    protected String driversLicenseNumber;

    /**
     * Gets the value of the driversLicenseState property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceCodeType }
     *     
     */
    public StateProvinceCodeType getDriversLicenseState() {
        return driversLicenseState;
    }

    /**
     * Sets the value of the driversLicenseState property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceCodeType }
     *     
     */
    public void setDriversLicenseState(StateProvinceCodeType value) {
        this.driversLicenseState = value;
    }

    /**
     * Gets the value of the driversLicenseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDriversLicenseNumber() {
        return driversLicenseNumber;
    }

    /**
     * Sets the value of the driversLicenseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDriversLicenseNumber(String value) {
        this.driversLicenseNumber = value;
    }

}