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
 * <p>Java class for MaritalStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MaritalStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CommonLaw"/>
 *     &lt;enumeration value="RegisteredPartnership"/>
 *     &lt;enumeration value="Divorced"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Unknown"/>
 *     &lt;enumeration value="Married"/>
 *     &lt;enumeration value="Unreported"/>
 *     &lt;enumeration value="Separated"/>
 *     &lt;enumeration value="Unmarried"/>
 *     &lt;enumeration value="Widowed"/>
 *     &lt;enumeration value="LegallySeparated"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MaritalStatusCodeType")
@XmlEnum
public enum MaritalStatusCodeType {

    @XmlEnumValue("CommonLaw")
    COMMON_LAW("CommonLaw"),
    @XmlEnumValue("RegisteredPartnership")
    REGISTERED_PARTNERSHIP("RegisteredPartnership"),
    @XmlEnumValue("Divorced")
    DIVORCED("Divorced"),
    @XmlEnumValue("Single")
    SINGLE("Single"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown"),
    @XmlEnumValue("Married")
    MARRIED("Married"),
    @XmlEnumValue("Unreported")
    UNREPORTED("Unreported"),
    @XmlEnumValue("Separated")
    SEPARATED("Separated"),
    @XmlEnumValue("Unmarried")
    UNMARRIED("Unmarried"),
    @XmlEnumValue("Widowed")
    WIDOWED("Widowed"),
    @XmlEnumValue("LegallySeparated")
    LEGALLY_SEPARATED("LegallySeparated");
    private final String value;

    MaritalStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MaritalStatusCodeType fromValue(String v) {
        for (MaritalStatusCodeType c: MaritalStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}