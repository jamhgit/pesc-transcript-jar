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
 * <p>Java class for AnswerSelectedCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AnswerSelectedCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSelected"/>
 *     &lt;enumeration value="Selected"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AnswerSelectedCodeType")
@XmlEnum
public enum AnswerSelectedCodeType {

    @XmlEnumValue("NotSelected")
    NOT_SELECTED("NotSelected"),
    @XmlEnumValue("Selected")
    SELECTED("Selected");
    private final String value;

    AnswerSelectedCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AnswerSelectedCodeType fromValue(String v) {
        for (AnswerSelectedCodeType c: AnswerSelectedCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}