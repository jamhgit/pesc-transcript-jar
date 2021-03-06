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
 * <p>Java class for LanguageProficiencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageProficiencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="EnglishOnly"/>
 *     &lt;enumeration value="Excellent"/>
 *     &lt;enumeration value="Fair"/>
 *     &lt;enumeration value="FullyEnglishProficient"/>
 *     &lt;enumeration value="Good"/>
 *     &lt;enumeration value="LimitedEnglishProficiency"/>
 *     &lt;enumeration value="NonEnglishSpeaking"/>
 *     &lt;enumeration value="Poor"/>
 *     &lt;enumeration value="RedesignatedFluentEnglishProficient"/>
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="Unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageProficiencyType")
@XmlEnum
public enum LanguageProficiencyType {

    @XmlEnumValue("EnglishOnly")
    ENGLISH_ONLY("EnglishOnly"),
    @XmlEnumValue("Excellent")
    EXCELLENT("Excellent"),
    @XmlEnumValue("Fair")
    FAIR("Fair"),
    @XmlEnumValue("FullyEnglishProficient")
    FULLY_ENGLISH_PROFICIENT("FullyEnglishProficient"),
    @XmlEnumValue("Good")
    GOOD("Good"),
    @XmlEnumValue("LimitedEnglishProficiency")
    LIMITED_ENGLISH_PROFICIENCY("LimitedEnglishProficiency"),
    @XmlEnumValue("NonEnglishSpeaking")
    NON_ENGLISH_SPEAKING("NonEnglishSpeaking"),
    @XmlEnumValue("Poor")
    POOR("Poor"),
    @XmlEnumValue("RedesignatedFluentEnglishProficient")
    REDESIGNATED_FLUENT_ENGLISH_PROFICIENT("RedesignatedFluentEnglishProficient"),
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    LanguageProficiencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageProficiencyType fromValue(String v) {
        for (LanguageProficiencyType c: LanguageProficiencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
