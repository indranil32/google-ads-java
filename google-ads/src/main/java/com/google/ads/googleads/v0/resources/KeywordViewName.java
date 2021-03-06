/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v0.resources;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import com.google.api.resourcenames.ResourceNameType;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

// AUTO-GENERATED DOCUMENTATION AND CLASS
@javax.annotation.Generated("by GAPIC protoc plugin")
public class KeywordViewName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer}/keywordViews/{keyword_view}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customer;
  private final String keywordView;

  public String getCustomer() {
    return customer;
  }

  public String getKeywordView() {
    return keywordView;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private KeywordViewName(Builder builder) {
    customer = Preconditions.checkNotNull(builder.getCustomer());
    keywordView = Preconditions.checkNotNull(builder.getKeywordView());
  }

  public static KeywordViewName of(String customer, String keywordView) {
    return newBuilder()
      .setCustomer(customer)
      .setKeywordView(keywordView)
      .build();
  }

  public static String format(String customer, String keywordView) {
    return newBuilder()
      .setCustomer(customer)
      .setKeywordView(keywordView)
      .build()
      .toString();
  }

  public static KeywordViewName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "KeywordViewName.parse: formattedString not in valid format");
    return of(matchMap.get("customer"), matchMap.get("keyword_view"));
  }

  public static List<KeywordViewName> parseList(List<String> formattedStrings) {
    List<KeywordViewName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<KeywordViewName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (KeywordViewName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customer", customer);
          fieldMapBuilder.put("keywordView", keywordView);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  /**
   * @deprecated This method is only present to satisfy the ResourceName interface.
   */
  @Deprecated
  public ResourceNameType getType() {
    throw new UnsupportedOperationException("KeywordViewName.getType() not supported");
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("customer", customer, "keyword_view", keywordView);
  }

  /** Builder for KeywordViewName. */
  public static class Builder {

    private String customer;
    private String keywordView;

    public String getCustomer() {
      return customer;
    }

    public String getKeywordView() {
      return keywordView;
    }

    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    public Builder setKeywordView(String keywordView) {
      this.keywordView = keywordView;
      return this;
    }

    private Builder() {
    }

    private Builder(KeywordViewName keywordViewName) {
      customer = keywordViewName.customer;
      keywordView = keywordViewName.keywordView;
    }

    public KeywordViewName build() {
      return new KeywordViewName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof KeywordViewName) {
      KeywordViewName that = (KeywordViewName) o;
      return (this.customer.equals(that.customer))
          && (this.keywordView.equals(that.keywordView));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customer.hashCode();
    h *= 1000003;
    h ^= keywordView.hashCode();
    return h;
  }
}

