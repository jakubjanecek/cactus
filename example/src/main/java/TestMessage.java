// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: test_message.proto

public final class TestMessage {
  private TestMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface DataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Data)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string field = 1;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    boolean hasField();
    /**
     * <code>optional string field = 1;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    java.lang.String getField();
    /**
     * <code>optional string field = 1;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    com.google.protobuf.ByteString
        getFieldBytes();

    /**
     * <code>optional int32 field_int_name = 2;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    boolean hasFieldIntName();
    /**
     * <code>optional int32 field_int_name = 2;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    int getFieldIntName();

    /**
     * <code>optional int32 field_option = 3;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    boolean hasFieldOption();
    /**
     * <code>optional int32 field_option = 3;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    int getFieldOption();

    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    com.google.protobuf.ProtocolStringList
        getFieldStringsList();
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    int getFieldStringsCount();
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    java.lang.String getFieldStrings(int index);
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    com.google.protobuf.ByteString
        getFieldStringsBytes(int index);

    /**
     * <code>repeated int32 field_option_integers = 5;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    java.util.List<java.lang.Integer> getFieldOptionIntegersList();
    /**
     * <code>repeated int32 field_option_integers = 5;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    int getFieldOptionIntegersCount();
    /**
     * <code>repeated int32 field_option_integers = 5;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    int getFieldOptionIntegers(int index);
  }
  /**
   * Protobuf type {@code Data}
   */
  public static final class Data extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:Data)
      DataOrBuilder {
    // Use Data.newBuilder() to construct.
    private Data(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Data(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Data defaultInstance;
    public static Data getDefaultInstance() {
      return defaultInstance;
    }

    public Data getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Data(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              field_ = bs;
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              fieldIntName_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              fieldOption_ = input.readInt32();
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                fieldStrings_ = new com.google.protobuf.LazyStringArrayList();
                mutable_bitField0_ |= 0x00000008;
              }
              fieldStrings_.add(bs);
              break;
            }
            case 40: {
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                fieldOptionIntegers_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              fieldOptionIntegers_.add(input.readInt32());
              break;
            }
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
                fieldOptionIntegers_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000010;
              }
              while (input.getBytesUntilLimit() > 0) {
                fieldOptionIntegers_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          fieldStrings_ = fieldStrings_.getUnmodifiableView();
        }
        if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
          fieldOptionIntegers_ = java.util.Collections.unmodifiableList(fieldOptionIntegers_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return TestMessage.internal_static_Data_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return TestMessage.internal_static_Data_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              TestMessage.Data.class, TestMessage.Data.Builder.class);
    }

    public static com.google.protobuf.Parser<Data> PARSER =
        new com.google.protobuf.AbstractParser<Data>() {
      public Data parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Data(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Data> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int FIELD_FIELD_NUMBER = 1;
    private java.lang.Object field_;
    /**
     * <code>optional string field = 1;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public boolean hasField() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string field = 1;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public java.lang.String getField() {
      java.lang.Object ref = field_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          field_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string field = 1;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFieldBytes() {
      java.lang.Object ref = field_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        field_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FIELD_INT_NAME_FIELD_NUMBER = 2;
    private int fieldIntName_;
    /**
     * <code>optional int32 field_int_name = 2;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public boolean hasFieldIntName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 field_int_name = 2;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public int getFieldIntName() {
      return fieldIntName_;
    }

    public static final int FIELD_OPTION_FIELD_NUMBER = 3;
    private int fieldOption_;
    /**
     * <code>optional int32 field_option = 3;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    public boolean hasFieldOption() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 field_option = 3;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    public int getFieldOption() {
      return fieldOption_;
    }

    public static final int FIELD_STRINGS_FIELD_NUMBER = 4;
    private com.google.protobuf.LazyStringList fieldStrings_;
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public com.google.protobuf.ProtocolStringList
        getFieldStringsList() {
      return fieldStrings_;
    }
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public int getFieldStringsCount() {
      return fieldStrings_.size();
    }
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public java.lang.String getFieldStrings(int index) {
      return fieldStrings_.get(index);
    }
    /**
     * <code>repeated string field_strings = 4;</code>
     *
     * <pre>
     * REQUIRED
     * </pre>
     */
    public com.google.protobuf.ByteString
        getFieldStringsBytes(int index) {
      return fieldStrings_.getByteString(index);
    }

    public static final int FIELD_OPTION_INTEGERS_FIELD_NUMBER = 5;
    private java.util.List<java.lang.Integer> fieldOptionIntegers_;
    /**
     * <code>repeated int32 field_option_integers = 5;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    public java.util.List<java.lang.Integer>
        getFieldOptionIntegersList() {
      return fieldOptionIntegers_;
    }
    /**
     * <code>repeated int32 field_option_integers = 5;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    public int getFieldOptionIntegersCount() {
      return fieldOptionIntegers_.size();
    }
    /**
     * <code>repeated int32 field_option_integers = 5;</code>
     *
     * <pre>
     * OPTIONAL
     * </pre>
     */
    public int getFieldOptionIntegers(int index) {
      return fieldOptionIntegers_.get(index);
    }

    private void initFields() {
      field_ = "";
      fieldIntName_ = 0;
      fieldOption_ = 0;
      fieldStrings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      fieldOptionIntegers_ = java.util.Collections.emptyList();
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
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getFieldBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, fieldIntName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, fieldOption_);
      }
      for (int i = 0; i < fieldStrings_.size(); i++) {
        output.writeBytes(4, fieldStrings_.getByteString(i));
      }
      for (int i = 0; i < fieldOptionIntegers_.size(); i++) {
        output.writeInt32(5, fieldOptionIntegers_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getFieldBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, fieldIntName_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, fieldOption_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fieldStrings_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeBytesSizeNoTag(fieldStrings_.getByteString(i));
        }
        size += dataSize;
        size += 1 * getFieldStringsList().size();
      }
      {
        int dataSize = 0;
        for (int i = 0; i < fieldOptionIntegers_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(fieldOptionIntegers_.get(i));
        }
        size += dataSize;
        size += 1 * getFieldOptionIntegersList().size();
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static TestMessage.Data parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestMessage.Data parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestMessage.Data parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static TestMessage.Data parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static TestMessage.Data parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static TestMessage.Data parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static TestMessage.Data parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static TestMessage.Data parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static TestMessage.Data parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static TestMessage.Data parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(TestMessage.Data prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code Data}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Data)
        TestMessage.DataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return TestMessage.internal_static_Data_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return TestMessage.internal_static_Data_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                TestMessage.Data.class, TestMessage.Data.Builder.class);
      }

      // Construct using TestMessage.Data.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        field_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        fieldIntName_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        fieldOption_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        fieldStrings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        fieldOptionIntegers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return TestMessage.internal_static_Data_descriptor;
      }

      public TestMessage.Data getDefaultInstanceForType() {
        return TestMessage.Data.getDefaultInstance();
      }

      public TestMessage.Data build() {
        TestMessage.Data result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public TestMessage.Data buildPartial() {
        TestMessage.Data result = new TestMessage.Data(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.field_ = field_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.fieldIntName_ = fieldIntName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.fieldOption_ = fieldOption_;
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          fieldStrings_ = fieldStrings_.getUnmodifiableView();
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.fieldStrings_ = fieldStrings_;
        if (((bitField0_ & 0x00000010) == 0x00000010)) {
          fieldOptionIntegers_ = java.util.Collections.unmodifiableList(fieldOptionIntegers_);
          bitField0_ = (bitField0_ & ~0x00000010);
        }
        result.fieldOptionIntegers_ = fieldOptionIntegers_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof TestMessage.Data) {
          return mergeFrom((TestMessage.Data)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(TestMessage.Data other) {
        if (other == TestMessage.Data.getDefaultInstance()) return this;
        if (other.hasField()) {
          bitField0_ |= 0x00000001;
          field_ = other.field_;
          onChanged();
        }
        if (other.hasFieldIntName()) {
          setFieldIntName(other.getFieldIntName());
        }
        if (other.hasFieldOption()) {
          setFieldOption(other.getFieldOption());
        }
        if (!other.fieldStrings_.isEmpty()) {
          if (fieldStrings_.isEmpty()) {
            fieldStrings_ = other.fieldStrings_;
            bitField0_ = (bitField0_ & ~0x00000008);
          } else {
            ensureFieldStringsIsMutable();
            fieldStrings_.addAll(other.fieldStrings_);
          }
          onChanged();
        }
        if (!other.fieldOptionIntegers_.isEmpty()) {
          if (fieldOptionIntegers_.isEmpty()) {
            fieldOptionIntegers_ = other.fieldOptionIntegers_;
            bitField0_ = (bitField0_ & ~0x00000010);
          } else {
            ensureFieldOptionIntegersIsMutable();
            fieldOptionIntegers_.addAll(other.fieldOptionIntegers_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        TestMessage.Data parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (TestMessage.Data) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object field_ = "";
      /**
       * <code>optional string field = 1;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public boolean hasField() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional string field = 1;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public java.lang.String getField() {
        java.lang.Object ref = field_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            field_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string field = 1;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public com.google.protobuf.ByteString
          getFieldBytes() {
        java.lang.Object ref = field_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          field_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string field = 1;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder setField(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        field_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string field = 1;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder clearField() {
        bitField0_ = (bitField0_ & ~0x00000001);
        field_ = getDefaultInstance().getField();
        onChanged();
        return this;
      }
      /**
       * <code>optional string field = 1;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder setFieldBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        field_ = value;
        onChanged();
        return this;
      }

      private int fieldIntName_ ;
      /**
       * <code>optional int32 field_int_name = 2;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public boolean hasFieldIntName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 field_int_name = 2;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public int getFieldIntName() {
        return fieldIntName_;
      }
      /**
       * <code>optional int32 field_int_name = 2;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder setFieldIntName(int value) {
        bitField0_ |= 0x00000002;
        fieldIntName_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 field_int_name = 2;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder clearFieldIntName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        fieldIntName_ = 0;
        onChanged();
        return this;
      }

      private int fieldOption_ ;
      /**
       * <code>optional int32 field_option = 3;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public boolean hasFieldOption() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 field_option = 3;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public int getFieldOption() {
        return fieldOption_;
      }
      /**
       * <code>optional int32 field_option = 3;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public Builder setFieldOption(int value) {
        bitField0_ |= 0x00000004;
        fieldOption_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 field_option = 3;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public Builder clearFieldOption() {
        bitField0_ = (bitField0_ & ~0x00000004);
        fieldOption_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.LazyStringList fieldStrings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      private void ensureFieldStringsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          fieldStrings_ = new com.google.protobuf.LazyStringArrayList(fieldStrings_);
          bitField0_ |= 0x00000008;
         }
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public com.google.protobuf.ProtocolStringList
          getFieldStringsList() {
        return fieldStrings_.getUnmodifiableView();
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public int getFieldStringsCount() {
        return fieldStrings_.size();
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public java.lang.String getFieldStrings(int index) {
        return fieldStrings_.get(index);
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public com.google.protobuf.ByteString
          getFieldStringsBytes(int index) {
        return fieldStrings_.getByteString(index);
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder setFieldStrings(
          int index, java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldStringsIsMutable();
        fieldStrings_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder addFieldStrings(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldStringsIsMutable();
        fieldStrings_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder addAllFieldStrings(
          java.lang.Iterable<java.lang.String> values) {
        ensureFieldStringsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fieldStrings_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder clearFieldStrings() {
        fieldStrings_ = com.google.protobuf.LazyStringArrayList.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>repeated string field_strings = 4;</code>
       *
       * <pre>
       * REQUIRED
       * </pre>
       */
      public Builder addFieldStringsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  ensureFieldStringsIsMutable();
        fieldStrings_.add(value);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> fieldOptionIntegers_ = java.util.Collections.emptyList();
      private void ensureFieldOptionIntegersIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          fieldOptionIntegers_ = new java.util.ArrayList<java.lang.Integer>(fieldOptionIntegers_);
          bitField0_ |= 0x00000010;
         }
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public java.util.List<java.lang.Integer>
          getFieldOptionIntegersList() {
        return java.util.Collections.unmodifiableList(fieldOptionIntegers_);
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public int getFieldOptionIntegersCount() {
        return fieldOptionIntegers_.size();
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public int getFieldOptionIntegers(int index) {
        return fieldOptionIntegers_.get(index);
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public Builder setFieldOptionIntegers(
          int index, int value) {
        ensureFieldOptionIntegersIsMutable();
        fieldOptionIntegers_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public Builder addFieldOptionIntegers(int value) {
        ensureFieldOptionIntegersIsMutable();
        fieldOptionIntegers_.add(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public Builder addAllFieldOptionIntegers(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureFieldOptionIntegersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, fieldOptionIntegers_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 field_option_integers = 5;</code>
       *
       * <pre>
       * OPTIONAL
       * </pre>
       */
      public Builder clearFieldOptionIntegers() {
        fieldOptionIntegers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000010);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Data)
    }

    static {
      defaultInstance = new Data(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:Data)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Data_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Data_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022test_message.proto\"y\n\004Data\022\r\n\005field\030\001 " +
      "\001(\t\022\026\n\016field_int_name\030\002 \001(\005\022\024\n\014field_opt" +
      "ion\030\003 \001(\005\022\025\n\rfield_strings\030\004 \003(\t\022\035\n\025fiel" +
      "d_option_integers\030\005 \003(\005"
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
        }, assigner);
    internal_static_Data_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Data_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Data_descriptor,
        new java.lang.String[] { "Field", "FieldIntName", "FieldOption", "FieldStrings", "FieldOptionIntegers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}