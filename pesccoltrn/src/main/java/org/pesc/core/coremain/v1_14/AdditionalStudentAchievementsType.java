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
import javax.xml.bind.annotation.XmlType;


/**
 * This Complex Type is being deprecated.  Use AdditionalStudentAchievementType
 * 
 * <p>Java class for AdditionalStudentAchievementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalStudentAchievementsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Requirement" type="{urn:org:pesc:core:CoreMain:v1.14.0}RAPType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Attribute" type="{urn:org:pesc:core:CoreMain:v1.14.0}RAPType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Proficiency" type="{urn:org:pesc:core:CoreMain:v1.14.0}RAPType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Language" type="{urn:org:pesc:core:CoreMain:v1.14.0}LanguageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Licensure" type="{urn:org:pesc:core:CoreMain:v1.14.0}LicensureType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "AdditionalStudentAchievementsType", propOrder = {
    "requirement",
    "attribute",
    "proficiency",
    "language",
    "licensure",
    "noteMessage"
})
public class AdditionalStudentAchievementsType {

    @XmlElement(name = "Requirement")
    protected List<RAPType> requirement;
    @XmlElement(name = "Attribute")
    protected List<RAPType> attribute;
    @XmlElement(name = "Proficiency")
    protected List<RAPType> proficiency;
    @XmlElement(name = "Language")
    protected List<LanguageType> language;
    @XmlElement(name = "Licensure")
    protected List<LicensureType> licensure;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAPType }
     * 
     * 
     */
    public List<RAPType> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<RAPType>();
        }
        return this.requirement;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAPType }
     * 
     * 
     */
    public List<RAPType> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<RAPType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the proficiency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proficiency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProficiency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAPType }
     * 
     * 
     */
    public List<RAPType> getProficiency() {
        if (proficiency == null) {
            proficiency = new ArrayList<RAPType>();
        }
        return this.proficiency;
    }

    /**
     * Gets the value of the language property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the language property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageType }
     * 
     * 
     */
    public List<LanguageType> getLanguage() {
        if (language == null) {
            language = new ArrayList<LanguageType>();
        }
        return this.language;
    }

    /**
     * Gets the value of the licensure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licensure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicensure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicensureType }
     * 
     * 
     */
    public List<LicensureType> getLicensure() {
        if (licensure == null) {
            licensure = new ArrayList<LicensureType>();
        }
        return this.licensure;
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
