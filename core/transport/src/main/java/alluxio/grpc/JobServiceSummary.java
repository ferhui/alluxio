// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

/**
 * Protobuf type {@code alluxio.grpc.job.JobServiceSummary}
 */
public  final class JobServiceSummary extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:alluxio.grpc.job.JobServiceSummary)
    JobServiceSummaryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use JobServiceSummary.newBuilder() to construct.
  private JobServiceSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private JobServiceSummary() {
    summaryPerStatus_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private JobServiceSummary(
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
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              summaryPerStatus_ = new java.util.ArrayList<alluxio.grpc.StatusSummary>();
              mutable_bitField0_ |= 0x00000001;
            }
            summaryPerStatus_.add(
                input.readMessage(alluxio.grpc.StatusSummary.PARSER, extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        summaryPerStatus_ = java.util.Collections.unmodifiableList(summaryPerStatus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobServiceSummary_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobServiceSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            alluxio.grpc.JobServiceSummary.class, alluxio.grpc.JobServiceSummary.Builder.class);
  }

  public static final int SUMMARYPERSTATUS_FIELD_NUMBER = 1;
  private java.util.List<alluxio.grpc.StatusSummary> summaryPerStatus_;
  /**
   * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
   */
  public java.util.List<alluxio.grpc.StatusSummary> getSummaryPerStatusList() {
    return summaryPerStatus_;
  }
  /**
   * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
   */
  public java.util.List<? extends alluxio.grpc.StatusSummaryOrBuilder> 
      getSummaryPerStatusOrBuilderList() {
    return summaryPerStatus_;
  }
  /**
   * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
   */
  public int getSummaryPerStatusCount() {
    return summaryPerStatus_.size();
  }
  /**
   * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
   */
  public alluxio.grpc.StatusSummary getSummaryPerStatus(int index) {
    return summaryPerStatus_.get(index);
  }
  /**
   * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
   */
  public alluxio.grpc.StatusSummaryOrBuilder getSummaryPerStatusOrBuilder(
      int index) {
    return summaryPerStatus_.get(index);
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
    for (int i = 0; i < summaryPerStatus_.size(); i++) {
      output.writeMessage(1, summaryPerStatus_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < summaryPerStatus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, summaryPerStatus_.get(i));
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
    if (!(obj instanceof alluxio.grpc.JobServiceSummary)) {
      return super.equals(obj);
    }
    alluxio.grpc.JobServiceSummary other = (alluxio.grpc.JobServiceSummary) obj;

    boolean result = true;
    result = result && getSummaryPerStatusList()
        .equals(other.getSummaryPerStatusList());
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
    if (getSummaryPerStatusCount() > 0) {
      hash = (37 * hash) + SUMMARYPERSTATUS_FIELD_NUMBER;
      hash = (53 * hash) + getSummaryPerStatusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static alluxio.grpc.JobServiceSummary parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.JobServiceSummary parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static alluxio.grpc.JobServiceSummary parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static alluxio.grpc.JobServiceSummary parseFrom(
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
  public static Builder newBuilder(alluxio.grpc.JobServiceSummary prototype) {
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
   * Protobuf type {@code alluxio.grpc.job.JobServiceSummary}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:alluxio.grpc.job.JobServiceSummary)
      alluxio.grpc.JobServiceSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobServiceSummary_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobServiceSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              alluxio.grpc.JobServiceSummary.class, alluxio.grpc.JobServiceSummary.Builder.class);
    }

    // Construct using alluxio.grpc.JobServiceSummary.newBuilder()
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
        getSummaryPerStatusFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (summaryPerStatusBuilder_ == null) {
        summaryPerStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        summaryPerStatusBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return alluxio.grpc.JobMasterProto.internal_static_alluxio_grpc_job_JobServiceSummary_descriptor;
    }

    public alluxio.grpc.JobServiceSummary getDefaultInstanceForType() {
      return alluxio.grpc.JobServiceSummary.getDefaultInstance();
    }

    public alluxio.grpc.JobServiceSummary build() {
      alluxio.grpc.JobServiceSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public alluxio.grpc.JobServiceSummary buildPartial() {
      alluxio.grpc.JobServiceSummary result = new alluxio.grpc.JobServiceSummary(this);
      int from_bitField0_ = bitField0_;
      if (summaryPerStatusBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          summaryPerStatus_ = java.util.Collections.unmodifiableList(summaryPerStatus_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.summaryPerStatus_ = summaryPerStatus_;
      } else {
        result.summaryPerStatus_ = summaryPerStatusBuilder_.build();
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
      if (other instanceof alluxio.grpc.JobServiceSummary) {
        return mergeFrom((alluxio.grpc.JobServiceSummary)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(alluxio.grpc.JobServiceSummary other) {
      if (other == alluxio.grpc.JobServiceSummary.getDefaultInstance()) return this;
      if (summaryPerStatusBuilder_ == null) {
        if (!other.summaryPerStatus_.isEmpty()) {
          if (summaryPerStatus_.isEmpty()) {
            summaryPerStatus_ = other.summaryPerStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSummaryPerStatusIsMutable();
            summaryPerStatus_.addAll(other.summaryPerStatus_);
          }
          onChanged();
        }
      } else {
        if (!other.summaryPerStatus_.isEmpty()) {
          if (summaryPerStatusBuilder_.isEmpty()) {
            summaryPerStatusBuilder_.dispose();
            summaryPerStatusBuilder_ = null;
            summaryPerStatus_ = other.summaryPerStatus_;
            bitField0_ = (bitField0_ & ~0x00000001);
            summaryPerStatusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSummaryPerStatusFieldBuilder() : null;
          } else {
            summaryPerStatusBuilder_.addAllMessages(other.summaryPerStatus_);
          }
        }
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
      alluxio.grpc.JobServiceSummary parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (alluxio.grpc.JobServiceSummary) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<alluxio.grpc.StatusSummary> summaryPerStatus_ =
      java.util.Collections.emptyList();
    private void ensureSummaryPerStatusIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        summaryPerStatus_ = new java.util.ArrayList<alluxio.grpc.StatusSummary>(summaryPerStatus_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.StatusSummary, alluxio.grpc.StatusSummary.Builder, alluxio.grpc.StatusSummaryOrBuilder> summaryPerStatusBuilder_;

    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public java.util.List<alluxio.grpc.StatusSummary> getSummaryPerStatusList() {
      if (summaryPerStatusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(summaryPerStatus_);
      } else {
        return summaryPerStatusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public int getSummaryPerStatusCount() {
      if (summaryPerStatusBuilder_ == null) {
        return summaryPerStatus_.size();
      } else {
        return summaryPerStatusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public alluxio.grpc.StatusSummary getSummaryPerStatus(int index) {
      if (summaryPerStatusBuilder_ == null) {
        return summaryPerStatus_.get(index);
      } else {
        return summaryPerStatusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder setSummaryPerStatus(
        int index, alluxio.grpc.StatusSummary value) {
      if (summaryPerStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.set(index, value);
        onChanged();
      } else {
        summaryPerStatusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder setSummaryPerStatus(
        int index, alluxio.grpc.StatusSummary.Builder builderForValue) {
      if (summaryPerStatusBuilder_ == null) {
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.set(index, builderForValue.build());
        onChanged();
      } else {
        summaryPerStatusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder addSummaryPerStatus(alluxio.grpc.StatusSummary value) {
      if (summaryPerStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.add(value);
        onChanged();
      } else {
        summaryPerStatusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder addSummaryPerStatus(
        int index, alluxio.grpc.StatusSummary value) {
      if (summaryPerStatusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.add(index, value);
        onChanged();
      } else {
        summaryPerStatusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder addSummaryPerStatus(
        alluxio.grpc.StatusSummary.Builder builderForValue) {
      if (summaryPerStatusBuilder_ == null) {
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.add(builderForValue.build());
        onChanged();
      } else {
        summaryPerStatusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder addSummaryPerStatus(
        int index, alluxio.grpc.StatusSummary.Builder builderForValue) {
      if (summaryPerStatusBuilder_ == null) {
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.add(index, builderForValue.build());
        onChanged();
      } else {
        summaryPerStatusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder addAllSummaryPerStatus(
        java.lang.Iterable<? extends alluxio.grpc.StatusSummary> values) {
      if (summaryPerStatusBuilder_ == null) {
        ensureSummaryPerStatusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, summaryPerStatus_);
        onChanged();
      } else {
        summaryPerStatusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder clearSummaryPerStatus() {
      if (summaryPerStatusBuilder_ == null) {
        summaryPerStatus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        summaryPerStatusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public Builder removeSummaryPerStatus(int index) {
      if (summaryPerStatusBuilder_ == null) {
        ensureSummaryPerStatusIsMutable();
        summaryPerStatus_.remove(index);
        onChanged();
      } else {
        summaryPerStatusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public alluxio.grpc.StatusSummary.Builder getSummaryPerStatusBuilder(
        int index) {
      return getSummaryPerStatusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public alluxio.grpc.StatusSummaryOrBuilder getSummaryPerStatusOrBuilder(
        int index) {
      if (summaryPerStatusBuilder_ == null) {
        return summaryPerStatus_.get(index);  } else {
        return summaryPerStatusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public java.util.List<? extends alluxio.grpc.StatusSummaryOrBuilder> 
         getSummaryPerStatusOrBuilderList() {
      if (summaryPerStatusBuilder_ != null) {
        return summaryPerStatusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(summaryPerStatus_);
      }
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public alluxio.grpc.StatusSummary.Builder addSummaryPerStatusBuilder() {
      return getSummaryPerStatusFieldBuilder().addBuilder(
          alluxio.grpc.StatusSummary.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public alluxio.grpc.StatusSummary.Builder addSummaryPerStatusBuilder(
        int index) {
      return getSummaryPerStatusFieldBuilder().addBuilder(
          index, alluxio.grpc.StatusSummary.getDefaultInstance());
    }
    /**
     * <code>repeated .alluxio.grpc.job.StatusSummary summaryPerStatus = 1;</code>
     */
    public java.util.List<alluxio.grpc.StatusSummary.Builder> 
         getSummaryPerStatusBuilderList() {
      return getSummaryPerStatusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        alluxio.grpc.StatusSummary, alluxio.grpc.StatusSummary.Builder, alluxio.grpc.StatusSummaryOrBuilder> 
        getSummaryPerStatusFieldBuilder() {
      if (summaryPerStatusBuilder_ == null) {
        summaryPerStatusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            alluxio.grpc.StatusSummary, alluxio.grpc.StatusSummary.Builder, alluxio.grpc.StatusSummaryOrBuilder>(
                summaryPerStatus_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        summaryPerStatus_ = null;
      }
      return summaryPerStatusBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:alluxio.grpc.job.JobServiceSummary)
  }

  // @@protoc_insertion_point(class_scope:alluxio.grpc.job.JobServiceSummary)
  private static final alluxio.grpc.JobServiceSummary DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new alluxio.grpc.JobServiceSummary();
  }

  public static alluxio.grpc.JobServiceSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<JobServiceSummary>
      PARSER = new com.google.protobuf.AbstractParser<JobServiceSummary>() {
    public JobServiceSummary parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new JobServiceSummary(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<JobServiceSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JobServiceSummary> getParserForType() {
    return PARSER;
  }

  public alluxio.grpc.JobServiceSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

