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
 * <p>Java class for UpdateContactsInformationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UpdateContactsInformationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="UpdateContacts"/>
 *     &lt;enumeration value="NoUpdate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UpdateContactsInformationType")
@XmlEnum
public enum UpdateContactsInformationType {

    @XmlEnumValue("UpdateContacts")
    UPDATE_CONTACTS("UpdateContacts"),
    @XmlEnumValue("NoUpdate")
    NO_UPDATE("NoUpdate");
    private final String value;

    UpdateContactsInformationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UpdateContactsInformationType fromValue(String v) {
        for (UpdateContactsInformationType c: UpdateContactsInformationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
