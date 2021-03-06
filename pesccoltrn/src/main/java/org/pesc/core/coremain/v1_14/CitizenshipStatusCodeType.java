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
 * <p>Java class for CitizenshipStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CitizenshipStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Asylee"/>
 *     &lt;enumeration value="Citizen"/>
 *     &lt;enumeration value="EligibleNonCitizen"/>
 *     &lt;enumeration value="IllegalAlien"/>
 *     &lt;enumeration value="LandedImmigrant"/>
 *     &lt;enumeration value="MinistersPermit"/>
 *     &lt;enumeration value="NonCitizen"/>
 *     &lt;enumeration value="NonPermanentResidentAlien"/>
 *     &lt;enumeration value="NonResidentAlien"/>
 *     &lt;enumeration value="NonResidentCitizen"/>
 *     &lt;enumeration value="NotEligible"/>
 *     &lt;enumeration value="PermanentVisa"/>
 *     &lt;enumeration value="Refugee"/>
 *     &lt;enumeration value="ResidentAlien"/>
 *     &lt;enumeration value="StudentAuthorization"/>
 *     &lt;enumeration value="StudentVisa"/>
 *     &lt;enumeration value="TemporaryVisa"/>
 *     &lt;enumeration value="UndocumentedAlien"/>
 *     &lt;enumeration value="VisitorVisa"/>
 *     &lt;enumeration value="WorkVisa"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CitizenshipStatusCodeType")
@XmlEnum
public enum CitizenshipStatusCodeType {

    @XmlEnumValue("Asylee")
    ASYLEE("Asylee"),
    @XmlEnumValue("Citizen")
    CITIZEN("Citizen"),
    @XmlEnumValue("EligibleNonCitizen")
    ELIGIBLE_NON_CITIZEN("EligibleNonCitizen"),
    @XmlEnumValue("IllegalAlien")
    ILLEGAL_ALIEN("IllegalAlien"),
    @XmlEnumValue("LandedImmigrant")
    LANDED_IMMIGRANT("LandedImmigrant"),
    @XmlEnumValue("MinistersPermit")
    MINISTERS_PERMIT("MinistersPermit"),
    @XmlEnumValue("NonCitizen")
    NON_CITIZEN("NonCitizen"),
    @XmlEnumValue("NonPermanentResidentAlien")
    NON_PERMANENT_RESIDENT_ALIEN("NonPermanentResidentAlien"),
    @XmlEnumValue("NonResidentAlien")
    NON_RESIDENT_ALIEN("NonResidentAlien"),
    @XmlEnumValue("NonResidentCitizen")
    NON_RESIDENT_CITIZEN("NonResidentCitizen"),
    @XmlEnumValue("NotEligible")
    NOT_ELIGIBLE("NotEligible"),
    @XmlEnumValue("PermanentVisa")
    PERMANENT_VISA("PermanentVisa"),
    @XmlEnumValue("Refugee")
    REFUGEE("Refugee"),
    @XmlEnumValue("ResidentAlien")
    RESIDENT_ALIEN("ResidentAlien"),
    @XmlEnumValue("StudentAuthorization")
    STUDENT_AUTHORIZATION("StudentAuthorization"),
    @XmlEnumValue("StudentVisa")
    STUDENT_VISA("StudentVisa"),
    @XmlEnumValue("TemporaryVisa")
    TEMPORARY_VISA("TemporaryVisa"),
    @XmlEnumValue("UndocumentedAlien")
    UNDOCUMENTED_ALIEN("UndocumentedAlien"),
    @XmlEnumValue("VisitorVisa")
    VISITOR_VISA("VisitorVisa"),
    @XmlEnumValue("WorkVisa")
    WORK_VISA("WorkVisa");
    private final String value;

    CitizenshipStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CitizenshipStatusCodeType fromValue(String v) {
        for (CitizenshipStatusCodeType c: CitizenshipStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
