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
import javax.xml.bind.annotation.XmlType;


/**
 * NOT USED (must check)
 * 
 * <p>Java class for OPEIDGroupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OPEIDGroupType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OPEID" type="{urn:org:pesc:core:CoreMain:v1.14.0}OPEIDType"/>
 *         &lt;element name="NonEDBranchID" type="{urn:org:pesc:core:CoreMain:v1.14.0}NonEDBranchIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OPEIDGroupType", propOrder = {
    "opeid",
    "nonEDBranchID"
})
public class OPEIDGroupType {

    @XmlElement(name = "OPEID", required = true)
    protected String opeid;
    @XmlElement(name = "NonEDBranchID")
    protected String nonEDBranchID;

    /**
     * Gets the value of the opeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPEID() {
        return opeid;
    }

    /**
     * Sets the value of the opeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPEID(String value) {
        this.opeid = value;
    }

    /**
     * Gets the value of the nonEDBranchID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonEDBranchID() {
        return nonEDBranchID;
    }

    /**
     * Sets the value of the nonEDBranchID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNonEDBranchID(String value) {
        this.nonEDBranchID = value;
    }

}
