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
 * Describes the Customer-Supplied Encryption Key mechanism used to store an
 * Object's data at rest.
 * </pre>
 *
 * Protobuf type {@code google.storage.v2.CustomerEncryption}
 */
public final class CustomerEncryption extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.storage.v2.CustomerEncryption)
    CustomerEncryptionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CustomerEncryption.newBuilder() to construct.
  private CustomerEncryption(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CustomerEncryption() {
    encryptionAlgorithm_ = "";
    keySha256Bytes_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CustomerEncryption();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_CustomerEncryption_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.storage.v2.StorageProto
        .internal_static_google_storage_v2_CustomerEncryption_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.storage.v2.CustomerEncryption.class,
            com.google.storage.v2.CustomerEncryption.Builder.class);
  }

  public static final int ENCRYPTION_ALGORITHM_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object encryptionAlgorithm_ = "";
  /**
   *
   *
   * <pre>
   * The encryption algorithm.
   * </pre>
   *
   * <code>string encryption_algorithm = 1;</code>
   *
   * @return The encryptionAlgorithm.
   */
  @java.lang.Override
  public java.lang.String getEncryptionAlgorithm() {
    java.lang.Object ref = encryptionAlgorithm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      encryptionAlgorithm_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The encryption algorithm.
   * </pre>
   *
   * <code>string encryption_algorithm = 1;</code>
   *
   * @return The bytes for encryptionAlgorithm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEncryptionAlgorithmBytes() {
    java.lang.Object ref = encryptionAlgorithm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      encryptionAlgorithm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_SHA256_BYTES_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString keySha256Bytes_ = com.google.protobuf.ByteString.EMPTY;
  /**
   *
   *
   * <pre>
   * SHA256 hash value of the encryption key.
   * In raw bytes format (not base64-encoded).
   * </pre>
   *
   * <code>bytes key_sha256_bytes = 3;</code>
   *
   * @return The keySha256Bytes.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeySha256Bytes() {
    return keySha256Bytes_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encryptionAlgorithm_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, encryptionAlgorithm_);
    }
    if (!keySha256Bytes_.isEmpty()) {
      output.writeBytes(3, keySha256Bytes_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(encryptionAlgorithm_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, encryptionAlgorithm_);
    }
    if (!keySha256Bytes_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(3, keySha256Bytes_);
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
    if (!(obj instanceof com.google.storage.v2.CustomerEncryption)) {
      return super.equals(obj);
    }
    com.google.storage.v2.CustomerEncryption other = (com.google.storage.v2.CustomerEncryption) obj;

    if (!getEncryptionAlgorithm().equals(other.getEncryptionAlgorithm())) return false;
    if (!getKeySha256Bytes().equals(other.getKeySha256Bytes())) return false;
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
    hash = (37 * hash) + ENCRYPTION_ALGORITHM_FIELD_NUMBER;
    hash = (53 * hash) + getEncryptionAlgorithm().hashCode();
    hash = (37 * hash) + KEY_SHA256_BYTES_FIELD_NUMBER;
    hash = (53 * hash) + getKeySha256Bytes().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.CustomerEncryption parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.CustomerEncryption parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.storage.v2.CustomerEncryption parseFrom(
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

  public static Builder newBuilder(com.google.storage.v2.CustomerEncryption prototype) {
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
   * Describes the Customer-Supplied Encryption Key mechanism used to store an
   * Object's data at rest.
   * </pre>
   *
   * Protobuf type {@code google.storage.v2.CustomerEncryption}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.storage.v2.CustomerEncryption)
      com.google.storage.v2.CustomerEncryptionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_CustomerEncryption_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_CustomerEncryption_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.storage.v2.CustomerEncryption.class,
              com.google.storage.v2.CustomerEncryption.Builder.class);
    }

    // Construct using com.google.storage.v2.CustomerEncryption.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      encryptionAlgorithm_ = "";
      keySha256Bytes_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.storage.v2.StorageProto
          .internal_static_google_storage_v2_CustomerEncryption_descriptor;
    }

    @java.lang.Override
    public com.google.storage.v2.CustomerEncryption getDefaultInstanceForType() {
      return com.google.storage.v2.CustomerEncryption.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.storage.v2.CustomerEncryption build() {
      com.google.storage.v2.CustomerEncryption result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.storage.v2.CustomerEncryption buildPartial() {
      com.google.storage.v2.CustomerEncryption result =
          new com.google.storage.v2.CustomerEncryption(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.storage.v2.CustomerEncryption result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.encryptionAlgorithm_ = encryptionAlgorithm_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keySha256Bytes_ = keySha256Bytes_;
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
      if (other instanceof com.google.storage.v2.CustomerEncryption) {
        return mergeFrom((com.google.storage.v2.CustomerEncryption) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.storage.v2.CustomerEncryption other) {
      if (other == com.google.storage.v2.CustomerEncryption.getDefaultInstance()) return this;
      if (!other.getEncryptionAlgorithm().isEmpty()) {
        encryptionAlgorithm_ = other.encryptionAlgorithm_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getKeySha256Bytes() != com.google.protobuf.ByteString.EMPTY) {
        setKeySha256Bytes(other.getKeySha256Bytes());
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
            case 10:
              {
                encryptionAlgorithm_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                keySha256Bytes_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
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

    private int bitField0_;

    private java.lang.Object encryptionAlgorithm_ = "";
    /**
     *
     *
     * <pre>
     * The encryption algorithm.
     * </pre>
     *
     * <code>string encryption_algorithm = 1;</code>
     *
     * @return The encryptionAlgorithm.
     */
    public java.lang.String getEncryptionAlgorithm() {
      java.lang.Object ref = encryptionAlgorithm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        encryptionAlgorithm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The encryption algorithm.
     * </pre>
     *
     * <code>string encryption_algorithm = 1;</code>
     *
     * @return The bytes for encryptionAlgorithm.
     */
    public com.google.protobuf.ByteString getEncryptionAlgorithmBytes() {
      java.lang.Object ref = encryptionAlgorithm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        encryptionAlgorithm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The encryption algorithm.
     * </pre>
     *
     * <code>string encryption_algorithm = 1;</code>
     *
     * @param value The encryptionAlgorithm to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionAlgorithm(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      encryptionAlgorithm_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encryption algorithm.
     * </pre>
     *
     * <code>string encryption_algorithm = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEncryptionAlgorithm() {
      encryptionAlgorithm_ = getDefaultInstance().getEncryptionAlgorithm();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encryption algorithm.
     * </pre>
     *
     * <code>string encryption_algorithm = 1;</code>
     *
     * @param value The bytes for encryptionAlgorithm to set.
     * @return This builder for chaining.
     */
    public Builder setEncryptionAlgorithmBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      encryptionAlgorithm_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString keySha256Bytes_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * SHA256 hash value of the encryption key.
     * In raw bytes format (not base64-encoded).
     * </pre>
     *
     * <code>bytes key_sha256_bytes = 3;</code>
     *
     * @return The keySha256Bytes.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getKeySha256Bytes() {
      return keySha256Bytes_;
    }
    /**
     *
     *
     * <pre>
     * SHA256 hash value of the encryption key.
     * In raw bytes format (not base64-encoded).
     * </pre>
     *
     * <code>bytes key_sha256_bytes = 3;</code>
     *
     * @param value The keySha256Bytes to set.
     * @return This builder for chaining.
     */
    public Builder setKeySha256Bytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      keySha256Bytes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * SHA256 hash value of the encryption key.
     * In raw bytes format (not base64-encoded).
     * </pre>
     *
     * <code>bytes key_sha256_bytes = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKeySha256Bytes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      keySha256Bytes_ = getDefaultInstance().getKeySha256Bytes();
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

    // @@protoc_insertion_point(builder_scope:google.storage.v2.CustomerEncryption)
  }

  // @@protoc_insertion_point(class_scope:google.storage.v2.CustomerEncryption)
  private static final com.google.storage.v2.CustomerEncryption DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.storage.v2.CustomerEncryption();
  }

  public static com.google.storage.v2.CustomerEncryption getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomerEncryption> PARSER =
      new com.google.protobuf.AbstractParser<CustomerEncryption>() {
        @java.lang.Override
        public CustomerEncryption parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomerEncryption> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomerEncryption> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.storage.v2.CustomerEncryption getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}