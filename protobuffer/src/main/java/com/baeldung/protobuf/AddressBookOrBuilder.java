// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: addressbook.proto

package com.baeldung.protobuf;

public interface AddressBookOrBuilder extends
    // @@protoc_insertion_point(interface_extends:protobuf.AddressBook)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .protobuf.Person people = 1;</code>
   */
  java.util.List<com.baeldung.protobuf.Person> 
      getPeopleList();
  /**
   * <code>repeated .protobuf.Person people = 1;</code>
   */
  com.baeldung.protobuf.Person getPeople(int index);
  /**
   * <code>repeated .protobuf.Person people = 1;</code>
   */
  int getPeopleCount();
  /**
   * <code>repeated .protobuf.Person people = 1;</code>
   */
  java.util.List<? extends com.baeldung.protobuf.PersonOrBuilder> 
      getPeopleOrBuilderList();
  /**
   * <code>repeated .protobuf.Person people = 1;</code>
   */
  com.baeldung.protobuf.PersonOrBuilder getPeopleOrBuilder(
      int index);
}
