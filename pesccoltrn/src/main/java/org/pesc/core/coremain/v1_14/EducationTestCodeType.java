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
 * <p>Java class for EducationTestCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EducationTestCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACT"/>
 *     &lt;enumeration value="ACTExplore"/>
 *     &lt;enumeration value="ACTInterestInventory"/>
 *     &lt;enumeration value="ACTPlan"/>
 *     &lt;enumeration value="ACTWorkKeys"/>
 *     &lt;enumeration value="APArtDrawing"/>
 *     &lt;enumeration value="APArtGeneral"/>
 *     &lt;enumeration value="APBiology"/>
 *     &lt;enumeration value="APCalculusAB"/>
 *     &lt;enumeration value="APCalculusBC"/>
 *     &lt;enumeration value="APChemistry"/>
 *     &lt;enumeration value="APComputerScienceA"/>
 *     &lt;enumeration value="APComputerScienceB"/>
 *     &lt;enumeration value="APEconomicsMacro"/>
 *     &lt;enumeration value="APEconomicsMicro"/>
 *     &lt;enumeration value="APEnglishLanguageComposition"/>
 *     &lt;enumeration value="APFrenchLanguage"/>
 *     &lt;enumeration value="APFrenchLiterature"/>
 *     &lt;enumeration value="APGermanLanguage"/>
 *     &lt;enumeration value="APGovernmentPoliticsComparative"/>
 *     &lt;enumeration value="APGovernmentPoliticsUS"/>
 *     &lt;enumeration value="APHistoryArt"/>
 *     &lt;enumeration value="APHistoryEurope"/>
 *     &lt;enumeration value="APHistoryUS"/>
 *     &lt;enumeration value="APLatinCatHor"/>
 *     &lt;enumeration value="APLatinVergil"/>
 *     &lt;enumeration value="APMusicListeningLiterature"/>
 *     &lt;enumeration value="APMusicTheory"/>
 *     &lt;enumeration value="APPhysics"/>
 *     &lt;enumeration value="APPhysicsEngineeringMechanics"/>
 *     &lt;enumeration value="APPhysicsMechanics"/>
 *     &lt;enumeration value="APPsychology"/>
 *     &lt;enumeration value="APSpanishLanguage"/>
 *     &lt;enumeration value="APSpanishLiterature"/>
 *     &lt;enumeration value="CaliforniaHighSchoolExitExam"/>
 *     &lt;enumeration value="CLEPAccountingFinancial"/>
 *     &lt;enumeration value="CLEPAlgebraCollege"/>
 *     &lt;enumeration value="CLEPBiology"/>
 *     &lt;enumeration value="CLEPBusinessLawIntroduction"/>
 *     &lt;enumeration value="CLEPCalculus"/>
 *     &lt;enumeration value="CLEPChemistry"/>
 *     &lt;enumeration value="CLEPCompositionCollegeFreshman"/>
 *     &lt;enumeration value="CLEPCompositionEnglish"/>
 *     &lt;enumeration value="CLEPEconomicsMacro"/>
 *     &lt;enumeration value="CLEPEconomicsMicro"/>
 *     &lt;enumeration value="CLEPEnglishComposition"/>
 *     &lt;enumeration value="CLEPFrenchLanguage"/>
 *     &lt;enumeration value="CLEPGermanLanguage"/>
 *     &lt;enumeration value="CLEPGovernmentAmerican"/>
 *     &lt;enumeration value="CLEPHistoryUSFrom1865"/>
 *     &lt;enumeration value="CLEPHistoryUSTo1877"/>
 *     &lt;enumeration value="CLEPHumanGrowthDevelopment"/>
 *     &lt;enumeration value="CLEPHumanities"/>
 *     &lt;enumeration value="CLEPInformationSystems"/>
 *     &lt;enumeration value="CLEPLanguageSpanish"/>
 *     &lt;enumeration value="CLEPLiteratureAmerican"/>
 *     &lt;enumeration value="CLEPLiteratureAnalysisAndInterpreting"/>
 *     &lt;enumeration value="CLEPLiteratureEnglish"/>
 *     &lt;enumeration value="CLEPManagement"/>
 *     &lt;enumeration value="CLEPMarketing"/>
 *     &lt;enumeration value="CLEPMath"/>
 *     &lt;enumeration value="CLEPMathCollege"/>
 *     &lt;enumeration value="CLEPPreCalculus"/>
 *     &lt;enumeration value="CLEPPsychologyEducational"/>
 *     &lt;enumeration value="CLEPPsychologyIntroductory"/>
 *     &lt;enumeration value="CLEPSciencesNatural"/>
 *     &lt;enumeration value="CLEPSocialSciencesAndHistory"/>
 *     &lt;enumeration value="CLEPSociologyIntroductory"/>
 *     &lt;enumeration value="CLEPWesternCivilizationFrom1648"/>
 *     &lt;enumeration value="CLEPWesternCivilizationTo1648"/>
 *     &lt;enumeration value="GED"/>
 *     &lt;enumeration value="GMAT"/>
 *     &lt;enumeration value="GRE"/>
 *     &lt;enumeration value="GREBiochemistryCellMolecular"/>
 *     &lt;enumeration value="GREBiology"/>
 *     &lt;enumeration value="GREChemistry"/>
 *     &lt;enumeration value="GREComputerScience"/>
 *     &lt;enumeration value="GRELiteratureEnglish"/>
 *     &lt;enumeration value="GREMathematics"/>
 *     &lt;enumeration value="GREPhysics"/>
 *     &lt;enumeration value="GREPsychology"/>
 *     &lt;enumeration value="IELTS"/>
 *     &lt;enumeration value="InternationalBaccalaureate"/>
 *     &lt;enumeration value="LSAT"/>
 *     &lt;enumeration value="MCAT"/>
 *     &lt;enumeration value="OtherStateTest"/>
 *     &lt;enumeration value="OtherTest"/>
 *     &lt;enumeration value="SAT"/>
 *     &lt;enumeration value="SATBiology"/>
 *     &lt;enumeration value="SATChemistry"/>
 *     &lt;enumeration value="SATChineseListening"/>
 *     &lt;enumeration value="SATFrenchListening"/>
 *     &lt;enumeration value="SATGerman"/>
 *     &lt;enumeration value="SATGermanListening"/>
 *     &lt;enumeration value="SATHebrew"/>
 *     &lt;enumeration value="SATHebrewModern"/>
 *     &lt;enumeration value="SATHistoryWorld"/>
 *     &lt;enumeration value="SATItalian"/>
 *     &lt;enumeration value="SATJapaneseWithListening"/>
 *     &lt;enumeration value="SATKoreanListening"/>
 *     &lt;enumeration value="SATLatin"/>
 *     &lt;enumeration value="SATLiterature"/>
 *     &lt;enumeration value="SATMath1"/>
 *     &lt;enumeration value="SATMath2"/>
 *     &lt;enumeration value="SATPhysics"/>
 *     &lt;enumeration value="SATSpanish"/>
 *     &lt;enumeration value="SATSpanishListening"/>
 *     &lt;enumeration value="SATUSHistory"/>
 *     &lt;enumeration value="TABE"/>
 *     &lt;enumeration value="TOEFL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EducationTestCodeType")
@XmlEnum
public enum EducationTestCodeType {

    ACT("ACT"),
    @XmlEnumValue("ACTExplore")
    ACT_EXPLORE("ACTExplore"),
    @XmlEnumValue("ACTInterestInventory")
    ACT_INTEREST_INVENTORY("ACTInterestInventory"),
    @XmlEnumValue("ACTPlan")
    ACT_PLAN("ACTPlan"),
    @XmlEnumValue("ACTWorkKeys")
    ACT_WORK_KEYS("ACTWorkKeys"),
    @XmlEnumValue("APArtDrawing")
    AP_ART_DRAWING("APArtDrawing"),
    @XmlEnumValue("APArtGeneral")
    AP_ART_GENERAL("APArtGeneral"),
    @XmlEnumValue("APBiology")
    AP_BIOLOGY("APBiology"),
    @XmlEnumValue("APCalculusAB")
    AP_CALCULUS_AB("APCalculusAB"),
    @XmlEnumValue("APCalculusBC")
    AP_CALCULUS_BC("APCalculusBC"),
    @XmlEnumValue("APChemistry")
    AP_CHEMISTRY("APChemistry"),
    @XmlEnumValue("APComputerScienceA")
    AP_COMPUTER_SCIENCE_A("APComputerScienceA"),
    @XmlEnumValue("APComputerScienceB")
    AP_COMPUTER_SCIENCE_B("APComputerScienceB"),
    @XmlEnumValue("APEconomicsMacro")
    AP_ECONOMICS_MACRO("APEconomicsMacro"),
    @XmlEnumValue("APEconomicsMicro")
    AP_ECONOMICS_MICRO("APEconomicsMicro"),
    @XmlEnumValue("APEnglishLanguageComposition")
    AP_ENGLISH_LANGUAGE_COMPOSITION("APEnglishLanguageComposition"),
    @XmlEnumValue("APFrenchLanguage")
    AP_FRENCH_LANGUAGE("APFrenchLanguage"),
    @XmlEnumValue("APFrenchLiterature")
    AP_FRENCH_LITERATURE("APFrenchLiterature"),
    @XmlEnumValue("APGermanLanguage")
    AP_GERMAN_LANGUAGE("APGermanLanguage"),
    @XmlEnumValue("APGovernmentPoliticsComparative")
    AP_GOVERNMENT_POLITICS_COMPARATIVE("APGovernmentPoliticsComparative"),
    @XmlEnumValue("APGovernmentPoliticsUS")
    AP_GOVERNMENT_POLITICS_US("APGovernmentPoliticsUS"),
    @XmlEnumValue("APHistoryArt")
    AP_HISTORY_ART("APHistoryArt"),
    @XmlEnumValue("APHistoryEurope")
    AP_HISTORY_EUROPE("APHistoryEurope"),
    @XmlEnumValue("APHistoryUS")
    AP_HISTORY_US("APHistoryUS"),
    @XmlEnumValue("APLatinCatHor")
    AP_LATIN_CAT_HOR("APLatinCatHor"),
    @XmlEnumValue("APLatinVergil")
    AP_LATIN_VERGIL("APLatinVergil"),
    @XmlEnumValue("APMusicListeningLiterature")
    AP_MUSIC_LISTENING_LITERATURE("APMusicListeningLiterature"),
    @XmlEnumValue("APMusicTheory")
    AP_MUSIC_THEORY("APMusicTheory"),
    @XmlEnumValue("APPhysics")
    AP_PHYSICS("APPhysics"),
    @XmlEnumValue("APPhysicsEngineeringMechanics")
    AP_PHYSICS_ENGINEERING_MECHANICS("APPhysicsEngineeringMechanics"),
    @XmlEnumValue("APPhysicsMechanics")
    AP_PHYSICS_MECHANICS("APPhysicsMechanics"),
    @XmlEnumValue("APPsychology")
    AP_PSYCHOLOGY("APPsychology"),
    @XmlEnumValue("APSpanishLanguage")
    AP_SPANISH_LANGUAGE("APSpanishLanguage"),
    @XmlEnumValue("APSpanishLiterature")
    AP_SPANISH_LITERATURE("APSpanishLiterature"),
    @XmlEnumValue("CaliforniaHighSchoolExitExam")
    CALIFORNIA_HIGH_SCHOOL_EXIT_EXAM("CaliforniaHighSchoolExitExam"),
    @XmlEnumValue("CLEPAccountingFinancial")
    CLEP_ACCOUNTING_FINANCIAL("CLEPAccountingFinancial"),
    @XmlEnumValue("CLEPAlgebraCollege")
    CLEP_ALGEBRA_COLLEGE("CLEPAlgebraCollege"),
    @XmlEnumValue("CLEPBiology")
    CLEP_BIOLOGY("CLEPBiology"),
    @XmlEnumValue("CLEPBusinessLawIntroduction")
    CLEP_BUSINESS_LAW_INTRODUCTION("CLEPBusinessLawIntroduction"),
    @XmlEnumValue("CLEPCalculus")
    CLEP_CALCULUS("CLEPCalculus"),
    @XmlEnumValue("CLEPChemistry")
    CLEP_CHEMISTRY("CLEPChemistry"),
    @XmlEnumValue("CLEPCompositionCollegeFreshman")
    CLEP_COMPOSITION_COLLEGE_FRESHMAN("CLEPCompositionCollegeFreshman"),
    @XmlEnumValue("CLEPCompositionEnglish")
    CLEP_COMPOSITION_ENGLISH("CLEPCompositionEnglish"),
    @XmlEnumValue("CLEPEconomicsMacro")
    CLEP_ECONOMICS_MACRO("CLEPEconomicsMacro"),
    @XmlEnumValue("CLEPEconomicsMicro")
    CLEP_ECONOMICS_MICRO("CLEPEconomicsMicro"),
    @XmlEnumValue("CLEPEnglishComposition")
    CLEP_ENGLISH_COMPOSITION("CLEPEnglishComposition"),
    @XmlEnumValue("CLEPFrenchLanguage")
    CLEP_FRENCH_LANGUAGE("CLEPFrenchLanguage"),
    @XmlEnumValue("CLEPGermanLanguage")
    CLEP_GERMAN_LANGUAGE("CLEPGermanLanguage"),
    @XmlEnumValue("CLEPGovernmentAmerican")
    CLEP_GOVERNMENT_AMERICAN("CLEPGovernmentAmerican"),
    @XmlEnumValue("CLEPHistoryUSFrom1865")
    CLEP_HISTORY_US_FROM_1865("CLEPHistoryUSFrom1865"),
    @XmlEnumValue("CLEPHistoryUSTo1877")
    CLEP_HISTORY_US_TO_1877("CLEPHistoryUSTo1877"),
    @XmlEnumValue("CLEPHumanGrowthDevelopment")
    CLEP_HUMAN_GROWTH_DEVELOPMENT("CLEPHumanGrowthDevelopment"),
    @XmlEnumValue("CLEPHumanities")
    CLEP_HUMANITIES("CLEPHumanities"),
    @XmlEnumValue("CLEPInformationSystems")
    CLEP_INFORMATION_SYSTEMS("CLEPInformationSystems"),
    @XmlEnumValue("CLEPLanguageSpanish")
    CLEP_LANGUAGE_SPANISH("CLEPLanguageSpanish"),
    @XmlEnumValue("CLEPLiteratureAmerican")
    CLEP_LITERATURE_AMERICAN("CLEPLiteratureAmerican"),
    @XmlEnumValue("CLEPLiteratureAnalysisAndInterpreting")
    CLEP_LITERATURE_ANALYSIS_AND_INTERPRETING("CLEPLiteratureAnalysisAndInterpreting"),
    @XmlEnumValue("CLEPLiteratureEnglish")
    CLEP_LITERATURE_ENGLISH("CLEPLiteratureEnglish"),
    @XmlEnumValue("CLEPManagement")
    CLEP_MANAGEMENT("CLEPManagement"),
    @XmlEnumValue("CLEPMarketing")
    CLEP_MARKETING("CLEPMarketing"),
    @XmlEnumValue("CLEPMath")
    CLEP_MATH("CLEPMath"),
    @XmlEnumValue("CLEPMathCollege")
    CLEP_MATH_COLLEGE("CLEPMathCollege"),
    @XmlEnumValue("CLEPPreCalculus")
    CLEP_PRE_CALCULUS("CLEPPreCalculus"),
    @XmlEnumValue("CLEPPsychologyEducational")
    CLEP_PSYCHOLOGY_EDUCATIONAL("CLEPPsychologyEducational"),
    @XmlEnumValue("CLEPPsychologyIntroductory")
    CLEP_PSYCHOLOGY_INTRODUCTORY("CLEPPsychologyIntroductory"),
    @XmlEnumValue("CLEPSciencesNatural")
    CLEP_SCIENCES_NATURAL("CLEPSciencesNatural"),
    @XmlEnumValue("CLEPSocialSciencesAndHistory")
    CLEP_SOCIAL_SCIENCES_AND_HISTORY("CLEPSocialSciencesAndHistory"),
    @XmlEnumValue("CLEPSociologyIntroductory")
    CLEP_SOCIOLOGY_INTRODUCTORY("CLEPSociologyIntroductory"),
    @XmlEnumValue("CLEPWesternCivilizationFrom1648")
    CLEP_WESTERN_CIVILIZATION_FROM_1648("CLEPWesternCivilizationFrom1648"),
    @XmlEnumValue("CLEPWesternCivilizationTo1648")
    CLEP_WESTERN_CIVILIZATION_TO_1648("CLEPWesternCivilizationTo1648"),
    GED("GED"),
    GMAT("GMAT"),
    GRE("GRE"),
    @XmlEnumValue("GREBiochemistryCellMolecular")
    GRE_BIOCHEMISTRY_CELL_MOLECULAR("GREBiochemistryCellMolecular"),
    @XmlEnumValue("GREBiology")
    GRE_BIOLOGY("GREBiology"),
    @XmlEnumValue("GREChemistry")
    GRE_CHEMISTRY("GREChemistry"),
    @XmlEnumValue("GREComputerScience")
    GRE_COMPUTER_SCIENCE("GREComputerScience"),
    @XmlEnumValue("GRELiteratureEnglish")
    GRE_LITERATURE_ENGLISH("GRELiteratureEnglish"),
    @XmlEnumValue("GREMathematics")
    GRE_MATHEMATICS("GREMathematics"),
    @XmlEnumValue("GREPhysics")
    GRE_PHYSICS("GREPhysics"),
    @XmlEnumValue("GREPsychology")
    GRE_PSYCHOLOGY("GREPsychology"),
    IELTS("IELTS"),
    @XmlEnumValue("InternationalBaccalaureate")
    INTERNATIONAL_BACCALAUREATE("InternationalBaccalaureate"),
    LSAT("LSAT"),
    MCAT("MCAT"),
    @XmlEnumValue("OtherStateTest")
    OTHER_STATE_TEST("OtherStateTest"),
    @XmlEnumValue("OtherTest")
    OTHER_TEST("OtherTest"),
    SAT("SAT"),
    @XmlEnumValue("SATBiology")
    SAT_BIOLOGY("SATBiology"),
    @XmlEnumValue("SATChemistry")
    SAT_CHEMISTRY("SATChemistry"),
    @XmlEnumValue("SATChineseListening")
    SAT_CHINESE_LISTENING("SATChineseListening"),
    @XmlEnumValue("SATFrenchListening")
    SAT_FRENCH_LISTENING("SATFrenchListening"),
    @XmlEnumValue("SATGerman")
    SAT_GERMAN("SATGerman"),
    @XmlEnumValue("SATGermanListening")
    SAT_GERMAN_LISTENING("SATGermanListening"),
    @XmlEnumValue("SATHebrew")
    SAT_HEBREW("SATHebrew"),
    @XmlEnumValue("SATHebrewModern")
    SAT_HEBREW_MODERN("SATHebrewModern"),
    @XmlEnumValue("SATHistoryWorld")
    SAT_HISTORY_WORLD("SATHistoryWorld"),
    @XmlEnumValue("SATItalian")
    SAT_ITALIAN("SATItalian"),
    @XmlEnumValue("SATJapaneseWithListening")
    SAT_JAPANESE_WITH_LISTENING("SATJapaneseWithListening"),
    @XmlEnumValue("SATKoreanListening")
    SAT_KOREAN_LISTENING("SATKoreanListening"),
    @XmlEnumValue("SATLatin")
    SAT_LATIN("SATLatin"),
    @XmlEnumValue("SATLiterature")
    SAT_LITERATURE("SATLiterature"),
    @XmlEnumValue("SATMath1")
    SAT_MATH_1("SATMath1"),
    @XmlEnumValue("SATMath2")
    SAT_MATH_2("SATMath2"),
    @XmlEnumValue("SATPhysics")
    SAT_PHYSICS("SATPhysics"),
    @XmlEnumValue("SATSpanish")
    SAT_SPANISH("SATSpanish"),
    @XmlEnumValue("SATSpanishListening")
    SAT_SPANISH_LISTENING("SATSpanishListening"),
    @XmlEnumValue("SATUSHistory")
    SATUS_HISTORY("SATUSHistory"),
    TABE("TABE"),
    TOEFL("TOEFL");
    private final String value;

    EducationTestCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EducationTestCodeType fromValue(String v) {
        for (EducationTestCodeType c: EducationTestCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}