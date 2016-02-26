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
 * <p>Java class for RelationshipToBorrowerType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RelationshipToBorrowerType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;enumeration value="Employer"/>
 *     &lt;enumeration value="Friend"/>
 *     &lt;enumeration value="Guardian"/>
 *     &lt;enumeration value="Other"/>
 *     &lt;enumeration value="Parent"/>
 *     &lt;enumeration value="Relative"/>
 *     &lt;enumeration value="Sibling"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RelationshipToBorrowerType")
@XmlEnum
public enum RelationshipToBorrowerType {

    @XmlEnumValue("Employer")
    EMPLOYER("Employer"),
    @XmlEnumValue("Friend")
    FRIEND("Friend"),
    @XmlEnumValue("Guardian")
    GUARDIAN("Guardian"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("Parent")
    PARENT("Parent"),
    @XmlEnumValue("Relative")
    RELATIVE("Relative"),
    @XmlEnumValue("Sibling")
    SIBLING("Sibling");
    private final String value;

    RelationshipToBorrowerType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RelationshipToBorrowerType fromValue(String v) {
        for (RelationshipToBorrowerType c: RelationshipToBorrowerType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}