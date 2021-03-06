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
 * <p>Java class for AttendedSchoolDisbursementResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttendedSchoolDisbursementResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}AttendedSchoolResponseType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="TotalNetDisbursementAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalNetEFTAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalNetNonEFTAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalReissueAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalCancellationAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalDeficitAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalNettedCancellationAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="TotalOutstandingCancellationAmount" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttendedSchoolDisbursementResponseType", propOrder = {
    "totalNetDisbursementAmount",
    "totalNetEFTAmount",
    "totalNetNonEFTAmount",
    "totalReissueAmount",
    "totalCancellationAmount",
    "totalDeficitAmount",
    "totalNettedCancellationAmount",
    "totalOutstandingCancellationAmount"
})
public class AttendedSchoolDisbursementResponseType
    extends AttendedSchoolResponseType
{

    @XmlElement(name = "TotalNetDisbursementAmount")
    protected Object totalNetDisbursementAmount;
    @XmlElement(name = "TotalNetEFTAmount")
    protected Object totalNetEFTAmount;
    @XmlElement(name = "TotalNetNonEFTAmount")
    protected Object totalNetNonEFTAmount;
    @XmlElement(name = "TotalReissueAmount")
    protected Object totalReissueAmount;
    @XmlElement(name = "TotalCancellationAmount")
    protected Object totalCancellationAmount;
    @XmlElement(name = "TotalDeficitAmount")
    protected Object totalDeficitAmount;
    @XmlElement(name = "TotalNettedCancellationAmount")
    protected Object totalNettedCancellationAmount;
    @XmlElement(name = "TotalOutstandingCancellationAmount")
    protected Object totalOutstandingCancellationAmount;

    /**
     * Gets the value of the totalNetDisbursementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalNetDisbursementAmount() {
        return totalNetDisbursementAmount;
    }

    /**
     * Sets the value of the totalNetDisbursementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalNetDisbursementAmount(Object value) {
        this.totalNetDisbursementAmount = value;
    }

    /**
     * Gets the value of the totalNetEFTAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalNetEFTAmount() {
        return totalNetEFTAmount;
    }

    /**
     * Sets the value of the totalNetEFTAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalNetEFTAmount(Object value) {
        this.totalNetEFTAmount = value;
    }

    /**
     * Gets the value of the totalNetNonEFTAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalNetNonEFTAmount() {
        return totalNetNonEFTAmount;
    }

    /**
     * Sets the value of the totalNetNonEFTAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalNetNonEFTAmount(Object value) {
        this.totalNetNonEFTAmount = value;
    }

    /**
     * Gets the value of the totalReissueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalReissueAmount() {
        return totalReissueAmount;
    }

    /**
     * Sets the value of the totalReissueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalReissueAmount(Object value) {
        this.totalReissueAmount = value;
    }

    /**
     * Gets the value of the totalCancellationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalCancellationAmount() {
        return totalCancellationAmount;
    }

    /**
     * Sets the value of the totalCancellationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalCancellationAmount(Object value) {
        this.totalCancellationAmount = value;
    }

    /**
     * Gets the value of the totalDeficitAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalDeficitAmount() {
        return totalDeficitAmount;
    }

    /**
     * Sets the value of the totalDeficitAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalDeficitAmount(Object value) {
        this.totalDeficitAmount = value;
    }

    /**
     * Gets the value of the totalNettedCancellationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalNettedCancellationAmount() {
        return totalNettedCancellationAmount;
    }

    /**
     * Sets the value of the totalNettedCancellationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalNettedCancellationAmount(Object value) {
        this.totalNettedCancellationAmount = value;
    }

    /**
     * Gets the value of the totalOutstandingCancellationAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTotalOutstandingCancellationAmount() {
        return totalOutstandingCancellationAmount;
    }

    /**
     * Sets the value of the totalOutstandingCancellationAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTotalOutstandingCancellationAmount(Object value) {
        this.totalOutstandingCancellationAmount = value;
    }

}
