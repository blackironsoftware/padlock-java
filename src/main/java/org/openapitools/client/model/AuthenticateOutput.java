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
 * AuthenticateOutput
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-27T16:41:05.426502-05:00[America/Toronto]")
public class AuthenticateOutput {
  public static final String SERIALIZED_NAME_ACCESS_TOKEN = "accessToken";
  @SerializedName(SERIALIZED_NAME_ACCESS_TOKEN)
  private String accessToken;

  public static final String SERIALIZED_NAME_EXPIRES_IN = "expiresIn";
  @SerializedName(SERIALIZED_NAME_EXPIRES_IN)
  private String expiresIn;

  public static final String SERIALIZED_NAME_ID_TOKEN = "idToken";
  @SerializedName(SERIALIZED_NAME_ID_TOKEN)
  private String idToken;

  public static final String SERIALIZED_NAME_REFRESH_TOKEN = "refreshToken";
  @SerializedName(SERIALIZED_NAME_REFRESH_TOKEN)
  private String refreshToken;

  public static final String SERIALIZED_NAME_TOKEN_TYPE = "tokenType";
  @SerializedName(SERIALIZED_NAME_TOKEN_TYPE)
  private String tokenType;

  public static final String SERIALIZED_NAME_CHALLENGE_NAME = "challengeName";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_NAME)
  private String challengeName;

  public static final String SERIALIZED_NAME_CODE_DELIVERY_MEDIUM = "codeDeliveryMedium";
  @SerializedName(SERIALIZED_NAME_CODE_DELIVERY_MEDIUM)
  private String codeDeliveryMedium;

  public static final String SERIALIZED_NAME_CODE_DELIVERY_DESTINATION = "codeDeliveryDestination";
  @SerializedName(SERIALIZED_NAME_CODE_DELIVERY_DESTINATION)
  private String codeDeliveryDestination;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private String userId;

  public static final String SERIALIZED_NAME_SESSION = "session";
  @SerializedName(SERIALIZED_NAME_SESSION)
  private String session;


  public AuthenticateOutput accessToken(String accessToken) {
    
    this.accessToken = accessToken;
    return this;
  }

   /**
   * Get accessToken
   * @return accessToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAccessToken() {
    return accessToken;
  }


  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public AuthenticateOutput expiresIn(String expiresIn) {
    
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Get expiresIn
   * @return expiresIn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpiresIn() {
    return expiresIn;
  }


  public void setExpiresIn(String expiresIn) {
    this.expiresIn = expiresIn;
  }


  public AuthenticateOutput idToken(String idToken) {
    
    this.idToken = idToken;
    return this;
  }

   /**
   * Get idToken
   * @return idToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIdToken() {
    return idToken;
  }


  public void setIdToken(String idToken) {
    this.idToken = idToken;
  }


  public AuthenticateOutput refreshToken(String refreshToken) {
    
    this.refreshToken = refreshToken;
    return this;
  }

   /**
   * Get refreshToken
   * @return refreshToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRefreshToken() {
    return refreshToken;
  }


  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  public AuthenticateOutput tokenType(String tokenType) {
    
    this.tokenType = tokenType;
    return this;
  }

   /**
   * Get tokenType
   * @return tokenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTokenType() {
    return tokenType;
  }


  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public AuthenticateOutput challengeName(String challengeName) {
    
    this.challengeName = challengeName;
    return this;
  }

   /**
   * Get challengeName
   * @return challengeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getChallengeName() {
    return challengeName;
  }


  public void setChallengeName(String challengeName) {
    this.challengeName = challengeName;
  }


  public AuthenticateOutput codeDeliveryMedium(String codeDeliveryMedium) {
    
    this.codeDeliveryMedium = codeDeliveryMedium;
    return this;
  }

   /**
   * Get codeDeliveryMedium
   * @return codeDeliveryMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeDeliveryMedium() {
    return codeDeliveryMedium;
  }


  public void setCodeDeliveryMedium(String codeDeliveryMedium) {
    this.codeDeliveryMedium = codeDeliveryMedium;
  }


  public AuthenticateOutput codeDeliveryDestination(String codeDeliveryDestination) {
    
    this.codeDeliveryDestination = codeDeliveryDestination;
    return this;
  }

   /**
   * Get codeDeliveryDestination
   * @return codeDeliveryDestination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCodeDeliveryDestination() {
    return codeDeliveryDestination;
  }


  public void setCodeDeliveryDestination(String codeDeliveryDestination) {
    this.codeDeliveryDestination = codeDeliveryDestination;
  }


  public AuthenticateOutput userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUserId() {
    return userId;
  }


  public void setUserId(String userId) {
    this.userId = userId;
  }


  public AuthenticateOutput session(String session) {
    
    this.session = session;
    return this;
  }

   /**
   * Get session
   * @return session
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSession() {
    return session;
  }


  public void setSession(String session) {
    this.session = session;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticateOutput authenticateOutput = (AuthenticateOutput) o;
    return Objects.equals(this.accessToken, authenticateOutput.accessToken) &&
        Objects.equals(this.expiresIn, authenticateOutput.expiresIn) &&
        Objects.equals(this.idToken, authenticateOutput.idToken) &&
        Objects.equals(this.refreshToken, authenticateOutput.refreshToken) &&
        Objects.equals(this.tokenType, authenticateOutput.tokenType) &&
        Objects.equals(this.challengeName, authenticateOutput.challengeName) &&
        Objects.equals(this.codeDeliveryMedium, authenticateOutput.codeDeliveryMedium) &&
        Objects.equals(this.codeDeliveryDestination, authenticateOutput.codeDeliveryDestination) &&
        Objects.equals(this.userId, authenticateOutput.userId) &&
        Objects.equals(this.session, authenticateOutput.session);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, expiresIn, idToken, refreshToken, tokenType, challengeName, codeDeliveryMedium, codeDeliveryDestination, userId, session);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateOutput {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    idToken: ").append(toIndentedString(idToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    challengeName: ").append(toIndentedString(challengeName)).append("\n");
    sb.append("    codeDeliveryMedium: ").append(toIndentedString(codeDeliveryMedium)).append("\n");
    sb.append("    codeDeliveryDestination: ").append(toIndentedString(codeDeliveryDestination)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    session: ").append(toIndentedString(session)).append("\n");
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

