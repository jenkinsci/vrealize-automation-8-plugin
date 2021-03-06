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
 * VMware Service Broker API
 * A multi-cloud API for Cloud Automation Services
 *
 * OpenAPI spec version: 2020-01-30
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.deployment;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/** Represents deployment requests. */
@Schema(description = "Represents deployment requests.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:32:24.285339-04:00[America/New_York]")
public class DeploymentRequest {
  @SerializedName("actionId")
  private String actionId = null;

  @SerializedName("approvedAt")
  private Date approvedAt = null;

  @SerializedName("blueprintId")
  private String blueprintId = null;

  @SerializedName("cancelable")
  private Boolean cancelable = null;

  @SerializedName("catalogItemId")
  private String catalogItemId = null;

  @SerializedName("completedAt")
  private Date completedAt = null;

  @SerializedName("completedTasks")
  private Integer completedTasks = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("deploymentId")
  private UUID deploymentId = null;

  @SerializedName("details")
  private String details = null;

  @SerializedName("dismissed")
  private Boolean dismissed = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("initializedAt")
  private Date initializedAt = null;

  @SerializedName("inputs")
  private Object inputs = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("parentId")
  private UUID parentId = null;

  @SerializedName("requestedBy")
  private String requestedBy = null;

  @SerializedName("resourceName")
  private String resourceName = null;

  @SerializedName("resourceType")
  private String resourceType = null;

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("totalTasks")
  private Integer totalTasks = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  public DeploymentRequest actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * Identifier of the requested action
   *
   * @return actionId
   */
  @Schema(description = "Identifier of the requested action")
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public DeploymentRequest approvedAt(Date approvedAt) {
    this.approvedAt = approvedAt;
    return this;
  }

  /**
   * Time at which the request was approved.
   *
   * @return approvedAt
   */
  @Schema(description = "Time at which the request was approved.")
  public Date getApprovedAt() {
    return approvedAt;
  }

  public void setApprovedAt(Date approvedAt) {
    this.approvedAt = approvedAt;
  }

  public DeploymentRequest blueprintId(String blueprintId) {
    this.blueprintId = blueprintId;
    return this;
  }

  /**
   * Identifier of the requested blueprint in the form &#x27;UUID:version&#x27;
   *
   * @return blueprintId
   */
  @Schema(description = "Identifier of the requested blueprint in the form 'UUID:version'")
  public String getBlueprintId() {
    return blueprintId;
  }

  public void setBlueprintId(String blueprintId) {
    this.blueprintId = blueprintId;
  }

  public DeploymentRequest cancelable(Boolean cancelable) {
    this.cancelable = cancelable;
    return this;
  }

  /**
   * Indicates whether request can be canceled or not.
   *
   * @return cancelable
   */
  @Schema(description = "Indicates whether request can be canceled or not.")
  public Boolean isCancelable() {
    return cancelable;
  }

  public void setCancelable(Boolean cancelable) {
    this.cancelable = cancelable;
  }

  public DeploymentRequest catalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
    return this;
  }

  /**
   * Identifier of the requested catalog item in the form &#x27;UUID:version&#x27;
   *
   * @return catalogItemId
   */
  @Schema(description = "Identifier of the requested catalog item in the form 'UUID:version'")
  public String getCatalogItemId() {
    return catalogItemId;
  }

  public void setCatalogItemId(String catalogItemId) {
    this.catalogItemId = catalogItemId;
  }

  public DeploymentRequest completedAt(Date completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Time at which the request completed.
   *
   * @return completedAt
   */
  @Schema(description = "Time at which the request completed.")
  public Date getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(Date completedAt) {
    this.completedAt = completedAt;
  }

  public DeploymentRequest completedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
    return this;
  }

  /**
   * The number of tasks completed while fulfilling this request.
   *
   * @return completedTasks
   */
  @Schema(description = "The number of tasks completed while fulfilling this request.")
  public Integer getCompletedTasks() {
    return completedTasks;
  }

  public void setCompletedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
  }

  public DeploymentRequest createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time (e.g. date format &#x27;2019-07-13T23:16:49.310Z&#x27;).
   *
   * @return createdAt
   */
  @Schema(description = "Creation time (e.g. date format '2019-07-13T23:16:49.310Z').")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public DeploymentRequest deploymentId(UUID deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Deployment id to which the event applies to
   *
   * @return deploymentId
   */
  @Schema(description = "Deployment id to which the event applies to")
  public UUID getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(UUID deploymentId) {
    this.deploymentId = deploymentId;
  }

  public DeploymentRequest details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Longer user-friendly details of the event.
   *
   * @return details
   */
  @Schema(description = "Longer user-friendly details of the event.")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public DeploymentRequest dismissed(Boolean dismissed) {
    this.dismissed = dismissed;
    return this;
  }

  /**
   * Indicates whether request is in dismissed state.
   *
   * @return dismissed
   */
  @Schema(description = "Indicates whether request is in dismissed state.")
  public Boolean isDismissed() {
    return dismissed;
  }

  public void setDismissed(Boolean dismissed) {
    this.dismissed = dismissed;
  }

  public DeploymentRequest id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Event identifier
   *
   * @return id
   */
  @Schema(description = "Event identifier")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public DeploymentRequest initializedAt(Date initializedAt) {
    this.initializedAt = initializedAt;
    return this;
  }

  /**
   * Time at which the request was initialized.
   *
   * @return initializedAt
   */
  @Schema(description = "Time at which the request was initialized.")
  public Date getInitializedAt() {
    return initializedAt;
  }

  public void setInitializedAt(Date initializedAt) {
    this.initializedAt = initializedAt;
  }

  public DeploymentRequest inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Request inputs
   *
   * @return inputs
   */
  @Schema(description = "Request inputs")
  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

  public DeploymentRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Short user-friendly label of the event (e.g. &#x27;shuting down myVM&#x27;)
   *
   * @return name
   */
  @Schema(description = "Short user-friendly label of the event (e.g. 'shuting down myVM')")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeploymentRequest parentId(UUID parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Parent event/request identifier
   *
   * @return parentId
   */
  @Schema(description = "Parent event/request identifier")
  public UUID getParentId() {
    return parentId;
  }

  public void setParentId(UUID parentId) {
    this.parentId = parentId;
  }

  public DeploymentRequest requestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
    return this;
  }

  /**
   * User that initiated the request
   *
   * @return requestedBy
   */
  @Schema(description = "User that initiated the request")
  public String getRequestedBy() {
    return requestedBy;
  }

  public void setRequestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
  }

  public DeploymentRequest resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Optional resource name to which the event applies to
   *
   * @return resourceName
   */
  @Schema(description = "Optional resource name to which the event applies to")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public DeploymentRequest resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Optional resource type to which the event applies to
   *
   * @return resourceType
   */
  @Schema(description = "Optional resource type to which the event applies to")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  public DeploymentRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Request overall execution status.
   *
   * @return status
   */
  @Schema(description = "Request overall execution status.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public DeploymentRequest totalTasks(Integer totalTasks) {
    this.totalTasks = totalTasks;
    return this;
  }

  /**
   * The total number of tasks need to be completed to fulfil this request.
   *
   * @return totalTasks
   */
  @Schema(description = "The total number of tasks need to be completed to fulfil this request.")
  public Integer getTotalTasks() {
    return totalTasks;
  }

  public void setTotalTasks(Integer totalTasks) {
    this.totalTasks = totalTasks;
  }

  public DeploymentRequest updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Last update time (e.g. date format &#x27;2019-07-13T23:16:49.310Z&#x27;).
   *
   * @return updatedAt
   */
  @Schema(description = "Last update time (e.g. date format '2019-07-13T23:16:49.310Z').")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRequest deploymentRequest = (DeploymentRequest) o;
    return Objects.equals(this.actionId, deploymentRequest.actionId)
        && Objects.equals(this.approvedAt, deploymentRequest.approvedAt)
        && Objects.equals(this.blueprintId, deploymentRequest.blueprintId)
        && Objects.equals(this.cancelable, deploymentRequest.cancelable)
        && Objects.equals(this.catalogItemId, deploymentRequest.catalogItemId)
        && Objects.equals(this.completedAt, deploymentRequest.completedAt)
        && Objects.equals(this.completedTasks, deploymentRequest.completedTasks)
        && Objects.equals(this.createdAt, deploymentRequest.createdAt)
        && Objects.equals(this.deploymentId, deploymentRequest.deploymentId)
        && Objects.equals(this.details, deploymentRequest.details)
        && Objects.equals(this.dismissed, deploymentRequest.dismissed)
        && Objects.equals(this.id, deploymentRequest.id)
        && Objects.equals(this.initializedAt, deploymentRequest.initializedAt)
        && Objects.equals(this.inputs, deploymentRequest.inputs)
        && Objects.equals(this.name, deploymentRequest.name)
        && Objects.equals(this.parentId, deploymentRequest.parentId)
        && Objects.equals(this.requestedBy, deploymentRequest.requestedBy)
        && Objects.equals(this.resourceName, deploymentRequest.resourceName)
        && Objects.equals(this.resourceType, deploymentRequest.resourceType)
        && Objects.equals(this.status, deploymentRequest.status)
        && Objects.equals(this.totalTasks, deploymentRequest.totalTasks)
        && Objects.equals(this.updatedAt, deploymentRequest.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        actionId,
        approvedAt,
        blueprintId,
        cancelable,
        catalogItemId,
        completedAt,
        completedTasks,
        createdAt,
        deploymentId,
        details,
        dismissed,
        id,
        initializedAt,
        inputs,
        name,
        parentId,
        requestedBy,
        resourceName,
        resourceType,
        status,
        totalTasks,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRequest {\n");

    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    approvedAt: ").append(toIndentedString(approvedAt)).append("\n");
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    cancelable: ").append(toIndentedString(cancelable)).append("\n");
    sb.append("    catalogItemId: ").append(toIndentedString(catalogItemId)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    completedTasks: ").append(toIndentedString(completedTasks)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    dismissed: ").append(toIndentedString(dismissed)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initializedAt: ").append(toIndentedString(initializedAt)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    totalTasks: ").append(toIndentedString(totalTasks)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

  /** Request overall execution status. */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    PENDING("PENDING"),
    INITIALIZATION("INITIALIZATION"),
    APPROVAL_PENDING("APPROVAL_PENDING"),
    INPROGRESS("INPROGRESS"),
    COMPLETION("COMPLETION"),
    APPROVAL_REJECTED("APPROVAL_REJECTED"),
    ABORTED("ABORTED"),
    SUCCESSFUL("SUCCESSFUL"),
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
}
