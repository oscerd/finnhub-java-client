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

import java.util.Objects;

/**
 * InstitutionalProfileInfo
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class InstitutionalProfileInfo {
  @SerializedName("cik")
  private String cik = null;

  @SerializedName("firmType")
  private String firmType = null;

  @SerializedName("manager")
  private String manager = null;

  @SerializedName("philosophy")
  private String philosophy = null;

  @SerializedName("profile")
  private String profile = null;

  @SerializedName("profileImg")
  private String profileImg = null;

  public InstitutionalProfileInfo cik(String cik) {
    this.cik = cik;
    return this;
  }

   /**
   * Investor&#x27;s company CIK.
   * @return cik
  **/
  @Schema(description = "Investor's company CIK.")
  public String getCik() {
    return cik;
  }

  public void setCik(String cik) {
    this.cik = cik;
  }

  public InstitutionalProfileInfo firmType(String firmType) {
    this.firmType = firmType;
    return this;
  }

   /**
   * Firm type.
   * @return firmType
  **/
  @Schema(description = "Firm type.")
  public String getFirmType() {
    return firmType;
  }

  public void setFirmType(String firmType) {
    this.firmType = firmType;
  }

  public InstitutionalProfileInfo manager(String manager) {
    this.manager = manager;
    return this;
  }

   /**
   * Manager.
   * @return manager
  **/
  @Schema(description = "Manager.")
  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }

  public InstitutionalProfileInfo philosophy(String philosophy) {
    this.philosophy = philosophy;
    return this;
  }

   /**
   * Investing philosophy.
   * @return philosophy
  **/
  @Schema(description = "Investing philosophy.")
  public String getPhilosophy() {
    return philosophy;
  }

  public void setPhilosophy(String philosophy) {
    this.philosophy = philosophy;
  }

  public InstitutionalProfileInfo profile(String profile) {
    this.profile = profile;
    return this;
  }

   /**
   * Profile info.
   * @return profile
  **/
  @Schema(description = "Profile info.")
  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public InstitutionalProfileInfo profileImg(String profileImg) {
    this.profileImg = profileImg;
    return this;
  }

   /**
   * Profile image.
   * @return profileImg
  **/
  @Schema(description = "Profile image.")
  public String getProfileImg() {
    return profileImg;
  }

  public void setProfileImg(String profileImg) {
    this.profileImg = profileImg;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstitutionalProfileInfo institutionalProfileInfo = (InstitutionalProfileInfo) o;
    return Objects.equals(this.cik, institutionalProfileInfo.cik) &&
        Objects.equals(this.firmType, institutionalProfileInfo.firmType) &&
        Objects.equals(this.manager, institutionalProfileInfo.manager) &&
        Objects.equals(this.philosophy, institutionalProfileInfo.philosophy) &&
        Objects.equals(this.profile, institutionalProfileInfo.profile) &&
        Objects.equals(this.profileImg, institutionalProfileInfo.profileImg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cik, firmType, manager, philosophy, profile, profileImg);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstitutionalProfileInfo {\n");
    
    sb.append("    cik: ").append(toIndentedString(cik)).append("\n");
    sb.append("    firmType: ").append(toIndentedString(firmType)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
    sb.append("    philosophy: ").append(toIndentedString(philosophy)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    profileImg: ").append(toIndentedString(profileImg)).append("\n");
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
