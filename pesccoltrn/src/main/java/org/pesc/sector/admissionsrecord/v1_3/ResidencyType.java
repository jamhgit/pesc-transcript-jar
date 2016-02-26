//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.sector.admissionsrecord.v1_3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_14.EmploymentAtAppliedSchoolType;
import org.pesc.core.coremain.v1_14.NameType;
import org.pesc.core.coremain.v1_14.RelationshipCodeType;
import org.pesc.core.coremain.v1_14.ResidencyStatusCodeType;
import org.pesc.core.coremain.v1_14.StateProvinceCodeType;
import org.pesc.core.coremain.v1_14.UserDefinedExtensionsType;


/**
 * <p>Java class for ResidencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResidencyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResidentName" type="{urn:org:pesc:core:CoreMain:v1.14.0}NameType" minOccurs="0"/>
 *         &lt;element name="RelationshipCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}RelationshipCodeType" minOccurs="0"/>
 *         &lt;element name="FinancialDependency" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}FinancialDependencyType" minOccurs="0"/>
 *         &lt;element name="StateProvinceCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}StateProvinceCodeType" minOccurs="0"/>
 *         &lt;element name="County" type="{urn:org:pesc:core:CoreMain:v1.14.0}CountyType" minOccurs="0"/>
 *         &lt;element name="City" type="{urn:org:pesc:core:CoreMain:v1.14.0}CityType" minOccurs="0"/>
 *         &lt;element name="ResidencyEstablishedDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}ResidencyEstablishedDateType" minOccurs="0"/>
 *         &lt;element name="ResidencyStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}ResidencyStatusCodeType"/>
 *         &lt;element name="DriversLicense" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}DriversLicenseType" minOccurs="0"/>
 *         &lt;element name="StateIdentification" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}StateIdentificationType" minOccurs="0"/>
 *         &lt;element name="VoterRegistration" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}VoterRegistrationType" minOccurs="0"/>
 *         &lt;element name="VehicleRegistration" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}VehicleRegistrationType" minOccurs="0"/>
 *         &lt;element name="EmploymentResidency" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}ResidencyEmploymentType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmploymentAtAppliedSchool" type="{urn:org:pesc:core:CoreMain:v1.14.0}EmploymentAtAppliedSchoolType" maxOccurs="4" minOccurs="0"/>
 *         &lt;element name="IncomeTaxInformation" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}IncomeTaxInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PropertyOwned" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}PropertyOwnedType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PublicAssistanceReceived" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}PublicAssistanceReceivedType" minOccurs="0"/>
 *         &lt;element name="ActiveDutyMilitary" type="{urn:org:pesc:sector:AdmissionsRecord:v1.3.0}ActiveDutyMilitaryType" minOccurs="0"/>
 *         &lt;element name="MemberOfIndianTribe" type="{urn:org:pesc:core:CoreMain:v1.14.0}MemberOfIndianTribeType" minOccurs="0"/>
 *         &lt;element name="LastResidence" type="{urn:org:pesc:core:CoreMain:v1.14.0}LastResidenceType" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.14.0}UserDefinedExtensionsType" minOccurs="0"/>
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
@XmlType(name = "ResidencyType", propOrder = {
    "residentName",
    "relationshipCode",
    "financialDependency",
    "stateProvinceCode",
    "county",
    "city",
    "residencyEstablishedDate",
    "residencyStatusCode",
    "driversLicense",
    "stateIdentification",
    "voterRegistration",
    "vehicleRegistration",
    "employmentResidency",
    "employmentAtAppliedSchool",
    "incomeTaxInformation",
    "propertyOwned",
    "publicAssistanceReceived",
    "activeDutyMilitary",
    "memberOfIndianTribe",
    "lastResidence",
    "userDefinedExtensions",
    "noteMessage"
})
public class ResidencyType {

    @XmlElement(name = "ResidentName")
    protected NameType residentName;
    @XmlElement(name = "RelationshipCode")
    @XmlSchemaType(name = "string")
    protected RelationshipCodeType relationshipCode;
    @XmlElement(name = "FinancialDependency")
    protected FinancialDependencyType financialDependency;
    @XmlElement(name = "StateProvinceCode")
    @XmlSchemaType(name = "token")
    protected StateProvinceCodeType stateProvinceCode;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "ResidencyEstablishedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar residencyEstablishedDate;
    @XmlElement(name = "ResidencyStatusCode", required = true)
    @XmlSchemaType(name = "string")
    protected ResidencyStatusCodeType residencyStatusCode;
    @XmlElement(name = "DriversLicense")
    protected DriversLicenseType driversLicense;
    @XmlElement(name = "StateIdentification")
    protected StateIdentificationType stateIdentification;
    @XmlElement(name = "VoterRegistration")
    protected VoterRegistrationType voterRegistration;
    @XmlElement(name = "VehicleRegistration")
    protected VehicleRegistrationType vehicleRegistration;
    @XmlElement(name = "EmploymentResidency")
    protected List<ResidencyEmploymentType> employmentResidency;
    @XmlElement(name = "EmploymentAtAppliedSchool")
    protected List<EmploymentAtAppliedSchoolType> employmentAtAppliedSchool;
    @XmlElement(name = "IncomeTaxInformation")
    protected List<IncomeTaxInformationType> incomeTaxInformation;
    @XmlElement(name = "PropertyOwned")
    protected List<PropertyOwnedType> propertyOwned;
    @XmlElement(name = "PublicAssistanceReceived")
    protected PublicAssistanceReceivedType publicAssistanceReceived;
    @XmlElement(name = "ActiveDutyMilitary")
    protected ActiveDutyMilitaryType activeDutyMilitary;
    @XmlElement(name = "MemberOfIndianTribe")
    protected String memberOfIndianTribe;
    @XmlElement(name = "LastResidence")
    protected String lastResidence;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the residentName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getResidentName() {
        return residentName;
    }

    /**
     * Sets the value of the residentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setResidentName(NameType value) {
        this.residentName = value;
    }

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipCodeType }
     *     
     */
    public RelationshipCodeType getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipCodeType }
     *     
     */
    public void setRelationshipCode(RelationshipCodeType value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the financialDependency property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialDependencyType }
     *     
     */
    public FinancialDependencyType getFinancialDependency() {
        return financialDependency;
    }

    /**
     * Sets the value of the financialDependency property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialDependencyType }
     *     
     */
    public void setFinancialDependency(FinancialDependencyType value) {
        this.financialDependency = value;
    }

    /**
     * Gets the value of the stateProvinceCode property.
     * 
     * @return
     *     possible object is
     *     {@link StateProvinceCodeType }
     *     
     */
    public StateProvinceCodeType getStateProvinceCode() {
        return stateProvinceCode;
    }

    /**
     * Sets the value of the stateProvinceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateProvinceCodeType }
     *     
     */
    public void setStateProvinceCode(StateProvinceCodeType value) {
        this.stateProvinceCode = value;
    }

    /**
     * Gets the value of the county property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the value of the county property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the residencyEstablishedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResidencyEstablishedDate() {
        return residencyEstablishedDate;
    }

    /**
     * Sets the value of the residencyEstablishedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResidencyEstablishedDate(XMLGregorianCalendar value) {
        this.residencyEstablishedDate = value;
    }

    /**
     * Gets the value of the residencyStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ResidencyStatusCodeType }
     *     
     */
    public ResidencyStatusCodeType getResidencyStatusCode() {
        return residencyStatusCode;
    }

    /**
     * Sets the value of the residencyStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResidencyStatusCodeType }
     *     
     */
    public void setResidencyStatusCode(ResidencyStatusCodeType value) {
        this.residencyStatusCode = value;
    }

    /**
     * Gets the value of the driversLicense property.
     * 
     * @return
     *     possible object is
     *     {@link DriversLicenseType }
     *     
     */
    public DriversLicenseType getDriversLicense() {
        return driversLicense;
    }

    /**
     * Sets the value of the driversLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link DriversLicenseType }
     *     
     */
    public void setDriversLicense(DriversLicenseType value) {
        this.driversLicense = value;
    }

    /**
     * Gets the value of the stateIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link StateIdentificationType }
     *     
     */
    public StateIdentificationType getStateIdentification() {
        return stateIdentification;
    }

    /**
     * Sets the value of the stateIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StateIdentificationType }
     *     
     */
    public void setStateIdentification(StateIdentificationType value) {
        this.stateIdentification = value;
    }

    /**
     * Gets the value of the voterRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link VoterRegistrationType }
     *     
     */
    public VoterRegistrationType getVoterRegistration() {
        return voterRegistration;
    }

    /**
     * Sets the value of the voterRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoterRegistrationType }
     *     
     */
    public void setVoterRegistration(VoterRegistrationType value) {
        this.voterRegistration = value;
    }

    /**
     * Gets the value of the vehicleRegistration property.
     * 
     * @return
     *     possible object is
     *     {@link VehicleRegistrationType }
     *     
     */
    public VehicleRegistrationType getVehicleRegistration() {
        return vehicleRegistration;
    }

    /**
     * Sets the value of the vehicleRegistration property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRegistrationType }
     *     
     */
    public void setVehicleRegistration(VehicleRegistrationType value) {
        this.vehicleRegistration = value;
    }

    /**
     * Gets the value of the employmentResidency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentResidency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentResidency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResidencyEmploymentType }
     * 
     * 
     */
    public List<ResidencyEmploymentType> getEmploymentResidency() {
        if (employmentResidency == null) {
            employmentResidency = new ArrayList<ResidencyEmploymentType>();
        }
        return this.employmentResidency;
    }

    /**
     * Gets the value of the employmentAtAppliedSchool property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employmentAtAppliedSchool property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmploymentAtAppliedSchool().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmploymentAtAppliedSchoolType }
     * 
     * 
     */
    public List<EmploymentAtAppliedSchoolType> getEmploymentAtAppliedSchool() {
        if (employmentAtAppliedSchool == null) {
            employmentAtAppliedSchool = new ArrayList<EmploymentAtAppliedSchoolType>();
        }
        return this.employmentAtAppliedSchool;
    }

    /**
     * Gets the value of the incomeTaxInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomeTaxInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomeTaxInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomeTaxInformationType }
     * 
     * 
     */
    public List<IncomeTaxInformationType> getIncomeTaxInformation() {
        if (incomeTaxInformation == null) {
            incomeTaxInformation = new ArrayList<IncomeTaxInformationType>();
        }
        return this.incomeTaxInformation;
    }

    /**
     * Gets the value of the propertyOwned property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the propertyOwned property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPropertyOwned().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PropertyOwnedType }
     * 
     * 
     */
    public List<PropertyOwnedType> getPropertyOwned() {
        if (propertyOwned == null) {
            propertyOwned = new ArrayList<PropertyOwnedType>();
        }
        return this.propertyOwned;
    }

    /**
     * Gets the value of the publicAssistanceReceived property.
     * 
     * @return
     *     possible object is
     *     {@link PublicAssistanceReceivedType }
     *     
     */
    public PublicAssistanceReceivedType getPublicAssistanceReceived() {
        return publicAssistanceReceived;
    }

    /**
     * Sets the value of the publicAssistanceReceived property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicAssistanceReceivedType }
     *     
     */
    public void setPublicAssistanceReceived(PublicAssistanceReceivedType value) {
        this.publicAssistanceReceived = value;
    }

    /**
     * Gets the value of the activeDutyMilitary property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveDutyMilitaryType }
     *     
     */
    public ActiveDutyMilitaryType getActiveDutyMilitary() {
        return activeDutyMilitary;
    }

    /**
     * Sets the value of the activeDutyMilitary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveDutyMilitaryType }
     *     
     */
    public void setActiveDutyMilitary(ActiveDutyMilitaryType value) {
        this.activeDutyMilitary = value;
    }

    /**
     * Gets the value of the memberOfIndianTribe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberOfIndianTribe() {
        return memberOfIndianTribe;
    }

    /**
     * Sets the value of the memberOfIndianTribe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberOfIndianTribe(String value) {
        this.memberOfIndianTribe = value;
    }

    /**
     * Gets the value of the lastResidence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastResidence() {
        return lastResidence;
    }

    /**
     * Sets the value of the lastResidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastResidence(String value) {
        this.lastResidence = value;
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
