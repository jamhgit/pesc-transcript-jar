//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:17 PM PST 
//


package org.pesc.message.transcriptresponse.v1_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.UserDefinedExtensionsType;
import org.pesc.sector.academicrecord.v1_9.ResponseType;
import org.pesc.sector.academicrecord.v1_9.TransmissionDataType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TransmissionData" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}TransmissionDataType"/>
 *         &lt;element name="Response" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}ResponseType" maxOccurs="unbounded"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.14.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.14.0}UserDefinedExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transmissionData",
    "response",
    "noteMessage",
    "userDefinedExtensions"
})
@XmlRootElement(name = "TranscriptResponse")
public class TranscriptResponse {

    @XmlElement(name = "TransmissionData", required = true)
    protected TransmissionDataType transmissionData;
    @XmlElement(name = "Response", required = true)
    protected List<ResponseType> response;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;

    /**
     * Gets the value of the transmissionData property.
     * 
     * @return
     *     possible object is
     *     {@link TransmissionDataType }
     *     
     */
    public TransmissionDataType getTransmissionData() {
        return transmissionData;
    }

    /**
     * Sets the value of the transmissionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransmissionDataType }
     *     
     */
    public void setTransmissionData(TransmissionDataType value) {
        this.transmissionData = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the response property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType }
     * 
     * 
     */
    public List<ResponseType> getResponse() {
        if (response == null) {
            response = new ArrayList<ResponseType>();
        }
        return this.response;
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

    /**
     * Gets the value of the userDefinedExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public UserDefinedExtensionsType getUserDefinedExtensions() {
        return userDefinedExtensions;
    }

    /**
     * Sets the value of the userDefinedExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public void setUserDefinedExtensions(UserDefinedExtensionsType value) {
        this.userDefinedExtensions = value;
    }

}
