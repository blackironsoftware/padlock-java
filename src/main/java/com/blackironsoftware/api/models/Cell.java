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
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * A cell is the top-level entity in Cell Block. Each tenant is represented by a cell.
 */
@ApiModel(description = "A cell is the top-level entity in Cell Block. Each tenant is represented by a cell.")
@JsonPropertyOrder({
  Cell.JSON_PROPERTY_ID,
  Cell.JSON_PROPERTY_OBJECT,
  Cell.JSON_PROPERTY_NAME,
  Cell.JSON_PROPERTY_METADATA,
  Cell.JSON_PROPERTY_CONTACT,
  Cell.JSON_PROPERTY_ADDRESS,
  Cell.JSON_PROPERTY_CREATE_TIME,
  Cell.JSON_PROPERTY_CREATE_USER,
  Cell.JSON_PROPERTY_UPDATE_TIME,
  Cell.JSON_PROPERTY_UPDATE_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:26:00.849569-05:00[America/New_York]")
public class Cell {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata;

  public static final String JSON_PROPERTY_CONTACT = "contact";
  private Contact contact;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private Address address;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private OffsetDateTime createTime;

  public static final String JSON_PROPERTY_CREATE_USER = "createUser";
  private String createUser;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private OffsetDateTime updateTime;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private String updateUser;


  public Cell id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The resource ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The resource ID.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Cell _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * String that identifies the type of entity represented.
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cell", value = "String that identifies the type of entity represented.")
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public Cell name(String name) {
    
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


  public Cell metadata(Object metadata) {
    
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


  public Cell contact(Contact contact) {
    
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


  public Cell address(Address address) {
    
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


   /**
   * Read-only timestamp, automatically assigned on back-end.
   * @return createTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only timestamp, automatically assigned on back-end.")
  @JsonProperty(JSON_PROPERTY_CREATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreateTime() {
    return createTime;
  }




   /**
   * The UUID of the user who preformed the action.
   * @return createUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the user who preformed the action.")
  @JsonProperty(JSON_PROPERTY_CREATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateUser() {
    return createUser;
  }




   /**
   * Read-only timestamp, automatically assigned on back-end.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only timestamp, automatically assigned on back-end.")
  @JsonProperty(JSON_PROPERTY_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }




   /**
   * The UUID of the user who preformed the action.
   * @return updateUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the user who preformed the action.")
  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateUser() {
    return updateUser;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cell cell = (Cell) o;
    return Objects.equals(this.id, cell.id) &&
        Objects.equals(this._object, cell._object) &&
        Objects.equals(this.name, cell.name) &&
        Objects.equals(this.metadata, cell.metadata) &&
        Objects.equals(this.contact, cell.contact) &&
        Objects.equals(this.address, cell.address) &&
        Objects.equals(this.createTime, cell.createTime) &&
        Objects.equals(this.createUser, cell.createUser) &&
        Objects.equals(this.updateTime, cell.updateTime) &&
        Objects.equals(this.updateUser, cell.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, name, metadata, contact, address, createTime, createUser, updateTime, updateUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cell {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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

