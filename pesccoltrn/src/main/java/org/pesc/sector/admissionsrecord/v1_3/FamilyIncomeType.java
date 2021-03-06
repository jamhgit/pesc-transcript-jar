//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.sector.admissionsrecord.v1_3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FamilyIncomeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyIncomeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaximumFamilyIncomeAmount" type="{urn:org:pesc:core:CoreMain:v1.14.0}MaximumFamilyIncomeAmountType" minOccurs="0"/>
 *         &lt;element name="MinimumFamilyIncomeAmount" type="{urn:org:pesc:core:CoreMain:v1.14.0}MinimumFamilyIncomeAmountType" minOccurs="0"/>
 *         &lt;element name="FamilyIncomeAmount" type="{urn:org:pesc:core:CoreMain:v1.14.0}FamilyIncomeAmountType" minOccurs="0"/>
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
@XmlType(name = "FamilyIncomeType", propOrder = {
    "maximumFamilyIncomeAmount",
    "minimumFamilyIncomeAmount",
    "familyIncomeAmount",
    "noteMessage"
})
public class FamilyIncomeType {

    @XmlElement(name = "MaximumFamilyIncomeAmount")
    protected BigDecimal maximumFamilyIncomeAmount;
    @XmlElement(name = "MinimumFamilyIncomeAmount")
    protected BigDecimal minimumFamilyIncomeAmount;
    @XmlElement(name = "FamilyIncomeAmount")
    protected BigDecimal familyIncomeAmount;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;

    /**
     * Gets the value of the maximumFamilyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaximumFamilyIncomeAmount() {
        return maximumFamilyIncomeAmount;
    }

    /**
     * Sets the value of the maximumFamilyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaximumFamilyIncomeAmount(BigDecimal value) {
        this.maximumFamilyIncomeAmount = value;
    }

    /**
     * Gets the value of the minimumFamilyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinimumFamilyIncomeAmount() {
        return minimumFamilyIncomeAmount;
    }

    /**
     * Sets the value of the minimumFamilyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinimumFamilyIncomeAmount(BigDecimal value) {
        this.minimumFamilyIncomeAmount = value;
    }

    /**
     * Gets the value of the familyIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFamilyIncomeAmount() {
        return familyIncomeAmount;
    }

    /**
     * Sets the value of the familyIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFamilyIncomeAmount(BigDecimal value) {
        this.familyIncomeAmount = value;
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
