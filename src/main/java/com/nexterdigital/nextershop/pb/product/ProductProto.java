// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.nexterdigital.nextershop.pb.product;

public final class ProductProto {
  private ProductProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_product_v1_Product_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_product_v1_Product_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rproduct.proto\022\nproduct.v1\"\255\005\n\007Product\022" +
      "\026\n\016sap_product_id\030\001 \001(\t\022\022\n\nproduct_id\030\002 " +
      "\001(\t\022\023\n\013category_id\030\003 \001(\t\022\022\n\ncategories\030\004" +
      " \001(\t\022\022\n\nvariant_id\030\005 \001(\t\022\017\n\007visible\030\006 \001(" +
      "\010\022\024\n\014product_type\030\007 \001(\t\022\014\n\004name\030\010 \001(\t\022\r\n" +
      "\005brand\030\t \001(\t\022\030\n\020minimum_purchase\030\n \001(\r\022\026" +
      "\n\016service_charge\030\013 \001(\002\022\r\n\005image\030\014 \001(\t\022\r\n" +
      "\005usage\030\r \001(\t\022\023\n\013description\030\016 \001(\t\022\025\n\rspe" +
      "cification\030\017 \001(\t\022\017\n\007barcode\030\020 \001(\t\022\022\n\nart" +
      "icle_id\030\021 \001(\t\022\r\n\005color\030\022 \001(\t\022\014\n\004size\030\023 \001" +
      "(\t\022\r\n\005price\030\024 \001(\002\022\025\n\rspecial_price\030\025 \001(\002" +
      "\022\025\n\rshipping_cost\030\026 \001(\002\022\014\n\004unit\030\027 \001(\t\022\021\n" +
      "\tunit_code\030\030 \001(\t\022\017\n\007service\030\031 \001(\t\022\017\n\007key" +
      "word\030\032 \001(\t\022\014\n\004type\030\033 \001(\t\022\017\n\007partner\030\034 \001(" +
      "\t\022\022\n\nphase_type\030\035 \001(\t\022\025\n\rshipping_type\030\036" +
      " \001(\t\022\025\n\rpattern_tiles\030\037 \001(\t\022\023\n\013pack_in_b" +
      "ox\030  \001(\r\022\023\n\013tile_square\030! \001(\t\022\025\n\rvariant" +
      "_image\030\" \001(\t\022\025\n\rproduct_image\030# \001(\tB9\n\'c" +
      "om.nexterdigital.nextershop.pb.productB\014" +
      "ProductProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_product_v1_Product_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_product_v1_Product_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_product_v1_Product_descriptor,
        new java.lang.String[] { "SapProductId", "ProductId", "CategoryId", "Categories", "VariantId", "Visible", "ProductType", "Name", "Brand", "MinimumPurchase", "ServiceCharge", "Image", "Usage", "Description", "Specification", "Barcode", "ArticleId", "Color", "Size", "Price", "SpecialPrice", "ShippingCost", "Unit", "UnitCode", "Service", "Keyword", "Type", "Partner", "PhaseType", "ShippingType", "PatternTiles", "PackInBox", "TileSquare", "VariantImage", "ProductImage", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
