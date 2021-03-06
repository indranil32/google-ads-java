// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad_group_criterion.proto

package com.google.ads.googleads.v0.resources;

public final class AdGroupCriterionProto {
  private AdGroupCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v0/resources/ad_g" +
      "roup_criterion.proto\022!google.ads.googlea" +
      "ds.v0.resources\032-google/ads/googleads/v0" +
      "/common/criteria.proto\0325google/ads/googl" +
      "eads/v0/common/custom_parameter.proto\032=g" +
      "oogle/ads/googleads/v0/enums/ad_group_cr" +
      "iterion_status.proto\032.google/ads/googlea" +
      "ds/v0/enums/bid_source.proto\0322google/ads" +
      "/googleads/v0/enums/criterion_type.proto" +
      "\0328google/ads/googleads/v0/enums/quality_" +
      "score_bucket.proto\032\036google/protobuf/wrap" +
      "pers.proto\"\353\017\n\020AdGroupCriterion\022\025\n\rresou" +
      "rce_name\030\001 \001(\t\0221\n\014criterion_id\030\032 \001(\0132\033.g" +
      "oogle.protobuf.Int64Value\022`\n\006status\030\003 \001(" +
      "\0162P.google.ads.googleads.v0.enums.AdGrou" +
      "pCriterionStatusEnum.AdGroupCriterionSta" +
      "tus\022U\n\014quality_info\030\004 \001(\0132?.google.ads.g" +
      "oogleads.v0.resources.AdGroupCriterion.Q" +
      "ualityInfo\022.\n\010ad_group\030\005 \001(\0132\034.google.pr" +
      "otobuf.StringValue\022L\n\004type\030\031 \001(\0162>.googl" +
      "e.ads.googleads.v0.enums.CriterionTypeEn" +
      "um.CriterionType\022,\n\010negative\030\037 \001(\0132\032.goo" +
      "gle.protobuf.BoolValue\0223\n\016cpc_bid_micros" +
      "\030\020 \001(\0132\033.google.protobuf.Int64Value\0223\n\016c" +
      "pm_bid_micros\030\021 \001(\0132\033.google.protobuf.In" +
      "t64Value\0223\n\016cpv_bid_micros\030\030 \001(\0132\033.googl" +
      "e.protobuf.Int64Value\022=\n\030effective_cpc_b" +
      "id_micros\030\022 \001(\0132\033.google.protobuf.Int64V" +
      "alue\022=\n\030effective_cpm_bid_micros\030\023 \001(\0132\033" +
      ".google.protobuf.Int64Value\022=\n\030effective" +
      "_cpv_bid_micros\030\024 \001(\0132\033.google.protobuf." +
      "Int64Value\022X\n\030effective_cpc_bid_source\030\025" +
      " \001(\01626.google.ads.googleads.v0.enums.Bid" +
      "SourceEnum.BidSource\022X\n\030effective_cpm_bi" +
      "d_source\030\026 \001(\01626.google.ads.googleads.v0" +
      ".enums.BidSourceEnum.BidSource\022X\n\030effect" +
      "ive_cpv_bid_source\030\027 \001(\01626.google.ads.go" +
      "ogleads.v0.enums.BidSourceEnum.BidSource" +
      "\022a\n\022position_estimates\030\n \001(\0132E.google.ad" +
      "s.googleads.v0.resources.AdGroupCriterio" +
      "n.PositionEstimates\0220\n\nfinal_urls\030\013 \003(\0132" +
      "\034.google.protobuf.StringValue\022;\n\025trackin" +
      "g_url_template\030\r \001(\0132\034.google.protobuf.S" +
      "tringValue\022N\n\025url_custom_parameters\030\016 \003(" +
      "\0132/.google.ads.googleads.v0.common.Custo" +
      "mParameter\022>\n\007keyword\030\033 \001(\0132+.google.ads" +
      ".googleads.v0.common.KeywordInfoH\000\032\377\002\n\013Q" +
      "ualityInfo\0222\n\rquality_score\030\001 \001(\0132\033.goog" +
      "le.protobuf.Int32Value\022h\n\026creative_quali" +
      "ty_score\030\002 \001(\0162H.google.ads.googleads.v0" +
      ".enums.QualityScoreBucketEnum.QualitySco" +
      "reBucket\022j\n\030post_click_quality_score\030\003 \001" +
      "(\0162H.google.ads.googleads.v0.enums.Quali" +
      "tyScoreBucketEnum.QualityScoreBucket\022f\n\024" +
      "search_predicted_ctr\030\004 \001(\0162H.google.ads." +
      "googleads.v0.enums.QualityScoreBucketEnu" +
      "m.QualityScoreBucket\032\314\001\n\021PositionEstimat" +
      "es\022:\n\025first_page_cpc_micros\030\001 \001(\0132\033.goog" +
      "le.protobuf.Int64Value\022>\n\031first_position" +
      "_cpc_micros\030\002 \001(\0132\033.google.protobuf.Int6" +
      "4Value\022;\n\026top_of_page_cpc_micros\030\003 \001(\0132\033" +
      ".google.protobuf.Int64ValueB\013\n\tcriterion" +
      "B\332\001\n%com.google.ads.googleads.v0.resourc" +
      "esB\025AdGroupCriterionProtoP\001ZJgoogle.gola" +
      "ng.org/genproto/googleapis/ads/googleads" +
      "/v0/resources;resources\242\002\003GAA\252\002!Google.A" +
      "ds.GoogleAds.V0.Resources\312\002!Google\\Ads\\G" +
      "oogleAds\\V0\\Resourcesb\006proto3"
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
          com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.AdGroupCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.BidSourceProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor(),
          com.google.ads.googleads.v0.enums.QualityScoreBucketProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "CriterionId", "Status", "QualityInfo", "AdGroup", "Type", "Negative", "CpcBidMicros", "CpmBidMicros", "CpvBidMicros", "EffectiveCpcBidMicros", "EffectiveCpmBidMicros", "EffectiveCpvBidMicros", "EffectiveCpcBidSource", "EffectiveCpmBidSource", "EffectiveCpvBidSource", "PositionEstimates", "FinalUrls", "TrackingUrlTemplate", "UrlCustomParameters", "Keyword", "Criterion", });
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_descriptor =
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_QualityInfo_descriptor,
        new java.lang.String[] { "QualityScore", "CreativeQualityScore", "PostClickQualityScore", "SearchPredictedCtr", });
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_descriptor =
      internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v0_resources_AdGroupCriterion_PositionEstimates_descriptor,
        new java.lang.String[] { "FirstPageCpcMicros", "FirstPositionCpcMicros", "TopOfPageCpcMicros", });
    com.google.ads.googleads.v0.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v0.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v0.enums.AdGroupCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v0.enums.BidSourceProto.getDescriptor();
    com.google.ads.googleads.v0.enums.CriterionTypeProto.getDescriptor();
    com.google.ads.googleads.v0.enums.QualityScoreBucketProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
