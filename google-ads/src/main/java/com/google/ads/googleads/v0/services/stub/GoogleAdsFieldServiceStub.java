/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.ads.googleads.v0.services.stub;

import static com.google.ads.googleads.v0.services.GoogleAdsFieldServiceClient.SearchGoogleAdsFieldsPagedResponse;

import com.google.ads.googleads.v0.resources.GoogleAdsField;
import com.google.ads.googleads.v0.services.GetGoogleAdsFieldRequest;
import com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsRequest;
import com.google.ads.googleads.v0.services.SearchGoogleAdsFieldsResponse;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.UnaryCallable;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Google Ads API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by GAPIC v0.0.5")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class GoogleAdsFieldServiceStub implements BackgroundResource {

  public UnaryCallable<GetGoogleAdsFieldRequest, GoogleAdsField> getGoogleAdsFieldCallable() {
    throw new UnsupportedOperationException("Not implemented: getGoogleAdsFieldCallable()");
  }

  public UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsPagedResponse>
      searchGoogleAdsFieldsPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: searchGoogleAdsFieldsPagedCallable()");
  }

  public UnaryCallable<SearchGoogleAdsFieldsRequest, SearchGoogleAdsFieldsResponse>
      searchGoogleAdsFieldsCallable() {
    throw new UnsupportedOperationException("Not implemented: searchGoogleAdsFieldsCallable()");
  }

  @Override
  public abstract void close();
}
