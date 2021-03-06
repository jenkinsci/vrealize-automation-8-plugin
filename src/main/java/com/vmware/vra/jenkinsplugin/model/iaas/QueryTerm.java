/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * VMware Cloud Assembly IaaS API
 * A multi-cloud IaaS API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-01-15
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.iaas;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Objects;

/** QueryTerm */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class QueryTerm {
  @SerializedName("propertyName")
  private String propertyName = null;

  /** Gets or Sets matchType */
  @JsonAdapter(MatchTypeEnum.Adapter.class)
  public enum MatchTypeEnum {
    WILDCARD("WILDCARD"),
    TERM("TERM"),
    PHRASE("PHRASE"),
    PREFIX("PREFIX");

    private String value;

    MatchTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MatchTypeEnum fromValue(String text) {
      for (MatchTypeEnum b : MatchTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MatchTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MatchTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MatchTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MatchTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("matchType")
  private MatchTypeEnum matchType = null;

  /** Gets or Sets propertyType */
  @JsonAdapter(PropertyTypeEnum.Adapter.class)
  public enum PropertyTypeEnum {
    LONG("LONG"),
    STRING("STRING"),
    BYTES("BYTES"),
    PODO("PODO"),
    COLLECTION("COLLECTION"),
    MAP("MAP"),
    BOOLEAN("BOOLEAN"),
    DOUBLE("DOUBLE"),
    INTERNETADDRESSV4("InternetAddressV4"),
    INTERNETADDRESSV6("InternetAddressV6"),
    DATE("DATE"),
    URI("URI"),
    ENUM("ENUM");

    private String value;

    PropertyTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PropertyTypeEnum fromValue(String text) {
      for (PropertyTypeEnum b : PropertyTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PropertyTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PropertyTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PropertyTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PropertyTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("propertyType")
  private PropertyTypeEnum propertyType = null;

  /** Gets or Sets sortOrder */
  @JsonAdapter(SortOrderEnum.Adapter.class)
  public enum SortOrderEnum {
    ASC("ASC"),
    DESC("DESC");

    private String value;

    SortOrderEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SortOrderEnum fromValue(String text) {
      for (SortOrderEnum b : SortOrderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SortOrderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SortOrderEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SortOrderEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SortOrderEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("sortOrder")
  private SortOrderEnum sortOrder = null;

  @SerializedName("range")
  private NumericRangeObject range = null;

  @SerializedName("matchValue")
  private String matchValue = null;

  public QueryTerm propertyName(String propertyName) {
    this.propertyName = propertyName;
    return this;
  }

  /**
   * Get propertyName
   *
   * @return propertyName
   */
  @Schema(description = "")
  public String getPropertyName() {
    return propertyName;
  }

  public void setPropertyName(String propertyName) {
    this.propertyName = propertyName;
  }

  public QueryTerm matchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
    return this;
  }

  /**
   * Get matchType
   *
   * @return matchType
   */
  @Schema(description = "")
  public MatchTypeEnum getMatchType() {
    return matchType;
  }

  public void setMatchType(MatchTypeEnum matchType) {
    this.matchType = matchType;
  }

  public QueryTerm propertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
    return this;
  }

  /**
   * Get propertyType
   *
   * @return propertyType
   */
  @Schema(description = "")
  public PropertyTypeEnum getPropertyType() {
    return propertyType;
  }

  public void setPropertyType(PropertyTypeEnum propertyType) {
    this.propertyType = propertyType;
  }

  public QueryTerm sortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
    return this;
  }

  /**
   * Get sortOrder
   *
   * @return sortOrder
   */
  @Schema(description = "")
  public SortOrderEnum getSortOrder() {
    return sortOrder;
  }

  public void setSortOrder(SortOrderEnum sortOrder) {
    this.sortOrder = sortOrder;
  }

  public QueryTerm range(NumericRangeObject range) {
    this.range = range;
    return this;
  }

  /**
   * Get range
   *
   * @return range
   */
  @Schema(description = "")
  public NumericRangeObject getRange() {
    return range;
  }

  public void setRange(NumericRangeObject range) {
    this.range = range;
  }

  public QueryTerm matchValue(String matchValue) {
    this.matchValue = matchValue;
    return this;
  }

  /**
   * Get matchValue
   *
   * @return matchValue
   */
  @Schema(description = "")
  public String getMatchValue() {
    return matchValue;
  }

  public void setMatchValue(String matchValue) {
    this.matchValue = matchValue;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryTerm queryTerm = (QueryTerm) o;
    return Objects.equals(this.propertyName, queryTerm.propertyName)
        && Objects.equals(this.matchType, queryTerm.matchType)
        && Objects.equals(this.propertyType, queryTerm.propertyType)
        && Objects.equals(this.sortOrder, queryTerm.sortOrder)
        && Objects.equals(this.range, queryTerm.range)
        && Objects.equals(this.matchValue, queryTerm.matchValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propertyName, matchType, propertyType, sortOrder, range, matchValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryTerm {\n");

    sb.append("    propertyName: ").append(toIndentedString(propertyName)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    propertyType: ").append(toIndentedString(propertyType)).append("\n");
    sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    matchValue: ").append(toIndentedString(matchValue)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
