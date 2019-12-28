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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Roles represent an entity that define permissions that can be granted to a user.
 */
@ApiModel(description = "Roles represent an entity that define permissions that can be granted to a user.")
@JsonPropertyOrder({
  Role.JSON_PROPERTY_ID,
  Role.JSON_PROPERTY_NAME,
  Role.JSON_PROPERTY_DESCRIPTION,
  Role.JSON_PROPERTY_PERMISSIONS,
  Role.JSON_PROPERTY_CREATE_TIME,
  Role.JSON_PROPERTY_CREATE_USER,
  Role.JSON_PROPERTY_UPDATE_TIME,
  Role.JSON_PROPERTY_UPDATE_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-27T21:38:18.544109-05:00[America/Toronto]")
public class Role {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private String permissions;

  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private OffsetDateTime createTime;

  public static final String JSON_PROPERTY_CREATE_USER = "createUser";
  private UUID createUser;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private OffsetDateTime updateTime;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private UUID updateUser;


  public Role id(String id) {
    
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


  public Role name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Role description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public Role permissions(String permissions) {
    
    this.permissions = permissions;
    return this;
  }

   /**
   * Get permissions
   * @return permissions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermissions() {
    return permissions;
  }


  public void setPermissions(String permissions) {
    this.permissions = permissions;
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




  public Role createUser(UUID createUser) {
    
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

  public UUID getCreateUser() {
    return createUser;
  }


  public void setCreateUser(UUID createUser) {
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




  public Role updateUser(UUID updateUser) {
    
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

  public UUID getUpdateUser() {
    return updateUser;
  }


  public void setUpdateUser(UUID updateUser) {
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
    Role role = (Role) o;
    return Objects.equals(this.id, role.id) &&
        Objects.equals(this.name, role.name) &&
        Objects.equals(this.description, role.description) &&
        Objects.equals(this.permissions, role.permissions) &&
        Objects.equals(this.createTime, role.createTime) &&
        Objects.equals(this.createUser, role.createUser) &&
        Objects.equals(this.updateTime, role.updateTime) &&
        Objects.equals(this.updateUser, role.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, permissions, createTime, createUser, updateTime, updateUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Role {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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

