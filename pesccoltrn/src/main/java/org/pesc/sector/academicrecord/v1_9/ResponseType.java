//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_14.UserDefinedExtensionsType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreatedDateTime" type="{urn:org:pesc:core:CoreMain:v1.14.0}CreatedDateTimeType"/>
 *         &lt;element name="RequestTrackingID" type="{urn:org:pesc:core:CoreMain:v1.14.0}RequestTrackingIDType"/>
 *         &lt;element name="RecipientTrackingID" type="{urn:org:pesc:core:CoreMain:v1.14.0}RequestTrackingIDType" minOccurs="0"/>
 *         &lt;element name="ResponseStatus" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}ResponseStatusType"/>
 *         &lt;element name="ResponseHold" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}ResponseHoldType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OrderFee" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}OrderFeeType" minOccurs="0"/>
 *         &lt;element name="RequestedStudent" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}RequestedStudentType"/>
 *         &lt;element name="Receiver" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}RequestorReceiverType" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}DeliveryMethodType" minOccurs="0"/>
 *         &lt;element name="ElectronicDelivery" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}ElectronicDeliveryType" minOccurs="0"/>
 *         &lt;element name="CarrierName" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}CarrierNameType" minOccurs="0"/>
 *         &lt;element name="CarrierTrackingID" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}CarrierTrackingIDType" minOccurs="0"/>
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
@XmlType(name = "ResponseType", propOrder = {
    "createdDateTime",
    "requestTrackingID",
    "recipientTrackingID",
    "responseStatus",
    "responseHold",
    "orderFee",
    "requestedStudent",
    "receiver",
    "deliveryMethod",
    "electronicDelivery",
    "carrierName",
    "carrierTrackingID",
    "noteMessage",
    "userDefinedExtensions"
})
public class ResponseType {

    @XmlElement(name = "CreatedDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDateTime;
    @XmlElement(name = "RequestTrackingID", required = true)
    protected String requestTrackingID;
    @XmlElement(name = "RecipientTrackingID")
    protected String recipientTrackingID;
    @XmlElement(name = "ResponseStatus", required = true)
    @XmlSchemaType(name = "string")
    protected ResponseStatusType responseStatus;
    @XmlElement(name = "ResponseHold")
    protected List<ResponseHoldType> responseHold;
    @XmlElement(name = "OrderFee")
    protected OrderFeeType orderFee;
    @XmlElement(name = "RequestedStudent", required = true)
    protected RequestedStudentType requestedStudent;
    @XmlElement(name = "Receiver")
    protected RequestorReceiverType receiver;
    @XmlElement(name = "DeliveryMethod")
    @XmlSchemaType(name = "string")
    protected DeliveryMethodType deliveryMethod;
    @XmlElement(name = "ElectronicDelivery")
    protected ElectronicDeliveryType electronicDelivery;
    @XmlElement(name = "CarrierName")
    protected String carrierName;
    @XmlElement(name = "CarrierTrackingID")
    protected String carrierTrackingID;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    /**
     * Gets the value of the requestTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestTrackingID() {
        return requestTrackingID;
    }

    /**
     * Sets the value of the requestTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestTrackingID(String value) {
        this.requestTrackingID = value;
    }

    /**
     * Gets the value of the recipientTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientTrackingID() {
        return recipientTrackingID;
    }

    /**
     * Sets the value of the recipientTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientTrackingID(String value) {
        this.recipientTrackingID = value;
    }

    /**
     * Gets the value of the responseStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseStatusType }
     *     
     */
    public ResponseStatusType getResponseStatus() {
        return responseStatus;
    }

    /**
     * Sets the value of the responseStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseStatusType }
     *     
     */
    public void setResponseStatus(ResponseStatusType value) {
        this.responseStatus = value;
    }

    /**
     * Gets the value of the responseHold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the responseHold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResponseHold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseHoldType }
     * 
     * 
     */
    public List<ResponseHoldType> getResponseHold() {
        if (responseHold == null) {
            responseHold = new ArrayList<ResponseHoldType>();
        }
        return this.responseHold;
    }

    /**
     * Gets the value of the orderFee property.
     * 
     * @return
     *     possible object is
     *     {@link OrderFeeType }
     *     
     */
    public OrderFeeType getOrderFee() {
        return orderFee;
    }

    /**
     * Sets the value of the orderFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderFeeType }
     *     
     */
    public void setOrderFee(OrderFeeType value) {
        this.orderFee = value;
    }

    /**
     * Gets the value of the requestedStudent property.
     * 
     * @return
     *     possible object is
     *     {@link RequestedStudentType }
     *     
     */
    public RequestedStudentType getRequestedStudent() {
        return requestedStudent;
    }

    /**
     * Sets the value of the requestedStudent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestedStudentType }
     *     
     */
    public void setRequestedStudent(RequestedStudentType value) {
        this.requestedStudent = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link RequestorReceiverType }
     *     
     */
    public RequestorReceiverType getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestorReceiverType }
     *     
     */
    public void setReceiver(RequestorReceiverType value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the deliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryMethodType }
     *     
     */
    public DeliveryMethodType getDeliveryMethod() {
        return deliveryMethod;
    }

    /**
     * Sets the value of the deliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryMethodType }
     *     
     */
    public void setDeliveryMethod(DeliveryMethodType value) {
        this.deliveryMethod = value;
    }

    /**
     * Gets the value of the electronicDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ElectronicDeliveryType }
     *     
     */
    public ElectronicDeliveryType getElectronicDelivery() {
        return electronicDelivery;
    }

    /**
     * Sets the value of the electronicDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElectronicDeliveryType }
     *     
     */
    public void setElectronicDelivery(ElectronicDeliveryType value) {
        this.electronicDelivery = value;
    }

    /**
     * Gets the value of the carrierName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierName() {
        return carrierName;
    }

    /**
     * Sets the value of the carrierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierName(String value) {
        this.carrierName = value;
    }

    /**
     * Gets the value of the carrierTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierTrackingID() {
        return carrierTrackingID;
    }

    /**
     * Sets the value of the carrierTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierTrackingID(String value) {
        this.carrierTrackingID = value;
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
