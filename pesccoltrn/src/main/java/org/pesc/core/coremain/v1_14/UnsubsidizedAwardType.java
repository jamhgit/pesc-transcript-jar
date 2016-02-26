//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Need to break Disbursement Out of this. 
 * 
 * <p>Java class for UnsubsidizedAwardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnsubsidizedAwardType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}StaffordAwardType">
 *       &lt;sequence>
 *         &lt;element name="HPPAIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Response" type="{urn:org:pesc:core:CoreMain:v1.14.0}DLAwardResponseType" minOccurs="0"/>
 *         &lt;element name="Disbursement" maxOccurs="2000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}DLDisbursementType">
 *                 &lt;sequence>
 *                   &lt;element name="Response" type="{urn:org:pesc:core:CoreMain:v1.14.0}ResponseType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalUnsubsidizedEligibility" type="{urn:org:pesc:core:CoreMain:v1.14.0}AdditionalUnsubsidizedEligibilityType" minOccurs="0"/>
 *         &lt;element name="PreprofessionalCoursework" type="{urn:org:pesc:core:CoreMain:v1.14.0}PreprofessionalCourseworkType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnsubsidizedAwardType", propOrder = {
    "hppaIndicator",
    "response",
    "disbursement",
    "additionalUnsubsidizedEligibility",
    "preprofessionalCoursework"
})
@XmlSeeAlso({
    DLUnsubsidizedType.class
})
public class UnsubsidizedAwardType
    extends StaffordAwardType
{

    @XmlElementRef(name = "HPPAIndicator", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> hppaIndicator;
    @XmlElement(name = "Response")
    protected DLAwardResponseType response;
    @XmlElement(name = "Disbursement")
    protected List<UnsubsidizedAwardType.Disbursement> disbursement;
    @XmlElementRef(name = "AdditionalUnsubsidizedEligibility", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> additionalUnsubsidizedEligibility;
    @XmlElementRef(name = "PreprofessionalCoursework", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> preprofessionalCoursework;

    /**
     * Gets the value of the hppaIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHPPAIndicator() {
        return hppaIndicator;
    }

    /**
     * Sets the value of the hppaIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHPPAIndicator(JAXBElement<Boolean> value) {
        this.hppaIndicator = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link DLAwardResponseType }
     *     
     */
    public DLAwardResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link DLAwardResponseType }
     *     
     */
    public void setResponse(DLAwardResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the disbursement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disbursement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisbursement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnsubsidizedAwardType.Disbursement }
     * 
     * 
     */
    public List<UnsubsidizedAwardType.Disbursement> getDisbursement() {
        if (disbursement == null) {
            disbursement = new ArrayList<UnsubsidizedAwardType.Disbursement>();
        }
        return this.disbursement;
    }

    /**
     * Gets the value of the additionalUnsubsidizedEligibility property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getAdditionalUnsubsidizedEligibility() {
        return additionalUnsubsidizedEligibility;
    }

    /**
     * Sets the value of the additionalUnsubsidizedEligibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setAdditionalUnsubsidizedEligibility(JAXBElement<Boolean> value) {
        this.additionalUnsubsidizedEligibility = value;
    }

    /**
     * Gets the value of the preprofessionalCoursework property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPreprofessionalCoursework() {
        return preprofessionalCoursework;
    }

    /**
     * Sets the value of the preprofessionalCoursework property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPreprofessionalCoursework(JAXBElement<Boolean> value) {
        this.preprofessionalCoursework = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}DLDisbursementType">
     *       &lt;sequence>
     *         &lt;element name="Response" type="{urn:org:pesc:core:CoreMain:v1.14.0}ResponseType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "response"
    })
    public static class Disbursement
        extends DLDisbursementType
    {

        @XmlElement(name = "Response")
        protected ResponseType response;

        /**
         * Gets the value of the response property.
         * 
         * @return
         *     possible object is
         *     {@link ResponseType }
         *     
         */
        public ResponseType getResponse() {
            return response;
        }

        /**
         * Sets the value of the response property.
         * 
         * @param value
         *     allowed object is
         *     {@link ResponseType }
         *     
         */
        public void setResponse(ResponseType value) {
            this.response = value;
        }

    }

}
