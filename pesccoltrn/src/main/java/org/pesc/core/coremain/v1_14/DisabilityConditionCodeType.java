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
 * <p>Java class for DisabilityConditionCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DisabilityConditionCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CerebralPalsy"/>
 *     &lt;enumeration value="ChronicIllness"/>
 *     &lt;enumeration value="DrugAlcoholAddiction"/>
 *     &lt;enumeration value="EmotionalPsychological"/>
 *     &lt;enumeration value="EpilepsySeizure"/>
 *     &lt;enumeration value="Hearing"/>
 *     &lt;enumeration value="Learning"/>
 *     &lt;enumeration value="MentalRetardation"/>
 *     &lt;enumeration value="None"/>
 *     &lt;enumeration value="OrthopedicPhysical"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="SpeechLanguage"/>
 *     &lt;enumeration value="Visual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DisabilityConditionCodeType")
@XmlEnum
public enum DisabilityConditionCodeType {

    @XmlEnumValue("CerebralPalsy")
    CEREBRAL_PALSY("CerebralPalsy"),
    @XmlEnumValue("ChronicIllness")
    CHRONIC_ILLNESS("ChronicIllness"),
    @XmlEnumValue("DrugAlcoholAddiction")
    DRUG_ALCOHOL_ADDICTION("DrugAlcoholAddiction"),
    @XmlEnumValue("EmotionalPsychological")
    EMOTIONAL_PSYCHOLOGICAL("EmotionalPsychological"),
    @XmlEnumValue("EpilepsySeizure")
    EPILEPSY_SEIZURE("EpilepsySeizure"),
    @XmlEnumValue("Hearing")
    HEARING("Hearing"),
    @XmlEnumValue("Learning")
    LEARNING("Learning"),
    @XmlEnumValue("MentalRetardation")
    MENTAL_RETARDATION("MentalRetardation"),
    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("OrthopedicPhysical")
    ORTHOPEDIC_PHYSICAL("OrthopedicPhysical"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("SpeechLanguage")
    SPEECH_LANGUAGE("SpeechLanguage"),
    @XmlEnumValue("Visual")
    VISUAL("Visual");
    private final String value;

    DisabilityConditionCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DisabilityConditionCodeType fromValue(String v) {
        for (DisabilityConditionCodeType c: DisabilityConditionCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
