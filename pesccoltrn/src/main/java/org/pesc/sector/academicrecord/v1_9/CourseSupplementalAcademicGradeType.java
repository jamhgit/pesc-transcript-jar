//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CourseSupplementalAcademicGradeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseSupplementalAcademicGradeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseSupplementalGrade" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}CourseSupplementalGradeType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseSupplementalAcademicGradeType", propOrder = {
    "courseSupplementalGrade"
})
public class CourseSupplementalAcademicGradeType {

    @XmlElement(name = "CourseSupplementalGrade", required = true)
    protected List<CourseSupplementalGradeType> courseSupplementalGrade;

    /**
     * Gets the value of the courseSupplementalGrade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the courseSupplementalGrade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCourseSupplementalGrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CourseSupplementalGradeType }
     * 
     * 
     */
    public List<CourseSupplementalGradeType> getCourseSupplementalGrade() {
        if (courseSupplementalGrade == null) {
            courseSupplementalGrade = new ArrayList<CourseSupplementalGradeType>();
        }
        return this.courseSupplementalGrade;
    }

}
