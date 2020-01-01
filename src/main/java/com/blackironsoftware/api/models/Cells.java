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
import com.blackironsoftware.api.models.Cell;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Cells
 */
@JsonPropertyOrder({
  Cells.JSON_PROPERTY_NEXT_PAGE_TOKEN,
  Cells.JSON_PROPERTY_ITEMS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-31T19:59:41.117806-05:00[America/New_York]")
public class Cells {
  public static final String JSON_PROPERTY_NEXT_PAGE_TOKEN = "nextPageToken";
  private String nextPageToken;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Cell> items = null;


  public Cells nextPageToken(String nextPageToken) {
    
    this.nextPageToken = nextPageToken;
    return this;
  }

   /**
   * Get nextPageToken
   * @return nextPageToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NEXT_PAGE_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNextPageToken() {
    return nextPageToken;
  }


  public void setNextPageToken(String nextPageToken) {
    this.nextPageToken = nextPageToken;
  }


  public Cells items(List<Cell> items) {
    
    this.items = items;
    return this;
  }

  public Cells addItemsItem(Cell itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<Cell>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Cell> getItems() {
    return items;
  }


  public void setItems(List<Cell> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cells cells = (Cells) o;
    return Objects.equals(this.nextPageToken, cells.nextPageToken) &&
        Objects.equals(this.items, cells.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nextPageToken, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cells {\n");
    sb.append("    nextPageToken: ").append(toIndentedString(nextPageToken)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

