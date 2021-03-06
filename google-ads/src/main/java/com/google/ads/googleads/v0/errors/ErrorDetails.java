// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/errors.proto

package com.google.ads.googleads.v0.errors;

/**
 * <pre>
 * Additional error details.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.errors.ErrorDetails}
 */
public  final class ErrorDetails extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.errors.ErrorDetails)
    ErrorDetailsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ErrorDetails.newBuilder() to construct.
  private ErrorDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ErrorDetails() {
    unpublishedErrorCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ErrorDetails(
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
            java.lang.String s = input.readStringRequireUtf8();

            unpublishedErrorCode_ = s;
            break;
          }
          case 18: {
            com.google.ads.googleads.v0.errors.PolicyViolationDetails.Builder subBuilder = null;
            if (policyViolationDetails_ != null) {
              subBuilder = policyViolationDetails_.toBuilder();
            }
            policyViolationDetails_ = input.readMessage(com.google.ads.googleads.v0.errors.PolicyViolationDetails.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(policyViolationDetails_);
              policyViolationDetails_ = subBuilder.buildPartial();
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
    return com.google.ads.googleads.v0.errors.ErrorsProto.internal_static_google_ads_googleads_v0_errors_ErrorDetails_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.errors.ErrorsProto.internal_static_google_ads_googleads_v0_errors_ErrorDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.errors.ErrorDetails.class, com.google.ads.googleads.v0.errors.ErrorDetails.Builder.class);
  }

  public static final int UNPUBLISHED_ERROR_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object unpublishedErrorCode_;
  /**
   * <pre>
   * The error code that should have been returned, but wasn't. This is used
   * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
   * </pre>
   *
   * <code>string unpublished_error_code = 1;</code>
   */
  public java.lang.String getUnpublishedErrorCode() {
    java.lang.Object ref = unpublishedErrorCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      unpublishedErrorCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The error code that should have been returned, but wasn't. This is used
   * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
   * </pre>
   *
   * <code>string unpublished_error_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUnpublishedErrorCodeBytes() {
    java.lang.Object ref = unpublishedErrorCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      unpublishedErrorCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POLICY_VIOLATION_DETAILS_FIELD_NUMBER = 2;
  private com.google.ads.googleads.v0.errors.PolicyViolationDetails policyViolationDetails_;
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  public boolean hasPolicyViolationDetails() {
    return policyViolationDetails_ != null;
  }
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  public com.google.ads.googleads.v0.errors.PolicyViolationDetails getPolicyViolationDetails() {
    return policyViolationDetails_ == null ? com.google.ads.googleads.v0.errors.PolicyViolationDetails.getDefaultInstance() : policyViolationDetails_;
  }
  /**
   * <pre>
   * Describes an ad policy violation.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
   */
  public com.google.ads.googleads.v0.errors.PolicyViolationDetailsOrBuilder getPolicyViolationDetailsOrBuilder() {
    return getPolicyViolationDetails();
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
    if (!getUnpublishedErrorCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, unpublishedErrorCode_);
    }
    if (policyViolationDetails_ != null) {
      output.writeMessage(2, getPolicyViolationDetails());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUnpublishedErrorCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, unpublishedErrorCode_);
    }
    if (policyViolationDetails_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPolicyViolationDetails());
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
    if (!(obj instanceof com.google.ads.googleads.v0.errors.ErrorDetails)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.errors.ErrorDetails other = (com.google.ads.googleads.v0.errors.ErrorDetails) obj;

    boolean result = true;
    result = result && getUnpublishedErrorCode()
        .equals(other.getUnpublishedErrorCode());
    result = result && (hasPolicyViolationDetails() == other.hasPolicyViolationDetails());
    if (hasPolicyViolationDetails()) {
      result = result && getPolicyViolationDetails()
          .equals(other.getPolicyViolationDetails());
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
    hash = (37 * hash) + UNPUBLISHED_ERROR_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getUnpublishedErrorCode().hashCode();
    if (hasPolicyViolationDetails()) {
      hash = (37 * hash) + POLICY_VIOLATION_DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getPolicyViolationDetails().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.ErrorDetails parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.errors.ErrorDetails prototype) {
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
   * Additional error details.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.errors.ErrorDetails}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.errors.ErrorDetails)
      com.google.ads.googleads.v0.errors.ErrorDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.errors.ErrorsProto.internal_static_google_ads_googleads_v0_errors_ErrorDetails_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.errors.ErrorsProto.internal_static_google_ads_googleads_v0_errors_ErrorDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.errors.ErrorDetails.class, com.google.ads.googleads.v0.errors.ErrorDetails.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.errors.ErrorDetails.newBuilder()
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
      unpublishedErrorCode_ = "";

      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetails_ = null;
      } else {
        policyViolationDetails_ = null;
        policyViolationDetailsBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.errors.ErrorsProto.internal_static_google_ads_googleads_v0_errors_ErrorDetails_descriptor;
    }

    public com.google.ads.googleads.v0.errors.ErrorDetails getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.errors.ErrorDetails.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.errors.ErrorDetails build() {
      com.google.ads.googleads.v0.errors.ErrorDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.errors.ErrorDetails buildPartial() {
      com.google.ads.googleads.v0.errors.ErrorDetails result = new com.google.ads.googleads.v0.errors.ErrorDetails(this);
      result.unpublishedErrorCode_ = unpublishedErrorCode_;
      if (policyViolationDetailsBuilder_ == null) {
        result.policyViolationDetails_ = policyViolationDetails_;
      } else {
        result.policyViolationDetails_ = policyViolationDetailsBuilder_.build();
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
      if (other instanceof com.google.ads.googleads.v0.errors.ErrorDetails) {
        return mergeFrom((com.google.ads.googleads.v0.errors.ErrorDetails)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.errors.ErrorDetails other) {
      if (other == com.google.ads.googleads.v0.errors.ErrorDetails.getDefaultInstance()) return this;
      if (!other.getUnpublishedErrorCode().isEmpty()) {
        unpublishedErrorCode_ = other.unpublishedErrorCode_;
        onChanged();
      }
      if (other.hasPolicyViolationDetails()) {
        mergePolicyViolationDetails(other.getPolicyViolationDetails());
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
      com.google.ads.googleads.v0.errors.ErrorDetails parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.errors.ErrorDetails) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object unpublishedErrorCode_ = "";
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public java.lang.String getUnpublishedErrorCode() {
      java.lang.Object ref = unpublishedErrorCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        unpublishedErrorCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUnpublishedErrorCodeBytes() {
      java.lang.Object ref = unpublishedErrorCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        unpublishedErrorCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public Builder setUnpublishedErrorCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      unpublishedErrorCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public Builder clearUnpublishedErrorCode() {
      
      unpublishedErrorCode_ = getDefaultInstance().getUnpublishedErrorCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The error code that should have been returned, but wasn't. This is used
     * when the error code is InternalError.ERROR_CODE_NOT_PUBLISHED.
     * </pre>
     *
     * <code>string unpublished_error_code = 1;</code>
     */
    public Builder setUnpublishedErrorCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      unpublishedErrorCode_ = value;
      onChanged();
      return this;
    }

    private com.google.ads.googleads.v0.errors.PolicyViolationDetails policyViolationDetails_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v0.errors.PolicyViolationDetails, com.google.ads.googleads.v0.errors.PolicyViolationDetails.Builder, com.google.ads.googleads.v0.errors.PolicyViolationDetailsOrBuilder> policyViolationDetailsBuilder_;
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public boolean hasPolicyViolationDetails() {
      return policyViolationDetailsBuilder_ != null || policyViolationDetails_ != null;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public com.google.ads.googleads.v0.errors.PolicyViolationDetails getPolicyViolationDetails() {
      if (policyViolationDetailsBuilder_ == null) {
        return policyViolationDetails_ == null ? com.google.ads.googleads.v0.errors.PolicyViolationDetails.getDefaultInstance() : policyViolationDetails_;
      } else {
        return policyViolationDetailsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder setPolicyViolationDetails(com.google.ads.googleads.v0.errors.PolicyViolationDetails value) {
      if (policyViolationDetailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        policyViolationDetails_ = value;
        onChanged();
      } else {
        policyViolationDetailsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder setPolicyViolationDetails(
        com.google.ads.googleads.v0.errors.PolicyViolationDetails.Builder builderForValue) {
      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetails_ = builderForValue.build();
        onChanged();
      } else {
        policyViolationDetailsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder mergePolicyViolationDetails(com.google.ads.googleads.v0.errors.PolicyViolationDetails value) {
      if (policyViolationDetailsBuilder_ == null) {
        if (policyViolationDetails_ != null) {
          policyViolationDetails_ =
            com.google.ads.googleads.v0.errors.PolicyViolationDetails.newBuilder(policyViolationDetails_).mergeFrom(value).buildPartial();
        } else {
          policyViolationDetails_ = value;
        }
        onChanged();
      } else {
        policyViolationDetailsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public Builder clearPolicyViolationDetails() {
      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetails_ = null;
        onChanged();
      } else {
        policyViolationDetails_ = null;
        policyViolationDetailsBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public com.google.ads.googleads.v0.errors.PolicyViolationDetails.Builder getPolicyViolationDetailsBuilder() {
      
      onChanged();
      return getPolicyViolationDetailsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    public com.google.ads.googleads.v0.errors.PolicyViolationDetailsOrBuilder getPolicyViolationDetailsOrBuilder() {
      if (policyViolationDetailsBuilder_ != null) {
        return policyViolationDetailsBuilder_.getMessageOrBuilder();
      } else {
        return policyViolationDetails_ == null ?
            com.google.ads.googleads.v0.errors.PolicyViolationDetails.getDefaultInstance() : policyViolationDetails_;
      }
    }
    /**
     * <pre>
     * Describes an ad policy violation.
     * </pre>
     *
     * <code>.google.ads.googleads.v0.errors.PolicyViolationDetails policy_violation_details = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.ads.googleads.v0.errors.PolicyViolationDetails, com.google.ads.googleads.v0.errors.PolicyViolationDetails.Builder, com.google.ads.googleads.v0.errors.PolicyViolationDetailsOrBuilder> 
        getPolicyViolationDetailsFieldBuilder() {
      if (policyViolationDetailsBuilder_ == null) {
        policyViolationDetailsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.ads.googleads.v0.errors.PolicyViolationDetails, com.google.ads.googleads.v0.errors.PolicyViolationDetails.Builder, com.google.ads.googleads.v0.errors.PolicyViolationDetailsOrBuilder>(
                getPolicyViolationDetails(),
                getParentForChildren(),
                isClean());
        policyViolationDetails_ = null;
      }
      return policyViolationDetailsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.errors.ErrorDetails)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.errors.ErrorDetails)
  private static final com.google.ads.googleads.v0.errors.ErrorDetails DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.errors.ErrorDetails();
  }

  public static com.google.ads.googleads.v0.errors.ErrorDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ErrorDetails>
      PARSER = new com.google.protobuf.AbstractParser<ErrorDetails>() {
    public ErrorDetails parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ErrorDetails(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ErrorDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ErrorDetails> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.errors.ErrorDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

