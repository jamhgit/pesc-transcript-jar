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
import org.pesc.core.coremain.v1_14.AdvancedPlacementCodeType;
import org.pesc.core.coremain.v1_14.AdvancedSubjectCreditCodeType;
import org.pesc.core.coremain.v1_14.SchoolServicesType;


/**
 * Particular institutional services offered by an educational institution
 * 
 * <p>Java class for SchoolSupportServicesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchoolSupportServicesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SchoolServices" type="{urn:org:pesc:core:CoreMain:v1.14.0}SchoolServicesType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdvancedPlacementCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}AdvancedPlacementCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdvancedSubjectCreditCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}AdvancedSubjectCreditCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchoolSupportServicesType", propOrder = {
    "schoolServices",
    "advancedPlacementCode",
    "advancedSubjectCreditCode"
})
public class SchoolSupportServicesType {

    @XmlElement(name = "SchoolServices")
    @XmlSchemaType(name = "string")
    protected List<SchoolServicesType> schoolServices;
    @XmlElement(name = "AdvancedPlacementCode")
    @XmlSchemaType(name = "string")
    protected List<AdvancedPlacementCodeType> advancedPlacementCode;
    @XmlElement(name = "AdvancedSubjectCreditCode")
    @XmlSchemaType(name = "string")
    protected List<AdvancedSubjectCreditCodeType> advancedSubjectCreditCode;

    /**
     * Gets the value of the schoolServices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schoolServices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchoolServices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchoolServicesType }
     * 
     * 
     */
    public List<SchoolServicesType> getSchoolServices() {
        if (schoolServices == null) {
            schoolServices = new ArrayList<SchoolServicesType>();
        }
        return this.schoolServices;
    }

    /**
     * Gets the value of the advancedPlacementCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedPlacementCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedPlacementCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvancedPlacementCodeType }
     * 
     * 
     */
    public List<AdvancedPlacementCodeType> getAdvancedPlacementCode() {
        if (advancedPlacementCode == null) {
            advancedPlacementCode = new ArrayList<AdvancedPlacementCodeType>();
        }
        return this.advancedPlacementCode;
    }

    /**
     * Gets the value of the advancedSubjectCreditCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the advancedSubjectCreditCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdvancedSubjectCreditCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdvancedSubjectCreditCodeType }
     * 
     * 
     */
    public List<AdvancedSubjectCreditCodeType> getAdvancedSubjectCreditCode() {
        if (advancedSubjectCreditCode == null) {
            advancedSubjectCreditCode = new ArrayList<AdvancedSubjectCreditCodeType>();
        }
        return this.advancedSubjectCreditCode;
    }

}
