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
 * <p>Java class for LanguageOfInstructionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LanguageOfInstructionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LanguageCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}LanguageCodeType" minOccurs="0"/>
 *         &lt;element name="InstructionUsage" type="{urn:org:pesc:core:CoreMain:v1.14.0}InstructionUsageType" minOccurs="0"/>
 *         &lt;element name="LanguageUsage" type="{urn:org:pesc:core:CoreMain:v1.14.0}LanguageUsageType" minOccurs="0"/>
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
@XmlType(name = "LanguageOfInstructionType", propOrder = {
    "languageCode",
    "instructionUsage",
    "languageUsage",
    "noteMessage"
})
public class LanguageOfInstructionType {

    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "InstructionUsage")
    @XmlSchemaType(name = "string")
    protected InstructionUsageType instructionUsage;
    @XmlElement(name = "LanguageUsage")
    @XmlSchemaType(name = "string")
    protected LanguageUsageType languageUsage;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the languageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * Sets the value of the languageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * Gets the value of the instructionUsage property.
     * 
     * @return
     *     possible object is
     *     {@link InstructionUsageType }
     *     
     */
    public InstructionUsageType getInstructionUsage() {
        return instructionUsage;
    }

    /**
     * Sets the value of the instructionUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstructionUsageType }
     *     
     */
    public void setInstructionUsage(InstructionUsageType value) {
        this.instructionUsage = value;
    }

    /**
     * Gets the value of the languageUsage property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageUsageType }
     *     
     */
    public LanguageUsageType getLanguageUsage() {
        return languageUsage;
    }

    /**
     * Sets the value of the languageUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageUsageType }
     *     
     */
    public void setLanguageUsage(LanguageUsageType value) {
        this.languageUsage = value;
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
