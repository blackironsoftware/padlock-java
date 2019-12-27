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


package org.openapitools.client.model;

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
import java.util.UUID;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.Contact;
import org.threeten.bp.OffsetDateTime;

/**
 * A cell is the top-level entity in Cell Block. Each tenant is represented by a cell.
 */
@ApiModel(description = "A cell is the top-level entity in Cell Block. Each tenant is represented by a cell.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-27T16:41:05.426502-05:00[America/Toronto]")
public class Cell {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;

  public static final String SERIALIZED_NAME_CONTACT = "contact";
  @SerializedName(SERIALIZED_NAME_CONTACT)
  private Contact contact;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private Address address;

  public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private OffsetDateTime createTime;

  public static final String SERIALIZED_NAME_CREATE_USER = "createUser";
  @SerializedName(SERIALIZED_NAME_CREATE_USER)
  private UUID createUser;

  public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";
  @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
  private OffsetDateTime updateTime;

  public static final String SERIALIZED_NAME_UPDATE_USER = "updateUser";
  @SerializedName(SERIALIZED_NAME_UPDATE_USER)
  private UUID updateUser;


  public Cell id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * The resource ID.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The resource ID.")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
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

  public OffsetDateTime getCreateTime() {
    return createTime;
  }




   /**
   * The UUID of the user who preformed the action.
   * @return createUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the user who preformed the action.")

  public UUID getCreateUser() {
    return createUser;
  }




   /**
   * Read-only timestamp, automatically assigned on back-end.
   * @return updateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only timestamp, automatically assigned on back-end.")

  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }




   /**
   * The UUID of the user who preformed the action.
   * @return updateUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The UUID of the user who preformed the action.")

  public UUID getUpdateUser() {
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

