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
 * <p>Java class for EmploymentStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EmploymentStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;enumeration value="FullTime"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="PartTime"/>
 *     &lt;enumeration value="Retired"/>
 *     &lt;enumeration value="Salary"/>
 *     &lt;enumeration value="SelfEmployed"/>
 *     &lt;enumeration value="SchoolYear"/>
 *     &lt;enumeration value="Summer"/>
 *     &lt;enumeration value="Unemployed"/>
 *     &lt;enumeration value="YearRound"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EmploymentStatusCodeType")
@XmlEnum
public enum EmploymentStatusCodeType {

    @XmlEnumValue("FullTime")
    FULL_TIME("FullTime"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("PartTime")
    PART_TIME("PartTime"),
    @XmlEnumValue("Retired")
    RETIRED("Retired"),
    @XmlEnumValue("Salary")
    SALARY("Salary"),
    @XmlEnumValue("SelfEmployed")
    SELF_EMPLOYED("SelfEmployed"),
    @XmlEnumValue("SchoolYear")
    SCHOOL_YEAR("SchoolYear"),
    @XmlEnumValue("Summer")
    SUMMER("Summer"),
    @XmlEnumValue("Unemployed")
    UNEMPLOYED("Unemployed"),
    @XmlEnumValue("YearRound")
    YEAR_ROUND("YearRound");
    private final String value;

    EmploymentStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EmploymentStatusCodeType fromValue(String v) {
        for (EmploymentStatusCodeType c: EmploymentStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
