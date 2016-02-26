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
 * <p>Java class for ExamResultsType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ExamResultsType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotRequired"/>
 *     &lt;enumeration value="NotTaken"/>
 *     &lt;enumeration value="Waived"/>
 *     &lt;enumeration value="Passed"/>
 *     &lt;enumeration value="Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ExamResultsType")
@XmlEnum
public enum ExamResultsType {

    @XmlEnumValue("NotRequired")
    NOT_REQUIRED("NotRequired"),
    @XmlEnumValue("NotTaken")
    NOT_TAKEN("NotTaken"),
    @XmlEnumValue("Waived")
    WAIVED("Waived"),
    @XmlEnumValue("Passed")
    PASSED("Passed"),
    @XmlEnumValue("Failed")
    FAILED("Failed");
    private final String value;

    ExamResultsType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExamResultsType fromValue(String v) {
        for (ExamResultsType c: ExamResultsType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}