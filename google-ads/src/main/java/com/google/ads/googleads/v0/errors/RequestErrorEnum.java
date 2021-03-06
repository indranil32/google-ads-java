// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/request_error.proto

package com.google.ads.googleads.v0.errors;

/**
 * <pre>
 * Container for enum describing possible request errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.errors.RequestErrorEnum}
 */
public  final class RequestErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.errors.RequestErrorEnum)
    RequestErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestErrorEnum.newBuilder() to construct.
  private RequestErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestErrorEnum(
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
    return com.google.ads.googleads.v0.errors.RequestErrorProto.internal_static_google_ads_googleads_v0_errors_RequestErrorEnum_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.errors.RequestErrorProto.internal_static_google_ads_googleads_v0_errors_RequestErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.errors.RequestErrorEnum.class, com.google.ads.googleads.v0.errors.RequestErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible request errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.errors.RequestErrorEnum.RequestError}
   */
  public enum RequestError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Resource name is required for this request.
     * </pre>
     *
     * <code>RESOURCE_NAME_MISSING = 3;</code>
     */
    RESOURCE_NAME_MISSING(3),
    /**
     * <pre>
     * Resource name provided is malformed.
     * </pre>
     *
     * <code>RESOURCE_NAME_MALFORMED = 4;</code>
     */
    RESOURCE_NAME_MALFORMED(4),
    /**
     * <pre>
     * Resource name provided is malformed.
     * </pre>
     *
     * <code>BAD_RESOURCE_ID = 17;</code>
     */
    BAD_RESOURCE_ID(17),
    /**
     * <pre>
     * Customer ID is invalid.
     * </pre>
     *
     * <code>INVALID_CUSTOMER_ID = 16;</code>
     */
    INVALID_CUSTOMER_ID(16),
    /**
     * <pre>
     * Mutate operation should have either create, update, or remove specified.
     * </pre>
     *
     * <code>OPERATION_REQUIRED = 5;</code>
     */
    OPERATION_REQUIRED(5),
    /**
     * <pre>
     * Requested resource not found.
     * </pre>
     *
     * <code>RESOURCE_NOT_FOUND = 6;</code>
     */
    RESOURCE_NOT_FOUND(6),
    /**
     * <pre>
     * Next page token specified in user request is invalid.
     * </pre>
     *
     * <code>INVALID_PAGE_TOKEN = 7;</code>
     */
    INVALID_PAGE_TOKEN(7),
    /**
     * <pre>
     * Next page token specified in user request has expired.
     * </pre>
     *
     * <code>EXPIRED_PAGE_TOKEN = 8;</code>
     */
    EXPIRED_PAGE_TOKEN(8),
    /**
     * <pre>
     * Required field is missing.
     * </pre>
     *
     * <code>REQUIRED_FIELD_MISSING = 9;</code>
     */
    REQUIRED_FIELD_MISSING(9),
    /**
     * <pre>
     * The field cannot be modified because it's immutable. It's also possible
     * that the field can be modified using 'create' operation but not 'update'.
     * </pre>
     *
     * <code>IMMUTABLE_FIELD = 11;</code>
     */
    IMMUTABLE_FIELD(11),
    /**
     * <pre>
     * Received too many entries in request.
     * </pre>
     *
     * <code>TOO_MANY_MUTATE_OPERATIONS = 13;</code>
     */
    TOO_MANY_MUTATE_OPERATIONS(13),
    /**
     * <pre>
     * Request cannot be executed by a manager account.
     * </pre>
     *
     * <code>CANNOT_BE_EXECUTED_BY_MANAGER_ACCOUNT = 14;</code>
     */
    CANNOT_BE_EXECUTED_BY_MANAGER_ACCOUNT(14),
    /**
     * <pre>
     * Mutate request was attempting to modify a readonly field.
     * For instance, Budget fields can be requested for Ad Group,
     * but are read-only for adGroups:mutate.
     * </pre>
     *
     * <code>CANNOT_MODIFY_FOREIGN_FIELD = 15;</code>
     */
    CANNOT_MODIFY_FOREIGN_FIELD(15),
    /**
     * <pre>
     * Enum value is not permitted.
     * </pre>
     *
     * <code>INVALID_ENUM_VALUE = 18;</code>
     */
    INVALID_ENUM_VALUE(18),
    /**
     * <pre>
     * The developer-token parameter is required for all requests.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_PARAMETER_MISSING = 19;</code>
     */
    DEVELOPER_TOKEN_PARAMETER_MISSING(19),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Resource name is required for this request.
     * </pre>
     *
     * <code>RESOURCE_NAME_MISSING = 3;</code>
     */
    public static final int RESOURCE_NAME_MISSING_VALUE = 3;
    /**
     * <pre>
     * Resource name provided is malformed.
     * </pre>
     *
     * <code>RESOURCE_NAME_MALFORMED = 4;</code>
     */
    public static final int RESOURCE_NAME_MALFORMED_VALUE = 4;
    /**
     * <pre>
     * Resource name provided is malformed.
     * </pre>
     *
     * <code>BAD_RESOURCE_ID = 17;</code>
     */
    public static final int BAD_RESOURCE_ID_VALUE = 17;
    /**
     * <pre>
     * Customer ID is invalid.
     * </pre>
     *
     * <code>INVALID_CUSTOMER_ID = 16;</code>
     */
    public static final int INVALID_CUSTOMER_ID_VALUE = 16;
    /**
     * <pre>
     * Mutate operation should have either create, update, or remove specified.
     * </pre>
     *
     * <code>OPERATION_REQUIRED = 5;</code>
     */
    public static final int OPERATION_REQUIRED_VALUE = 5;
    /**
     * <pre>
     * Requested resource not found.
     * </pre>
     *
     * <code>RESOURCE_NOT_FOUND = 6;</code>
     */
    public static final int RESOURCE_NOT_FOUND_VALUE = 6;
    /**
     * <pre>
     * Next page token specified in user request is invalid.
     * </pre>
     *
     * <code>INVALID_PAGE_TOKEN = 7;</code>
     */
    public static final int INVALID_PAGE_TOKEN_VALUE = 7;
    /**
     * <pre>
     * Next page token specified in user request has expired.
     * </pre>
     *
     * <code>EXPIRED_PAGE_TOKEN = 8;</code>
     */
    public static final int EXPIRED_PAGE_TOKEN_VALUE = 8;
    /**
     * <pre>
     * Required field is missing.
     * </pre>
     *
     * <code>REQUIRED_FIELD_MISSING = 9;</code>
     */
    public static final int REQUIRED_FIELD_MISSING_VALUE = 9;
    /**
     * <pre>
     * The field cannot be modified because it's immutable. It's also possible
     * that the field can be modified using 'create' operation but not 'update'.
     * </pre>
     *
     * <code>IMMUTABLE_FIELD = 11;</code>
     */
    public static final int IMMUTABLE_FIELD_VALUE = 11;
    /**
     * <pre>
     * Received too many entries in request.
     * </pre>
     *
     * <code>TOO_MANY_MUTATE_OPERATIONS = 13;</code>
     */
    public static final int TOO_MANY_MUTATE_OPERATIONS_VALUE = 13;
    /**
     * <pre>
     * Request cannot be executed by a manager account.
     * </pre>
     *
     * <code>CANNOT_BE_EXECUTED_BY_MANAGER_ACCOUNT = 14;</code>
     */
    public static final int CANNOT_BE_EXECUTED_BY_MANAGER_ACCOUNT_VALUE = 14;
    /**
     * <pre>
     * Mutate request was attempting to modify a readonly field.
     * For instance, Budget fields can be requested for Ad Group,
     * but are read-only for adGroups:mutate.
     * </pre>
     *
     * <code>CANNOT_MODIFY_FOREIGN_FIELD = 15;</code>
     */
    public static final int CANNOT_MODIFY_FOREIGN_FIELD_VALUE = 15;
    /**
     * <pre>
     * Enum value is not permitted.
     * </pre>
     *
     * <code>INVALID_ENUM_VALUE = 18;</code>
     */
    public static final int INVALID_ENUM_VALUE_VALUE = 18;
    /**
     * <pre>
     * The developer-token parameter is required for all requests.
     * </pre>
     *
     * <code>DEVELOPER_TOKEN_PARAMETER_MISSING = 19;</code>
     */
    public static final int DEVELOPER_TOKEN_PARAMETER_MISSING_VALUE = 19;


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
    public static RequestError valueOf(int value) {
      return forNumber(value);
    }

    public static RequestError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 3: return RESOURCE_NAME_MISSING;
        case 4: return RESOURCE_NAME_MALFORMED;
        case 17: return BAD_RESOURCE_ID;
        case 16: return INVALID_CUSTOMER_ID;
        case 5: return OPERATION_REQUIRED;
        case 6: return RESOURCE_NOT_FOUND;
        case 7: return INVALID_PAGE_TOKEN;
        case 8: return EXPIRED_PAGE_TOKEN;
        case 9: return REQUIRED_FIELD_MISSING;
        case 11: return IMMUTABLE_FIELD;
        case 13: return TOO_MANY_MUTATE_OPERATIONS;
        case 14: return CANNOT_BE_EXECUTED_BY_MANAGER_ACCOUNT;
        case 15: return CANNOT_MODIFY_FOREIGN_FIELD;
        case 18: return INVALID_ENUM_VALUE;
        case 19: return DEVELOPER_TOKEN_PARAMETER_MISSING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RequestError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RequestError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RequestError>() {
            public RequestError findValueByNumber(int number) {
              return RequestError.forNumber(number);
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
      return com.google.ads.googleads.v0.errors.RequestErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final RequestError[] VALUES = values();

    public static RequestError valueOf(
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

    private RequestError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.errors.RequestErrorEnum.RequestError)
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
    if (!(obj instanceof com.google.ads.googleads.v0.errors.RequestErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.errors.RequestErrorEnum other = (com.google.ads.googleads.v0.errors.RequestErrorEnum) obj;

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

  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.RequestErrorEnum parseFrom(
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
  public static Builder newBuilder(com.google.ads.googleads.v0.errors.RequestErrorEnum prototype) {
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
   * Container for enum describing possible request errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.errors.RequestErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.errors.RequestErrorEnum)
      com.google.ads.googleads.v0.errors.RequestErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.errors.RequestErrorProto.internal_static_google_ads_googleads_v0_errors_RequestErrorEnum_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.errors.RequestErrorProto.internal_static_google_ads_googleads_v0_errors_RequestErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.errors.RequestErrorEnum.class, com.google.ads.googleads.v0.errors.RequestErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.errors.RequestErrorEnum.newBuilder()
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
      return com.google.ads.googleads.v0.errors.RequestErrorProto.internal_static_google_ads_googleads_v0_errors_RequestErrorEnum_descriptor;
    }

    public com.google.ads.googleads.v0.errors.RequestErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.errors.RequestErrorEnum.getDefaultInstance();
    }

    public com.google.ads.googleads.v0.errors.RequestErrorEnum build() {
      com.google.ads.googleads.v0.errors.RequestErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.ads.googleads.v0.errors.RequestErrorEnum buildPartial() {
      com.google.ads.googleads.v0.errors.RequestErrorEnum result = new com.google.ads.googleads.v0.errors.RequestErrorEnum(this);
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
      if (other instanceof com.google.ads.googleads.v0.errors.RequestErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v0.errors.RequestErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.errors.RequestErrorEnum other) {
      if (other == com.google.ads.googleads.v0.errors.RequestErrorEnum.getDefaultInstance()) return this;
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
      com.google.ads.googleads.v0.errors.RequestErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.errors.RequestErrorEnum) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.errors.RequestErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.errors.RequestErrorEnum)
  private static final com.google.ads.googleads.v0.errors.RequestErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.errors.RequestErrorEnum();
  }

  public static com.google.ads.googleads.v0.errors.RequestErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<RequestErrorEnum>() {
    public RequestErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestErrorEnum> getParserForType() {
    return PARSER;
  }

  public com.google.ads.googleads.v0.errors.RequestErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

