package com.github.oscerd.finnhub.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "c", "h", "l", "o", "s", "t", "v"})
public class Candle {

  @JsonProperty("c")
  private Double [] c;

  @JsonProperty("h")
  private Double [] h;

  @JsonProperty("l")
  private Double [] l;

  @JsonProperty("o")
  private Double [] o;

  @JsonProperty("s")
  private String s;

  @JsonProperty("t")
  private Long [] t;

  @JsonProperty("v")
  private Long [] v;

  @JsonProperty("c")
  public Double[] getC() {
    return c;
  }

  @JsonProperty("h")
  public Double[] getH() {
    return h;
  }

  @JsonProperty("l")
  public Double[] getL() {
    return l;
  }

  @JsonProperty("o")
  public Double[] getO() {
    return o;
  }

  @JsonProperty("s")
  public String getS() {
    return s;
  }

  @JsonProperty("t")
  public Long[] getT() {
    return t;
  }

  @JsonProperty("v")
  public Long[] getV() {
    return v;
  }
}
