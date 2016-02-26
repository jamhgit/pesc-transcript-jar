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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AcademicSessionDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicSessionDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SessionDesignator" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionDesignatorType"/>
 *         &lt;element name="SessionDesignatorSuffix" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionDesignatorSuffixType" minOccurs="0"/>
 *         &lt;element name="SessionName" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionNameType" minOccurs="0"/>
 *         &lt;element name="SessionType" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionTypeType" minOccurs="0"/>
 *         &lt;element name="SessionSchoolYear" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionSchoolYearType" minOccurs="0"/>
 *         &lt;element name="SessionBeginDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionBeginDateType" minOccurs="0"/>
 *         &lt;element name="SessionEndDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}SessionEndDateType" minOccurs="0"/>
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
@XmlType(name = "AcademicSessionDetailType", propOrder = {
    "sessionDesignator",
    "sessionDesignatorSuffix",
    "sessionName",
    "sessionType",
    "sessionSchoolYear",
    "sessionBeginDate",
    "sessionEndDate",
    "noteMessage"
})
public class AcademicSessionDetailType {

    @XmlElement(name = "SessionDesignator", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar sessionDesignator;
    @XmlElement(name = "SessionDesignatorSuffix")
    protected String sessionDesignatorSuffix;
    @XmlElement(name = "SessionName")
    protected String sessionName;
    @XmlElement(name = "SessionType")
    @XmlSchemaType(name = "string")
    protected SessionTypeType sessionType;
    @XmlElement(name = "SessionSchoolYear")
    protected String sessionSchoolYear;
    @XmlElement(name = "SessionBeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sessionBeginDate;
    @XmlElement(name = "SessionEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sessionEndDate;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the sessionDesignator property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionDesignator() {
        return sessionDesignator;
    }

    /**
     * Sets the value of the sessionDesignator property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionDesignator(XMLGregorianCalendar value) {
        this.sessionDesignator = value;
    }

    /**
     * Gets the value of the sessionDesignatorSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionDesignatorSuffix() {
        return sessionDesignatorSuffix;
    }

    /**
     * Sets the value of the sessionDesignatorSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionDesignatorSuffix(String value) {
        this.sessionDesignatorSuffix = value;
    }

    /**
     * Gets the value of the sessionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionName() {
        return sessionName;
    }

    /**
     * Sets the value of the sessionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionName(String value) {
        this.sessionName = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTypeType }
     *     
     */
    public SessionTypeType getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTypeType }
     *     
     */
    public void setSessionType(SessionTypeType value) {
        this.sessionType = value;
    }

    /**
     * Gets the value of the sessionSchoolYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionSchoolYear() {
        return sessionSchoolYear;
    }

    /**
     * Sets the value of the sessionSchoolYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionSchoolYear(String value) {
        this.sessionSchoolYear = value;
    }

    /**
     * Gets the value of the sessionBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionBeginDate() {
        return sessionBeginDate;
    }

    /**
     * Sets the value of the sessionBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionBeginDate(XMLGregorianCalendar value) {
        this.sessionBeginDate = value;
    }

    /**
     * Gets the value of the sessionEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSessionEndDate() {
        return sessionEndDate;
    }

    /**
     * Sets the value of the sessionEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSessionEndDate(XMLGregorianCalendar value) {
        this.sessionEndDate = value;
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
