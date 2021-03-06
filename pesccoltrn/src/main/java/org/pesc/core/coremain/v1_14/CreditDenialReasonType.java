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
 * <p>Java class for CreditDenialReasonType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CreditDenialReasonType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;minLength value="1"/>
 *     &lt;enumeration value="AccountNotPaidAsAgreed"/>
 *     &lt;enumeration value="Bankruptcy"/>
 *     &lt;enumeration value="ChargeOffAccounts"/>
 *     &lt;enumeration value="CollectionAccounts"/>
 *     &lt;enumeration value="CreditHistoryLessThanRequiredMinimum"/>
 *     &lt;enumeration value="CreditInquiriesExceedMaximumAllowed"/>
 *     &lt;enumeration value="DebtIncomeRatioAboveAllowableLimit"/>
 *     &lt;enumeration value="DelinquentCreditObligations"/>
 *     &lt;enumeration value="Foreclosures"/>
 *     &lt;enumeration value="Garnishments"/>
 *     &lt;enumeration value="IncomeInsufficientForCreditRequested"/>
 *     &lt;enumeration value="InsufficientCreditBureauScore"/>
 *     &lt;enumeration value="JudgementOrSuits"/>
 *     &lt;enumeration value="MiscellaneousPublicRecords"/>
 *     &lt;enumeration value="NoAdverseFactor"/>
 *     &lt;enumeration value="PoorCreditPerformance"/>
 *     &lt;enumeration value="Repossession"/>
 *     &lt;enumeration value="RevolvingDebtBurdenAboveAllowableLimit"/>
 *     &lt;enumeration value="RevolvingDebtAboveAllowableLimit"/>
 *     &lt;enumeration value="StudentLoanDefaults"/>
 *     &lt;enumeration value="TaxLiensOrAttachments"/>
 *     &lt;enumeration value="TotalRevolvingDebtAboveAllowableLimit"/>
 *     &lt;enumeration value="UnableToValidateInformation"/>
 *     &lt;enumeration value="UnpaidBankOfAmericaChargeOffAccount"/>
 *     &lt;enumeration value="UnpaidChargeOffAccounts"/>
 *     &lt;enumeration value="UnpaidCollectionAccounts"/>
 *     &lt;enumeration value="Fraud"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CreditDenialReasonType")
@XmlEnum
public enum CreditDenialReasonType {

    @XmlEnumValue("AccountNotPaidAsAgreed")
    ACCOUNT_NOT_PAID_AS_AGREED("AccountNotPaidAsAgreed"),
    @XmlEnumValue("Bankruptcy")
    BANKRUPTCY("Bankruptcy"),
    @XmlEnumValue("ChargeOffAccounts")
    CHARGE_OFF_ACCOUNTS("ChargeOffAccounts"),
    @XmlEnumValue("CollectionAccounts")
    COLLECTION_ACCOUNTS("CollectionAccounts"),
    @XmlEnumValue("CreditHistoryLessThanRequiredMinimum")
    CREDIT_HISTORY_LESS_THAN_REQUIRED_MINIMUM("CreditHistoryLessThanRequiredMinimum"),
    @XmlEnumValue("CreditInquiriesExceedMaximumAllowed")
    CREDIT_INQUIRIES_EXCEED_MAXIMUM_ALLOWED("CreditInquiriesExceedMaximumAllowed"),
    @XmlEnumValue("DebtIncomeRatioAboveAllowableLimit")
    DEBT_INCOME_RATIO_ABOVE_ALLOWABLE_LIMIT("DebtIncomeRatioAboveAllowableLimit"),
    @XmlEnumValue("DelinquentCreditObligations")
    DELINQUENT_CREDIT_OBLIGATIONS("DelinquentCreditObligations"),
    @XmlEnumValue("Foreclosures")
    FORECLOSURES("Foreclosures"),
    @XmlEnumValue("Garnishments")
    GARNISHMENTS("Garnishments"),
    @XmlEnumValue("IncomeInsufficientForCreditRequested")
    INCOME_INSUFFICIENT_FOR_CREDIT_REQUESTED("IncomeInsufficientForCreditRequested"),
    @XmlEnumValue("InsufficientCreditBureauScore")
    INSUFFICIENT_CREDIT_BUREAU_SCORE("InsufficientCreditBureauScore"),
    @XmlEnumValue("JudgementOrSuits")
    JUDGEMENT_OR_SUITS("JudgementOrSuits"),
    @XmlEnumValue("MiscellaneousPublicRecords")
    MISCELLANEOUS_PUBLIC_RECORDS("MiscellaneousPublicRecords"),
    @XmlEnumValue("NoAdverseFactor")
    NO_ADVERSE_FACTOR("NoAdverseFactor"),
    @XmlEnumValue("PoorCreditPerformance")
    POOR_CREDIT_PERFORMANCE("PoorCreditPerformance"),
    @XmlEnumValue("Repossession")
    REPOSSESSION("Repossession"),
    @XmlEnumValue("RevolvingDebtBurdenAboveAllowableLimit")
    REVOLVING_DEBT_BURDEN_ABOVE_ALLOWABLE_LIMIT("RevolvingDebtBurdenAboveAllowableLimit"),
    @XmlEnumValue("RevolvingDebtAboveAllowableLimit")
    REVOLVING_DEBT_ABOVE_ALLOWABLE_LIMIT("RevolvingDebtAboveAllowableLimit"),
    @XmlEnumValue("StudentLoanDefaults")
    STUDENT_LOAN_DEFAULTS("StudentLoanDefaults"),
    @XmlEnumValue("TaxLiensOrAttachments")
    TAX_LIENS_OR_ATTACHMENTS("TaxLiensOrAttachments"),
    @XmlEnumValue("TotalRevolvingDebtAboveAllowableLimit")
    TOTAL_REVOLVING_DEBT_ABOVE_ALLOWABLE_LIMIT("TotalRevolvingDebtAboveAllowableLimit"),
    @XmlEnumValue("UnableToValidateInformation")
    UNABLE_TO_VALIDATE_INFORMATION("UnableToValidateInformation"),
    @XmlEnumValue("UnpaidBankOfAmericaChargeOffAccount")
    UNPAID_BANK_OF_AMERICA_CHARGE_OFF_ACCOUNT("UnpaidBankOfAmericaChargeOffAccount"),
    @XmlEnumValue("UnpaidChargeOffAccounts")
    UNPAID_CHARGE_OFF_ACCOUNTS("UnpaidChargeOffAccounts"),
    @XmlEnumValue("UnpaidCollectionAccounts")
    UNPAID_COLLECTION_ACCOUNTS("UnpaidCollectionAccounts"),
    @XmlEnumValue("Fraud")
    FRAUD("Fraud");
    private final String value;

    CreditDenialReasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CreditDenialReasonType fromValue(String v) {
        for (CreditDenialReasonType c: CreditDenialReasonType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
