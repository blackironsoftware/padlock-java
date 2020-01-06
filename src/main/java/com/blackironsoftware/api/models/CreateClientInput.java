/*
 * Cell Block
 * The Black Iron Software Platform is a multi-tenant SaaS coupled with an OAuth compliant authentication service that helps jump start SaaS software development.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: info@blackironsoftware.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blackironsoftware.api.models;

import java.util.Objects;
import java.util.Arrays;
import com.blackironsoftware.api.models.Address;
import com.blackironsoftware.api.models.Contact;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Clients represent an entity that a cell provides services to. This could be an individual or company.
 */
@ApiModel(description = "Clients represent an entity that a cell provides services to. This could be an individual or company.")
@JsonPropertyOrder({
  CreateClientInput.JSON_PROPERTY_NAME,
  CreateClientInput.JSON_PROPERTY_DOING_BUSINESS_AS,
  CreateClientInput.JSON_PROPERTY_LEGAL_NAME,
  CreateClientInput.JSON_PROPERTY_METADATA,
  CreateClientInput.JSON_PROPERTY_CONTACT,
  CreateClientInput.JSON_PROPERTY_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:39:58.739242-05:00[America/New_York]")
public class CreateClientInput {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DOING_BUSINESS_AS = "doingBusinessAs";
  private String doingBusinessAs;

  public static final String JSON_PROPERTY_LEGAL_NAME = "legalName";
  private String legalName;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private Contact contact;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;


  public CreateClientInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Black Iron Software", value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateClientInput doingBusinessAs(String doingBusinessAs) {
    
    this.doingBusinessAs = doingBusinessAs;
    return this;
  }

   /**
   * Get doingBusinessAs
   * @return doingBusinessAs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BIS", value = "")
  @JsonProperty(JSON_PROPERTY_DOING_BUSINESS_AS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDoingBusinessAs() {
    return doingBusinessAs;
  }


  public void setDoingBusinessAs(String doingBusinessAs) {
    this.doingBusinessAs = doingBusinessAs;
  }


  public CreateClientInput legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Get legalName
   * @return legalName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Black Iron Software, INC.", value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public CreateClientInput metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Holds any valid JSON object up to 2KB in length. Field can be used to store application specific values or configuration.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Holds any valid JSON object up to 2KB in length. Field can be used to store application specific values or configuration.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public CreateClientInput contact(Contact contact) {
    
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Contact getContact() {
    return contact;
  }


  public void setContact(Contact contact) {
    this.contact = contact;
  }


  public CreateClientInput address(Address address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Address getAddress() {
    return address;
  }


  public void setAddress(Address address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateClientInput createClientInput = (CreateClientInput) o;
    return Objects.equals(this.name, createClientInput.name) &&
        Objects.equals(this.doingBusinessAs, createClientInput.doingBusinessAs) &&
        Objects.equals(this.legalName, createClientInput.legalName) &&
        Objects.equals(this.metadata, createClientInput.metadata) &&
        Objects.equals(this.contact, createClientInput.contact) &&
        Objects.equals(this.address, createClientInput.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, doingBusinessAs, legalName, metadata, contact, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateClientInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

