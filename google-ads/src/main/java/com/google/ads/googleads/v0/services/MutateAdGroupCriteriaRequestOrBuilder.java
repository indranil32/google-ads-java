// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_group_criterion_service.proto

package com.google.ads.googleads.v0.services;

public interface MutateAdGroupCriteriaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.services.MutateAdGroupCriteriaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID of the customer whose criteria are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * ID of the customer whose criteria are being modified.
   * </pre>
   *
   * <code>string customer_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * The list of operations to perform on individual criteria.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.AdGroupCriterionOperation operations = 2;</code>
   */
  java.util.List<com.google.ads.googleads.v0.services.AdGroupCriterionOperation> 
      getOperationsList();
  /**
   * <pre>
   * The list of operations to perform on individual criteria.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.AdGroupCriterionOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.AdGroupCriterionOperation getOperations(int index);
  /**
   * <pre>
   * The list of operations to perform on individual criteria.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.AdGroupCriterionOperation operations = 2;</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * The list of operations to perform on individual criteria.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.AdGroupCriterionOperation operations = 2;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v0.services.AdGroupCriterionOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * The list of operations to perform on individual criteria.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v0.services.AdGroupCriterionOperation operations = 2;</code>
   */
  com.google.ads.googleads.v0.services.AdGroupCriterionOperationOrBuilder getOperationsOrBuilder(
      int index);
}
