package com.aks.openapi3.academic.model;

import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Address
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-23T23:23:43.733872+05:30[Asia/Kolkata]")

public class Address  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("address1")
  private String address1;

  @JsonProperty("address2")
  private String address2;

  @JsonProperty("address3")
  private String address3;

  @JsonProperty("postalCode")
  private String postalCode;

  public Address id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the Contact.
   * @return id
  */
  @ApiModelProperty(example = "1", required = true, value = "Unique identifier of the Contact.")
  @NotNull


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Address address1(String address1) {
    this.address1 = address1;
    return this;
  }

  /**
   * Address line 1 of the contact.
   * @return address1
  */
  @ApiModelProperty(example = "888", value = "Address line 1 of the contact.")

@Size(min=0,max=50) 
  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public Address address2(String address2) {
    this.address2 = address2;
    return this;
  }

  /**
   * Address line 2 of the contact.
   * @return address2
  */
  @ApiModelProperty(example = "San Angeles", value = "Address line 2 of the contact.")

@Size(min=0,max=50) 
  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public Address address3(String address3) {
    this.address3 = address3;
    return this;
  }

  /**
   * Address line 3 of the contact.
   * @return address3
  */
  @ApiModelProperty(example = "Florida", value = "Address line 3 of the contact.")

@Size(min=0,max=50) 
  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public Address postalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  /**
   * Postal code of the contact.
   * @return postalCode
  */
  @ApiModelProperty(example = "32106", required = true, value = "Postal code of the contact.")
  @NotNull

@Size(min=0,max=20) 
  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.address1, address.address1) &&
        Objects.equals(this.address2, address.address2) &&
        Objects.equals(this.address3, address.address3) &&
        Objects.equals(this.postalCode, address.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, address1, address2, address3, postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    address1: ").append(toIndentedString(address1)).append("\n");
    sb.append("    address2: ").append(toIndentedString(address2)).append("\n");
    sb.append("    address3: ").append(toIndentedString(address3)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

