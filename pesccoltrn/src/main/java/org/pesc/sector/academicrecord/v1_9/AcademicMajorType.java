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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.pesc.core.coremain.v1_14.ProgramSecondarySchoolCodeType;


/**
 * Academic subject area
 * 
 * <p>Java class for AcademicMajorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AcademicMajorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AcademicProgramName" type="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicProgramNameType"/>
 *         &lt;group ref="{urn:org:pesc:core:CoreMain:v1.14.0}AcademicProgramCodeGroup"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcademicMajorType", propOrder = {
    "academicProgramName",
    "programSecondarySchoolCode",
    "programCIPCode",
    "programHEGISCode",
    "programCSISCode",
    "programUSISCode",
    "programESISCode",
    "programLocalCode"
})
public class AcademicMajorType {

    @XmlElement(name = "AcademicProgramName", required = true)
    protected String academicProgramName;
    @XmlElement(name = "ProgramSecondarySchoolCode")
    @XmlSchemaType(name = "string")
    protected ProgramSecondarySchoolCodeType programSecondarySchoolCode;
    @XmlElement(name = "ProgramCIPCode")
    protected String programCIPCode;
    @XmlElement(name = "ProgramHEGISCode")
    protected String programHEGISCode;
    @XmlElement(name = "ProgramCSISCode")
    protected String programCSISCode;
    @XmlElement(name = "ProgramUSISCode")
    protected String programUSISCode;
    @XmlElement(name = "ProgramESISCode")
    protected String programESISCode;
    @XmlElement(name = "ProgramLocalCode")
    protected String programLocalCode;

    /**
     * Gets the value of the academicProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcademicProgramName() {
        return academicProgramName;
    }

    /**
     * Sets the value of the academicProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcademicProgramName(String value) {
        this.academicProgramName = value;
    }

    /**
     * Gets the value of the programSecondarySchoolCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProgramSecondarySchoolCodeType }
     *     
     */
    public ProgramSecondarySchoolCodeType getProgramSecondarySchoolCode() {
        return programSecondarySchoolCode;
    }

    /**
     * Sets the value of the programSecondarySchoolCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProgramSecondarySchoolCodeType }
     *     
     */
    public void setProgramSecondarySchoolCode(ProgramSecondarySchoolCodeType value) {
        this.programSecondarySchoolCode = value;
    }

    /**
     * Gets the value of the programCIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCIPCode() {
        return programCIPCode;
    }

    /**
     * Sets the value of the programCIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCIPCode(String value) {
        this.programCIPCode = value;
    }

    /**
     * Gets the value of the programHEGISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramHEGISCode() {
        return programHEGISCode;
    }

    /**
     * Sets the value of the programHEGISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramHEGISCode(String value) {
        this.programHEGISCode = value;
    }

    /**
     * Gets the value of the programCSISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramCSISCode() {
        return programCSISCode;
    }

    /**
     * Sets the value of the programCSISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramCSISCode(String value) {
        this.programCSISCode = value;
    }

    /**
     * Gets the value of the programUSISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramUSISCode() {
        return programUSISCode;
    }

    /**
     * Sets the value of the programUSISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramUSISCode(String value) {
        this.programUSISCode = value;
    }

    /**
     * Gets the value of the programESISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramESISCode() {
        return programESISCode;
    }

    /**
     * Sets the value of the programESISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramESISCode(String value) {
        this.programESISCode = value;
    }

    /**
     * Gets the value of the programLocalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramLocalCode() {
        return programLocalCode;
    }

    /**
     * Sets the value of the programLocalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramLocalCode(String value) {
        this.programLocalCode = value;
    }

}