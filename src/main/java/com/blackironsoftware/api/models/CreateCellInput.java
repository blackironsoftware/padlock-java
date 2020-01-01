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
 * CreateCellInput
 */
@JsonPropertyOrder({
  CreateCellInput.JSON_PROPERTY_NAME,
  CreateCellInput.JSON_PROPERTY_METADATA,
  CreateCellInput.JSON_PROPERTY_CONTACT,
  CreateCellInput.JSON_PROPERTY_ADDRESS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-31T19:59:41.117806-05:00[America/New_York]")
public class CreateCellInput {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private Contact contact;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;


  public CreateCellInput name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "Black Iron Software", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CreateCellInput metadata(Object metadata) {
    
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


  public CreateCellInput contact(Contact contact) {
    
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


  public CreateCellInput address(Address address) {
    
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
    CreateCellInput createCellInput = (CreateCellInput) o;
    return Objects.equals(this.name, createCellInput.name) &&
        Objects.equals(this.metadata, createCellInput.metadata) &&
        Objects.equals(this.contact, createCellInput.contact) &&
        Objects.equals(this.address, createCellInput.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, metadata, contact, address);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateCellInput {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

