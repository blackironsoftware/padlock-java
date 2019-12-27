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

/**
 * Every error is the system is returned via an error object.
 */
@ApiModel(description = "Every error is the system is returned via an error object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-27T18:09:04.654884-05:00[America/Toronto]")
public class Error {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_ISNTANCE = "isntance";
  @SerializedName(SERIALIZED_NAME_ISNTANCE)
  private String isntance;


   /**
   * Read-only timestamp, automatically assigned on back-end.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Read-only timestamp, automatically assigned on back-end.")

  public String getType() {
    return type;
  }




   /**
   * A short, human-readable summary of the problem type. It SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A short, human-readable summary of the problem type. It SHOULD NOT change from occurrence to occurrence of the problem, except for purposes of localization.")

  public String getTitle() {
    return title;
  }




   /**
   * The HTTP status code ([RFC7231], Section 6) generated by the origin server for this occurrence of the problem.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The HTTP status code ([RFC7231], Section 6) generated by the origin server for this occurrence of the problem.")

  public String getStatus() {
    return status;
  }




   /**
   * A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced.
   * @return isntance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A URI reference that identifies the specific occurrence of the problem.  It may or may not yield further information if dereferenced.")

  public String getIsntance() {
    return isntance;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.type, error.type) &&
        Objects.equals(this.title, error.title) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.isntance, error.isntance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, title, status, isntance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isntance: ").append(toIndentedString(isntance)).append("\n");
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

