/*
 * Finnhub API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.github.oscerd.finnhub.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * SymbolLookup
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class SymbolLookup {
  @SerializedName("result")
  private List<SymbolLookupInfo> result = null;

  @SerializedName("count")
  private Long count = null;

  public SymbolLookup result(List<SymbolLookupInfo> result) {
    this.result = result;
    return this;
  }

  public SymbolLookup addResultItem(SymbolLookupInfo resultItem) {
    if (this.result == null) {
      this.result = new ArrayList<SymbolLookupInfo>();
    }
    this.result.add(resultItem);
    return this;
  }

   /**
   * Array of search results.
   * @return result
  **/
  @Schema(description = "Array of search results.")
  public List<SymbolLookupInfo> getResult() {
    return result;
  }

  public void setResult(List<SymbolLookupInfo> result) {
    this.result = result;
  }

  public SymbolLookup count(Long count) {
    this.count = count;
    return this;
  }

   /**
   * Number of results.
   * @return count
  **/
  @Schema(description = "Number of results.")
  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SymbolLookup symbolLookup = (SymbolLookup) o;
    return Objects.equals(this.result, symbolLookup.result) &&
        Objects.equals(this.count, symbolLookup.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result, count);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SymbolLookup {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}