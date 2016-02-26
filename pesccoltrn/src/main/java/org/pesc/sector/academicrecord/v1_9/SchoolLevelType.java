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
 * <p>Java class for SchoolLevelType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SchoolLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BacheloriateCollege"/>
 *     &lt;enumeration value="CommunityCollege"/>
 *     &lt;enumeration value="GraduateSchool"/>
 *     &lt;enumeration value="MBA"/>
 *     &lt;enumeration value="MBAAccelerated"/>
 *     &lt;enumeration value="Professional"/>
 *     &lt;enumeration value="Undergraduate"/>
 *     &lt;enumeration value="VocationalTechnical"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SchoolLevelType")
@XmlEnum
public enum SchoolLevelType {

    @XmlEnumValue("BacheloriateCollege")
    BACHELORIATE_COLLEGE("BacheloriateCollege"),
    @XmlEnumValue("CommunityCollege")
    COMMUNITY_COLLEGE("CommunityCollege"),
    @XmlEnumValue("GraduateSchool")
    GRADUATE_SCHOOL("GraduateSchool"),
    MBA("MBA"),
    @XmlEnumValue("MBAAccelerated")
    MBA_ACCELERATED("MBAAccelerated"),
    @XmlEnumValue("Professional")
    PROFESSIONAL("Professional"),
    @XmlEnumValue("Undergraduate")
    UNDERGRADUATE("Undergraduate"),
    @XmlEnumValue("VocationalTechnical")
    VOCATIONAL_TECHNICAL("VocationalTechnical");
    private final String value;

    SchoolLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SchoolLevelType fromValue(String v) {
        for (SchoolLevelType c: SchoolLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
