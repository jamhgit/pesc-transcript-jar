//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.25 at 04:54:19 PM PST 
//


package org.pesc.sector.academicrecord.v1_9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.pesc.core.coremain.v1_14.CourseAcademicGradeStatusCodeType;
import org.pesc.core.coremain.v1_14.CourseApplicabilityType;
import org.pesc.core.coremain.v1_14.CourseCreditBasisType;
import org.pesc.core.coremain.v1_14.CourseCreditLevelType;
import org.pesc.core.coremain.v1_14.CourseGPAApplicabilityCodeType;
import org.pesc.core.coremain.v1_14.CourseInstructionSiteType;
import org.pesc.core.coremain.v1_14.CourseLevelType;
import org.pesc.core.coremain.v1_14.CourseRepeatCodeType;
import org.pesc.core.coremain.v1_14.CourseSubjectAreaCodeType;
import org.pesc.core.coremain.v1_14.LanguageOfInstructionType;
import org.pesc.core.coremain.v1_14.LicensureType;
import org.pesc.core.coremain.v1_14.RAPType;
import org.pesc.core.coremain.v1_14.UserDefinedExtensionsType;


/**
 * <p>Java class for CourseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CourseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CourseCreditBasis" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCreditBasisType"/>
 *         &lt;element name="CourseCreditUnits" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCreditUnitsType" minOccurs="0"/>
 *         &lt;element name="CourseCreditLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCreditLevelType" minOccurs="0"/>
 *         &lt;element name="CourseCreditValue" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCreditValueType" minOccurs="0"/>
 *         &lt;element name="CourseCreditEarned" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCreditEarnedType" minOccurs="0"/>
 *         &lt;element name="CourseAcademicGradeScaleCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseAcademicGradeScaleCodeType" minOccurs="0"/>
 *         &lt;element name="CourseAcademicGrade" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseAcademicGradeType" minOccurs="0"/>
 *         &lt;element name="CourseSupplementalAcademicGrade" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}CourseSupplementalAcademicGradeType" minOccurs="0"/>
 *         &lt;element name="CourseAcademicGradeStatusCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseAcademicGradeStatusCodeType" minOccurs="0"/>
 *         &lt;element name="CourseNarrativeExplanationGrade" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseNarrativeExplanationGradeType" minOccurs="0"/>
 *         &lt;element name="CourseRepeatCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseRepeatCodeType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="CourseCIPCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCIPCodeType" minOccurs="0"/>
 *           &lt;element name="CourseCSISCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseCSISCodeType" minOccurs="0"/>
 *           &lt;element name="CourseUSISCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseUSISCodeType" minOccurs="0"/>
 *           &lt;element name="CourseNCESCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseNCESCodeType" minOccurs="0"/>
 *           &lt;element name="CourseSCEDCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseSCEDCodeType" minOccurs="0"/>
 *           &lt;element name="CourseFiveDigitSCEDCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseFiveDigitSCEDCodeType" minOccurs="0"/>
 *           &lt;element name="CourseSubjectAreaCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseSubjectAreaCodeType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="CourseQualityPointsEarned" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseQualityPointsEarnedType" minOccurs="0"/>
 *         &lt;element name="CourseLevel" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseLevelType" minOccurs="0"/>
 *         &lt;element name="CourseGPAApplicabilityCode" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseGPAApplicabilityCodeType" minOccurs="0"/>
 *         &lt;element name="CourseSubjectAbbreviation" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseSubjectAbbreviationType" minOccurs="0"/>
 *         &lt;element name="CourseNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseNumberType" minOccurs="0"/>
 *         &lt;element name="CourseSectionNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseSectionNumberType" minOccurs="0"/>
 *         &lt;element name="OriginalCourseID" type="{urn:org:pesc:core:CoreMain:v1.14.0}OriginalCourseIDType" minOccurs="0"/>
 *         &lt;element name="AgencyCourseID" type="{urn:org:pesc:core:CoreMain:v1.14.0}AgencyCourseIDType" minOccurs="0"/>
 *         &lt;element name="CourseTitle" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseTitleType" minOccurs="0"/>
 *         &lt;element name="CourseAddDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseAddDateType" minOccurs="0"/>
 *         &lt;element name="CourseDropDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseDropDateType" minOccurs="0"/>
 *         &lt;element name="CourseOverrideSchool" type="{urn:org:pesc:sector:AcademicRecord:v1.9.0}SchoolType" minOccurs="0"/>
 *         &lt;element name="OverrideSchoolCourseNumber" type="{urn:org:pesc:core:CoreMain:v1.14.0}OverrideSchoolCourseNumberType" minOccurs="0"/>
 *         &lt;element name="CourseApplicability" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseApplicabilityType" minOccurs="0"/>
 *         &lt;element name="CourseBeginDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseBeginDateType" minOccurs="0"/>
 *         &lt;element name="CourseEndDate" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseEndDateType" minOccurs="0"/>
 *         &lt;element name="CourseInstructionSite" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseInstructionSiteType" minOccurs="0"/>
 *         &lt;element name="CourseInstructionSiteName" type="{urn:org:pesc:core:CoreMain:v1.14.0}CourseInstructionSiteNameType" minOccurs="0"/>
 *         &lt;element name="Requirement" type="{urn:org:pesc:core:CoreMain:v1.14.0}RAPType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Attribute" type="{urn:org:pesc:core:CoreMain:v1.14.0}RAPType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Proficiency" type="{urn:org:pesc:core:CoreMain:v1.14.0}RAPType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Licensure" type="{urn:org:pesc:core:CoreMain:v1.14.0}LicensureType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LanguageOfInstruction" type="{urn:org:pesc:core:CoreMain:v1.14.0}LanguageOfInstructionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NoteMessage" type="{urn:org:pesc:core:CoreMain:v1.14.0}NoteMessageType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserDefinedExtensions" type="{urn:org:pesc:core:CoreMain:v1.14.0}UserDefinedExtensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CourseType", propOrder = {
    "courseCreditBasis",
    "courseCreditUnits",
    "courseCreditLevel",
    "courseCreditValue",
    "courseCreditEarned",
    "courseAcademicGradeScaleCode",
    "courseAcademicGrade",
    "courseSupplementalAcademicGrade",
    "courseAcademicGradeStatusCode",
    "courseNarrativeExplanationGrade",
    "courseRepeatCode",
    "courseCIPCode",
    "courseCSISCode",
    "courseUSISCode",
    "courseNCESCode",
    "courseSCEDCode",
    "courseFiveDigitSCEDCode",
    "courseSubjectAreaCode",
    "courseQualityPointsEarned",
    "courseLevel",
    "courseGPAApplicabilityCode",
    "courseSubjectAbbreviation",
    "courseNumber",
    "courseSectionNumber",
    "originalCourseID",
    "agencyCourseID",
    "courseTitle",
    "courseAddDate",
    "courseDropDate",
    "courseOverrideSchool",
    "overrideSchoolCourseNumber",
    "courseApplicability",
    "courseBeginDate",
    "courseEndDate",
    "courseInstructionSite",
    "courseInstructionSiteName",
    "requirement",
    "attribute",
    "proficiency",
    "licensure",
    "languageOfInstruction",
    "noteMessage",
    "userDefinedExtensions"
})
public class CourseType {

    @XmlElement(name = "CourseCreditBasis", required = true)
    @XmlSchemaType(name = "string")
    protected CourseCreditBasisType courseCreditBasis;
    @XmlElement(name = "CourseCreditUnits")
    protected String courseCreditUnits;
    @XmlElement(name = "CourseCreditLevel")
    @XmlSchemaType(name = "string")
    protected CourseCreditLevelType courseCreditLevel;
    @XmlElement(name = "CourseCreditValue")
    protected BigDecimal courseCreditValue;
    @XmlElement(name = "CourseCreditEarned")
    protected BigDecimal courseCreditEarned;
    @XmlElement(name = "CourseAcademicGradeScaleCode")
    protected String courseAcademicGradeScaleCode;
    @XmlElement(name = "CourseAcademicGrade")
    protected String courseAcademicGrade;
    @XmlElement(name = "CourseSupplementalAcademicGrade")
    protected CourseSupplementalAcademicGradeType courseSupplementalAcademicGrade;
    @XmlElement(name = "CourseAcademicGradeStatusCode")
    @XmlSchemaType(name = "string")
    protected CourseAcademicGradeStatusCodeType courseAcademicGradeStatusCode;
    @XmlElement(name = "CourseNarrativeExplanationGrade")
    protected String courseNarrativeExplanationGrade;
    @XmlElement(name = "CourseRepeatCode")
    @XmlSchemaType(name = "string")
    protected CourseRepeatCodeType courseRepeatCode;
    @XmlElement(name = "CourseCIPCode")
    protected String courseCIPCode;
    @XmlElement(name = "CourseCSISCode")
    protected String courseCSISCode;
    @XmlElement(name = "CourseUSISCode")
    protected String courseUSISCode;
    @XmlElement(name = "CourseNCESCode")
    protected String courseNCESCode;
    @XmlElement(name = "CourseSCEDCode")
    protected String courseSCEDCode;
    @XmlElement(name = "CourseFiveDigitSCEDCode")
    protected String courseFiveDigitSCEDCode;
    @XmlElement(name = "CourseSubjectAreaCode")
    @XmlSchemaType(name = "string")
    protected CourseSubjectAreaCodeType courseSubjectAreaCode;
    @XmlElement(name = "CourseQualityPointsEarned")
    protected BigDecimal courseQualityPointsEarned;
    @XmlElement(name = "CourseLevel")
    @XmlSchemaType(name = "string")
    protected CourseLevelType courseLevel;
    @XmlElement(name = "CourseGPAApplicabilityCode")
    @XmlSchemaType(name = "string")
    protected CourseGPAApplicabilityCodeType courseGPAApplicabilityCode;
    @XmlElement(name = "CourseSubjectAbbreviation")
    protected String courseSubjectAbbreviation;
    @XmlElement(name = "CourseNumber")
    protected String courseNumber;
    @XmlElement(name = "CourseSectionNumber")
    protected String courseSectionNumber;
    @XmlElement(name = "OriginalCourseID")
    protected String originalCourseID;
    @XmlElement(name = "AgencyCourseID")
    protected String agencyCourseID;
    @XmlElement(name = "CourseTitle")
    protected String courseTitle;
    @XmlElement(name = "CourseAddDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar courseAddDate;
    @XmlElement(name = "CourseDropDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar courseDropDate;
    @XmlElement(name = "CourseOverrideSchool")
    protected SchoolType courseOverrideSchool;
    @XmlElement(name = "OverrideSchoolCourseNumber")
    protected String overrideSchoolCourseNumber;
    @XmlElement(name = "CourseApplicability")
    @XmlSchemaType(name = "string")
    protected CourseApplicabilityType courseApplicability;
    @XmlElement(name = "CourseBeginDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar courseBeginDate;
    @XmlElement(name = "CourseEndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar courseEndDate;
    @XmlElement(name = "CourseInstructionSite")
    @XmlSchemaType(name = "string")
    protected CourseInstructionSiteType courseInstructionSite;
    @XmlElement(name = "CourseInstructionSiteName")
    protected String courseInstructionSiteName;
    @XmlElement(name = "Requirement")
    protected List<RAPType> requirement;
    @XmlElement(name = "Attribute")
    protected List<RAPType> attribute;
    @XmlElement(name = "Proficiency")
    protected List<RAPType> proficiency;
    @XmlElement(name = "Licensure")
    protected List<LicensureType> licensure;
    @XmlElement(name = "LanguageOfInstruction")
    protected List<LanguageOfInstructionType> languageOfInstruction;
    @XmlElement(name = "NoteMessage")
    protected List<String> noteMessage;
    @XmlElement(name = "UserDefinedExtensions")
    protected UserDefinedExtensionsType userDefinedExtensions;

    /**
     * Gets the value of the courseCreditBasis property.
     * 
     * @return
     *     possible object is
     *     {@link CourseCreditBasisType }
     *     
     */
    public CourseCreditBasisType getCourseCreditBasis() {
        return courseCreditBasis;
    }

    /**
     * Sets the value of the courseCreditBasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseCreditBasisType }
     *     
     */
    public void setCourseCreditBasis(CourseCreditBasisType value) {
        this.courseCreditBasis = value;
    }

    /**
     * Gets the value of the courseCreditUnits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCreditUnits() {
        return courseCreditUnits;
    }

    /**
     * Sets the value of the courseCreditUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCreditUnits(String value) {
        this.courseCreditUnits = value;
    }

    /**
     * Gets the value of the courseCreditLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CourseCreditLevelType }
     *     
     */
    public CourseCreditLevelType getCourseCreditLevel() {
        return courseCreditLevel;
    }

    /**
     * Sets the value of the courseCreditLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseCreditLevelType }
     *     
     */
    public void setCourseCreditLevel(CourseCreditLevelType value) {
        this.courseCreditLevel = value;
    }

    /**
     * Gets the value of the courseCreditValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseCreditValue() {
        return courseCreditValue;
    }

    /**
     * Sets the value of the courseCreditValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseCreditValue(BigDecimal value) {
        this.courseCreditValue = value;
    }

    /**
     * Gets the value of the courseCreditEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseCreditEarned() {
        return courseCreditEarned;
    }

    /**
     * Sets the value of the courseCreditEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseCreditEarned(BigDecimal value) {
        this.courseCreditEarned = value;
    }

    /**
     * Gets the value of the courseAcademicGradeScaleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseAcademicGradeScaleCode() {
        return courseAcademicGradeScaleCode;
    }

    /**
     * Sets the value of the courseAcademicGradeScaleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseAcademicGradeScaleCode(String value) {
        this.courseAcademicGradeScaleCode = value;
    }

    /**
     * Gets the value of the courseAcademicGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseAcademicGrade() {
        return courseAcademicGrade;
    }

    /**
     * Sets the value of the courseAcademicGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseAcademicGrade(String value) {
        this.courseAcademicGrade = value;
    }

    /**
     * Gets the value of the courseSupplementalAcademicGrade property.
     * 
     * @return
     *     possible object is
     *     {@link CourseSupplementalAcademicGradeType }
     *     
     */
    public CourseSupplementalAcademicGradeType getCourseSupplementalAcademicGrade() {
        return courseSupplementalAcademicGrade;
    }

    /**
     * Sets the value of the courseSupplementalAcademicGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseSupplementalAcademicGradeType }
     *     
     */
    public void setCourseSupplementalAcademicGrade(CourseSupplementalAcademicGradeType value) {
        this.courseSupplementalAcademicGrade = value;
    }

    /**
     * Gets the value of the courseAcademicGradeStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link CourseAcademicGradeStatusCodeType }
     *     
     */
    public CourseAcademicGradeStatusCodeType getCourseAcademicGradeStatusCode() {
        return courseAcademicGradeStatusCode;
    }

    /**
     * Sets the value of the courseAcademicGradeStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseAcademicGradeStatusCodeType }
     *     
     */
    public void setCourseAcademicGradeStatusCode(CourseAcademicGradeStatusCodeType value) {
        this.courseAcademicGradeStatusCode = value;
    }

    /**
     * Gets the value of the courseNarrativeExplanationGrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNarrativeExplanationGrade() {
        return courseNarrativeExplanationGrade;
    }

    /**
     * Sets the value of the courseNarrativeExplanationGrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNarrativeExplanationGrade(String value) {
        this.courseNarrativeExplanationGrade = value;
    }

    /**
     * Gets the value of the courseRepeatCode property.
     * 
     * @return
     *     possible object is
     *     {@link CourseRepeatCodeType }
     *     
     */
    public CourseRepeatCodeType getCourseRepeatCode() {
        return courseRepeatCode;
    }

    /**
     * Sets the value of the courseRepeatCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseRepeatCodeType }
     *     
     */
    public void setCourseRepeatCode(CourseRepeatCodeType value) {
        this.courseRepeatCode = value;
    }

    /**
     * Gets the value of the courseCIPCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCIPCode() {
        return courseCIPCode;
    }

    /**
     * Sets the value of the courseCIPCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCIPCode(String value) {
        this.courseCIPCode = value;
    }

    /**
     * Gets the value of the courseCSISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseCSISCode() {
        return courseCSISCode;
    }

    /**
     * Sets the value of the courseCSISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseCSISCode(String value) {
        this.courseCSISCode = value;
    }

    /**
     * Gets the value of the courseUSISCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseUSISCode() {
        return courseUSISCode;
    }

    /**
     * Sets the value of the courseUSISCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseUSISCode(String value) {
        this.courseUSISCode = value;
    }

    /**
     * Gets the value of the courseNCESCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNCESCode() {
        return courseNCESCode;
    }

    /**
     * Sets the value of the courseNCESCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNCESCode(String value) {
        this.courseNCESCode = value;
    }

    /**
     * Gets the value of the courseSCEDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSCEDCode() {
        return courseSCEDCode;
    }

    /**
     * Sets the value of the courseSCEDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSCEDCode(String value) {
        this.courseSCEDCode = value;
    }

    /**
     * Gets the value of the courseFiveDigitSCEDCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseFiveDigitSCEDCode() {
        return courseFiveDigitSCEDCode;
    }

    /**
     * Sets the value of the courseFiveDigitSCEDCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseFiveDigitSCEDCode(String value) {
        this.courseFiveDigitSCEDCode = value;
    }

    /**
     * Gets the value of the courseSubjectAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link CourseSubjectAreaCodeType }
     *     
     */
    public CourseSubjectAreaCodeType getCourseSubjectAreaCode() {
        return courseSubjectAreaCode;
    }

    /**
     * Sets the value of the courseSubjectAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseSubjectAreaCodeType }
     *     
     */
    public void setCourseSubjectAreaCode(CourseSubjectAreaCodeType value) {
        this.courseSubjectAreaCode = value;
    }

    /**
     * Gets the value of the courseQualityPointsEarned property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCourseQualityPointsEarned() {
        return courseQualityPointsEarned;
    }

    /**
     * Sets the value of the courseQualityPointsEarned property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCourseQualityPointsEarned(BigDecimal value) {
        this.courseQualityPointsEarned = value;
    }

    /**
     * Gets the value of the courseLevel property.
     * 
     * @return
     *     possible object is
     *     {@link CourseLevelType }
     *     
     */
    public CourseLevelType getCourseLevel() {
        return courseLevel;
    }

    /**
     * Sets the value of the courseLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseLevelType }
     *     
     */
    public void setCourseLevel(CourseLevelType value) {
        this.courseLevel = value;
    }

    /**
     * Gets the value of the courseGPAApplicabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link CourseGPAApplicabilityCodeType }
     *     
     */
    public CourseGPAApplicabilityCodeType getCourseGPAApplicabilityCode() {
        return courseGPAApplicabilityCode;
    }

    /**
     * Sets the value of the courseGPAApplicabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseGPAApplicabilityCodeType }
     *     
     */
    public void setCourseGPAApplicabilityCode(CourseGPAApplicabilityCodeType value) {
        this.courseGPAApplicabilityCode = value;
    }

    /**
     * Gets the value of the courseSubjectAbbreviation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSubjectAbbreviation() {
        return courseSubjectAbbreviation;
    }

    /**
     * Sets the value of the courseSubjectAbbreviation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSubjectAbbreviation(String value) {
        this.courseSubjectAbbreviation = value;
    }

    /**
     * Gets the value of the courseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseNumber() {
        return courseNumber;
    }

    /**
     * Sets the value of the courseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseNumber(String value) {
        this.courseNumber = value;
    }

    /**
     * Gets the value of the courseSectionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseSectionNumber() {
        return courseSectionNumber;
    }

    /**
     * Sets the value of the courseSectionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseSectionNumber(String value) {
        this.courseSectionNumber = value;
    }

    /**
     * Gets the value of the originalCourseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCourseID() {
        return originalCourseID;
    }

    /**
     * Sets the value of the originalCourseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCourseID(String value) {
        this.originalCourseID = value;
    }

    /**
     * Gets the value of the agencyCourseID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgencyCourseID() {
        return agencyCourseID;
    }

    /**
     * Sets the value of the agencyCourseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgencyCourseID(String value) {
        this.agencyCourseID = value;
    }

    /**
     * Gets the value of the courseTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseTitle() {
        return courseTitle;
    }

    /**
     * Sets the value of the courseTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseTitle(String value) {
        this.courseTitle = value;
    }

    /**
     * Gets the value of the courseAddDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCourseAddDate() {
        return courseAddDate;
    }

    /**
     * Sets the value of the courseAddDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCourseAddDate(XMLGregorianCalendar value) {
        this.courseAddDate = value;
    }

    /**
     * Gets the value of the courseDropDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCourseDropDate() {
        return courseDropDate;
    }

    /**
     * Sets the value of the courseDropDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCourseDropDate(XMLGregorianCalendar value) {
        this.courseDropDate = value;
    }

    /**
     * Gets the value of the courseOverrideSchool property.
     * 
     * @return
     *     possible object is
     *     {@link SchoolType }
     *     
     */
    public SchoolType getCourseOverrideSchool() {
        return courseOverrideSchool;
    }

    /**
     * Sets the value of the courseOverrideSchool property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchoolType }
     *     
     */
    public void setCourseOverrideSchool(SchoolType value) {
        this.courseOverrideSchool = value;
    }

    /**
     * Gets the value of the overrideSchoolCourseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverrideSchoolCourseNumber() {
        return overrideSchoolCourseNumber;
    }

    /**
     * Sets the value of the overrideSchoolCourseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverrideSchoolCourseNumber(String value) {
        this.overrideSchoolCourseNumber = value;
    }

    /**
     * Gets the value of the courseApplicability property.
     * 
     * @return
     *     possible object is
     *     {@link CourseApplicabilityType }
     *     
     */
    public CourseApplicabilityType getCourseApplicability() {
        return courseApplicability;
    }

    /**
     * Sets the value of the courseApplicability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseApplicabilityType }
     *     
     */
    public void setCourseApplicability(CourseApplicabilityType value) {
        this.courseApplicability = value;
    }

    /**
     * Gets the value of the courseBeginDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCourseBeginDate() {
        return courseBeginDate;
    }

    /**
     * Sets the value of the courseBeginDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCourseBeginDate(XMLGregorianCalendar value) {
        this.courseBeginDate = value;
    }

    /**
     * Gets the value of the courseEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCourseEndDate() {
        return courseEndDate;
    }

    /**
     * Sets the value of the courseEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCourseEndDate(XMLGregorianCalendar value) {
        this.courseEndDate = value;
    }

    /**
     * Gets the value of the courseInstructionSite property.
     * 
     * @return
     *     possible object is
     *     {@link CourseInstructionSiteType }
     *     
     */
    public CourseInstructionSiteType getCourseInstructionSite() {
        return courseInstructionSite;
    }

    /**
     * Sets the value of the courseInstructionSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link CourseInstructionSiteType }
     *     
     */
    public void setCourseInstructionSite(CourseInstructionSiteType value) {
        this.courseInstructionSite = value;
    }

    /**
     * Gets the value of the courseInstructionSiteName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourseInstructionSiteName() {
        return courseInstructionSiteName;
    }

    /**
     * Sets the value of the courseInstructionSiteName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourseInstructionSiteName(String value) {
        this.courseInstructionSiteName = value;
    }

    /**
     * Gets the value of the requirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAPType }
     * 
     * 
     */
    public List<RAPType> getRequirement() {
        if (requirement == null) {
            requirement = new ArrayList<RAPType>();
        }
        return this.requirement;
    }

    /**
     * Gets the value of the attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAPType }
     * 
     * 
     */
    public List<RAPType> getAttribute() {
        if (attribute == null) {
            attribute = new ArrayList<RAPType>();
        }
        return this.attribute;
    }

    /**
     * Gets the value of the proficiency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proficiency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProficiency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RAPType }
     * 
     * 
     */
    public List<RAPType> getProficiency() {
        if (proficiency == null) {
            proficiency = new ArrayList<RAPType>();
        }
        return this.proficiency;
    }

    /**
     * Gets the value of the licensure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licensure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicensure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicensureType }
     * 
     * 
     */
    public List<LicensureType> getLicensure() {
        if (licensure == null) {
            licensure = new ArrayList<LicensureType>();
        }
        return this.licensure;
    }

    /**
     * Gets the value of the languageOfInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageOfInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageOfInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageOfInstructionType }
     * 
     * 
     */
    public List<LanguageOfInstructionType> getLanguageOfInstruction() {
        if (languageOfInstruction == null) {
            languageOfInstruction = new ArrayList<LanguageOfInstructionType>();
        }
        return this.languageOfInstruction;
    }

    /**
     * Gets the value of the noteMessage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the noteMessage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNoteMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNoteMessage() {
        if (noteMessage == null) {
            noteMessage = new ArrayList<String>();
        }
        return this.noteMessage;
    }

    /**
     * Gets the value of the userDefinedExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public UserDefinedExtensionsType getUserDefinedExtensions() {
        return userDefinedExtensions;
    }

    /**
     * Sets the value of the userDefinedExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedExtensionsType }
     *     
     */
    public void setUserDefinedExtensions(UserDefinedExtensionsType value) {
        this.userDefinedExtensions = value;
    }

}
