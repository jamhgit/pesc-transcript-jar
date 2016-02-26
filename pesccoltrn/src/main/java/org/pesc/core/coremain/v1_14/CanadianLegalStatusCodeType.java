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
 * <p>Java class for CanadianLegalStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CanadianLegalStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NonStatus"/>
 *     &lt;enumeration value="Status"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CanadianLegalStatusCodeType")
@XmlEnum
public enum CanadianLegalStatusCodeType {

    @XmlEnumValue("NonStatus")
    NON_STATUS("NonStatus"),
    @XmlEnumValue("Status")
    STATUS("Status");
    private final String value;

    CanadianLegalStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CanadianLegalStatusCodeType fromValue(String v) {
        for (CanadianLegalStatusCodeType c: CanadianLegalStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
