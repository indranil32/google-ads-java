// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/customer.proto

package com.google.ads.googleads.v0.resources;

public final class CustomerProto {
  private CustomerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_Customer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_Customer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n0google/ads/googleads/v0/resources/cust" +
      "omer.proto\022!google.ads.googleads.v0.reso" +
      "urces\032\036google/protobuf/wrappers.proto\"\337\002" +
      "\n\010Customer\022\025\n\rresource_name\030\001 \001(\t\022\'\n\002id\030" +
      "\003 \001(\0132\033.google.protobuf.Int64Value\0226\n\020de" +
      "scriptive_name\030\004 \001(\0132\034.google.protobuf.S" +
      "tringValue\0223\n\rcurrency_code\030\005 \001(\0132\034.goog" +
      "le.protobuf.StringValue\022/\n\ttime_zone\030\006 \001" +
      "(\0132\034.google.protobuf.StringValue\022;\n\025trac" +
      "king_url_template\030\007 \001(\0132\034.google.protobu" +
      "f.StringValue\0228\n\024auto_tagging_enabled\030\010 " +
      "\001(\0132\032.google.protobuf.BoolValueB\322\001\n%com." +
      "google.ads.googleads.v0.resourcesB\rCusto" +
      "merProtoP\001ZJgoogle.golang.org/genproto/g" +
      "oogleapis/ads/googleads/v0/resources;res" +
      "ources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V0.R" +
      "esources\312\002!Google\\Ads\\GoogleAds\\V0\\Resou" +
      "rcesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_Customer_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "DescriptiveName", "CurrencyCode", "TimeZone", "TrackingUrlTemplate", "AutoTaggingEnabled", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
