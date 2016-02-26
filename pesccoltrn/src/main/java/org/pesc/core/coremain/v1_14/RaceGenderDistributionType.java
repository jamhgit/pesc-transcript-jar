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
 * <p>Java class for RaceGenderDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RaceGenderDistributionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HispanicAnyRace" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="AmericanIndianOrAlaskaNative" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="Asian" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="BlackOrAfricanAmerican" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="NativeHawaiianOrPacificIslander" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="White" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="TwoOrMoreRaces" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="NonresidentAlien" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="RaceEthnicityUnknown" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *         &lt;element name="TotalAllRaceEthnicity" type="{urn:org:pesc:core:CoreMain:v1.14.0}GenderCountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RaceGenderDistributionType", propOrder = {
    "hispanicAnyRace",
    "americanIndianOrAlaskaNative",
    "asian",
    "blackOrAfricanAmerican",
    "nativeHawaiianOrPacificIslander",
    "white",
    "twoOrMoreRaces",
    "nonresidentAlien",
    "raceEthnicityUnknown",
    "totalAllRaceEthnicity"
})
public class RaceGenderDistributionType {

    @XmlElement(name = "HispanicAnyRace")
    protected GenderCountType hispanicAnyRace;
    @XmlElement(name = "AmericanIndianOrAlaskaNative")
    protected GenderCountType americanIndianOrAlaskaNative;
    @XmlElement(name = "Asian")
    protected GenderCountType asian;
    @XmlElement(name = "BlackOrAfricanAmerican")
    protected GenderCountType blackOrAfricanAmerican;
    @XmlElement(name = "NativeHawaiianOrPacificIslander")
    protected GenderCountType nativeHawaiianOrPacificIslander;
    @XmlElement(name = "White")
    protected GenderCountType white;
    @XmlElement(name = "TwoOrMoreRaces")
    protected GenderCountType twoOrMoreRaces;
    @XmlElement(name = "NonresidentAlien")
    protected GenderCountType nonresidentAlien;
    @XmlElement(name = "RaceEthnicityUnknown")
    protected GenderCountType raceEthnicityUnknown;
    @XmlElement(name = "TotalAllRaceEthnicity")
    protected GenderCountType totalAllRaceEthnicity;

    /**
     * Gets the value of the hispanicAnyRace property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getHispanicAnyRace() {
        return hispanicAnyRace;
    }

    /**
     * Sets the value of the hispanicAnyRace property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setHispanicAnyRace(GenderCountType value) {
        this.hispanicAnyRace = value;
    }

    /**
     * Gets the value of the americanIndianOrAlaskaNative property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAmericanIndianOrAlaskaNative() {
        return americanIndianOrAlaskaNative;
    }

    /**
     * Sets the value of the americanIndianOrAlaskaNative property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAmericanIndianOrAlaskaNative(GenderCountType value) {
        this.americanIndianOrAlaskaNative = value;
    }

    /**
     * Gets the value of the asian property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getAsian() {
        return asian;
    }

    /**
     * Sets the value of the asian property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setAsian(GenderCountType value) {
        this.asian = value;
    }

    /**
     * Gets the value of the blackOrAfricanAmerican property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getBlackOrAfricanAmerican() {
        return blackOrAfricanAmerican;
    }

    /**
     * Sets the value of the blackOrAfricanAmerican property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setBlackOrAfricanAmerican(GenderCountType value) {
        this.blackOrAfricanAmerican = value;
    }

    /**
     * Gets the value of the nativeHawaiianOrPacificIslander property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getNativeHawaiianOrPacificIslander() {
        return nativeHawaiianOrPacificIslander;
    }

    /**
     * Sets the value of the nativeHawaiianOrPacificIslander property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setNativeHawaiianOrPacificIslander(GenderCountType value) {
        this.nativeHawaiianOrPacificIslander = value;
    }

    /**
     * Gets the value of the white property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getWhite() {
        return white;
    }

    /**
     * Sets the value of the white property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setWhite(GenderCountType value) {
        this.white = value;
    }

    /**
     * Gets the value of the twoOrMoreRaces property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getTwoOrMoreRaces() {
        return twoOrMoreRaces;
    }

    /**
     * Sets the value of the twoOrMoreRaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setTwoOrMoreRaces(GenderCountType value) {
        this.twoOrMoreRaces = value;
    }

    /**
     * Gets the value of the nonresidentAlien property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getNonresidentAlien() {
        return nonresidentAlien;
    }

    /**
     * Sets the value of the nonresidentAlien property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setNonresidentAlien(GenderCountType value) {
        this.nonresidentAlien = value;
    }

    /**
     * Gets the value of the raceEthnicityUnknown property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getRaceEthnicityUnknown() {
        return raceEthnicityUnknown;
    }

    /**
     * Sets the value of the raceEthnicityUnknown property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setRaceEthnicityUnknown(GenderCountType value) {
        this.raceEthnicityUnknown = value;
    }

    /**
     * Gets the value of the totalAllRaceEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link GenderCountType }
     *     
     */
    public GenderCountType getTotalAllRaceEthnicity() {
        return totalAllRaceEthnicity;
    }

    /**
     * Sets the value of the totalAllRaceEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenderCountType }
     *     
     */
    public void setTotalAllRaceEthnicity(GenderCountType value) {
        this.totalAllRaceEthnicity = value;
    }

}
