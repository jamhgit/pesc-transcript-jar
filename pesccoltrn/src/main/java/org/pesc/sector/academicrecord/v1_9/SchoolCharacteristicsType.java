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
import org.pesc.core.coremain.v1_14.CountryCodeType;
import org.pesc.core.coremain.v1_14.SchoolAcademicLoadCodeType;
import org.pesc.core.coremain.v1_14.SchoolGenderCompostionCodeType;
import org.pesc.core.coremain.v1_14.SchoolOrganizationalControlType;
import org.pesc.core.coremain.v1_14.StateProvinceCodeType;


/**
 * General attributes of an academic institution
 * 
 * <p>Java class for SchoolCharacteristicsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolCharacteristicsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolOrganizationalControl" type="{urn:org:pesc:core:CoreMain:v1.14.0}SchoolOrganizationalControlType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SchoolLevel" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{urn:org:pesc:sector:AcademicRecord:v1.9.0}SchoolLevelType">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SchoolStudentEnrollment" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}NumericRangeType" minOccurs="0"/>
 *         &lt;element name="SchoolDistance" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}NumericRangeType" minOccurs="0"/>
 *         &lt;element name="ReligiousAffiliation" type="{urn:org:pesc:core:CoreMain:v1.14.0}ReligiousAffiliationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SchoolAcademicLoadCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}SchoolAcademicLoadCodeType" minOccurs="0"/>
 *         &lt;element name="SchoolGenderCompostionCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}SchoolGenderCompostionCodeType" minOccurs="0"/>
 *         &lt;element name="SchoolTuition" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}NumericRangeType" minOccurs="0"/>
 *         &lt;element name="AcademicMajor" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}AcademicMajorType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="StateProvinceCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}StateProvinceCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CountryCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CountryCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolCharacteristicsType", propOrder = {
    "schoolOrganizationalControl",
    "schoolLevel",
    "schoolStudentEnrollment",
    "schoolDistance",
    "religiousAffiliation",
    "schoolAcademicLoadCode",
    "schoolGenderCompostionCode",
    "schoolTuition",
    "academicMajor",
    "stateProvinceCode",
    "countryCode"
})
public class SchoolCharacteristicsType {

    @XmlElement(name = "SchoolOrganizationalControl")
    @XmlSchemaType(name = "string")
    protected List<SchoolOrganizationalControlType> schoolOrganizationalControl;
    @XmlElement(name = "SchoolLevel")
    protected List<SchoolLevelType> schoolLevel;
    @XmlElement(name = "SchoolStudentEnrollment")
    protected NumericRangeType schoolStudentEnrollment;
    @XmlElement(name = "SchoolDistance")
    protected NumericRangeType schoolDistance;
    @XmlElement(name = "ReligiousAffiliation")
    protected List<String> religiousAffiliation;
    @XmlElement(name = "SchoolAcademicLoadCode")
    @XmlSchemaType(name = "string")
    protected SchoolAcademicLoadCodeType schoolAcademicLoadCode;
    @XmlElement(name = "SchoolGenderCompostionCode")
    @XmlSchemaType(name = "string")
    protected SchoolGenderCompostionCodeType schoolGenderCompostionCode;
    @XmlElement(name = "SchoolTuition")
    protected NumericRangeType schoolTuition;
    @XmlElement(name = "AcademicMajor")
    protected List<AcademicMajorType> academicMajor;
    @XmlElement(name = "StateProvinceCode")
    @XmlSchemaType(name = "token")
    protected List<StateProvinceCodeType> stateProvinceCode;
    @XmlElement(name = "CountryCode")
    @XmlSchemaType(name = "string")
    protected List<CountryCodeType> countryCode;

    /**
     * Gets the value of the schoolOrganizationalControl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolOrganizationalControl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolOrganizationalControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolOrganizationalControlType }
     * 
     * 
     */
    public List<SchoolOrganizationalControlType> getSchoolOrganizationalControl() {
        if (schoolOrganizationalControl == null) {
            schoolOrganizationalControl = new ArrayList<SchoolOrganizationalControlType>();
        }
        return this.schoolOrganizationalControl;
    }

    /**
     * Gets the value of the schoolLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolLevelType }
     * 
     * 
     */
    public List<SchoolLevelType> getSchoolLevel() {
        if (schoolLevel == null) {
            schoolLevel = new ArrayList<SchoolLevelType>();
        }
        return this.schoolLevel;
    }

    /**
     * Gets the value of the schoolStudentEnrollment property.
     * 
     * @return
     *     possible object is
     *     {@link NumericRangeType }
     *     
     */
    public NumericRangeType getSchoolStudentEnrollment() {
        return schoolStudentEnrollment;
    }

    /**
     * Sets the value of the schoolStudentEnrollment property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericRangeType }
     *     
     */
    public void setSchoolStudentEnrollment(NumericRangeType value) {
        this.schoolStudentEnrollment = value;
    }

    /**
     * Gets the value of the schoolDistance property.
     * 
     * @return
     *     possible object is
     *     {@link NumericRangeType }
     *     
     */
    public NumericRangeType getSchoolDistance() {
        return schoolDistance;
    }

    /**
     * Sets the value of the schoolDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericRangeType }
     *     
     */
    public void setSchoolDistance(NumericRangeType value) {
        this.schoolDistance = value;
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
     * Gets the value of the schoolAcademicLoadCode property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolAcademicLoadCodeType }
     *     
     */
    public SchoolAcademicLoadCodeType getSchoolAcademicLoadCode() {
        return schoolAcademicLoadCode;
    }

    /**
     * Sets the value of the schoolAcademicLoadCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolAcademicLoadCodeType }
     *     
     */
    public void setSchoolAcademicLoadCode(SchoolAcademicLoadCodeType value) {
        this.schoolAcademicLoadCode = value;
    }

    /**
     * Gets the value of the schoolGenderCompostionCode property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolGenderCompostionCodeType }
     *     
     */
    public SchoolGenderCompostionCodeType getSchoolGenderCompostionCode() {
        return schoolGenderCompostionCode;
    }

    /**
     * Sets the value of the schoolGenderCompostionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolGenderCompostionCodeType }
     *     
     */
    public void setSchoolGenderCompostionCode(SchoolGenderCompostionCodeType value) {
        this.schoolGenderCompostionCode = value;
    }

    /**
     * Gets the value of the schoolTuition property.
     * 
     * @return
     *     possible object is
     *     {@link NumericRangeType }
     *     
     */
    public NumericRangeType getSchoolTuition() {
        return schoolTuition;
    }

    /**
     * Sets the value of the schoolTuition property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericRangeType }
     *     
     */
    public void setSchoolTuition(NumericRangeType value) {
        this.schoolTuition = value;
    }

    /**
     * Gets the value of the academicMajor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicMajor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicMajor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicMajorType }
     * 
     * 
     */
    public List<AcademicMajorType> getAcademicMajor() {
        if (academicMajor == null) {
            academicMajor = new ArrayList<AcademicMajorType>();
        }
        return this.academicMajor;
    }

    /**
     * Gets the value of the stateProvinceCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stateProvinceCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStateProvinceCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StateProvinceCodeType }
     * 
     * 
     */
    public List<StateProvinceCodeType> getStateProvinceCode() {
        if (stateProvinceCode == null) {
            stateProvinceCode = new ArrayList<StateProvinceCodeType>();
        }
        return this.stateProvinceCode;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryCodeType }
     * 
     * 
     */
    public List<CountryCodeType> getCountryCode() {
        if (countryCode == null) {
            countryCode = new ArrayList<CountryCodeType>();
        }
        return this.countryCode;
    }

}
