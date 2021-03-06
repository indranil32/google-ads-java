// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/common/ad.proto

package com.google.ads.googleads.v0.common;

/**
 * <pre>
 * A dynamic search ad.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.common.DynamicSearchAdInfo}
 */
public  final class DynamicSearchAdInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.common.DynamicSearchAdInfo)
    DynamicSearchAdInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DynamicSearchAdInfo.newBuilder() to construct.
  private DynamicSearchAdInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DynamicSearchAdInfo() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DynamicSearchAdInfo(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description1_ != null) {
              subBuilder = description1_.toBuilder();
            }
            description1_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description1_);
              description1_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.StringValue.Builder subBuilder = null;
            if (description2_ != null) {
              subBuilder = description2_.toBuilder();
            }
            description2_ = input.readMessage(com.google.protobuf.StringValue.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(description2_);
              description2_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v0.common.AdProto.internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.common.AdProto.internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.common.DynamicSearchAdInfo.class, com.google.ads.googleads.v0.common.DynamicSearchAdInfo.Builder.class);
  }

  public static final int DESCRIPTION1_FIELD_NUMBER = 1;
  private com.google.protobuf.StringValue description1_;
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 1;</code>
   */
  public boolean hasDescription1() {
    return description1_ != null;
  }
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 1;</code>
   */
  public com.google.protobuf.StringValue getDescription1() {
    return description1_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description1_;
  }
  /**
   * <pre>
   * The first line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description1 = 1;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getDescription1OrBuilder() {
    return getDescription1();
  }

  public static final int DESCRIPTION2_FIELD_NUMBER = 2;
  private com.google.protobuf.StringValue description2_;
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 2;</code>
   */
  public boolean hasDescription2() {
    return description2_ != null;
  }
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 2;</code>
   */
  public com.google.protobuf.StringValue getDescription2() {
    return description2_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description2_;
  }
  /**
   * <pre>
   * The second line of the ad's description.
   * </pre>
   *
   * <code>.google.protobuf.StringValue description2 = 2;</code>
   */
  public com.google.protobuf.StringValueOrBuilder getDescription2OrBuilder() {
    return getDescription2();
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
    if (description1_ != null) {
      output.writeMessage(1, getDescription1());
    }
    if (description2_ != null) {
      output.writeMessage(2, getDescription2());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (description1_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDescription1());
    }
    if (description2_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDescription2());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.common.DynamicSearchAdInfo)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.common.DynamicSearchAdInfo other = (com.google.ads.googleads.v0.common.DynamicSearchAdInfo) obj;

    boolean result = true;
    result = result && (hasDescription1() == other.hasDescription1());
    if (hasDescription1()) {
      result = result && getDescription1()
          .equals(other.getDescription1());
    }
    result = result && (hasDescription2() == other.hasDescription2());
    if (hasDescription2()) {
      result = result && getDescription2()
          .equals(other.getDescription2());
    }
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
    if (hasDescription1()) {
      hash = (37 * hash) + DESCRIPTION1_FIELD_NUMBER;
      hash = (53 * hash) + getDescription1().hashCode();
    }
    if (hasDescription2()) {
      hash = (37 * hash) + DESCRIPTION2_FIELD_NUMBER;
      hash = (53 * hash) + getDescription2().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.common.DynamicSearchAdInfo prototype) {
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
   * A dynamic search ad.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.common.DynamicSearchAdInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.common.DynamicSearchAdInfo)
      com.google.ads.googleads.v0.common.DynamicSearchAdInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.common.AdProto.internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.common.AdProto.internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.common.DynamicSearchAdInfo.class, com.google.ads.googleads.v0.common.DynamicSearchAdInfo.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.common.DynamicSearchAdInfo.newBuilder()
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
      if (description1Builder_ == null) {
        description1_ = null;
      } else {
        description1_ = null;
        description1Builder_ = null;
      }
      if (description2Builder_ == null) {
        description2_ = null;
      } else {
        description2_ = null;
        description2Builder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.common.AdProto.internal_static_google_ads_googleads_v0_common_DynamicSearchAdInfo_descriptor;
    }

    public com.google.ads.googleads.v0.common.DynamicSearchAdInfo getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.common.DynamicSearchAdInfo.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.common.DynamicSearchAdInfo build() {
      com.google.ads.googleads.v0.common.DynamicSearchAdInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.common.DynamicSearchAdInfo buildPartial() {
      com.google.ads.googleads.v0.common.DynamicSearchAdInfo result = new com.google.ads.googleads.v0.common.DynamicSearchAdInfo(this);
      if (description1Builder_ == null) {
        result.description1_ = description1_;
      } else {
        result.description1_ = description1Builder_.build();
      }
      if (description2Builder_ == null) {
        result.description2_ = description2_;
      } else {
        result.description2_ = description2Builder_.build();
      }
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
      if (other instanceof com.google.ads.googleads.v0.common.DynamicSearchAdInfo) {
        return mergeFrom((com.google.ads.googleads.v0.common.DynamicSearchAdInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.common.DynamicSearchAdInfo other) {
      if (other == com.google.ads.googleads.v0.common.DynamicSearchAdInfo.getDefaultInstance()) return this;
      if (other.hasDescription1()) {
        mergeDescription1(other.getDescription1());
      }
      if (other.hasDescription2()) {
        mergeDescription2(other.getDescription2());
      }
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
      com.google.ads.googleads.v0.common.DynamicSearchAdInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.common.DynamicSearchAdInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.StringValue description1_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> description1Builder_;
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public boolean hasDescription1() {
      return description1Builder_ != null || description1_ != null;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public com.google.protobuf.StringValue getDescription1() {
      if (description1Builder_ == null) {
        return description1_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description1_;
      } else {
        return description1Builder_.getMessage();
      }
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public Builder setDescription1(com.google.protobuf.StringValue value) {
      if (description1Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description1_ = value;
        onChanged();
      } else {
        description1Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public Builder setDescription1(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (description1Builder_ == null) {
        description1_ = builderForValue.build();
        onChanged();
      } else {
        description1Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public Builder mergeDescription1(com.google.protobuf.StringValue value) {
      if (description1Builder_ == null) {
        if (description1_ != null) {
          description1_ =
            com.google.protobuf.StringValue.newBuilder(description1_).mergeFrom(value).buildPartial();
        } else {
          description1_ = value;
        }
        onChanged();
      } else {
        description1Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public Builder clearDescription1() {
      if (description1Builder_ == null) {
        description1_ = null;
        onChanged();
      } else {
        description1_ = null;
        description1Builder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescription1Builder() {
      
      onChanged();
      return getDescription1FieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescription1OrBuilder() {
      if (description1Builder_ != null) {
        return description1Builder_.getMessageOrBuilder();
      } else {
        return description1_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description1_;
      }
    }
    /**
     * <pre>
     * The first line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description1 = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescription1FieldBuilder() {
      if (description1Builder_ == null) {
        description1Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription1(),
                getParentForChildren(),
                isClean());
        description1_ = null;
      }
      return description1Builder_;
    }

    private com.google.protobuf.StringValue description2_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> description2Builder_;
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public boolean hasDescription2() {
      return description2Builder_ != null || description2_ != null;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public com.google.protobuf.StringValue getDescription2() {
      if (description2Builder_ == null) {
        return description2_ == null ? com.google.protobuf.StringValue.getDefaultInstance() : description2_;
      } else {
        return description2Builder_.getMessage();
      }
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public Builder setDescription2(com.google.protobuf.StringValue value) {
      if (description2Builder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        description2_ = value;
        onChanged();
      } else {
        description2Builder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public Builder setDescription2(
        com.google.protobuf.StringValue.Builder builderForValue) {
      if (description2Builder_ == null) {
        description2_ = builderForValue.build();
        onChanged();
      } else {
        description2Builder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public Builder mergeDescription2(com.google.protobuf.StringValue value) {
      if (description2Builder_ == null) {
        if (description2_ != null) {
          description2_ =
            com.google.protobuf.StringValue.newBuilder(description2_).mergeFrom(value).buildPartial();
        } else {
          description2_ = value;
        }
        onChanged();
      } else {
        description2Builder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public Builder clearDescription2() {
      if (description2Builder_ == null) {
        description2_ = null;
        onChanged();
      } else {
        description2_ = null;
        description2Builder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public com.google.protobuf.StringValue.Builder getDescription2Builder() {
      
      onChanged();
      return getDescription2FieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    public com.google.protobuf.StringValueOrBuilder getDescription2OrBuilder() {
      if (description2Builder_ != null) {
        return description2Builder_.getMessageOrBuilder();
      } else {
        return description2_ == null ?
            com.google.protobuf.StringValue.getDefaultInstance() : description2_;
      }
    }
    /**
     * <pre>
     * The second line of the ad's description.
     * </pre>
     *
     * <code>.google.protobuf.StringValue description2 = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder> 
        getDescription2FieldBuilder() {
      if (description2Builder_ == null) {
        description2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.StringValue, com.google.protobuf.StringValue.Builder, com.google.protobuf.StringValueOrBuilder>(
                getDescription2(),
                getParentForChildren(),
                isClean());
        description2_ = null;
      }
      return description2Builder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.common.DynamicSearchAdInfo)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.common.DynamicSearchAdInfo)
  private static final com.google.ads.googleads.v0.common.DynamicSearchAdInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.common.DynamicSearchAdInfo();
  }

  public static com.google.ads.googleads.v0.common.DynamicSearchAdInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DynamicSearchAdInfo>
      PARSER = new com.google.protobuf.AbstractParser<DynamicSearchAdInfo>() {
    public DynamicSearchAdInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DynamicSearchAdInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DynamicSearchAdInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DynamicSearchAdInfo> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.common.DynamicSearchAdInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

