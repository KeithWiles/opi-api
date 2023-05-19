// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: oc_interfaces.proto

package opi_api.network.v1;

public final class OcInterfacesProto {
  private OcInterfacesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_Config_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_Config_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_Counters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_Counters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_State_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_State_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_HoldTime_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_HoldTime_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_Subinterfaces_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_SubifConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_SubifConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_GetNetInterfaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_GetNetInterfaceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_ListNetInterfacesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_ListNetInterfacesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_ListNetInterfacesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_ListNetInterfacesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_opi_api_network_v1_UpdateNetInterfaceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_opi_api_network_v1_UpdateNetInterfaceRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023oc_interfaces.proto\022\022opi_api.network.v" +
      "1\032\027google/api/client.proto\032\031google/api/r" +
      "esource.proto\032\034google/api/annotations.pr" +
      "oto\032\037google/api/field_behavior.proto\032 go" +
      "ogle/protobuf/field_mask.proto\"\221\001\n\006Confi" +
      "g\022\014\n\004name\030\001 \001(\t\022/\n\004type\030\002 \001(\0162!.opi_api." +
      "network.v1.InterfaceType\022\013\n\003mtu\030\003 \001(\r\022\025\n" +
      "\rloopback_mode\030\004 \001(\010\022\023\n\013description\030\005 \001(" +
      "\t\022\017\n\007enabled\030\006 \001(\010\"\260\003\n\010Counters\022\021\n\trx_oc" +
      "tets\030\001 \001(\004\022\022\n\nrx_packets\030\002 \001(\004\022\027\n\017rx_uni" +
      "cast_pkts\030\003 \001(\004\022\031\n\021rx_broadcast_pkts\030\004 \001" +
      "(\004\022\031\n\021rx_multicast_pkts\030\005 \001(\004\022\023\n\013rx_disc" +
      "ards\030\006 \001(\004\022\021\n\trx_errors\030\007 \001(\004\022\031\n\021rx_unkn" +
      "own_protos\030\010 \001(\004\022\025\n\rrx_fcs_errors\030\t \001(\004\022" +
      "\022\n\nout_octets\030\n \001(\004\022\023\n\013out_packets\030\013 \001(\004" +
      "\022\030\n\020out_unicast_pkts\030\014 \001(\004\022\032\n\022out_broadc" +
      "ast_pkts\030\r \001(\004\022\032\n\022out_multicast_pkts\030\016 \001" +
      "(\004\022\024\n\014out_discards\030\017 \001(\004\022\022\n\nout_errors\030\020" +
      " \001(\004\022\033\n\023carrier_transitions\030\021 \001(\004\022\022\n\nlas" +
      "t_clear\030\022 \001(\004\"\200\003\n\005State\022\014\n\004name\030\001 \001(\t\022/\n" +
      "\004type\030\002 \001(\0162!.opi_api.network.v1.Interfa" +
      "ceType\022\013\n\003mtu\030\003 \001(\r\022\025\n\rloopback_mode\030\004 \001" +
      "(\010\022\023\n\013description\030\005 \001(\t\022\017\n\007enabled\030\006 \001(\010" +
      "\022\017\n\007ifindex\030\007 \001(\r\0223\n\013admin_state\030\010 \001(\0162\036" +
      ".opi_api.network.v1.AdminState\0221\n\noper_s" +
      "tate\030\t \001(\0162\035.opi_api.network.v1.OperStat" +
      "e\022\023\n\013last_change\030\n \001(\004\022\017\n\007logical\030\013 \001(\010\022" +
      "\022\n\nmanagement\030\014 \001(\010\022\013\n\003cpu\030\r \001(\010\022.\n\010coun" +
      "ters\030\016 \001(\0132\034.opi_api.network.v1.Counters" +
      "\"\270\006\n\014NetInterface\022\014\n\004name\030\001 \001(\t\022*\n\006confi" +
      "g\030\002 \001(\0132\032.opi_api.network.v1.Config\022(\n\005s" +
      "tate\030\003 \001(\0132\031.opi_api.network.v1.State\022;\n" +
      "\010holdtime\030\004 \001(\0132).opi_api.network.v1.Net" +
      "Interface.HoldTime\022E\n\rsubinterfaces\030\005 \001(" +
      "\0132..opi_api.network.v1.NetInterface.Subi" +
      "nterfaces\032\355\001\n\010HoldTime\022I\n\013hold_config\030\001 " +
      "\001(\01324.opi_api.network.v1.NetInterface.Ho" +
      "ldTime.HoldConfig\022G\n\nhold_state\030\002 \001(\01323." +
      "opi_api.network.v1.NetInterface.HoldTime" +
      ".HoldState\032&\n\nHoldConfig\022\n\n\002up\030\001 \001(\r\022\014\n\004" +
      "down\030\002 \001(\r\032%\n\tHoldState\022\n\n\002up\030\001 \001(\r\022\014\n\004d" +
      "own\030\002 \001(\r\032\317\002\n\rSubinterfaces\022Q\n\014subinterf" +
      "ace\030\002 \003(\0132;.opi_api.network.v1.NetInterf" +
      "ace.Subinterfaces.Subinterface\032\352\001\n\014Subin" +
      "terface\022\r\n\005index\030\001 \001(\003\022]\n\014subif_config\030\002" +
      " \001(\0132G.opi_api.network.v1.NetInterface.S" +
      "ubinterfaces.Subinterface.SubifConfig\022(\n" +
      "\005state\030\003 \001(\0132\031.opi_api.network.v1.State\032" +
      "B\n\013SubifConfig\022\r\n\005index\030\001 \001(\004\022\023\n\013descrip" +
      "tion\030\002 \001(\t\022\017\n\007enabled\030\003 \001(\010\"M\n\026GetNetInt" +
      "erfaceRequest\0223\n\004name\030\001 \001(\tB%\340A\002\372A\037\n\035opi" +
      "_api.network.v1/Interfaces\"x\n\030ListNetInt" +
      "erfacesRequest\0225\n\006parent\030\001 \001(\tB%\340A\002\372A\037\n\035" +
      "opi_api.network.v1/Interfaces\022\021\n\tpage_si" +
      "ze\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\"n\n\031ListNetI" +
      "nterfacesResponse\0228\n\016net_interfaces\030\001 \003(" +
      "\0132 .opi_api.network.v1.NetInterface\022\027\n\017n" +
      "ext_page_token\030\002 \001(\t\"\205\001\n\031UpdateNetInterf" +
      "aceRequest\0227\n\rnet_interface\030\001 \001(\0132 .opi_" +
      "api.network.v1.NetInterface\022/\n\013update_ma" +
      "sk\030\002 \001(\0132\032.google.protobuf.FieldMask*K\n\r" +
      "InterfaceType\022\036\n\032INTERFACE_TYPE_UNSPECIF" +
      "IED\020\000\022\014\n\010ETHERNET\020\001\022\014\n\010LOOPBACK\020\002*l\n\nAdm" +
      "inState\022\033\n\027ADMIN_STATE_UNSPECIFIED\020\000\022\022\n\016" +
      "ADMIN_STATE_UP\020\001\022\024\n\020ADMIN_STATE_DOWN\020\002\022\027" +
      "\n\023ADMIN_STATE_TESTING\020\003*\324\001\n\tOperState\022\032\n" +
      "\026OPER_STATE_UNSPECIFIED\020\000\022\021\n\rOPER_STATE_" +
      "UP\020\002\022\023\n\017OPER_STATE_DOWN\020\003\022\026\n\022OPER_STATE_" +
      "TESTING\020\004\022\026\n\022OPER_STATE_UNKNOWN\020\005\022\026\n\022OPE" +
      "R_STATE_DORMANT\020\006\022\032\n\026OPER_STATE_NOT_PRES" +
      "ENT\020\007\022\037\n\033OPER_STATE_LOWER_LAYER_DOWN\020\0102\226" +
      "\004\n\023NetInterfaceService\022\223\001\n\017GetNetInterfa" +
      "ce\022*.opi_api.network.v1.GetNetInterfaceR" +
      "equest\032 .opi_api.network.v1.NetInterface" +
      "\"2\202\323\344\223\002%\022#/v1/{name=interfaces/*/interfa" +
      "ce/*}\332A\004name\022\232\001\n\021ListNetInterfaces\022,.opi" +
      "_api.network.v1.ListNetInterfacesRequest" +
      "\032-.opi_api.network.v1.ListNetInterfacesR" +
      "esponse\"(\202\323\344\223\002\031\022\027/v1/{parent=interfaces}" +
      "\332A\006parent\022\313\001\n\022UpdateNetInterface\022-.opi_a" +
      "pi.network.v1.UpdateNetInterfaceRequest\032" +
      " .opi_api.network.v1.NetInterface\"d\202\323\344\223\002" +
      "B21/v1/{net_interface.name=interfaces/*/" +
      "interface/*}:\rnet_interface\332A\031net_interf" +
      "ace,update_maskBZ\n\022opi_api.network.v1B\021O" +
      "cInterfacesProtoP\001Z/github.com/opiprojec" +
      "t/opi-api/network/v1/gen/gob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_opi_api_network_v1_Config_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_opi_api_network_v1_Config_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_Config_descriptor,
        new java.lang.String[] { "Name", "Type", "Mtu", "LoopbackMode", "Description", "Enabled", });
    internal_static_opi_api_network_v1_Counters_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_opi_api_network_v1_Counters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_Counters_descriptor,
        new java.lang.String[] { "RxOctets", "RxPackets", "RxUnicastPkts", "RxBroadcastPkts", "RxMulticastPkts", "RxDiscards", "RxErrors", "RxUnknownProtos", "RxFcsErrors", "OutOctets", "OutPackets", "OutUnicastPkts", "OutBroadcastPkts", "OutMulticastPkts", "OutDiscards", "OutErrors", "CarrierTransitions", "LastClear", });
    internal_static_opi_api_network_v1_State_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_opi_api_network_v1_State_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_State_descriptor,
        new java.lang.String[] { "Name", "Type", "Mtu", "LoopbackMode", "Description", "Enabled", "Ifindex", "AdminState", "OperState", "LastChange", "Logical", "Management", "Cpu", "Counters", });
    internal_static_opi_api_network_v1_NetInterface_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_opi_api_network_v1_NetInterface_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_descriptor,
        new java.lang.String[] { "Name", "Config", "State", "Holdtime", "Subinterfaces", });
    internal_static_opi_api_network_v1_NetInterface_HoldTime_descriptor =
      internal_static_opi_api_network_v1_NetInterface_descriptor.getNestedTypes().get(0);
    internal_static_opi_api_network_v1_NetInterface_HoldTime_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_HoldTime_descriptor,
        new java.lang.String[] { "HoldConfig", "HoldState", });
    internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldConfig_descriptor =
      internal_static_opi_api_network_v1_NetInterface_HoldTime_descriptor.getNestedTypes().get(0);
    internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldConfig_descriptor,
        new java.lang.String[] { "Up", "Down", });
    internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldState_descriptor =
      internal_static_opi_api_network_v1_NetInterface_HoldTime_descriptor.getNestedTypes().get(1);
    internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_HoldTime_HoldState_descriptor,
        new java.lang.String[] { "Up", "Down", });
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_descriptor =
      internal_static_opi_api_network_v1_NetInterface_descriptor.getNestedTypes().get(1);
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_Subinterfaces_descriptor,
        new java.lang.String[] { "Subinterface", });
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_descriptor =
      internal_static_opi_api_network_v1_NetInterface_Subinterfaces_descriptor.getNestedTypes().get(0);
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_descriptor,
        new java.lang.String[] { "Index", "SubifConfig", "State", });
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_SubifConfig_descriptor =
      internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_descriptor.getNestedTypes().get(0);
    internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_SubifConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_NetInterface_Subinterfaces_Subinterface_SubifConfig_descriptor,
        new java.lang.String[] { "Index", "Description", "Enabled", });
    internal_static_opi_api_network_v1_GetNetInterfaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_opi_api_network_v1_GetNetInterfaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_GetNetInterfaceRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_opi_api_network_v1_ListNetInterfacesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_opi_api_network_v1_ListNetInterfacesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_ListNetInterfacesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageSize", "PageToken", });
    internal_static_opi_api_network_v1_ListNetInterfacesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_opi_api_network_v1_ListNetInterfacesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_ListNetInterfacesResponse_descriptor,
        new java.lang.String[] { "NetInterfaces", "NextPageToken", });
    internal_static_opi_api_network_v1_UpdateNetInterfaceRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_opi_api_network_v1_UpdateNetInterfaceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_opi_api_network_v1_UpdateNetInterfaceRequest_descriptor,
        new java.lang.String[] { "NetInterface", "UpdateMask", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.ClientProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}