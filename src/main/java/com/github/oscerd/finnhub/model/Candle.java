/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
