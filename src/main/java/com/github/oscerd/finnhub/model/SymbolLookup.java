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

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "result", "count" })
public class SymbolLookup {

	@JsonProperty("result")
	private List<Symbol> result;
	@JsonProperty("count")
	private int count;

	@JsonProperty("result")
	public List<Symbol> getResult() {
		return result;
	}

	@JsonProperty("description")
	public void setResult(List<Symbol> result) {
		this.result = result;
	}

	@JsonProperty("count")
    public int getCount() {
        return count;
    }

	@JsonProperty("count")
    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "SymbolLookup [count=" + count + ", result=" + result + "]";
    }
}
