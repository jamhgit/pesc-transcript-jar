//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DLLoanInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DLLoanInformationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:org:pesc:core:CoreMain:v1.14.0}LoanInformationType">
 *       &lt;sequence>
 *         &lt;element name="OriginationFeePercent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="InterestRebatePercent" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="100"/>
 *               &lt;totalDigits value="6"/>
 *               &lt;fractionDigits value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PromissoryNotePrintCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="S"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="Z"/>
 *               &lt;enumeration value="V"/>
 *               &lt;enumeration value="O"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DisclosureStatementPrintCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Y"/>
 *               &lt;enumeration value="R"/>
 *               &lt;enumeration value="S"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AcademicYearBeginDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="AcademicYearEndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Response" type="{urn:org:pesc:core:CoreMain:v1.14.0}ResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DLLoanInformationType", propOrder = {
    "originationFeePercent",
    "interestRebatePercent",
    "promissoryNotePrintCode",
    "disclosureStatementPrintCode",
    "academicYearBeginDate",
    "academicYearEndDate",
    "response"
})
public class DLLoanInformationType
    extends LoanInformationType
{

    @XmlElementRef(name = "OriginationFeePercent", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> originationFeePercent;
    @XmlElementRef(name = "InterestRebatePercent", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> interestRebatePercent;
    @XmlElementRef(name = "PromissoryNotePrintCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> promissoryNotePrintCode;
    @XmlElementRef(name = "DisclosureStatementPrintCode", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disclosureStatementPrintCode;
    @XmlElementRef(name = "AcademicYearBeginDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> academicYearBeginDate;
    @XmlElementRef(name = "AcademicYearEndDate", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> academicYearEndDate;
    @XmlElement(name = "Response")
    protected ResponseType response;

    /**
     * Gets the value of the originationFeePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOriginationFeePercent() {
        return originationFeePercent;
    }

    /**
     * Sets the value of the originationFeePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOriginationFeePercent(JAXBElement<BigDecimal> value) {
        this.originationFeePercent = value;
    }

    /**
     * Gets the value of the interestRebatePercent property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getInterestRebatePercent() {
        return interestRebatePercent;
    }

    /**
     * Sets the value of the interestRebatePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setInterestRebatePercent(JAXBElement<BigDecimal> value) {
        this.interestRebatePercent = value;
    }

    /**
     * Gets the value of the promissoryNotePrintCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPromissoryNotePrintCode() {
        return promissoryNotePrintCode;
    }

    /**
     * Sets the value of the promissoryNotePrintCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPromissoryNotePrintCode(JAXBElement<String> value) {
        this.promissoryNotePrintCode = value;
    }

    /**
     * Gets the value of the disclosureStatementPrintCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisclosureStatementPrintCode() {
        return disclosureStatementPrintCode;
    }

    /**
     * Sets the value of the disclosureStatementPrintCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisclosureStatementPrintCode(JAXBElement<String> value) {
        this.disclosureStatementPrintCode = value;
    }

    /**
     * Gets the value of the academicYearBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcademicYearBeginDate() {
        return academicYearBeginDate;
    }

    /**
     * Sets the value of the academicYearBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcademicYearBeginDate(JAXBElement<XMLGregorianCalendar> value) {
        this.academicYearBeginDate = value;
    }

    /**
     * Gets the value of the academicYearEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getAcademicYearEndDate() {
        return academicYearEndDate;
    }

    /**
     * Sets the value of the academicYearEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setAcademicYearEndDate(JAXBElement<XMLGregorianCalendar> value) {
        this.academicYearEndDate = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

}
