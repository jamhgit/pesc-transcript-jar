//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *     logical grouping for National SMART Grant program
 * 
 * <p>Java class for NationalSMARTGrantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalSMARTGrantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FinancialAwardYear" type="{urn:org:pesc:core:CoreMain:v1.14.0}FinancialAwardYearType"/>
 *         &lt;element name="CPSTransactionNumber" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *               &lt;minInclusive value="1"/>
 *               &lt;maxInclusive value="99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="FinancialAwardAmount" type="{urn:org:pesc:core:CoreMain:v1.14.0}SmallCurrencyType" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.14.0}NoteMessageType" minOccurs="0"/>
 *         &lt;element name="EnrollmentDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="FinancialAwardNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}FinancialAwardNumberType" minOccurs="0"/>
 *         &lt;element name="FinancialAwardID" type="{urn:org:pesc:core:CoreMain:v1.14.0}FinancialAwardIDType" minOccurs="0"/>
 *         &lt;element name="StudentLevelCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}StudentLevelCodeType" minOccurs="0"/>
 *         &lt;element name="CourseCIPCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCIPCodeType" minOccurs="0"/>
 *         &lt;element name="Disbursement" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}CODDisbursementType">
 *                 &lt;sequence>
 *                   &lt;element name="PaymentPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalSMARTGrantType", propOrder = {
    "financialAwardYear",
    "cpsTransactionNumber",
    "financialAwardAmount",
    "noteMessage",
    "enrollmentDate",
    "financialAwardNumber",
    "financialAwardID",
    "studentLevelCode",
    "courseCIPCode",
    "disbursement"
})
public class NationalSMARTGrantType {

    @XmlElement(name = "FinancialAwardYear", required = true)
    protected String financialAwardYear;
    @XmlElement(name = "CPSTransactionNumber")
    protected Integer cpsTransactionNumber;
    @XmlElementRef(name = "FinancialAwardAmount", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> financialAwardAmount;
    @XmlElement(name = "NoteMessage")
    protected String noteMessage;
    @XmlElement(name = "EnrollmentDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar enrollmentDate;
    @XmlElement(name = "FinancialAwardNumber")
    protected BigInteger financialAwardNumber;
    @XmlElement(name = "FinancialAwardID")
    protected String financialAwardID;
    @XmlElement(name = "StudentLevelCode")
    @XmlSchemaType(name = "string")
    protected StudentLevelCodeType studentLevelCode;
    @XmlElement(name = "CourseCIPCode")
    protected String courseCIPCode;
    @XmlElement(name = "Disbursement")
    protected List<NationalSMARTGrantType.Disbursement> disbursement;

    /**
     * Gets the value of the financialAwardYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAwardYear() {
        return financialAwardYear;
    }

    /**
     * Sets the value of the financialAwardYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAwardYear(String value) {
        this.financialAwardYear = value;
    }

    /**
     * Gets the value of the cpsTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCPSTransactionNumber() {
        return cpsTransactionNumber;
    }

    /**
     * Sets the value of the cpsTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCPSTransactionNumber(Integer value) {
        this.cpsTransactionNumber = value;
    }

    /**
     * Gets the value of the financialAwardAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getFinancialAwardAmount() {
        return financialAwardAmount;
    }

    /**
     * Sets the value of the financialAwardAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setFinancialAwardAmount(JAXBElement<BigDecimal> value) {
        this.financialAwardAmount = value;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoteMessage() {
        return noteMessage;
    }

    /**
     * Sets the value of the noteMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoteMessage(String value) {
        this.noteMessage = value;
    }

    /**
     * Gets the value of the enrollmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEnrollmentDate() {
        return enrollmentDate;
    }

    /**
     * Sets the value of the enrollmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEnrollmentDate(XMLGregorianCalendar value) {
        this.enrollmentDate = value;
    }

    /**
     * Gets the value of the financialAwardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFinancialAwardNumber() {
        return financialAwardNumber;
    }

    /**
     * Sets the value of the financialAwardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFinancialAwardNumber(BigInteger value) {
        this.financialAwardNumber = value;
    }

    /**
     * Gets the value of the financialAwardID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFinancialAwardID() {
        return financialAwardID;
    }

    /**
     * Sets the value of the financialAwardID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFinancialAwardID(String value) {
        this.financialAwardID = value;
    }

    /**
     * Gets the value of the studentLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link StudentLevelCodeType }
     *     
     */
    public StudentLevelCodeType getStudentLevelCode() {
        return studentLevelCode;
    }

    /**
     * Sets the value of the studentLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentLevelCodeType }
     *     
     */
    public void setStudentLevelCode(StudentLevelCodeType value) {
        this.studentLevelCode = value;
    }

    /**
     * Gets the value of the courseCIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCIPCode() {
        return courseCIPCode;
    }

    /**
     * Sets the value of the courseCIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCIPCode(String value) {
        this.courseCIPCode = value;
    }

    /**
     * Gets the value of the disbursement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the disbursement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDisbursement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalSMARTGrantType.Disbursement }
     * 
     * 
     */
    public List<NationalSMARTGrantType.Disbursement> getDisbursement() {
        if (disbursement == null) {
            disbursement = new ArrayList<NationalSMARTGrantType.Disbursement>();
        }
        return this.disbursement;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}CODDisbursementType">
     *       &lt;sequence>
     *         &lt;element name="PaymentPeriodStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentPeriodStartDate"
    })
    public static class Disbursement
        extends CODDisbursementType
    {

        @XmlElement(name = "PaymentPeriodStartDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar paymentPeriodStartDate;

        /**
         * Gets the value of the paymentPeriodStartDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPaymentPeriodStartDate() {
            return paymentPeriodStartDate;
        }

        /**
         * Sets the value of the paymentPeriodStartDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPaymentPeriodStartDate(XMLGregorianCalendar value) {
            this.paymentPeriodStartDate = value;
        }

    }

}
