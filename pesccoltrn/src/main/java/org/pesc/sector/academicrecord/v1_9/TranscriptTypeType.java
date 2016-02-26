//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TranscriptTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TranscriptTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BothContinuingEdAndCreditCourses"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="ContinuingEdCreditCoursesOnly"/>
 *     &lt;enumeration value="CreditCoursesOnly"/>
 *     &lt;enumeration value="Dental"/>
 *     &lt;enumeration value="Graduate"/>
 *     &lt;enumeration value="Health"/>
 *     &lt;enumeration value="Law"/>
 *     &lt;enumeration value="Management"/>
 *     &lt;enumeration value="Medical"/>
 *     &lt;enumeration value="Pharmacy"/>
 *     &lt;enumeration value="Undergraduate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TranscriptTypeType")
@XmlEnum
public enum TranscriptTypeType {

    @XmlEnumValue("BothContinuingEdAndCreditCourses")
    BOTH_CONTINUING_ED_AND_CREDIT_COURSES("BothContinuingEdAndCreditCourses"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("ContinuingEdCreditCoursesOnly")
    CONTINUING_ED_CREDIT_COURSES_ONLY("ContinuingEdCreditCoursesOnly"),
    @XmlEnumValue("CreditCoursesOnly")
    CREDIT_COURSES_ONLY("CreditCoursesOnly"),
    @XmlEnumValue("Dental")
    DENTAL("Dental"),
    @XmlEnumValue("Graduate")
    GRADUATE("Graduate"),
    @XmlEnumValue("Health")
    HEALTH("Health"),
    @XmlEnumValue("Law")
    LAW("Law"),
    @XmlEnumValue("Management")
    MANAGEMENT("Management"),
    @XmlEnumValue("Medical")
    MEDICAL("Medical"),
    @XmlEnumValue("Pharmacy")
    PHARMACY("Pharmacy"),
    @XmlEnumValue("Undergraduate")
    UNDERGRADUATE("Undergraduate");
    private final String value;

    TranscriptTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TranscriptTypeType fromValue(String v) {
        for (TranscriptTypeType c: TranscriptTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
