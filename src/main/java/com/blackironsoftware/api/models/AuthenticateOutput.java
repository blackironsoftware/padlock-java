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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AuthenticateOutput
 */
@JsonPropertyOrder({
  AuthenticateOutput.JSON_PROPERTY_ACCESS_TOKEN,
  AuthenticateOutput.JSON_PROPERTY_EXPIRES_IN,
  AuthenticateOutput.JSON_PROPERTY_ID_TOKEN,
  AuthenticateOutput.JSON_PROPERTY_REFRESH_TOKEN,
  AuthenticateOutput.JSON_PROPERTY_TOKEN_TYPE,
  AuthenticateOutput.JSON_PROPERTY_CHALLENGE_NAME,
  AuthenticateOutput.JSON_PROPERTY_CODE_DELIVERY_MEDIUM,
  AuthenticateOutput.JSON_PROPERTY_CODE_DELIVERY_DESTINATION,
  AuthenticateOutput.JSON_PROPERTY_USER_ID,
  AuthenticateOutput.JSON_PROPERTY_SESSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-01-06T18:26:00.849569-05:00[America/New_York]")
public class AuthenticateOutput {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
  private String accessToken;

  public static final String JSON_PROPERTY_EXPIRES_IN = "expiresIn";
  private String expiresIn;

  public static final String JSON_PROPERTY_ID_TOKEN = "idToken";
  private String idToken;

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refreshToken";
  private String refreshToken;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "tokenType";
  private String tokenType;

  public static final String JSON_PROPERTY_CHALLENGE_NAME = "challengeName";
  private String challengeName;

  public static final String JSON_PROPERTY_CODE_DELIVERY_MEDIUM = "codeDeliveryMedium";
  private String codeDeliveryMedium;

  public static final String JSON_PROPERTY_CODE_DELIVERY_DESTINATION = "codeDeliveryDestination";
  private String codeDeliveryDestination;

  public static final String JSON_PROPERTY_USER_ID = "userId";
  private String userId;

  public static final String JSON_PROPERTY_SESSION = "session";
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
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_ID_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CHALLENGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CODE_DELIVERY_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_CODE_DELIVERY_DESTINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  @JsonProperty(JSON_PROPERTY_SESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

