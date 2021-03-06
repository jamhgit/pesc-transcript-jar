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
 * <p>Java class for CourseCreditBasisType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CourseCreditBasisType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="AcademicRenewal"/>
 *     &lt;enumeration value="AdvancedPlacement"/>
 *     &lt;enumeration value="AdvancedStanding"/>
 *     &lt;enumeration value="ContinuingEducation"/>
 *     &lt;enumeration value="Correspondence"/>
 *     &lt;enumeration value="Exemption"/>
 *     &lt;enumeration value="Equivalence"/>
 *     &lt;enumeration value="InternationalBaccalaureate"/>
 *     &lt;enumeration value="Military"/>
 *     &lt;enumeration value="Remedial"/>
 *     &lt;enumeration value="CreditByExam"/>
 *     &lt;enumeration value="HighSchoolTransferCredit"/>
 *     &lt;enumeration value="HighSchoolCreditOnly"/>
 *     &lt;enumeration value="HighSchoolDualCredit"/>
 *     &lt;enumeration value="JuniorHighSchoolCredit"/>
 *     &lt;enumeration value="LifeExperience"/>
 *     &lt;enumeration value="Major"/>
 *     &lt;enumeration value="AdultBasic"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CourseCreditBasisType")
@XmlEnum
public enum CourseCreditBasisType {

    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("AcademicRenewal")
    ACADEMIC_RENEWAL("AcademicRenewal"),
    @XmlEnumValue("AdvancedPlacement")
    ADVANCED_PLACEMENT("AdvancedPlacement"),
    @XmlEnumValue("AdvancedStanding")
    ADVANCED_STANDING("AdvancedStanding"),
    @XmlEnumValue("ContinuingEducation")
    CONTINUING_EDUCATION("ContinuingEducation"),
    @XmlEnumValue("Correspondence")
    CORRESPONDENCE("Correspondence"),
    @XmlEnumValue("Exemption")
    EXEMPTION("Exemption"),
    @XmlEnumValue("Equivalence")
    EQUIVALENCE("Equivalence"),
    @XmlEnumValue("InternationalBaccalaureate")
    INTERNATIONAL_BACCALAUREATE("InternationalBaccalaureate"),
    @XmlEnumValue("Military")
    MILITARY("Military"),
    @XmlEnumValue("Remedial")
    REMEDIAL("Remedial"),
    @XmlEnumValue("CreditByExam")
    CREDIT_BY_EXAM("CreditByExam"),
    @XmlEnumValue("HighSchoolTransferCredit")
    HIGH_SCHOOL_TRANSFER_CREDIT("HighSchoolTransferCredit"),
    @XmlEnumValue("HighSchoolCreditOnly")
    HIGH_SCHOOL_CREDIT_ONLY("HighSchoolCreditOnly"),
    @XmlEnumValue("HighSchoolDualCredit")
    HIGH_SCHOOL_DUAL_CREDIT("HighSchoolDualCredit"),
    @XmlEnumValue("JuniorHighSchoolCredit")
    JUNIOR_HIGH_SCHOOL_CREDIT("JuniorHighSchoolCredit"),
    @XmlEnumValue("LifeExperience")
    LIFE_EXPERIENCE("LifeExperience"),
    @XmlEnumValue("Major")
    MAJOR("Major"),
    @XmlEnumValue("AdultBasic")
    ADULT_BASIC("AdultBasic");
    private final String value;

    CourseCreditBasisType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CourseCreditBasisType fromValue(String v) {
        for (CourseCreditBasisType c: CourseCreditBasisType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
