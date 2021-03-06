// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/enums/google_ads_field_category.proto

package com.google.ads.googleads.v0.enums;

/**
 * <pre>
 * Container for enum that determines if the described artifact is a resource
 * or a field, and if it is a field, when it segments search queries.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum}
 */
public  final class GoogleAdsFieldCategoryEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum)
    GoogleAdsFieldCategoryEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoogleAdsFieldCategoryEnum.newBuilder() to construct.
  private GoogleAdsFieldCategoryEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoogleAdsFieldCategoryEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GoogleAdsFieldCategoryEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldCategoryEnum_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldCategoryEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.class, com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.Builder.class);
  }

  /**
   * <pre>
   * The category of the artifact.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.GoogleAdsFieldCategory}
   */
  public enum GoogleAdsFieldCategory
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * The described artifact is a resource.
     * </pre>
     *
     * <code>RESOURCE = 2;</code>
     */
    RESOURCE(2),
    /**
     * <pre>
     * The described artifact is a field and is an attribute of a resource.
     * Including a resource attribute field in a query may segment the query if
     * the resource to which it is attributed segments the resource found in
     * the FROM clause.
     * </pre>
     *
     * <code>ATTRIBUTE = 3;</code>
     */
    ATTRIBUTE(3),
    /**
     * <pre>
     * The described artifact is a field and always segments search queries.
     * </pre>
     *
     * <code>SEGMENT = 5;</code>
     */
    SEGMENT(5),
    /**
     * <pre>
     * The described artifact is a field and is a metric. It never segments
     * search queries.
     * </pre>
     *
     * <code>METRIC = 6;</code>
     */
    METRIC(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Unspecified
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * Unknown
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * The described artifact is a resource.
     * </pre>
     *
     * <code>RESOURCE = 2;</code>
     */
    public static final int RESOURCE_VALUE = 2;
    /**
     * <pre>
     * The described artifact is a field and is an attribute of a resource.
     * Including a resource attribute field in a query may segment the query if
     * the resource to which it is attributed segments the resource found in
     * the FROM clause.
     * </pre>
     *
     * <code>ATTRIBUTE = 3;</code>
     */
    public static final int ATTRIBUTE_VALUE = 3;
    /**
     * <pre>
     * The described artifact is a field and always segments search queries.
     * </pre>
     *
     * <code>SEGMENT = 5;</code>
     */
    public static final int SEGMENT_VALUE = 5;
    /**
     * <pre>
     * The described artifact is a field and is a metric. It never segments
     * search queries.
     * </pre>
     *
     * <code>METRIC = 6;</code>
     */
    public static final int METRIC_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static GoogleAdsFieldCategory valueOf(int value) {
      return forNumber(value);
    }

    public static GoogleAdsFieldCategory forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return RESOURCE;
        case 3: return ATTRIBUTE;
        case 5: return SEGMENT;
        case 6: return METRIC;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GoogleAdsFieldCategory>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GoogleAdsFieldCategory> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GoogleAdsFieldCategory>() {
            public GoogleAdsFieldCategory findValueByNumber(int number) {
              return GoogleAdsFieldCategory.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final GoogleAdsFieldCategory[] VALUES = values();

    public static GoogleAdsFieldCategory valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private GoogleAdsFieldCategory(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.GoogleAdsFieldCategory)
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum other = (com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum that determines if the described artifact is a resource
   * or a field, and if it is a field, when it segments search queries.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum)
      com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldCategoryEnum_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldCategoryEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.class, com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryProto.internal_static_google_ads_googleads_v0_enums_GoogleAdsFieldCategoryEnum_descriptor;
    }

    public com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum build() {
      com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum buildPartial() {
      com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum result = new com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum) {
        return mergeFrom((com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum other) {
      if (other == com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum)
  private static final com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum();
  }

  public static com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleAdsFieldCategoryEnum>
      PARSER = new com.google.protobuf.AbstractParser<GoogleAdsFieldCategoryEnum>() {
    public GoogleAdsFieldCategoryEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GoogleAdsFieldCategoryEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GoogleAdsFieldCategoryEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleAdsFieldCategoryEnum> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.enums.GoogleAdsFieldCategoryEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

