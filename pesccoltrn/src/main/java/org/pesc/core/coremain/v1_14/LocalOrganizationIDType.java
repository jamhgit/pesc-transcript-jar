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
 * <p>Java class for LocalOrganizationIDType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalOrganizationIDType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocalOrganizationIDCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}LocalOrganizationIDCodeType"/>
 *         &lt;element name="LocalOrganizationIDQualifier" type="{urn:org:pesc:core:CoreMain:v1.14.0}LocalOrganizationIDCodeQualifierType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalOrganizationIDType", propOrder = {
    "localOrganizationIDCode",
    "localOrganizationIDQualifier"
})
public class LocalOrganizationIDType {

    @XmlElement(name = "LocalOrganizationIDCode", required = true)
    protected String localOrganizationIDCode;
    @XmlElement(name = "LocalOrganizationIDQualifier", required = true)
    @XmlSchemaType(name = "token")
    protected LocalOrganizationIDCodeQualifierType localOrganizationIDQualifier;

    /**
     * Gets the value of the localOrganizationIDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalOrganizationIDCode() {
        return localOrganizationIDCode;
    }

    /**
     * Sets the value of the localOrganizationIDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalOrganizationIDCode(String value) {
        this.localOrganizationIDCode = value;
    }

    /**
     * Gets the value of the localOrganizationIDQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link LocalOrganizationIDCodeQualifierType }
     *     
     */
    public LocalOrganizationIDCodeQualifierType getLocalOrganizationIDQualifier() {
        return localOrganizationIDQualifier;
    }

    /**
     * Sets the value of the localOrganizationIDQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalOrganizationIDCodeQualifierType }
     *     
     */
    public void setLocalOrganizationIDQualifier(LocalOrganizationIDCodeQualifierType value) {
        this.localOrganizationIDQualifier = value;
    }

}
