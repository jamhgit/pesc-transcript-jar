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
 * <p>Java class for PersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Birth" type="{urn:org:pesc:core:CoreMain:v1.14.0}BirthType" maxOccurs="unbounded"/>
 *         &lt;element name="Name" type="{urn:org:pesc:core:CoreMain:v1.14.0}NameType" maxOccurs="unbounded"/>
 *         &lt;element name="Contacts" type="{urn:org:pesc:core:CoreMain:v1.14.0}ContactsType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Gender" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderType" minOccurs="0"/>
 *         &lt;element name="Marital" type="{urn:org:pesc:core:CoreMain:v1.14.0}MaritalType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RaceEthnicity" type="{urn:org:pesc:core:CoreMain:v1.14.0}RaceEthnicityType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Citizenship" type="{urn:org:pesc:core:CoreMain:v1.14.0}CitizenshipType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Residency" type="{urn:org:pesc:core:CoreMain:v1.14.0}ResidencyType" minOccurs="0"/>
 *         &lt;element name="Deceased" type="{urn:org:pesc:core:CoreMain:v1.14.0}DeceasedType" minOccurs="0"/>
 *         &lt;element name="EducationLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}EducationLevelType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Immigration" type="{urn:org:pesc:core:CoreMain:v1.14.0}ImmigrationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{urn:org:pesc:core:CoreMain:v1.14.0}OccupationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReligiousAffiliation" type="{urn:org:pesc:core:CoreMain:v1.14.0}ReligiousAffiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrivacyRestriction" type="{urn:org:pesc:core:CoreMain:v1.14.0}PrivacyRestrictionType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PersonType", propOrder = {
    "birth",
    "name",
    "contacts",
    "gender",
    "marital",
    "raceEthnicity",
    "citizenship",
    "residency",
    "deceased",
    "educationLevel",
    "immigration",
    "occupation",
    "religiousAffiliation",
    "privacyRestriction",
    "noteMessage"
})
public class PersonType {

    @XmlElement(name = "Birth", required = true)
    protected List<BirthType> birth;
    @XmlElement(name = "Name", required = true)
    protected List<NameType> name;
    @XmlElement(name = "Contacts")
    protected List<ContactsType> contacts;
    @XmlElement(name = "Gender")
    protected GenderType gender;
    @XmlElement(name = "Marital")
    protected List<MaritalType> marital;
    @XmlElement(name = "RaceEthnicity")
    protected List<RaceEthnicityType> raceEthnicity;
    @XmlElement(name = "Citizenship")
    protected List<CitizenshipType> citizenship;
    @XmlElement(name = "Residency")
    protected ResidencyType residency;
    @XmlElement(name = "Deceased")
    protected DeceasedType deceased;
    @XmlElement(name = "EducationLevel")
    @XmlSchemaType(name = "string")
    protected List<EducationLevelType> educationLevel;
    @XmlElement(name = "Immigration")
    protected List<ImmigrationType> immigration;
    @XmlElement(name = "Occupation")
    protected List<String> occupation;
    @XmlElement(name = "ReligiousAffiliation")
    protected List<String> religiousAffiliation;
    @XmlElement(name = "PrivacyRestriction")
    protected List<PrivacyRestrictionType> privacyRestriction;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the birth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the birth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBirth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BirthType }
     * 
     * 
     */
    public List<BirthType> getBirth() {
        if (birth == null) {
            birth = new ArrayList<BirthType>();
        }
        return this.birth;
    }

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NameType }
     * 
     * 
     */
    public List<NameType> getName() {
        if (name == null) {
            name = new ArrayList<NameType>();
        }
        return this.name;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsType }
     * 
     * 
     */
    public List<ContactsType> getContacts() {
        if (contacts == null) {
            contacts = new ArrayList<ContactsType>();
        }
        return this.contacts;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link GenderType }
     *     
     */
    public GenderType getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderType }
     *     
     */
    public void setGender(GenderType value) {
        this.gender = value;
    }

    /**
     * Gets the value of the marital property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the marital property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarital().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaritalType }
     * 
     * 
     */
    public List<MaritalType> getMarital() {
        if (marital == null) {
            marital = new ArrayList<MaritalType>();
        }
        return this.marital;
    }

    /**
     * Gets the value of the raceEthnicity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the raceEthnicity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRaceEthnicity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RaceEthnicityType }
     * 
     * 
     */
    public List<RaceEthnicityType> getRaceEthnicity() {
        if (raceEthnicity == null) {
            raceEthnicity = new ArrayList<RaceEthnicityType>();
        }
        return this.raceEthnicity;
    }

    /**
     * Gets the value of the citizenship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the citizenship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCitizenship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CitizenshipType }
     * 
     * 
     */
    public List<CitizenshipType> getCitizenship() {
        if (citizenship == null) {
            citizenship = new ArrayList<CitizenshipType>();
        }
        return this.citizenship;
    }

    /**
     * Gets the value of the residency property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencyType }
     *     
     */
    public ResidencyType getResidency() {
        return residency;
    }

    /**
     * Sets the value of the residency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencyType }
     *     
     */
    public void setResidency(ResidencyType value) {
        this.residency = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link DeceasedType }
     *     
     */
    public DeceasedType getDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeceasedType }
     *     
     */
    public void setDeceased(DeceasedType value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the educationLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationLevelType }
     * 
     * 
     */
    public List<EducationLevelType> getEducationLevel() {
        if (educationLevel == null) {
            educationLevel = new ArrayList<EducationLevelType>();
        }
        return this.educationLevel;
    }

    /**
     * Gets the value of the immigration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the immigration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImmigration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ImmigrationType }
     * 
     * 
     */
    public List<ImmigrationType> getImmigration() {
        if (immigration == null) {
            immigration = new ArrayList<ImmigrationType>();
        }
        return this.immigration;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occupation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOccupation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getOccupation() {
        if (occupation == null) {
            occupation = new ArrayList<String>();
        }
        return this.occupation;
    }

    /**
     * Gets the value of the religiousAffiliation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the religiousAffiliation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReligiousAffiliation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReligiousAffiliation() {
        if (religiousAffiliation == null) {
            religiousAffiliation = new ArrayList<String>();
        }
        return this.religiousAffiliation;
    }

    /**
     * Gets the value of the privacyRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the privacyRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrivacyRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrivacyRestrictionType }
     * 
     * 
     */
    public List<PrivacyRestrictionType> getPrivacyRestriction() {
        if (privacyRestriction == null) {
            privacyRestriction = new ArrayList<PrivacyRestrictionType>();
        }
        return this.privacyRestriction;
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
