/*
 * Copyright 2024 Google LLC
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
// source: google/storage/v2/storage.proto

// Protobuf Java Version: 3.25.5
package com.google.storage.v2;

/**
 *
 *
 * <pre>
 * Response object for `QueryWriteStatus`.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.QueryWriteStatusResponse}
 */
public final class QueryWriteStatusResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.QueryWriteStatusResponse)
    QueryWriteStatusResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use QueryWriteStatusResponse.newBuilder() to construct.
  private QueryWriteStatusResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private QueryWriteStatusResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new QueryWriteStatusResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_QueryWriteStatusResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_QueryWriteStatusResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.QueryWriteStatusResponse.class,
            com.google.storage.v2.QueryWriteStatusResponse.Builder.class);
  }

  private int writeStatusCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object writeStatus_;

  public enum WriteStatusCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    PERSISTED_SIZE(1),
    RESOURCE(2),
    WRITESTATUS_NOT_SET(0);
    private final int value;

    private WriteStatusCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static WriteStatusCase valueOf(int value) {
      return forNumber(value);
    }

    public static WriteStatusCase forNumber(int value) {
      switch (value) {
        case 1:
          return PERSISTED_SIZE;
        case 2:
          return RESOURCE;
        case 0:
          return WRITESTATUS_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public WriteStatusCase getWriteStatusCase() {
    return WriteStatusCase.forNumber(writeStatusCase_);
  }

  public static final int PERSISTED_SIZE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * The total number of bytes that have been processed for the given object
   * from all `WriteObject` calls. This is the correct value for the
   * 'write_offset' field to use when resuming the `WriteObject` operation.
   * Only set if the upload has not finalized.
   * </pre>
   *
   * <code>int64 persisted_size = 1;</code>
   *
   * @return Whether the persistedSize field is set.
   */
  @java.lang.Override
  public boolean hasPersistedSize() {
    return writeStatusCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * The total number of bytes that have been processed for the given object
   * from all `WriteObject` calls. This is the correct value for the
   * 'write_offset' field to use when resuming the `WriteObject` operation.
   * Only set if the upload has not finalized.
   * </pre>
   *
   * <code>int64 persisted_size = 1;</code>
   *
   * @return The persistedSize.
   */
  @java.lang.Override
  public long getPersistedSize() {
    if (writeStatusCase_ == 1) {
      return (java.lang.Long) writeStatus_;
    }
    return 0L;
  }

  public static final int RESOURCE_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * A resource containing the metadata for the uploaded object. Only set if
   * the upload has finalized.
   * </pre>
   *
   * <code>.google.storage.v2.Object resource = 2;</code>
   *
   * @return Whether the resource field is set.
   */
  @java.lang.Override
  public boolean hasResource() {
    return writeStatusCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * A resource containing the metadata for the uploaded object. Only set if
   * the upload has finalized.
   * </pre>
   *
   * <code>.google.storage.v2.Object resource = 2;</code>
   *
   * @return The resource.
   */
  @java.lang.Override
  public com.google.storage.v2.Object getResource() {
    if (writeStatusCase_ == 2) {
      return (com.google.storage.v2.Object) writeStatus_;
    }
    return com.google.storage.v2.Object.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * A resource containing the metadata for the uploaded object. Only set if
   * the upload has finalized.
   * </pre>
   *
   * <code>.google.storage.v2.Object resource = 2;</code>
   */
  @java.lang.Override
  public com.google.storage.v2.ObjectOrBuilder getResourceOrBuilder() {
    if (writeStatusCase_ == 2) {
      return (com.google.storage.v2.Object) writeStatus_;
    }
    return com.google.storage.v2.Object.getDefaultInstance();
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
    if (writeStatusCase_ == 1) {
      output.writeInt64(1, (long) ((java.lang.Long) writeStatus_));
    }
    if (writeStatusCase_ == 2) {
      output.writeMessage(2, (com.google.storage.v2.Object) writeStatus_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (writeStatusCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeInt64Size(
              1, (long) ((java.lang.Long) writeStatus_));
    }
    if (writeStatusCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.storage.v2.Object) writeStatus_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.storage.v2.QueryWriteStatusResponse)) {
      return super.equals(obj);
    }
    com.google.storage.v2.QueryWriteStatusResponse other =
        (com.google.storage.v2.QueryWriteStatusResponse) obj;

    if (!getWriteStatusCase().equals(other.getWriteStatusCase())) return false;
    switch (writeStatusCase_) {
      case 1:
        if (getPersistedSize() != other.getPersistedSize()) return false;
        break;
      case 2:
        if (!getResource().equals(other.getResource())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (writeStatusCase_) {
      case 1:
        hash = (37 * hash) + PERSISTED_SIZE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getPersistedSize());
        break;
      case 2:
        hash = (37 * hash) + RESOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getResource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.QueryWriteStatusResponse parseFrom(
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

  public static Builder newBuilder(com.google.storage.v2.QueryWriteStatusResponse prototype) {
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
   * Response object for `QueryWriteStatus`.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.QueryWriteStatusResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.QueryWriteStatusResponse)
      com.google.storage.v2.QueryWriteStatusResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_QueryWriteStatusResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_QueryWriteStatusResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.QueryWriteStatusResponse.class,
              com.google.storage.v2.QueryWriteStatusResponse.Builder.class);
    }

    // Construct using com.google.storage.v2.QueryWriteStatusResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (resourceBuilder_ != null) {
        resourceBuilder_.clear();
      }
      writeStatusCase_ = 0;
      writeStatus_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_QueryWriteStatusResponse_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.QueryWriteStatusResponse getDefaultInstanceForType() {
      return com.google.storage.v2.QueryWriteStatusResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.QueryWriteStatusResponse build() {
      com.google.storage.v2.QueryWriteStatusResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.QueryWriteStatusResponse buildPartial() {
      com.google.storage.v2.QueryWriteStatusResponse result =
          new com.google.storage.v2.QueryWriteStatusResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v2.QueryWriteStatusResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.storage.v2.QueryWriteStatusResponse result) {
      result.writeStatusCase_ = writeStatusCase_;
      result.writeStatus_ = this.writeStatus_;
      if (writeStatusCase_ == 2 && resourceBuilder_ != null) {
        result.writeStatus_ = resourceBuilder_.build();
      }
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
      if (other instanceof com.google.storage.v2.QueryWriteStatusResponse) {
        return mergeFrom((com.google.storage.v2.QueryWriteStatusResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.QueryWriteStatusResponse other) {
      if (other == com.google.storage.v2.QueryWriteStatusResponse.getDefaultInstance()) return this;
      switch (other.getWriteStatusCase()) {
        case PERSISTED_SIZE:
          {
            setPersistedSize(other.getPersistedSize());
            break;
          }
        case RESOURCE:
          {
            mergeResource(other.getResource());
            break;
          }
        case WRITESTATUS_NOT_SET:
          {
            break;
          }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                writeStatus_ = input.readInt64();
                writeStatusCase_ = 1;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(getResourceFieldBuilder().getBuilder(), extensionRegistry);
                writeStatusCase_ = 2;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int writeStatusCase_ = 0;
    private java.lang.Object writeStatus_;

    public WriteStatusCase getWriteStatusCase() {
      return WriteStatusCase.forNumber(writeStatusCase_);
    }

    public Builder clearWriteStatus() {
      writeStatusCase_ = 0;
      writeStatus_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * The total number of bytes that have been processed for the given object
     * from all `WriteObject` calls. This is the correct value for the
     * 'write_offset' field to use when resuming the `WriteObject` operation.
     * Only set if the upload has not finalized.
     * </pre>
     *
     * <code>int64 persisted_size = 1;</code>
     *
     * @return Whether the persistedSize field is set.
     */
    public boolean hasPersistedSize() {
      return writeStatusCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * The total number of bytes that have been processed for the given object
     * from all `WriteObject` calls. This is the correct value for the
     * 'write_offset' field to use when resuming the `WriteObject` operation.
     * Only set if the upload has not finalized.
     * </pre>
     *
     * <code>int64 persisted_size = 1;</code>
     *
     * @return The persistedSize.
     */
    public long getPersistedSize() {
      if (writeStatusCase_ == 1) {
        return (java.lang.Long) writeStatus_;
      }
      return 0L;
    }
    /**
     *
     *
     * <pre>
     * The total number of bytes that have been processed for the given object
     * from all `WriteObject` calls. This is the correct value for the
     * 'write_offset' field to use when resuming the `WriteObject` operation.
     * Only set if the upload has not finalized.
     * </pre>
     *
     * <code>int64 persisted_size = 1;</code>
     *
     * @param value The persistedSize to set.
     * @return This builder for chaining.
     */
    public Builder setPersistedSize(long value) {

      writeStatusCase_ = 1;
      writeStatus_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of bytes that have been processed for the given object
     * from all `WriteObject` calls. This is the correct value for the
     * 'write_offset' field to use when resuming the `WriteObject` operation.
     * Only set if the upload has not finalized.
     * </pre>
     *
     * <code>int64 persisted_size = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPersistedSize() {
      if (writeStatusCase_ == 1) {
        writeStatusCase_ = 0;
        writeStatus_ = null;
        onChanged();
      }
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.Object,
            com.google.storage.v2.Object.Builder,
            com.google.storage.v2.ObjectOrBuilder>
        resourceBuilder_;
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     *
     * @return Whether the resource field is set.
     */
    @java.lang.Override
    public boolean hasResource() {
      return writeStatusCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     *
     * @return The resource.
     */
    @java.lang.Override
    public com.google.storage.v2.Object getResource() {
      if (resourceBuilder_ == null) {
        if (writeStatusCase_ == 2) {
          return (com.google.storage.v2.Object) writeStatus_;
        }
        return com.google.storage.v2.Object.getDefaultInstance();
      } else {
        if (writeStatusCase_ == 2) {
          return resourceBuilder_.getMessage();
        }
        return com.google.storage.v2.Object.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    public Builder setResource(com.google.storage.v2.Object value) {
      if (resourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        writeStatus_ = value;
        onChanged();
      } else {
        resourceBuilder_.setMessage(value);
      }
      writeStatusCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    public Builder setResource(com.google.storage.v2.Object.Builder builderForValue) {
      if (resourceBuilder_ == null) {
        writeStatus_ = builderForValue.build();
        onChanged();
      } else {
        resourceBuilder_.setMessage(builderForValue.build());
      }
      writeStatusCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    public Builder mergeResource(com.google.storage.v2.Object value) {
      if (resourceBuilder_ == null) {
        if (writeStatusCase_ == 2
            && writeStatus_ != com.google.storage.v2.Object.getDefaultInstance()) {
          writeStatus_ =
              com.google.storage.v2.Object.newBuilder((com.google.storage.v2.Object) writeStatus_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          writeStatus_ = value;
        }
        onChanged();
      } else {
        if (writeStatusCase_ == 2) {
          resourceBuilder_.mergeFrom(value);
        } else {
          resourceBuilder_.setMessage(value);
        }
      }
      writeStatusCase_ = 2;
      return this;
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    public Builder clearResource() {
      if (resourceBuilder_ == null) {
        if (writeStatusCase_ == 2) {
          writeStatusCase_ = 0;
          writeStatus_ = null;
          onChanged();
        }
      } else {
        if (writeStatusCase_ == 2) {
          writeStatusCase_ = 0;
          writeStatus_ = null;
        }
        resourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    public com.google.storage.v2.Object.Builder getResourceBuilder() {
      return getResourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    @java.lang.Override
    public com.google.storage.v2.ObjectOrBuilder getResourceOrBuilder() {
      if ((writeStatusCase_ == 2) && (resourceBuilder_ != null)) {
        return resourceBuilder_.getMessageOrBuilder();
      } else {
        if (writeStatusCase_ == 2) {
          return (com.google.storage.v2.Object) writeStatus_;
        }
        return com.google.storage.v2.Object.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * A resource containing the metadata for the uploaded object. Only set if
     * the upload has finalized.
     * </pre>
     *
     * <code>.google.storage.v2.Object resource = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.storage.v2.Object,
            com.google.storage.v2.Object.Builder,
            com.google.storage.v2.ObjectOrBuilder>
        getResourceFieldBuilder() {
      if (resourceBuilder_ == null) {
        if (!(writeStatusCase_ == 2)) {
          writeStatus_ = com.google.storage.v2.Object.getDefaultInstance();
        }
        resourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.storage.v2.Object,
                com.google.storage.v2.Object.Builder,
                com.google.storage.v2.ObjectOrBuilder>(
                (com.google.storage.v2.Object) writeStatus_, getParentForChildren(), isClean());
        writeStatus_ = null;
      }
      writeStatusCase_ = 2;
      onChanged();
      return resourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.storage.v2.QueryWriteStatusResponse)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.QueryWriteStatusResponse)
  private static final com.google.storage.v2.QueryWriteStatusResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.QueryWriteStatusResponse();
  }

  public static com.google.storage.v2.QueryWriteStatusResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryWriteStatusResponse> PARSER =
      new com.google.protobuf.AbstractParser<QueryWriteStatusResponse>() {
        @java.lang.Override
        public QueryWriteStatusResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<QueryWriteStatusResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryWriteStatusResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.QueryWriteStatusResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}