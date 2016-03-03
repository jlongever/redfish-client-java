package io.swagger.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Odata400Count;
import io.swagger.client.model.Odata400IdRef;
import io.swagger.client.model.PhysicalContext100PhysicalContext;
import io.swagger.client.model.RedundancyRedundancy;
import io.swagger.client.model.ResourceOem;
import io.swagger.client.model.ResourceStatus;
import java.util.ArrayList;
import java.util.List;



/**
 * This is the base type for addressable members of an array.
 **/

@ApiModel(description = "This is the base type for addressable members of an array.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-03T14:43:19.261-05:00")
public class Thermal100Fan   {
  
  private String memberId = null;
  private ResourceOem oem = null;
  private PhysicalContext100PhysicalContext physicalContext = null;
  private List<RedundancyRedundancy> redundancy = new ArrayList<RedundancyRedundancy>();
  private Odata400Count redundancyodataCount = null;
  private Odata400IdRef redundancyodataNavigationLink = null;
  private List<Odata400IdRef> relatedItem = new ArrayList<Odata400IdRef>();
  private Odata400Count relatedItemodataCount = null;
  private Odata400IdRef relatedItemodataNavigationLink = null;
  private ResourceStatus status = null;

  
  /**
   * This is the identifier for the member within the collection.
   **/
  public Thermal100Fan memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the identifier for the member within the collection.")
  @JsonProperty("MemberId")
  public String getMemberId() {
    return memberId;
  }
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  
  /**
   * This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.
   **/
  public Thermal100Fan oem(ResourceOem oem) {
    this.oem = oem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This is the manufacturer/provider specific extension moniker used to divide the Oem object into sections.")
  @JsonProperty("Oem")
  public ResourceOem getOem() {
    return oem;
  }
  public void setOem(ResourceOem oem) {
    this.oem = oem;
  }

  
  /**
   * Describes the area or device associated with this fan.
   **/
  public Thermal100Fan physicalContext(PhysicalContext100PhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Describes the area or device associated with this fan.")
  @JsonProperty("PhysicalContext")
  public PhysicalContext100PhysicalContext getPhysicalContext() {
    return physicalContext;
  }
  public void setPhysicalContext(PhysicalContext100PhysicalContext physicalContext) {
    this.physicalContext = physicalContext;
  }

  
  /**
   * This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.
   **/
  public Thermal100Fan redundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "This structure is used to show redundancy for fans.  The Component ids will reference the members of the redundancy groups.")
  @JsonProperty("Redundancy")
  public List<RedundancyRedundancy> getRedundancy() {
    return redundancy;
  }
  public void setRedundancy(List<RedundancyRedundancy> redundancy) {
    this.redundancy = redundancy;
  }

  
  /**
   **/
  public Thermal100Fan redundancyodataCount(Odata400Count redundancyodataCount) {
    this.redundancyodataCount = redundancyodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Redundancy@odata.count")
  public Odata400Count getRedundancyodataCount() {
    return redundancyodataCount;
  }
  public void setRedundancyodataCount(Odata400Count redundancyodataCount) {
    this.redundancyodataCount = redundancyodataCount;
  }

  
  /**
   **/
  public Thermal100Fan redundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
    this.redundancyodataNavigationLink = redundancyodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Redundancy@odata.navigationLink")
  public Odata400IdRef getRedundancyodataNavigationLink() {
    return redundancyodataNavigationLink;
  }
  public void setRedundancyodataNavigationLink(Odata400IdRef redundancyodataNavigationLink) {
    this.redundancyodataNavigationLink = redundancyodataNavigationLink;
  }

  
  /**
   * The ID(s) of the resources serviced with this fan
   **/
  public Thermal100Fan relatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID(s) of the resources serviced with this fan")
  @JsonProperty("RelatedItem")
  public List<Odata400IdRef> getRelatedItem() {
    return relatedItem;
  }
  public void setRelatedItem(List<Odata400IdRef> relatedItem) {
    this.relatedItem = relatedItem;
  }

  
  /**
   **/
  public Thermal100Fan relatedItemodataCount(Odata400Count relatedItemodataCount) {
    this.relatedItemodataCount = relatedItemodataCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("RelatedItem@odata.count")
  public Odata400Count getRelatedItemodataCount() {
    return relatedItemodataCount;
  }
  public void setRelatedItemodataCount(Odata400Count relatedItemodataCount) {
    this.relatedItemodataCount = relatedItemodataCount;
  }

  
  /**
   **/
  public Thermal100Fan relatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
    this.relatedItemodataNavigationLink = relatedItemodataNavigationLink;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("RelatedItem@odata.navigationLink")
  public Odata400IdRef getRelatedItemodataNavigationLink() {
    return relatedItemodataNavigationLink;
  }
  public void setRelatedItemodataNavigationLink(Odata400IdRef relatedItemodataNavigationLink) {
    this.relatedItemodataNavigationLink = relatedItemodataNavigationLink;
  }

  
  /**
   **/
  public Thermal100Fan status(ResourceStatus status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("Status")
  public ResourceStatus getStatus() {
    return status;
  }
  public void setStatus(ResourceStatus status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Thermal100Fan thermal100Fan = (Thermal100Fan) o;
    return Objects.equals(this.memberId, thermal100Fan.memberId) &&
        Objects.equals(this.oem, thermal100Fan.oem) &&
        Objects.equals(this.physicalContext, thermal100Fan.physicalContext) &&
        Objects.equals(this.redundancy, thermal100Fan.redundancy) &&
        Objects.equals(this.redundancyodataCount, thermal100Fan.redundancyodataCount) &&
        Objects.equals(this.redundancyodataNavigationLink, thermal100Fan.redundancyodataNavigationLink) &&
        Objects.equals(this.relatedItem, thermal100Fan.relatedItem) &&
        Objects.equals(this.relatedItemodataCount, thermal100Fan.relatedItemodataCount) &&
        Objects.equals(this.relatedItemodataNavigationLink, thermal100Fan.relatedItemodataNavigationLink) &&
        Objects.equals(this.status, thermal100Fan.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, oem, physicalContext, redundancy, redundancyodataCount, redundancyodataNavigationLink, relatedItem, relatedItemodataCount, relatedItemodataNavigationLink, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Thermal100Fan {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    oem: ").append(toIndentedString(oem)).append("\n");
    sb.append("    physicalContext: ").append(toIndentedString(physicalContext)).append("\n");
    sb.append("    redundancy: ").append(toIndentedString(redundancy)).append("\n");
    sb.append("    redundancyodataCount: ").append(toIndentedString(redundancyodataCount)).append("\n");
    sb.append("    redundancyodataNavigationLink: ").append(toIndentedString(redundancyodataNavigationLink)).append("\n");
    sb.append("    relatedItem: ").append(toIndentedString(relatedItem)).append("\n");
    sb.append("    relatedItemodataCount: ").append(toIndentedString(relatedItemodataCount)).append("\n");
    sb.append("    relatedItemodataNavigationLink: ").append(toIndentedString(relatedItemodataNavigationLink)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

