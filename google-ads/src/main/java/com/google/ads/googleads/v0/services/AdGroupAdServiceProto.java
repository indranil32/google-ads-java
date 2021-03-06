// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/services/ad_group_ad_service.proto

package com.google.ads.googleads.v0.services;

public final class AdGroupAdServiceProto {
  private AdGroupAdServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_GetAdGroupAdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_GetAdGroupAdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_AdGroupAdOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_AdGroupAdOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_services_MutateAdGroupAdResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v0/services/ad_gr" +
      "oup_ad_service.proto\022 google.ads.googlea" +
      "ds.v0.services\0323google/ads/googleads/v0/" +
      "resources/ad_group_ad.proto\032\034google/api/" +
      "annotations.proto\032 google/protobuf/field" +
      "_mask.proto\",\n\023GetAdGroupAdRequest\022\025\n\rre" +
      "source_name\030\001 \001(\t\"x\n\027MutateAdGroupAdsReq" +
      "uest\022\023\n\013customer_id\030\001 \001(\t\022H\n\noperations\030" +
      "\002 \003(\01324.google.ads.googleads.v0.services" +
      ".AdGroupAdOperation\"\344\001\n\022AdGroupAdOperati" +
      "on\022/\n\013update_mask\030\004 \001(\0132\032.google.protobu" +
      "f.FieldMask\022>\n\006create\030\001 \001(\0132,.google.ads" +
      ".googleads.v0.resources.AdGroupAdH\000\022>\n\006u" +
      "pdate\030\002 \001(\0132,.google.ads.googleads.v0.re" +
      "sources.AdGroupAdH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n" +
      "\toperation\"d\n\030MutateAdGroupAdsResponse\022H" +
      "\n\007results\030\002 \003(\01327.google.ads.googleads.v" +
      "0.services.MutateAdGroupAdResult\".\n\025Muta" +
      "teAdGroupAdResult\022\025\n\rresource_name\030\001 \001(\t" +
      "2\206\003\n\020AdGroupAdService\022\251\001\n\014GetAdGroupAd\0225" +
      ".google.ads.googleads.v0.services.GetAdG" +
      "roupAdRequest\032,.google.ads.googleads.v0." +
      "resources.AdGroupAd\"4\202\323\344\223\002.\022,/v0/{resour" +
      "ce_name=customers/*/adGroupAds/*}\022\305\001\n\020Mu" +
      "tateAdGroupAds\0229.google.ads.googleads.v0" +
      ".services.MutateAdGroupAdsRequest\032:.goog" +
      "le.ads.googleads.v0.services.MutateAdGro" +
      "upAdsResponse\":\202\323\344\223\0024\"//v0/customers/{cu" +
      "stomer_id=*}/adGroupAds:mutate:\001*B\325\001\n$co" +
      "m.google.ads.googleads.v0.servicesB\025AdGr" +
      "oupAdServiceProtoP\001ZHgoogle.golang.org/g" +
      "enproto/googleapis/ads/googleads/v0/serv" +
      "ices;services\242\002\003GAA\252\002 Google.Ads.GoogleA" +
      "ds.V0.Services\312\002 Google\\Ads\\GoogleAds\\V0" +
      "\\Servicesb\006proto3"
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
          com.google.ads.googleads.v0.resources.AdGroupAdProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_services_GetAdGroupAdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_services_GetAdGroupAdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_GetAdGroupAdRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", });
    internal_static_google_ads_googleads_v0_services_AdGroupAdOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v0_services_AdGroupAdOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_AdGroupAdOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupAdsResponse_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v0_services_MutateAdGroupAdResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_services_MutateAdGroupAdResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v0.resources.AdGroupAdProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
