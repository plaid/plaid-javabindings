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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Allows specifying the metadata of the test account
 */
@ApiModel(description = "Allows specifying the metadata of the test account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-31T22:07:53.679Z[GMT]")
public class Meta {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICIAL_NAME = "official_name";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_NAME)
  private String officialName;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Double limit;


  public Meta name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The account&#39;s name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The account's name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Meta officialName(String officialName) {
    
    this.officialName = officialName;
    return this;
  }

   /**
   * The account&#39;s official name
   * @return officialName
  **/
  @ApiModelProperty(required = true, value = "The account's official name")

  public String getOfficialName() {
    return officialName;
  }


  public void setOfficialName(String officialName) {
    this.officialName = officialName;
  }


  public Meta limit(Double limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * The account&#39;s limit
   * @return limit
  **/
  @ApiModelProperty(required = true, value = "The account's limit")

  public Double getLimit() {
    return limit;
  }


  public void setLimit(Double limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Meta meta = (Meta) o;
    return Objects.equals(this.name, meta.name) &&
        Objects.equals(this.officialName, meta.officialName) &&
        Objects.equals(this.limit, meta.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, officialName, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Meta {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officialName: ").append(toIndentedString(officialName)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

