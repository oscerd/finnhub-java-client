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
 * MarketNews
 */

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2024-03-22T10:38:13.551248835+01:00[Europe/Rome]")

public class MarketNews {
  @SerializedName("category")
  private String category = null;

  @SerializedName("datetime")
  private Long datetime = null;

  @SerializedName("headline")
  private String headline = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("related")
  private String related = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("summary")
  private String summary = null;

  @SerializedName("url")
  private String url = null;

  public MarketNews category(String category) {
    this.category = category;
    return this;
  }

   /**
   * News category.
   * @return category
  **/
  @Schema(description = "News category.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public MarketNews datetime(Long datetime) {
    this.datetime = datetime;
    return this;
  }

   /**
   * Published time in UNIX timestamp.
   * @return datetime
  **/
  @Schema(description = "Published time in UNIX timestamp.")
  public Long getDatetime() {
    return datetime;
  }

  public void setDatetime(Long datetime) {
    this.datetime = datetime;
  }

  public MarketNews headline(String headline) {
    this.headline = headline;
    return this;
  }

   /**
   * News headline.
   * @return headline
  **/
  @Schema(description = "News headline.")
  public String getHeadline() {
    return headline;
  }

  public void setHeadline(String headline) {
    this.headline = headline;
  }

  public MarketNews id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * News ID. This value can be used for &lt;code&gt;minId&lt;/code&gt; params to get the latest news only.
   * @return id
  **/
  @Schema(description = "News ID. This value can be used for <code>minId</code> params to get the latest news only.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MarketNews image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Thumbnail image URL.
   * @return image
  **/
  @Schema(description = "Thumbnail image URL.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public MarketNews related(String related) {
    this.related = related;
    return this;
  }

   /**
   * Related stocks and companies mentioned in the article.
   * @return related
  **/
  @Schema(description = "Related stocks and companies mentioned in the article.")
  public String getRelated() {
    return related;
  }

  public void setRelated(String related) {
    this.related = related;
  }

  public MarketNews source(String source) {
    this.source = source;
    return this;
  }

   /**
   * News source.
   * @return source
  **/
  @Schema(description = "News source.")
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MarketNews summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * News summary.
   * @return summary
  **/
  @Schema(description = "News summary.")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public MarketNews url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL of the original article.
   * @return url
  **/
  @Schema(description = "URL of the original article.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MarketNews marketNews = (MarketNews) o;
    return Objects.equals(this.category, marketNews.category) &&
        Objects.equals(this.datetime, marketNews.datetime) &&
        Objects.equals(this.headline, marketNews.headline) &&
        Objects.equals(this.id, marketNews.id) &&
        Objects.equals(this.image, marketNews.image) &&
        Objects.equals(this.related, marketNews.related) &&
        Objects.equals(this.source, marketNews.source) &&
        Objects.equals(this.summary, marketNews.summary) &&
        Objects.equals(this.url, marketNews.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, datetime, headline, id, image, related, source, summary, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MarketNews {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    datetime: ").append(toIndentedString(datetime)).append("\n");
    sb.append("    headline: ").append(toIndentedString(headline)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    related: ").append(toIndentedString(related)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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