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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ServiceDocumentDescription */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class ServiceDocumentDescription {
  @SerializedName("serializedStateSizeLimit")
  private Integer serializedStateSizeLimit = null;

  /** Gets or Sets serviceCapabilities */
  @JsonAdapter(ServiceCapabilitiesEnum.Adapter.class)
  public enum ServiceCapabilitiesEnum {
    INSTRUMENTATION("INSTRUMENTATION"),
    PERIODIC_MAINTENANCE("PERIODIC_MAINTENANCE"),
    PERSISTENCE("PERSISTENCE"),
    REPLICATION("REPLICATION"),
    OWNER_SELECTION("OWNER_SELECTION"),
    STRICT_UPDATE_CHECKING("STRICT_UPDATE_CHECKING"),
    HTML_USER_INTERFACE("HTML_USER_INTERFACE"),
    CONCURRENT_UPDATE_HANDLING("CONCURRENT_UPDATE_HANDLING"),
    CONCURRENT_GET_HANDLING("CONCURRENT_GET_HANDLING"),
    IDEMPOTENT_POST("IDEMPOTENT_POST"),
    ON_DEMAND_LOAD("ON_DEMAND_LOAD"),
    IMMUTABLE("IMMUTABLE"),
    WRAP_ERROR_RESPONSE("WRAP_ERROR_RESPONSE"),
    LIFO_QUEUE("LIFO_QUEUE"),
    URI_NAMESPACE_OWNER("URI_NAMESPACE_OWNER"),
    CORE("CORE"),
    UTILITY("UTILITY"),
    FACTORY("FACTORY"),
    FACTORY_ITEM("FACTORY_ITEM"),
    STATELESS("STATELESS"),
    NONE("NONE");

    private String value;

    ServiceCapabilitiesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ServiceCapabilitiesEnum fromValue(String text) {
      for (ServiceCapabilitiesEnum b : ServiceCapabilitiesEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ServiceCapabilitiesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ServiceCapabilitiesEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ServiceCapabilitiesEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ServiceCapabilitiesEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("serviceCapabilities")
  private List<ServiceCapabilitiesEnum> serviceCapabilities = null;

  @SerializedName("versionRetentionLimit")
  private Long versionRetentionLimit = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("propertyDescriptions")
  private Map<String, PropertyDescription> propertyDescriptions = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("versionRetentionFloor")
  private Long versionRetentionFloor = null;

  /** Gets or Sets documentIndexingOptions */
  @JsonAdapter(DocumentIndexingOptionsEnum.Adapter.class)
  public enum DocumentIndexingOptionsEnum {
    METADATA("INDEX_METADATA");

    private String value;

    DocumentIndexingOptionsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocumentIndexingOptionsEnum fromValue(String text) {
      for (DocumentIndexingOptionsEnum b : DocumentIndexingOptionsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DocumentIndexingOptionsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocumentIndexingOptionsEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocumentIndexingOptionsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DocumentIndexingOptionsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("documentIndexingOptions")
  private List<DocumentIndexingOptionsEnum> documentIndexingOptions = null;

  @SerializedName("serviceRequestRoutes")
  private Map<String, List<Route>> serviceRequestRoutes = null;

  @SerializedName("userInterfaceResourcePath")
  private String userInterfaceResourcePath = null;

  public ServiceDocumentDescription serializedStateSizeLimit(Integer serializedStateSizeLimit) {
    this.serializedStateSizeLimit = serializedStateSizeLimit;
    return this;
  }

  /**
   * Get serializedStateSizeLimit
   *
   * @return serializedStateSizeLimit
   */
  @Schema(description = "")
  public Integer getSerializedStateSizeLimit() {
    return serializedStateSizeLimit;
  }

  public void setSerializedStateSizeLimit(Integer serializedStateSizeLimit) {
    this.serializedStateSizeLimit = serializedStateSizeLimit;
  }

  public ServiceDocumentDescription serviceCapabilities(
      List<ServiceCapabilitiesEnum> serviceCapabilities) {
    this.serviceCapabilities = serviceCapabilities;
    return this;
  }

  public ServiceDocumentDescription addServiceCapabilitiesItem(
      ServiceCapabilitiesEnum serviceCapabilitiesItem) {
    if (this.serviceCapabilities == null) {
      this.serviceCapabilities = new ArrayList<ServiceCapabilitiesEnum>();
    }
    this.serviceCapabilities.add(serviceCapabilitiesItem);
    return this;
  }

  /**
   * Get serviceCapabilities
   *
   * @return serviceCapabilities
   */
  @Schema(description = "")
  public List<ServiceCapabilitiesEnum> getServiceCapabilities() {
    return serviceCapabilities;
  }

  public void setServiceCapabilities(List<ServiceCapabilitiesEnum> serviceCapabilities) {
    this.serviceCapabilities = serviceCapabilities;
  }

  public ServiceDocumentDescription versionRetentionLimit(Long versionRetentionLimit) {
    this.versionRetentionLimit = versionRetentionLimit;
    return this;
  }

  /**
   * Get versionRetentionLimit
   *
   * @return versionRetentionLimit
   */
  @Schema(description = "")
  public Long getVersionRetentionLimit() {
    return versionRetentionLimit;
  }

  public void setVersionRetentionLimit(Long versionRetentionLimit) {
    this.versionRetentionLimit = versionRetentionLimit;
  }

  public ServiceDocumentDescription name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceDocumentDescription propertyDescriptions(
      Map<String, PropertyDescription> propertyDescriptions) {
    this.propertyDescriptions = propertyDescriptions;
    return this;
  }

  public ServiceDocumentDescription putPropertyDescriptionsItem(
      String key, PropertyDescription propertyDescriptionsItem) {
    if (this.propertyDescriptions == null) {
      this.propertyDescriptions = new HashMap<String, PropertyDescription>();
    }
    this.propertyDescriptions.put(key, propertyDescriptionsItem);
    return this;
  }

  /**
   * Get propertyDescriptions
   *
   * @return propertyDescriptions
   */
  @Schema(description = "")
  public Map<String, PropertyDescription> getPropertyDescriptions() {
    return propertyDescriptions;
  }

  public void setPropertyDescriptions(Map<String, PropertyDescription> propertyDescriptions) {
    this.propertyDescriptions = propertyDescriptions;
  }

  public ServiceDocumentDescription description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ServiceDocumentDescription versionRetentionFloor(Long versionRetentionFloor) {
    this.versionRetentionFloor = versionRetentionFloor;
    return this;
  }

  /**
   * Get versionRetentionFloor
   *
   * @return versionRetentionFloor
   */
  @Schema(description = "")
  public Long getVersionRetentionFloor() {
    return versionRetentionFloor;
  }

  public void setVersionRetentionFloor(Long versionRetentionFloor) {
    this.versionRetentionFloor = versionRetentionFloor;
  }

  public ServiceDocumentDescription documentIndexingOptions(
      List<DocumentIndexingOptionsEnum> documentIndexingOptions) {
    this.documentIndexingOptions = documentIndexingOptions;
    return this;
  }

  public ServiceDocumentDescription addDocumentIndexingOptionsItem(
      DocumentIndexingOptionsEnum documentIndexingOptionsItem) {
    if (this.documentIndexingOptions == null) {
      this.documentIndexingOptions = new ArrayList<DocumentIndexingOptionsEnum>();
    }
    this.documentIndexingOptions.add(documentIndexingOptionsItem);
    return this;
  }

  /**
   * Get documentIndexingOptions
   *
   * @return documentIndexingOptions
   */
  @Schema(description = "")
  public List<DocumentIndexingOptionsEnum> getDocumentIndexingOptions() {
    return documentIndexingOptions;
  }

  public void setDocumentIndexingOptions(
      List<DocumentIndexingOptionsEnum> documentIndexingOptions) {
    this.documentIndexingOptions = documentIndexingOptions;
  }

  public ServiceDocumentDescription serviceRequestRoutes(
      Map<String, List<Route>> serviceRequestRoutes) {
    this.serviceRequestRoutes = serviceRequestRoutes;
    return this;
  }

  public ServiceDocumentDescription putServiceRequestRoutesItem(
      String key, List<Route> serviceRequestRoutesItem) {
    if (this.serviceRequestRoutes == null) {
      this.serviceRequestRoutes = new HashMap<String, List<Route>>();
    }
    this.serviceRequestRoutes.put(key, serviceRequestRoutesItem);
    return this;
  }

  /**
   * Get serviceRequestRoutes
   *
   * @return serviceRequestRoutes
   */
  @Schema(description = "")
  public Map<String, List<Route>> getServiceRequestRoutes() {
    return serviceRequestRoutes;
  }

  public void setServiceRequestRoutes(Map<String, List<Route>> serviceRequestRoutes) {
    this.serviceRequestRoutes = serviceRequestRoutes;
  }

  public ServiceDocumentDescription userInterfaceResourcePath(String userInterfaceResourcePath) {
    this.userInterfaceResourcePath = userInterfaceResourcePath;
    return this;
  }

  /**
   * Get userInterfaceResourcePath
   *
   * @return userInterfaceResourcePath
   */
  @Schema(description = "")
  public String getUserInterfaceResourcePath() {
    return userInterfaceResourcePath;
  }

  public void setUserInterfaceResourcePath(String userInterfaceResourcePath) {
    this.userInterfaceResourcePath = userInterfaceResourcePath;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDocumentDescription serviceDocumentDescription = (ServiceDocumentDescription) o;
    return Objects.equals(
            this.serializedStateSizeLimit, serviceDocumentDescription.serializedStateSizeLimit)
        && Objects.equals(this.serviceCapabilities, serviceDocumentDescription.serviceCapabilities)
        && Objects.equals(
            this.versionRetentionLimit, serviceDocumentDescription.versionRetentionLimit)
        && Objects.equals(this.name, serviceDocumentDescription.name)
        && Objects.equals(
            this.propertyDescriptions, serviceDocumentDescription.propertyDescriptions)
        && Objects.equals(this.description, serviceDocumentDescription.description)
        && Objects.equals(
            this.versionRetentionFloor, serviceDocumentDescription.versionRetentionFloor)
        && Objects.equals(
            this.documentIndexingOptions, serviceDocumentDescription.documentIndexingOptions)
        && Objects.equals(
            this.serviceRequestRoutes, serviceDocumentDescription.serviceRequestRoutes)
        && Objects.equals(
            this.userInterfaceResourcePath, serviceDocumentDescription.userInterfaceResourcePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        serializedStateSizeLimit,
        serviceCapabilities,
        versionRetentionLimit,
        name,
        propertyDescriptions,
        description,
        versionRetentionFloor,
        documentIndexingOptions,
        serviceRequestRoutes,
        userInterfaceResourcePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDocumentDescription {\n");

    sb.append("    serializedStateSizeLimit: ")
        .append(toIndentedString(serializedStateSizeLimit))
        .append("\n");
    sb.append("    serviceCapabilities: ")
        .append(toIndentedString(serviceCapabilities))
        .append("\n");
    sb.append("    versionRetentionLimit: ")
        .append(toIndentedString(versionRetentionLimit))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyDescriptions: ")
        .append(toIndentedString(propertyDescriptions))
        .append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    versionRetentionFloor: ")
        .append(toIndentedString(versionRetentionFloor))
        .append("\n");
    sb.append("    documentIndexingOptions: ")
        .append(toIndentedString(documentIndexingOptions))
        .append("\n");
    sb.append("    serviceRequestRoutes: ")
        .append(toIndentedString(serviceRequestRoutes))
        .append("\n");
    sb.append("    userInterfaceResourcePath: ")
        .append(toIndentedString(userInterfaceResourcePath))
        .append("\n");
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
