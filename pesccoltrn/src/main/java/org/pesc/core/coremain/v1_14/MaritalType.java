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
 * <p>Java class for MaritalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaritalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaritalStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}MaritalStatusCodeType" minOccurs="0"/>
 *         &lt;element name="MaritalStatusChangeCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}MaritalStatusChangeCodeType" minOccurs="0"/>
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
@XmlType(name = "MaritalType", propOrder = {
    "maritalStatusCode",
    "maritalStatusChangeCode",
    "noteMessage"
})
public class MaritalType {

    @XmlElement(name = "MaritalStatusCode")
    @XmlSchemaType(name = "string")
    protected MaritalStatusCodeType maritalStatusCode;
    @XmlElement(name = "MaritalStatusChangeCode")
    @XmlSchemaType(name = "string")
    protected MaritalStatusChangeCodeType maritalStatusChangeCode;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the maritalStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusCodeType }
     *     
     */
    public MaritalStatusCodeType getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Sets the value of the maritalStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusCodeType }
     *     
     */
    public void setMaritalStatusCode(MaritalStatusCodeType value) {
        this.maritalStatusCode = value;
    }

    /**
     * Gets the value of the maritalStatusChangeCode property.
     * 
     * @return
     *     possible object is
     *     {@link MaritalStatusChangeCodeType }
     *     
     */
    public MaritalStatusChangeCodeType getMaritalStatusChangeCode() {
        return maritalStatusChangeCode;
    }

    /**
     * Sets the value of the maritalStatusChangeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaritalStatusChangeCodeType }
     *     
     */
    public void setMaritalStatusChangeCode(MaritalStatusChangeCodeType value) {
        this.maritalStatusChangeCode = value;
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
