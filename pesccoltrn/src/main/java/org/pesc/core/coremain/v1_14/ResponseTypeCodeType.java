//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:23 PM PST 
//


package org.pesc.core.coremain.v1_14;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseTypeCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResponseTypeCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ResponseToChangeRequest"/>
 *     &lt;enumeration value="ModificationAfterGuarantee"/>
 *     &lt;enumeration value="ResponseToLoanRequest"/>
 *     &lt;enumeration value="ResponseToCreditRequest"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResponseTypeCodeType")
@XmlEnum
public enum ResponseTypeCodeType {

    @XmlEnumValue("ResponseToChangeRequest")
    RESPONSE_TO_CHANGE_REQUEST("ResponseToChangeRequest"),
    @XmlEnumValue("ModificationAfterGuarantee")
    MODIFICATION_AFTER_GUARANTEE("ModificationAfterGuarantee"),
    @XmlEnumValue("ResponseToLoanRequest")
    RESPONSE_TO_LOAN_REQUEST("ResponseToLoanRequest"),
    @XmlEnumValue("ResponseToCreditRequest")
    RESPONSE_TO_CREDIT_REQUEST("ResponseToCreditRequest");
    private final String value;

    ResponseTypeCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResponseTypeCodeType fromValue(String v) {
        for (ResponseTypeCodeType c: ResponseTypeCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
