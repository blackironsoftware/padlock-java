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
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Represents the audit information about the entity.
 */
@ApiModel(description = "Represents the audit information about the entity.")
@JsonPropertyOrder({
  Audit.JSON_PROPERTY_CREATE_TIME,
  Audit.JSON_PROPERTY_CREATE_USER,
  Audit.JSON_PROPERTY_UPDATE_TIME,
  Audit.JSON_PROPERTY_UPDATE_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:39:58.739242-05:00[America/New_York]")
public class Audit {
  public static final String JSON_PROPERTY_CREATE_TIME = "createTime";
  private OffsetDateTime createTime;

  public static final String JSON_PROPERTY_CREATE_USER = "createUser";
  private String createUser;

  public static final String JSON_PROPERTY_UPDATE_TIME = "updateTime";
  private OffsetDateTime updateTime;

  public static final String JSON_PROPERTY_UPDATE_USER = "updateUser";
  private String updateUser;


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




  public Audit createUser(String createUser) {
    
    this.createUser = createUser;
    return this;
  }

   /**
   * Get createUser
   * @return createUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "identity_bnrp67kgn7as72v4q367", value = "")
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




  public Audit updateUser(String updateUser) {
    
    this.updateUser = updateUser;
    return this;
  }

   /**
   * Get updateUser
   * @return updateUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "identity_bnrp67kgn7as72v4q234", value = "")
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
    Audit audit = (Audit) o;
    return Objects.equals(this.createTime, audit.createTime) &&
        Objects.equals(this.createUser, audit.createUser) &&
        Objects.equals(this.updateTime, audit.updateTime) &&
        Objects.equals(this.updateUser, audit.updateUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, createUser, updateTime, updateUser);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Audit {\n");
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

