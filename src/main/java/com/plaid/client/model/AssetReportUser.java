/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.5.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The user object allows you to provide additional information about the user to be appended to the Asset Report. All fields are optional. The &#x60;first_name&#x60;, &#x60;last_name&#x60;, and &#x60;ssn&#x60; fields are required if you would like the Report to be eligible for Fannie Mae’s Day 1 Certainty™ program.
 */
@ApiModel(description = "The user object allows you to provide additional information about the user to be appended to the Asset Report. All fields are optional. The `first_name`, `last_name`, and `ssn` fields are required if you would like the Report to be eligible for Fannie Mae’s Day 1 Certainty™ program.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T22:11:20.181Z[GMT]")
public class AssetReportUser {
  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "first_name";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_MIDDLE_NAME = "middle_name";
  @SerializedName(SERIALIZED_NAME_MIDDLE_NAME)
  private String middleName;

  public static final String SERIALIZED_NAME_LAST_NAME = "last_name";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_SSN = "ssn";
  @SerializedName(SERIALIZED_NAME_SSN)
  private String ssn;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;


  public AssetReportUser clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * An identifier you determine and submit for the user.
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An identifier you determine and submit for the user.")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public AssetReportUser firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * The user&#39;s first name. Required for the Fannie Mae Day 1 Certainty™ program.
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's first name. Required for the Fannie Mae Day 1 Certainty™ program.")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public AssetReportUser middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The user&#39;s middle name
   * @return middleName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's middle name")

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public AssetReportUser lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * The user&#39;s last name.  Required for the Fannie Mae Day 1 Certainty™ program.
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's last name.  Required for the Fannie Mae Day 1 Certainty™ program.")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public AssetReportUser ssn(String ssn) {
    
    this.ssn = ssn;
    return this;
  }

   /**
   * The user&#39;s Social Security Number. Required for the Fannie Mae Day 1 Certainty™ program.  Format: \&quot;ddd-dd-dddd\&quot;
   * @return ssn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's Social Security Number. Required for the Fannie Mae Day 1 Certainty™ program.  Format: \"ddd-dd-dddd\"")

  public String getSsn() {
    return ssn;
  }


  public void setSsn(String ssn) {
    this.ssn = ssn;
  }


  public AssetReportUser phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * The user&#39;s phone number, in E.164 format: +{countrycode}{number}. For example: \&quot;+14151234567\&quot;
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's phone number, in E.164 format: +{countrycode}{number}. For example: \"+14151234567\"")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public AssetReportUser email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * The user&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The user's email address.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportUser assetReportUser = (AssetReportUser) o;
    return Objects.equals(this.clientUserId, assetReportUser.clientUserId) &&
        Objects.equals(this.firstName, assetReportUser.firstName) &&
        Objects.equals(this.middleName, assetReportUser.middleName) &&
        Objects.equals(this.lastName, assetReportUser.lastName) &&
        Objects.equals(this.ssn, assetReportUser.ssn) &&
        Objects.equals(this.phoneNumber, assetReportUser.phoneNumber) &&
        Objects.equals(this.email, assetReportUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientUserId, firstName, middleName, lastName, ssn, phoneNumber, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportUser {\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    ssn: ").append(toIndentedString(ssn)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
