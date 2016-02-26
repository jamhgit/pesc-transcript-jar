//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HighSchoolType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HighSchoolType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationName" type="{urn:org:pesc:core:CoreMain:v1.14.0}OrganizationNameType"/>
 *         &lt;group ref="{urn:org:pesc:core:CoreMain:v1.14.0}OrganizationIDMultiChoiceGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HighSchoolType", propOrder = {
    "organizationName",
    "opeid",
    "nchelpid",
    "ipeds",
    "atp",
    "fice",
    "act",
    "ccd",
    "pss",
    "ceebact",
    "csis",
    "usis",
    "esis",
    "psis",
    "duns",
    "mutuallyDefined",
    "apas"
})
public class HighSchoolType {

    @XmlElement(name = "OrganizationName", required = true)
    protected String organizationName;
    @XmlElement(name = "OPEID")
    protected String opeid;
    @XmlElement(name = "NCHELPID")
    protected String nchelpid;
    @XmlElement(name = "IPEDS")
    protected String ipeds;
    @XmlElement(name = "ATP")
    protected String atp;
    @XmlElement(name = "FICE")
    protected String fice;
    @XmlElement(name = "ACT")
    protected String act;
    @XmlElement(name = "CCD")
    protected String ccd;
    @XmlElement(name = "PSS")
    protected String pss;
    @XmlElement(name = "CEEBACT")
    protected String ceebact;
    @XmlElement(name = "CSIS")
    protected String csis;
    @XmlElement(name = "USIS")
    protected String usis;
    @XmlElement(name = "ESIS")
    protected String esis;
    @XmlElement(name = "PSIS")
    protected String psis;
    @XmlElement(name = "DUNS")
    protected String duns;
    @XmlElement(name = "MutuallyDefined")
    protected String mutuallyDefined;
    @XmlElement(name = "APAS")
    protected String apas;

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the opeid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOPEID() {
        return opeid;
    }

    /**
     * Sets the value of the opeid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOPEID(String value) {
        this.opeid = value;
    }

    /**
     * Gets the value of the nchelpid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNCHELPID() {
        return nchelpid;
    }

    /**
     * Sets the value of the nchelpid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNCHELPID(String value) {
        this.nchelpid = value;
    }

    /**
     * Gets the value of the ipeds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPEDS() {
        return ipeds;
    }

    /**
     * Sets the value of the ipeds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPEDS(String value) {
        this.ipeds = value;
    }

    /**
     * Gets the value of the atp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATP() {
        return atp;
    }

    /**
     * Sets the value of the atp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATP(String value) {
        this.atp = value;
    }

    /**
     * Gets the value of the fice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFICE() {
        return fice;
    }

    /**
     * Sets the value of the fice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFICE(String value) {
        this.fice = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACT() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACT(String value) {
        this.act = value;
    }

    /**
     * Gets the value of the ccd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCCD() {
        return ccd;
    }

    /**
     * Sets the value of the ccd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCCD(String value) {
        this.ccd = value;
    }

    /**
     * Gets the value of the pss property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSS() {
        return pss;
    }

    /**
     * Sets the value of the pss property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSS(String value) {
        this.pss = value;
    }

    /**
     * Gets the value of the ceebact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCEEBACT() {
        return ceebact;
    }

    /**
     * Sets the value of the ceebact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCEEBACT(String value) {
        this.ceebact = value;
    }

    /**
     * Gets the value of the csis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSIS() {
        return csis;
    }

    /**
     * Sets the value of the csis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSIS(String value) {
        this.csis = value;
    }

    /**
     * Gets the value of the usis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSIS() {
        return usis;
    }

    /**
     * Sets the value of the usis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSIS(String value) {
        this.usis = value;
    }

    /**
     * Gets the value of the esis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getESIS() {
        return esis;
    }

    /**
     * Sets the value of the esis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setESIS(String value) {
        this.esis = value;
    }

    /**
     * Gets the value of the psis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPSIS() {
        return psis;
    }

    /**
     * Sets the value of the psis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPSIS(String value) {
        this.psis = value;
    }

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDUNS(String value) {
        this.duns = value;
    }

    /**
     * Gets the value of the mutuallyDefined property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMutuallyDefined() {
        return mutuallyDefined;
    }

    /**
     * Sets the value of the mutuallyDefined property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutuallyDefined(String value) {
        this.mutuallyDefined = value;
    }

    /**
     * Gets the value of the apas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAPAS() {
        return apas;
    }

    /**
     * Sets the value of the apas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAPAS(String value) {
        this.apas = value;
    }

}
