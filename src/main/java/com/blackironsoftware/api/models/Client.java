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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Clients represent an entity that a cell provides services to. This could be an individual or company.
 */
@ApiModel(description = "Clients represent an entity that a cell provides services to. This could be an individual or company.")
@JsonPropertyOrder({
  Client.JSON_PROPERTY_ID,
  Client.JSON_PROPERTY_OBJECT,
  Client.JSON_PROPERTY_CELL_ID,
  Client.JSON_PROPERTY_NAME,
  Client.JSON_PROPERTY_DOING_BUSINESS_AS,
  Client.JSON_PROPERTY_LEGAL_NAME,
  Client.JSON_PROPERTY_METADATA,
  Client.JSON_PROPERTY_CONTACT,
  Client.JSON_PROPERTY_ADDRESS,
  Client.JSON_PROPERTY_CREATE_TIME,
  Client.JSON_PROPERTY_CREATE_USER,
  Client.JSON_PROPERTY_UPDATE_TIME,
  Client.JSON_PROPERTY_UPDATE_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-09T17:34:25.627035-05:00[America/New_York]")
public class Client {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OBJECT = "object";
  private String _object;

  public static final String JSON_PROPERTY_CELL_ID = "cellId";
  private String cellId;

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

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private OffsetDateTime createTime;

  public static final String JSON_PROPERTY_CREATE_USER = "createUser";
  private String createUser;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private OffsetDateTime updateTime;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private String updateUser;


  public Client id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The resource ID. Defaults to UUID v4
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The resource ID. Defaults to UUID v4")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Client _object(String _object) {
    
    this._object = _object;
    return this;
  }

   /**
   * String that identifies the type of entity represented.
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "client", value = "String that identifies the type of entity represented.")
  @JsonProperty(JSON_PROPERTY_OBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    this._object = _object;
  }


  public Client cellId(String cellId) {
    
    this.cellId = cellId;
    return this;
  }

   /**
   * The id of the cell the client belongs too.
   * @return cellId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "cell_bnpcida1bcvs72s7bl30", value = "The id of the cell the client belongs too.")
  @JsonProperty(JSON_PROPERTY_CELL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCellId() {
    return cellId;
  }


  public void setCellId(String cellId) {
    this.cellId = cellId;
  }


  public Client name(String name) {
    
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


  public Client doingBusinessAs(String doingBusinessAs) {
    
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


  public Client legalName(String legalName) {
    
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


  public Client metadata(Object metadata) {
    
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


  public Client contact(Contact contact) {
    
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


  public Client address(Address address) {
    
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




  public Client createUser(String createUser) {
    
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "")
  @JsonProperty(JSON_PROPERTY_CREATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreateUser() {
    return createUser;
  }


  public void setCreateUser(String createUser) {
    this.createUser = createUser;
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




  public Client updateUser(String updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

   /**
   * Get updateUser
   * @return updateUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdateUser() {
    return updateUser;
  }


  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this._object, client._object) &&
        Objects.equals(this.cellId, client.cellId) &&
        Objects.equals(this.name, client.name) &&
        Objects.equals(this.doingBusinessAs, client.doingBusinessAs) &&
        Objects.equals(this.legalName, client.legalName) &&
        Objects.equals(this.metadata, client.metadata) &&
        Objects.equals(this.contact, client.contact) &&
        Objects.equals(this.address, client.address) &&
        Objects.equals(this.createTime, client.createTime) &&
        Objects.equals(this.createUser, client.createUser) &&
        Objects.equals(this.updateTime, client.updateTime) &&
        Objects.equals(this.updateUser, client.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, _object, cellId, name, doingBusinessAs, legalName, metadata, contact, address, createTime, createUser, updateTime, updateUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    cellId: ").append(toIndentedString(cellId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    doingBusinessAs: ").append(toIndentedString(doingBusinessAs)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
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

