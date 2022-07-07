/*
 * Copyright 2020 Google LLC
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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/response_params.proto

package com.google.bigtable.v2;

/**
 *
 *
 * <pre>
 * Response metadata proto
 * This is an experimental feature that will be used to get zone_id and
 * cluster_id from response trailers to tag the metrics. This should not be
 * used by customers directly
 * </pre>
 *
 * Protobuf type {@code google.bigtable.v2.ResponseParams}
 */
public final class ResponseParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.v2.ResponseParams)
    ResponseParamsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResponseParams.newBuilder() to construct.
  private ResponseParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResponseParams() {
    zoneId_ = "";
    clusterId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResponseParams();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ResponseParams(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              zoneId_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              clusterId_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.v2.ResponseParamsProto
        .internal_static_google_bigtable_v2_ResponseParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.v2.ResponseParamsProto
        .internal_static_google_bigtable_v2_ResponseParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.v2.ResponseParams.class,
            com.google.bigtable.v2.ResponseParams.Builder.class);
  }

  private int bitField0_;
  public static final int ZONE_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object zoneId_;
  /**
   *
   *
   * <pre>
   * The cloud bigtable zone associated with the cluster.
   * </pre>
   *
   * <code>optional string zone_id = 1;</code>
   *
   * @return Whether the zoneId field is set.
   */
  @java.lang.Override
  public boolean hasZoneId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The cloud bigtable zone associated with the cluster.
   * </pre>
   *
   * <code>optional string zone_id = 1;</code>
   *
   * @return The zoneId.
   */
  @java.lang.Override
  public java.lang.String getZoneId() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zoneId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The cloud bigtable zone associated with the cluster.
   * </pre>
   *
   * <code>optional string zone_id = 1;</code>
   *
   * @return The bytes for zoneId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getZoneIdBytes() {
    java.lang.Object ref = zoneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zoneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object clusterId_;
  /**
   *
   *
   * <pre>
   * Identifier for a cluster that represents set of
   * bigtable resources.
   * </pre>
   *
   * <code>optional string cluster_id = 2;</code>
   *
   * @return Whether the clusterId field is set.
   */
  @java.lang.Override
  public boolean hasClusterId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Identifier for a cluster that represents set of
   * bigtable resources.
   * </pre>
   *
   * <code>optional string cluster_id = 2;</code>
   *
   * @return The clusterId.
   */
  @java.lang.Override
  public java.lang.String getClusterId() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Identifier for a cluster that represents set of
   * bigtable resources.
   * </pre>
   *
   * <code>optional string cluster_id = 2;</code>
   *
   * @return The bytes for clusterId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getClusterIdBytes() {
    java.lang.Object ref = clusterId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      clusterId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, zoneId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, clusterId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, zoneId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, clusterId_);
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
    if (!(obj instanceof com.google.bigtable.v2.ResponseParams)) {
      return super.equals(obj);
    }
    com.google.bigtable.v2.ResponseParams other = (com.google.bigtable.v2.ResponseParams) obj;

    if (hasZoneId() != other.hasZoneId()) return false;
    if (hasZoneId()) {
      if (!getZoneId().equals(other.getZoneId())) return false;
    }
    if (hasClusterId() != other.hasClusterId()) return false;
    if (hasClusterId()) {
      if (!getClusterId().equals(other.getClusterId())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasZoneId()) {
      hash = (37 * hash) + ZONE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getZoneId().hashCode();
    }
    if (hasClusterId()) {
      hash = (37 * hash) + CLUSTER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getClusterId().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ResponseParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ResponseParams parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.v2.ResponseParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.v2.ResponseParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response metadata proto
   * This is an experimental feature that will be used to get zone_id and
   * cluster_id from response trailers to tag the metrics. This should not be
   * used by customers directly
   * </pre>
   *
   * Protobuf type {@code google.bigtable.v2.ResponseParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.v2.ResponseParams)
      com.google.bigtable.v2.ResponseParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.v2.ResponseParamsProto
          .internal_static_google_bigtable_v2_ResponseParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.v2.ResponseParamsProto
          .internal_static_google_bigtable_v2_ResponseParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.v2.ResponseParams.class,
              com.google.bigtable.v2.ResponseParams.Builder.class);
    }

    // Construct using com.google.bigtable.v2.ResponseParams.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      zoneId_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      clusterId_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.v2.ResponseParamsProto
          .internal_static_google_bigtable_v2_ResponseParams_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ResponseParams getDefaultInstanceForType() {
      return com.google.bigtable.v2.ResponseParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.v2.ResponseParams build() {
      com.google.bigtable.v2.ResponseParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.v2.ResponseParams buildPartial() {
      com.google.bigtable.v2.ResponseParams result =
          new com.google.bigtable.v2.ResponseParams(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        to_bitField0_ |= 0x00000001;
      }
      result.zoneId_ = zoneId_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        to_bitField0_ |= 0x00000002;
      }
      result.clusterId_ = clusterId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.v2.ResponseParams) {
        return mergeFrom((com.google.bigtable.v2.ResponseParams) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.v2.ResponseParams other) {
      if (other == com.google.bigtable.v2.ResponseParams.getDefaultInstance()) return this;
      if (other.hasZoneId()) {
        bitField0_ |= 0x00000001;
        zoneId_ = other.zoneId_;
        onChanged();
      }
      if (other.hasClusterId()) {
        bitField0_ |= 0x00000002;
        clusterId_ = other.clusterId_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.bigtable.v2.ResponseParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.bigtable.v2.ResponseParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.lang.Object zoneId_ = "";
    /**
     *
     *
     * <pre>
     * The cloud bigtable zone associated with the cluster.
     * </pre>
     *
     * <code>optional string zone_id = 1;</code>
     *
     * @return Whether the zoneId field is set.
     */
    public boolean hasZoneId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The cloud bigtable zone associated with the cluster.
     * </pre>
     *
     * <code>optional string zone_id = 1;</code>
     *
     * @return The zoneId.
     */
    public java.lang.String getZoneId() {
      java.lang.Object ref = zoneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zoneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The cloud bigtable zone associated with the cluster.
     * </pre>
     *
     * <code>optional string zone_id = 1;</code>
     *
     * @return The bytes for zoneId.
     */
    public com.google.protobuf.ByteString getZoneIdBytes() {
      java.lang.Object ref = zoneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zoneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The cloud bigtable zone associated with the cluster.
     * </pre>
     *
     * <code>optional string zone_id = 1;</code>
     *
     * @param value The zoneId to set.
     * @return This builder for chaining.
     */
    public Builder setZoneId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      zoneId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cloud bigtable zone associated with the cluster.
     * </pre>
     *
     * <code>optional string zone_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZoneId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      zoneId_ = getDefaultInstance().getZoneId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The cloud bigtable zone associated with the cluster.
     * </pre>
     *
     * <code>optional string zone_id = 1;</code>
     *
     * @param value The bytes for zoneId to set.
     * @return This builder for chaining.
     */
    public Builder setZoneIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000001;
      zoneId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clusterId_ = "";
    /**
     *
     *
     * <pre>
     * Identifier for a cluster that represents set of
     * bigtable resources.
     * </pre>
     *
     * <code>optional string cluster_id = 2;</code>
     *
     * @return Whether the clusterId field is set.
     */
    public boolean hasClusterId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Identifier for a cluster that represents set of
     * bigtable resources.
     * </pre>
     *
     * <code>optional string cluster_id = 2;</code>
     *
     * @return The clusterId.
     */
    public java.lang.String getClusterId() {
      java.lang.Object ref = clusterId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier for a cluster that represents set of
     * bigtable resources.
     * </pre>
     *
     * <code>optional string cluster_id = 2;</code>
     *
     * @return The bytes for clusterId.
     */
    public com.google.protobuf.ByteString getClusterIdBytes() {
      java.lang.Object ref = clusterId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        clusterId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Identifier for a cluster that represents set of
     * bigtable resources.
     * </pre>
     *
     * <code>optional string cluster_id = 2;</code>
     *
     * @param value The clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      clusterId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier for a cluster that represents set of
     * bigtable resources.
     * </pre>
     *
     * <code>optional string cluster_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clusterId_ = getDefaultInstance().getClusterId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Identifier for a cluster that represents set of
     * bigtable resources.
     * </pre>
     *
     * <code>optional string cluster_id = 2;</code>
     *
     * @param value The bytes for clusterId to set.
     * @return This builder for chaining.
     */
    public Builder setClusterIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      bitField0_ |= 0x00000002;
      clusterId_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.v2.ResponseParams)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.v2.ResponseParams)
  private static final com.google.bigtable.v2.ResponseParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.v2.ResponseParams();
  }

  public static com.google.bigtable.v2.ResponseParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseParams> PARSER =
      new com.google.protobuf.AbstractParser<ResponseParams>() {
        @java.lang.Override
        public ResponseParams parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ResponseParams(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ResponseParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.v2.ResponseParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
