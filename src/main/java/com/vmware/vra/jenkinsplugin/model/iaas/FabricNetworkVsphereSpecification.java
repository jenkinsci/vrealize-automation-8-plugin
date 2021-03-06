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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Specification for updating a Vsphere FabricNetwork */
@Schema(description = "Specification for updating a Vsphere FabricNetwork")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class FabricNetworkVsphereSpecification {
  @SerializedName("ipv6Cidr")
  private String ipv6Cidr = null;

  @SerializedName("isDefault")
  private Boolean isDefault = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("defaultIpv6Gateway")
  private String defaultIpv6Gateway = null;

  @SerializedName("dnsServerAddresses")
  private List<String> dnsServerAddresses = null;

  @SerializedName("isPublic")
  private Boolean isPublic = null;

  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("defaultGateway")
  private String defaultGateway = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("dnsSearchDomains")
  private List<String> dnsSearchDomains = null;

  public FabricNetworkVsphereSpecification ipv6Cidr(String ipv6Cidr) {
    this.ipv6Cidr = ipv6Cidr;
    return this;
  }

  /**
   * Network IPv6 CIDR to be used.
   *
   * @return ipv6Cidr
   */
  @Schema(example = "2001:eeee:6bd:2a::1/64", description = "Network IPv6 CIDR to be used.")
  public String getIpv6Cidr() {
    return ipv6Cidr;
  }

  public void setIpv6Cidr(String ipv6Cidr) {
    this.ipv6Cidr = ipv6Cidr;
  }

  public FabricNetworkVsphereSpecification isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Indicates whether this is the default subnet for the zone.
   *
   * @return isDefault
   */
  @Schema(description = "Indicates whether this is the default subnet for the zone.")
  public Boolean isIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public FabricNetworkVsphereSpecification domain(String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * Domain value.
   *
   * @return domain
   */
  @Schema(example = "sqa.local", description = "Domain value.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public FabricNetworkVsphereSpecification defaultIpv6Gateway(String defaultIpv6Gateway) {
    this.defaultIpv6Gateway = defaultIpv6Gateway;
    return this;
  }

  /**
   * IPv6 default gateway to be used.
   *
   * @return defaultIpv6Gateway
   */
  @Schema(example = "2001:eeee:6bd:2a::1", description = "IPv6 default gateway to be used.")
  public String getDefaultIpv6Gateway() {
    return defaultIpv6Gateway;
  }

  public void setDefaultIpv6Gateway(String defaultIpv6Gateway) {
    this.defaultIpv6Gateway = defaultIpv6Gateway;
  }

  public FabricNetworkVsphereSpecification dnsServerAddresses(List<String> dnsServerAddresses) {
    this.dnsServerAddresses = dnsServerAddresses;
    return this;
  }

  public FabricNetworkVsphereSpecification addDnsServerAddressesItem(
      String dnsServerAddressesItem) {
    if (this.dnsServerAddresses == null) {
      this.dnsServerAddresses = new ArrayList<String>();
    }
    this.dnsServerAddresses.add(dnsServerAddressesItem);
    return this;
  }

  /**
   * A list of DNS server addresses that were set on this resource instance.
   *
   * @return dnsServerAddresses
   */
  @Schema(
      example = "[1.1.1.1]",
      description = "A list of DNS server addresses that were set on this resource instance.")
  public List<String> getDnsServerAddresses() {
    return dnsServerAddresses;
  }

  public void setDnsServerAddresses(List<String> dnsServerAddresses) {
    this.dnsServerAddresses = dnsServerAddresses;
  }

  public FabricNetworkVsphereSpecification isPublic(Boolean isPublic) {
    this.isPublic = isPublic;
    return this;
  }

  /**
   * Indicates whether the sub-network supports public IP assignment.
   *
   * @return isPublic
   */
  @Schema(description = "Indicates whether the sub-network supports public IP assignment.")
  public Boolean isIsPublic() {
    return isPublic;
  }

  public void setIsPublic(Boolean isPublic) {
    this.isPublic = isPublic;
  }

  public FabricNetworkVsphereSpecification cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

  /**
   * Network CIDR to be used.
   *
   * @return cidr
   */
  @Schema(example = "10.1.2.0/24", description = "Network CIDR to be used.")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public FabricNetworkVsphereSpecification defaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
    return this;
  }

  /**
   * IPv4 default gateway to be used.
   *
   * @return defaultGateway
   */
  @Schema(example = "10.1.2.1", description = "IPv4 default gateway to be used.")
  public String getDefaultGateway() {
    return defaultGateway;
  }

  public void setDefaultGateway(String defaultGateway) {
    this.defaultGateway = defaultGateway;
  }

  public FabricNetworkVsphereSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public FabricNetworkVsphereSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values that were set on this resource instance.
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"fast-network\", \"value\": \"true\" } ]",
      description =
          "A set of tag keys and optional values that were set on this resource instance.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public FabricNetworkVsphereSpecification dnsSearchDomains(List<String> dnsSearchDomains) {
    this.dnsSearchDomains = dnsSearchDomains;
    return this;
  }

  public FabricNetworkVsphereSpecification addDnsSearchDomainsItem(String dnsSearchDomainsItem) {
    if (this.dnsSearchDomains == null) {
      this.dnsSearchDomains = new ArrayList<String>();
    }
    this.dnsSearchDomains.add(dnsSearchDomainsItem);
    return this;
  }

  /**
   * A list of DNS search domains that were set on this resource instance.
   *
   * @return dnsSearchDomains
   */
  @Schema(
      example = "[vmware.com]",
      description = "A list of DNS search domains that were set on this resource instance.")
  public List<String> getDnsSearchDomains() {
    return dnsSearchDomains;
  }

  public void setDnsSearchDomains(List<String> dnsSearchDomains) {
    this.dnsSearchDomains = dnsSearchDomains;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FabricNetworkVsphereSpecification fabricNetworkVsphereSpecification =
        (FabricNetworkVsphereSpecification) o;
    return Objects.equals(this.ipv6Cidr, fabricNetworkVsphereSpecification.ipv6Cidr)
        && Objects.equals(this.isDefault, fabricNetworkVsphereSpecification.isDefault)
        && Objects.equals(this.domain, fabricNetworkVsphereSpecification.domain)
        && Objects.equals(
            this.defaultIpv6Gateway, fabricNetworkVsphereSpecification.defaultIpv6Gateway)
        && Objects.equals(
            this.dnsServerAddresses, fabricNetworkVsphereSpecification.dnsServerAddresses)
        && Objects.equals(this.isPublic, fabricNetworkVsphereSpecification.isPublic)
        && Objects.equals(this.cidr, fabricNetworkVsphereSpecification.cidr)
        && Objects.equals(this.defaultGateway, fabricNetworkVsphereSpecification.defaultGateway)
        && Objects.equals(this.tags, fabricNetworkVsphereSpecification.tags)
        && Objects.equals(
            this.dnsSearchDomains, fabricNetworkVsphereSpecification.dnsSearchDomains);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        ipv6Cidr,
        isDefault,
        domain,
        defaultIpv6Gateway,
        dnsServerAddresses,
        isPublic,
        cidr,
        defaultGateway,
        tags,
        dnsSearchDomains);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricNetworkVsphereSpecification {\n");

    sb.append("    ipv6Cidr: ").append(toIndentedString(ipv6Cidr)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    defaultIpv6Gateway: ").append(toIndentedString(defaultIpv6Gateway)).append("\n");
    sb.append("    dnsServerAddresses: ").append(toIndentedString(dnsServerAddresses)).append("\n");
    sb.append("    isPublic: ").append(toIndentedString(isPublic)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
    sb.append("    defaultGateway: ").append(toIndentedString(defaultGateway)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    dnsSearchDomains: ").append(toIndentedString(dnsSearchDomains)).append("\n");
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
