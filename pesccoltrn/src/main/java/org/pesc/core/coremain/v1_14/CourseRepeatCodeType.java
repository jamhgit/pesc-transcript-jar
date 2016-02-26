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
 * <p>Java class for CourseRepeatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CourseRepeatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RepeatCounted"/>
 *     &lt;enumeration value="RepeatNotCounted"/>
 *     &lt;enumeration value="ReplacementCounted"/>
 *     &lt;enumeration value="ReplacedNotCounted"/>
 *     &lt;enumeration value="RepeatOtherInstitution"/>
 *     &lt;enumeration value="NotCountedOther"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CourseRepeatCodeType")
@XmlEnum
public enum CourseRepeatCodeType {

    @XmlEnumValue("RepeatCounted")
    REPEAT_COUNTED("RepeatCounted"),
    @XmlEnumValue("RepeatNotCounted")
    REPEAT_NOT_COUNTED("RepeatNotCounted"),
    @XmlEnumValue("ReplacementCounted")
    REPLACEMENT_COUNTED("ReplacementCounted"),
    @XmlEnumValue("ReplacedNotCounted")
    REPLACED_NOT_COUNTED("ReplacedNotCounted"),
    @XmlEnumValue("RepeatOtherInstitution")
    REPEAT_OTHER_INSTITUTION("RepeatOtherInstitution"),
    @XmlEnumValue("NotCountedOther")
    NOT_COUNTED_OTHER("NotCountedOther");
    private final String value;

    CourseRepeatCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CourseRepeatCodeType fromValue(String v) {
        for (CourseRepeatCodeType c: CourseRepeatCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}