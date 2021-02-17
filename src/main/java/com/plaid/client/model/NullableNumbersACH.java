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
import com.plaid.client.model.NumbersACH;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * NullableNumbersACH
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-02-17T22:11:20.181Z[GMT]")
public class NullableNumbersACH {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ACCOUNT = "account";
  @SerializedName(SERIALIZED_NAME_ACCOUNT)
  private String account;

  public static final String SERIALIZED_NAME_ROUTING = "routing";
  @SerializedName(SERIALIZED_NAME_ROUTING)
  private String routing;

  public static final String SERIALIZED_NAME_WIRE_ROUTING = "wire_routing";
  @SerializedName(SERIALIZED_NAME_WIRE_ROUTING)
  private String wireRouting;


  public NullableNumbersACH accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The Plaid account ID associated with the account numbers
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The Plaid account ID associated with the account numbers")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public NullableNumbersACH account(String account) {
    
    this.account = account;
    return this;
  }

   /**
   * The ACH account number for the account
   * @return account
  **/
  @ApiModelProperty(required = true, value = "The ACH account number for the account")

  public String getAccount() {
    return account;
  }


  public void setAccount(String account) {
    this.account = account;
  }


  public NullableNumbersACH routing(String routing) {
    
    this.routing = routing;
    return this;
  }

   /**
   * The ACH routing number for the account
   * @return routing
  **/
  @ApiModelProperty(required = true, value = "The ACH routing number for the account")

  public String getRouting() {
    return routing;
  }


  public void setRouting(String routing) {
    this.routing = routing;
  }


  public NullableNumbersACH wireRouting(String wireRouting) {
    
    this.wireRouting = wireRouting;
    return this;
  }

   /**
   * The wire transfer routing number for the account, if available
   * @return wireRouting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The wire transfer routing number for the account, if available")

  public String getWireRouting() {
    return wireRouting;
  }


  public void setWireRouting(String wireRouting) {
    this.wireRouting = wireRouting;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NullableNumbersACH nullableNumbersACH = (NullableNumbersACH) o;
    return Objects.equals(this.accountId, nullableNumbersACH.accountId) &&
        Objects.equals(this.account, nullableNumbersACH.account) &&
        Objects.equals(this.routing, nullableNumbersACH.routing) &&
        Objects.equals(this.wireRouting, nullableNumbersACH.wireRouting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, account, routing, wireRouting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NullableNumbersACH {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    wireRouting: ").append(toIndentedString(wireRouting)).append("\n");
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
