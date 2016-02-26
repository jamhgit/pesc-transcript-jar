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
 * <p>Java class for StudentReleaseCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="StudentReleaseCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllValuesIncluded"/>
 *     &lt;enumeration value="AllTrue"/>
 *     &lt;enumeration value="HonorCode"/>
 *     &lt;enumeration value="ObtainTranscripts"/>
 *     &lt;enumeration value="ReleaseTestScores"/>
 *     &lt;enumeration value="ReleaseTranscripts"/>
 *     &lt;enumeration value="ObtainTestScores"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "StudentReleaseCodeType")
@XmlEnum
public enum StudentReleaseCodeType {

    @XmlEnumValue("AllValuesIncluded")
    ALL_VALUES_INCLUDED("AllValuesIncluded"),
    @XmlEnumValue("AllTrue")
    ALL_TRUE("AllTrue"),
    @XmlEnumValue("HonorCode")
    HONOR_CODE("HonorCode"),
    @XmlEnumValue("ObtainTranscripts")
    OBTAIN_TRANSCRIPTS("ObtainTranscripts"),
    @XmlEnumValue("ReleaseTestScores")
    RELEASE_TEST_SCORES("ReleaseTestScores"),
    @XmlEnumValue("ReleaseTranscripts")
    RELEASE_TRANSCRIPTS("ReleaseTranscripts"),
    @XmlEnumValue("ObtainTestScores")
    OBTAIN_TEST_SCORES("ObtainTestScores");
    private final String value;

    StudentReleaseCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StudentReleaseCodeType fromValue(String v) {
        for (StudentReleaseCodeType c: StudentReleaseCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}