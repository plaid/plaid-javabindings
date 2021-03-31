/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.12.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.PSLFStatus;
import com.plaid.client.model.ServicerAddressData;
import com.plaid.client.model.StudentLoanStatus;
import com.plaid.client.model.StudentRepaymentPlan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Contains details about a student loan account
 */
@ApiModel(description = "Contains details about a student loan account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T22:07:53.679Z[GMT]")
public class StudentLoan {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "account_number";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_DISBURSEMENT_DATES = "disbursement_dates";
  @SerializedName(SERIALIZED_NAME_DISBURSEMENT_DATES)
  private List<String> disbursementDates = null;

  public static final String SERIALIZED_NAME_EXPECTED_PAYOFF_DATE = "expected_payoff_date";
  @SerializedName(SERIALIZED_NAME_EXPECTED_PAYOFF_DATE)
  private String expectedPayoffDate;

  public static final String SERIALIZED_NAME_GUARANTOR = "guarantor";
  @SerializedName(SERIALIZED_NAME_GUARANTOR)
  private String guarantor;

  public static final String SERIALIZED_NAME_INTEREST_RATE_PERCENTAGE = "interest_rate_percentage";
  @SerializedName(SERIALIZED_NAME_INTEREST_RATE_PERCENTAGE)
  private Double interestRatePercentage;

  public static final String SERIALIZED_NAME_IS_OVERDUE = "is_overdue";
  @SerializedName(SERIALIZED_NAME_IS_OVERDUE)
  private Boolean isOverdue;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_AMOUNT = "last_payment_amount";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_AMOUNT)
  private Double lastPaymentAmount;

  public static final String SERIALIZED_NAME_LAST_PAYMENT_DATE = "last_payment_date";
  @SerializedName(SERIALIZED_NAME_LAST_PAYMENT_DATE)
  private String lastPaymentDate;

  public static final String SERIALIZED_NAME_LAST_STATEMENT_BALANCE = "last_statement_balance";
  @SerializedName(SERIALIZED_NAME_LAST_STATEMENT_BALANCE)
  private Double lastStatementBalance;

  public static final String SERIALIZED_NAME_LAST_STATEMENT_ISSUE_DATE = "last_statement_issue_date";
  @SerializedName(SERIALIZED_NAME_LAST_STATEMENT_ISSUE_DATE)
  private String lastStatementIssueDate;

  public static final String SERIALIZED_NAME_LOAN_NAME = "loan_name";
  @SerializedName(SERIALIZED_NAME_LOAN_NAME)
  private String loanName;

  public static final String SERIALIZED_NAME_LOAN_STATUS = "loan_status";
  @SerializedName(SERIALIZED_NAME_LOAN_STATUS)
  private StudentLoanStatus loanStatus;

  public static final String SERIALIZED_NAME_MINIMUM_PAYMENT_AMOUNT = "minimum_payment_amount";
  @SerializedName(SERIALIZED_NAME_MINIMUM_PAYMENT_AMOUNT)
  private Double minimumPaymentAmount;

  public static final String SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE = "next_payment_due_date";
  @SerializedName(SERIALIZED_NAME_NEXT_PAYMENT_DUE_DATE)
  private String nextPaymentDueDate;

  public static final String SERIALIZED_NAME_ORIGINATION_DATE = "origination_date";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_DATE)
  private String originationDate;

  public static final String SERIALIZED_NAME_ORIGINATION_PRINCIPAL_AMOUNT = "origination_principal_amount";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_PRINCIPAL_AMOUNT)
  private Double originationPrincipalAmount;

  public static final String SERIALIZED_NAME_OUTSTANDING_INTEREST_AMOUNT = "outstanding_interest_amount";
  @SerializedName(SERIALIZED_NAME_OUTSTANDING_INTEREST_AMOUNT)
  private Double outstandingInterestAmount;

  public static final String SERIALIZED_NAME_PAYMENT_REFERENCE_NUMBER = "payment_reference_number";
  @SerializedName(SERIALIZED_NAME_PAYMENT_REFERENCE_NUMBER)
  private String paymentReferenceNumber;

  public static final String SERIALIZED_NAME_PSLF_STATUS = "pslf_status";
  @SerializedName(SERIALIZED_NAME_PSLF_STATUS)
  private PSLFStatus pslfStatus;

  public static final String SERIALIZED_NAME_REPAYMENT_PLAN = "repayment_plan";
  @SerializedName(SERIALIZED_NAME_REPAYMENT_PLAN)
  private StudentRepaymentPlan repaymentPlan;

  public static final String SERIALIZED_NAME_SEQUENCE_NUMBER = "sequence_number";
  @SerializedName(SERIALIZED_NAME_SEQUENCE_NUMBER)
  private String sequenceNumber;

  public static final String SERIALIZED_NAME_SERVICER_ADDRESS = "servicer_address";
  @SerializedName(SERIALIZED_NAME_SERVICER_ADDRESS)
  private ServicerAddressData servicerAddress;

  public static final String SERIALIZED_NAME_YTD_INTEREST_PAID = "ytd_interest_paid";
  @SerializedName(SERIALIZED_NAME_YTD_INTEREST_PAID)
  private Double ytdInterestPaid;

  public static final String SERIALIZED_NAME_YTD_PRINCIPAL_PAID = "ytd_principal_paid";
  @SerializedName(SERIALIZED_NAME_YTD_PRINCIPAL_PAID)
  private Double ytdPrincipalPaid;


  public StudentLoan accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The ID of the account that this liability belongs to.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The ID of the account that this liability belongs to.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public StudentLoan accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The account number of the loan. For some institutions, this may be a masked version of the number (e.g., the last 4 digits instead of the entire number).
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account number of the loan. For some institutions, this may be a masked version of the number (e.g., the last 4 digits instead of the entire number).")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public StudentLoan disbursementDates(List<String> disbursementDates) {
    
    this.disbursementDates = disbursementDates;
    return this;
  }

  public StudentLoan addDisbursementDatesItem(String disbursementDatesItem) {
    if (this.disbursementDates == null) {
      this.disbursementDates = new ArrayList<>();
    }
    this.disbursementDates.add(disbursementDatesItem);
    return this;
  }

   /**
   * The dates on which loaned funds were disbursed or will be disbursed. These are often in the past. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return disbursementDates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The dates on which loaned funds were disbursed or will be disbursed. These are often in the past. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public List<String> getDisbursementDates() {
    return disbursementDates;
  }


  public void setDisbursementDates(List<String> disbursementDates) {
    this.disbursementDates = disbursementDates;
  }


  public StudentLoan expectedPayoffDate(String expectedPayoffDate) {
    
    this.expectedPayoffDate = expectedPayoffDate;
    return this;
  }

   /**
   * The date when the student loan is expected to be paid off. Availability for this field is limited. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return expectedPayoffDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date when the student loan is expected to be paid off. Availability for this field is limited. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getExpectedPayoffDate() {
    return expectedPayoffDate;
  }


  public void setExpectedPayoffDate(String expectedPayoffDate) {
    this.expectedPayoffDate = expectedPayoffDate;
  }


  public StudentLoan guarantor(String guarantor) {
    
    this.guarantor = guarantor;
    return this;
  }

   /**
   * The guarantor of the student loan.
   * @return guarantor
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The guarantor of the student loan.")

  public String getGuarantor() {
    return guarantor;
  }


  public void setGuarantor(String guarantor) {
    this.guarantor = guarantor;
  }


  public StudentLoan interestRatePercentage(Double interestRatePercentage) {
    
    this.interestRatePercentage = interestRatePercentage;
    return this;
  }

   /**
   * The interest rate on the loan as a percentage.
   * @return interestRatePercentage
  **/
  @ApiModelProperty(required = true, value = "The interest rate on the loan as a percentage.")

  public Double getInterestRatePercentage() {
    return interestRatePercentage;
  }


  public void setInterestRatePercentage(Double interestRatePercentage) {
    this.interestRatePercentage = interestRatePercentage;
  }


  public StudentLoan isOverdue(Boolean isOverdue) {
    
    this.isOverdue = isOverdue;
    return this;
  }

   /**
   * &#x60;true&#x60; if a payment is currently overdue. Availability for this field is limited.
   * @return isOverdue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "`true` if a payment is currently overdue. Availability for this field is limited.")

  public Boolean getIsOverdue() {
    return isOverdue;
  }


  public void setIsOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
  }


  public StudentLoan lastPaymentAmount(Double lastPaymentAmount) {
    
    this.lastPaymentAmount = lastPaymentAmount;
    return this;
  }

   /**
   * The amount of the last payment.
   * @return lastPaymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of the last payment.")

  public Double getLastPaymentAmount() {
    return lastPaymentAmount;
  }


  public void setLastPaymentAmount(Double lastPaymentAmount) {
    this.lastPaymentAmount = lastPaymentAmount;
  }


  public StudentLoan lastPaymentDate(String lastPaymentDate) {
    
    this.lastPaymentDate = lastPaymentDate;
    return this;
  }

   /**
   * The date of the last payment. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return lastPaymentDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the last payment. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getLastPaymentDate() {
    return lastPaymentDate;
  }


  public void setLastPaymentDate(String lastPaymentDate) {
    this.lastPaymentDate = lastPaymentDate;
  }


  public StudentLoan lastStatementBalance(Double lastStatementBalance) {
    
    this.lastStatementBalance = lastStatementBalance;
    return this;
  }

   /**
   * The outstanding balance on the last statement. This field could also be interpreted as the next payment due. Availability for this field is limited. 
   * @return lastStatementBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The outstanding balance on the last statement. This field could also be interpreted as the next payment due. Availability for this field is limited. ")

  public Double getLastStatementBalance() {
    return lastStatementBalance;
  }


  public void setLastStatementBalance(Double lastStatementBalance) {
    this.lastStatementBalance = lastStatementBalance;
  }


  public StudentLoan lastStatementIssueDate(String lastStatementIssueDate) {
    
    this.lastStatementIssueDate = lastStatementIssueDate;
    return this;
  }

   /**
   * The date of the last statement. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return lastStatementIssueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date of the last statement. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getLastStatementIssueDate() {
    return lastStatementIssueDate;
  }


  public void setLastStatementIssueDate(String lastStatementIssueDate) {
    this.lastStatementIssueDate = lastStatementIssueDate;
  }


  public StudentLoan loanName(String loanName) {
    
    this.loanName = loanName;
    return this;
  }

   /**
   * The type of loan, e.g., \&quot;Consolidation Loans\&quot;.
   * @return loanName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of loan, e.g., \"Consolidation Loans\".")

  public String getLoanName() {
    return loanName;
  }


  public void setLoanName(String loanName) {
    this.loanName = loanName;
  }


  public StudentLoan loanStatus(StudentLoanStatus loanStatus) {
    
    this.loanStatus = loanStatus;
    return this;
  }

   /**
   * Get loanStatus
   * @return loanStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StudentLoanStatus getLoanStatus() {
    return loanStatus;
  }


  public void setLoanStatus(StudentLoanStatus loanStatus) {
    this.loanStatus = loanStatus;
  }


  public StudentLoan minimumPaymentAmount(Double minimumPaymentAmount) {
    
    this.minimumPaymentAmount = minimumPaymentAmount;
    return this;
  }

   /**
   * The minimum payment due for the next billing cycle. There are some exceptions: Some institutions require a minimum payment across all loans associated with an account number. Our API presents that same minimum payment amount on each loan. The institutions that do this are: Great Lakes ( &#x60;ins_116861&#x60;), Firstmark (&#x60;ins_116295&#x60;), Commonbond Firstmark Services (&#x60;ins_116950&#x60;), Nelnet (&#x60;ins_116528&#x60;), EdFinancial Services (&#x60;ins_116304&#x60;), Granite State (&#x60;ins_116308&#x60;), and Oklahoma Student Loan Authority (&#x60;ins_116945&#x60;). Firstmark (&#x60;ins_116295&#x60; ) will display as $0 if there is an autopay program in effect.
   * @return minimumPaymentAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The minimum payment due for the next billing cycle. There are some exceptions: Some institutions require a minimum payment across all loans associated with an account number. Our API presents that same minimum payment amount on each loan. The institutions that do this are: Great Lakes ( `ins_116861`), Firstmark (`ins_116295`), Commonbond Firstmark Services (`ins_116950`), Nelnet (`ins_116528`), EdFinancial Services (`ins_116304`), Granite State (`ins_116308`), and Oklahoma Student Loan Authority (`ins_116945`). Firstmark (`ins_116295` ) will display as $0 if there is an autopay program in effect.")

  public Double getMinimumPaymentAmount() {
    return minimumPaymentAmount;
  }


  public void setMinimumPaymentAmount(Double minimumPaymentAmount) {
    this.minimumPaymentAmount = minimumPaymentAmount;
  }


  public StudentLoan nextPaymentDueDate(String nextPaymentDueDate) {
    
    this.nextPaymentDueDate = nextPaymentDueDate;
    return this;
  }

   /**
   * The due date for the next payment. The due date is &#x60;null&#x60; if a payment is not expected. A payment is not expected if &#x60;loan_status.type&#x60; is &#x60;deferment&#x60;, &#x60;in_school&#x60;, &#x60;consolidated&#x60;, &#x60;paid in full&#x60;, or &#x60;transferred&#x60;. Dates are returned in an ISO 8601 format (YYYY-MM-DD).
   * @return nextPaymentDueDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The due date for the next payment. The due date is `null` if a payment is not expected. A payment is not expected if `loan_status.type` is `deferment`, `in_school`, `consolidated`, `paid in full`, or `transferred`. Dates are returned in an ISO 8601 format (YYYY-MM-DD).")

  public String getNextPaymentDueDate() {
    return nextPaymentDueDate;
  }


  public void setNextPaymentDueDate(String nextPaymentDueDate) {
    this.nextPaymentDueDate = nextPaymentDueDate;
  }


  public StudentLoan originationDate(String originationDate) {
    
    this.originationDate = originationDate;
    return this;
  }

   /**
   * The date on which the loan was initially lent. Dates are returned in an ISO 8601 format (YYYY-MM-DD). 
   * @return originationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date on which the loan was initially lent. Dates are returned in an ISO 8601 format (YYYY-MM-DD). ")

  public String getOriginationDate() {
    return originationDate;
  }


  public void setOriginationDate(String originationDate) {
    this.originationDate = originationDate;
  }


  public StudentLoan originationPrincipalAmount(Double originationPrincipalAmount) {
    
    this.originationPrincipalAmount = originationPrincipalAmount;
    return this;
  }

   /**
   * The original principal balance of the loan.
   * @return originationPrincipalAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The original principal balance of the loan.")

  public Double getOriginationPrincipalAmount() {
    return originationPrincipalAmount;
  }


  public void setOriginationPrincipalAmount(Double originationPrincipalAmount) {
    this.originationPrincipalAmount = originationPrincipalAmount;
  }


  public StudentLoan outstandingInterestAmount(Double outstandingInterestAmount) {
    
    this.outstandingInterestAmount = outstandingInterestAmount;
    return this;
  }

   /**
   * The total dollar amount of the accrued interest balance. For Sallie Mae ( &#x60;ins_116944&#x60;), this amount is included in the current balance of the loan, so this field will return as &#x60;null&#x60;.
   * @return outstandingInterestAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total dollar amount of the accrued interest balance. For Sallie Mae ( `ins_116944`), this amount is included in the current balance of the loan, so this field will return as `null`.")

  public Double getOutstandingInterestAmount() {
    return outstandingInterestAmount;
  }


  public void setOutstandingInterestAmount(Double outstandingInterestAmount) {
    this.outstandingInterestAmount = outstandingInterestAmount;
  }


  public StudentLoan paymentReferenceNumber(String paymentReferenceNumber) {
    
    this.paymentReferenceNumber = paymentReferenceNumber;
    return this;
  }

   /**
   * The relevant account number that should be used to reference this loan for payments. In the majority of cases, &#x60;payment_reference_number&#x60; will match a&#x60;ccount_number,&#x60; but in some institutions, such as Great Lakes (&#x60;ins_116861&#x60;), it will be different.
   * @return paymentReferenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The relevant account number that should be used to reference this loan for payments. In the majority of cases, `payment_reference_number` will match a`ccount_number,` but in some institutions, such as Great Lakes (`ins_116861`), it will be different.")

  public String getPaymentReferenceNumber() {
    return paymentReferenceNumber;
  }


  public void setPaymentReferenceNumber(String paymentReferenceNumber) {
    this.paymentReferenceNumber = paymentReferenceNumber;
  }


  public StudentLoan pslfStatus(PSLFStatus pslfStatus) {
    
    this.pslfStatus = pslfStatus;
    return this;
  }

   /**
   * Get pslfStatus
   * @return pslfStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PSLFStatus getPslfStatus() {
    return pslfStatus;
  }


  public void setPslfStatus(PSLFStatus pslfStatus) {
    this.pslfStatus = pslfStatus;
  }


  public StudentLoan repaymentPlan(StudentRepaymentPlan repaymentPlan) {
    
    this.repaymentPlan = repaymentPlan;
    return this;
  }

   /**
   * Get repaymentPlan
   * @return repaymentPlan
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StudentRepaymentPlan getRepaymentPlan() {
    return repaymentPlan;
  }


  public void setRepaymentPlan(StudentRepaymentPlan repaymentPlan) {
    this.repaymentPlan = repaymentPlan;
  }


  public StudentLoan sequenceNumber(String sequenceNumber) {
    
    this.sequenceNumber = sequenceNumber;
    return this;
  }

   /**
   * The sequence number of the student loan. Heartland ECSI (&#x60;ins_116948&#x60;) does not make this field available.
   * @return sequenceNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sequence number of the student loan. Heartland ECSI (`ins_116948`) does not make this field available.")

  public String getSequenceNumber() {
    return sequenceNumber;
  }


  public void setSequenceNumber(String sequenceNumber) {
    this.sequenceNumber = sequenceNumber;
  }


  public StudentLoan servicerAddress(ServicerAddressData servicerAddress) {
    
    this.servicerAddress = servicerAddress;
    return this;
  }

   /**
   * Get servicerAddress
   * @return servicerAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ServicerAddressData getServicerAddress() {
    return servicerAddress;
  }


  public void setServicerAddress(ServicerAddressData servicerAddress) {
    this.servicerAddress = servicerAddress;
  }


  public StudentLoan ytdInterestPaid(Double ytdInterestPaid) {
    
    this.ytdInterestPaid = ytdInterestPaid;
    return this;
  }

   /**
   * The year to date (YTD) interest paid. Availability for this field is limited.
   * @return ytdInterestPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year to date (YTD) interest paid. Availability for this field is limited.")

  public Double getYtdInterestPaid() {
    return ytdInterestPaid;
  }


  public void setYtdInterestPaid(Double ytdInterestPaid) {
    this.ytdInterestPaid = ytdInterestPaid;
  }


  public StudentLoan ytdPrincipalPaid(Double ytdPrincipalPaid) {
    
    this.ytdPrincipalPaid = ytdPrincipalPaid;
    return this;
  }

   /**
   * The year to date (YTD) principal paid. Availability for this field is limited.
   * @return ytdPrincipalPaid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The year to date (YTD) principal paid. Availability for this field is limited.")

  public Double getYtdPrincipalPaid() {
    return ytdPrincipalPaid;
  }


  public void setYtdPrincipalPaid(Double ytdPrincipalPaid) {
    this.ytdPrincipalPaid = ytdPrincipalPaid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StudentLoan studentLoan = (StudentLoan) o;
    return Objects.equals(this.accountId, studentLoan.accountId) &&
        Objects.equals(this.accountNumber, studentLoan.accountNumber) &&
        Objects.equals(this.disbursementDates, studentLoan.disbursementDates) &&
        Objects.equals(this.expectedPayoffDate, studentLoan.expectedPayoffDate) &&
        Objects.equals(this.guarantor, studentLoan.guarantor) &&
        Objects.equals(this.interestRatePercentage, studentLoan.interestRatePercentage) &&
        Objects.equals(this.isOverdue, studentLoan.isOverdue) &&
        Objects.equals(this.lastPaymentAmount, studentLoan.lastPaymentAmount) &&
        Objects.equals(this.lastPaymentDate, studentLoan.lastPaymentDate) &&
        Objects.equals(this.lastStatementBalance, studentLoan.lastStatementBalance) &&
        Objects.equals(this.lastStatementIssueDate, studentLoan.lastStatementIssueDate) &&
        Objects.equals(this.loanName, studentLoan.loanName) &&
        Objects.equals(this.loanStatus, studentLoan.loanStatus) &&
        Objects.equals(this.minimumPaymentAmount, studentLoan.minimumPaymentAmount) &&
        Objects.equals(this.nextPaymentDueDate, studentLoan.nextPaymentDueDate) &&
        Objects.equals(this.originationDate, studentLoan.originationDate) &&
        Objects.equals(this.originationPrincipalAmount, studentLoan.originationPrincipalAmount) &&
        Objects.equals(this.outstandingInterestAmount, studentLoan.outstandingInterestAmount) &&
        Objects.equals(this.paymentReferenceNumber, studentLoan.paymentReferenceNumber) &&
        Objects.equals(this.pslfStatus, studentLoan.pslfStatus) &&
        Objects.equals(this.repaymentPlan, studentLoan.repaymentPlan) &&
        Objects.equals(this.sequenceNumber, studentLoan.sequenceNumber) &&
        Objects.equals(this.servicerAddress, studentLoan.servicerAddress) &&
        Objects.equals(this.ytdInterestPaid, studentLoan.ytdInterestPaid) &&
        Objects.equals(this.ytdPrincipalPaid, studentLoan.ytdPrincipalPaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountNumber, disbursementDates, expectedPayoffDate, guarantor, interestRatePercentage, isOverdue, lastPaymentAmount, lastPaymentDate, lastStatementBalance, lastStatementIssueDate, loanName, loanStatus, minimumPaymentAmount, nextPaymentDueDate, originationDate, originationPrincipalAmount, outstandingInterestAmount, paymentReferenceNumber, pslfStatus, repaymentPlan, sequenceNumber, servicerAddress, ytdInterestPaid, ytdPrincipalPaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StudentLoan {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    disbursementDates: ").append(toIndentedString(disbursementDates)).append("\n");
    sb.append("    expectedPayoffDate: ").append(toIndentedString(expectedPayoffDate)).append("\n");
    sb.append("    guarantor: ").append(toIndentedString(guarantor)).append("\n");
    sb.append("    interestRatePercentage: ").append(toIndentedString(interestRatePercentage)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
    sb.append("    lastPaymentAmount: ").append(toIndentedString(lastPaymentAmount)).append("\n");
    sb.append("    lastPaymentDate: ").append(toIndentedString(lastPaymentDate)).append("\n");
    sb.append("    lastStatementBalance: ").append(toIndentedString(lastStatementBalance)).append("\n");
    sb.append("    lastStatementIssueDate: ").append(toIndentedString(lastStatementIssueDate)).append("\n");
    sb.append("    loanName: ").append(toIndentedString(loanName)).append("\n");
    sb.append("    loanStatus: ").append(toIndentedString(loanStatus)).append("\n");
    sb.append("    minimumPaymentAmount: ").append(toIndentedString(minimumPaymentAmount)).append("\n");
    sb.append("    nextPaymentDueDate: ").append(toIndentedString(nextPaymentDueDate)).append("\n");
    sb.append("    originationDate: ").append(toIndentedString(originationDate)).append("\n");
    sb.append("    originationPrincipalAmount: ").append(toIndentedString(originationPrincipalAmount)).append("\n");
    sb.append("    outstandingInterestAmount: ").append(toIndentedString(outstandingInterestAmount)).append("\n");
    sb.append("    paymentReferenceNumber: ").append(toIndentedString(paymentReferenceNumber)).append("\n");
    sb.append("    pslfStatus: ").append(toIndentedString(pslfStatus)).append("\n");
    sb.append("    repaymentPlan: ").append(toIndentedString(repaymentPlan)).append("\n");
    sb.append("    sequenceNumber: ").append(toIndentedString(sequenceNumber)).append("\n");
    sb.append("    servicerAddress: ").append(toIndentedString(servicerAddress)).append("\n");
    sb.append("    ytdInterestPaid: ").append(toIndentedString(ytdInterestPaid)).append("\n");
    sb.append("    ytdPrincipalPaid: ").append(toIndentedString(ytdPrincipalPaid)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

