/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.8.1
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
 * ProcessorBalanceGetRequest defines the request schema for &#x60;/processor/balance/get&#x60;
 */
@ApiModel(description = "ProcessorBalanceGetRequest defines the request schema for `/processor/balance/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T18:25:11.743Z[GMT]")
public class ProcessorBalanceGetRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_PROCESSOR_TOKEN = "processor_token";
  @SerializedName(SERIALIZED_NAME_PROCESSOR_TOKEN)
  private String processorToken;


  public ProcessorBalanceGetRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public ProcessorBalanceGetRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public ProcessorBalanceGetRequest processorToken(String processorToken) {
    
    this.processorToken = processorToken;
    return this;
  }

   /**
   * The processor token obtained from the Plaid integration partner. Processor tokens are in the format: &#x60;processor-&lt;environment&gt;-&lt;identifier&gt;&#x60;
   * @return processorToken
  **/
  @ApiModelProperty(required = true, value = "The processor token obtained from the Plaid integration partner. Processor tokens are in the format: `processor-<environment>-<identifier>`")

  public String getProcessorToken() {
    return processorToken;
  }


  public void setProcessorToken(String processorToken) {
    this.processorToken = processorToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessorBalanceGetRequest processorBalanceGetRequest = (ProcessorBalanceGetRequest) o;
    return Objects.equals(this.clientId, processorBalanceGetRequest.clientId) &&
        Objects.equals(this.secret, processorBalanceGetRequest.secret) &&
        Objects.equals(this.processorToken, processorBalanceGetRequest.processorToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, processorToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessorBalanceGetRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    processorToken: ").append(toIndentedString(processorToken)).append("\n");
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

