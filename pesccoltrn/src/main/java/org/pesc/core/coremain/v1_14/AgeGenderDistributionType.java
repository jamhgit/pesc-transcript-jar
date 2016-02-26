//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AgeGenderDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AgeGenderDistributionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeUnder18" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age18To19" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age20To21" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age22To24" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age25To29" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age30To34" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age35To39" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age40To49" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age50To64" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Age65AndOver" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="AgeUnknown" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="TotalAllAge" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeGenderDistributionType", propOrder = {
    "ageUnder18",
    "age18To19",
    "age20To21",
    "age22To24",
    "age25To29",
    "age30To34",
    "age35To39",
    "age40To49",
    "age50To64",
    "age65AndOver",
    "ageUnknown",
    "totalAllAge"
})
public class AgeGenderDistributionType {

    @XmlElement(name = "AgeUnder18")
    protected GenderCountType ageUnder18;
    @XmlElement(name = "Age18To19")
    protected GenderCountType age18To19;
    @XmlElement(name = "Age20To21")
    protected GenderCountType age20To21;
    @XmlElement(name = "Age22To24")
    protected GenderCountType age22To24;
    @XmlElement(name = "Age25To29")
    protected GenderCountType age25To29;
    @XmlElement(name = "Age30To34")
    protected GenderCountType age30To34;
    @XmlElement(name = "Age35To39")
    protected GenderCountType age35To39;
    @XmlElement(name = "Age40To49")
    protected GenderCountType age40To49;
    @XmlElement(name = "Age50To64")
    protected GenderCountType age50To64;
    @XmlElement(name = "Age65AndOver")
    protected GenderCountType age65AndOver;
    @XmlElement(name = "AgeUnknown")
    protected GenderCountType ageUnknown;
    @XmlElement(name = "TotalAllAge")
    protected GenderCountType totalAllAge;

    /**
     * Gets the value of the ageUnder18 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAgeUnder18() {
        return ageUnder18;
    }

    /**
     * Sets the value of the ageUnder18 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAgeUnder18(GenderCountType value) {
        this.ageUnder18 = value;
    }

    /**
     * Gets the value of the age18To19 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge18To19() {
        return age18To19;
    }

    /**
     * Sets the value of the age18To19 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge18To19(GenderCountType value) {
        this.age18To19 = value;
    }

    /**
     * Gets the value of the age20To21 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge20To21() {
        return age20To21;
    }

    /**
     * Sets the value of the age20To21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge20To21(GenderCountType value) {
        this.age20To21 = value;
    }

    /**
     * Gets the value of the age22To24 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge22To24() {
        return age22To24;
    }

    /**
     * Sets the value of the age22To24 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge22To24(GenderCountType value) {
        this.age22To24 = value;
    }

    /**
     * Gets the value of the age25To29 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge25To29() {
        return age25To29;
    }

    /**
     * Sets the value of the age25To29 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge25To29(GenderCountType value) {
        this.age25To29 = value;
    }

    /**
     * Gets the value of the age30To34 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge30To34() {
        return age30To34;
    }

    /**
     * Sets the value of the age30To34 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge30To34(GenderCountType value) {
        this.age30To34 = value;
    }

    /**
     * Gets the value of the age35To39 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge35To39() {
        return age35To39;
    }

    /**
     * Sets the value of the age35To39 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge35To39(GenderCountType value) {
        this.age35To39 = value;
    }

    /**
     * Gets the value of the age40To49 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge40To49() {
        return age40To49;
    }

    /**
     * Sets the value of the age40To49 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge40To49(GenderCountType value) {
        this.age40To49 = value;
    }

    /**
     * Gets the value of the age50To64 property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge50To64() {
        return age50To64;
    }

    /**
     * Sets the value of the age50To64 property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge50To64(GenderCountType value) {
        this.age50To64 = value;
    }

    /**
     * Gets the value of the age65AndOver property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAge65AndOver() {
        return age65AndOver;
    }

    /**
     * Sets the value of the age65AndOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAge65AndOver(GenderCountType value) {
        this.age65AndOver = value;
    }

    /**
     * Gets the value of the ageUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAgeUnknown() {
        return ageUnknown;
    }

    /**
     * Sets the value of the ageUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAgeUnknown(GenderCountType value) {
        this.ageUnknown = value;
    }

    /**
     * Gets the value of the totalAllAge property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getTotalAllAge() {
        return totalAllAge;
    }

    /**
     * Sets the value of the totalAllAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setTotalAllAge(GenderCountType value) {
        this.totalAllAge = value;
    }

}
