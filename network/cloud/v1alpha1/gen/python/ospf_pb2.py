# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ospf.proto
# Protobuf Python Version: 4.25.2
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


import networktypes_pb2 as networktypes__pb2
from google.api import resource_pb2 as google_dot_api_dot_resource__pb2
from google.api import field_behavior_pb2 as google_dot_api_dot_field__behavior__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\nospf.proto\x12\x1eopi_api.network.cloud.v1alpha1\x1a\x12networktypes.proto\x1a\x19google/api/resource.proto\x1a\x1fgoogle/api/field_behavior.proto\"\x8d\x02\n\nOSPFConfig\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12<\n\x04spec\x18\x02 \x01(\x0b\x32(.opi_api.network.cloud.v1alpha1.OSPFSpecR\x04spec\x12I\n\x05state\x18\x03 \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.OSPFOperStateB\x04\xe2\x41\x01\x03R\x05state:\\\xea\x41Y\n)opi_api.network.cloud.v1alpha1/OSPFConfig\x12\x13ospfs/{ospf_config}*\x0bospfConfigs2\nospfConfig\"\x9e\x02\n\x08OSPFSpec\x12N\n\x0cospf_version\x18\x01 \x01(\x0e\x32+.opi_api.network.cloud.v1alpha1.OSPFVersionR\x0bospfVersion\x12\x1b\n\trouter_id\x18\x02 \x01(\x07R\x08routerId\x12>\n\x1bsuppress_default_resolution\x18\x03 \x01(\x08R\x19suppressDefaultResolution\x12\x46\n\x06redist\x18\x04 \x01(\x0b\x32..opi_api.network.cloud.v1alpha1.OSPFRedistSpecR\x06redist\x12\x1d\n\npassive_if\x18\x05 \x01(\tR\tpassiveIf\"\x8d\x03\n\x0eOSPFRedistSpec\x12O\n\x0bredist_type\x18\x01 \x01(\x0e\x32..opi_api.network.cloud.v1alpha1.OSPFRedistTypeR\nredistType\x12G\n\x05state\x18\x02 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateR\x05state\x12U\n\rlocal_address\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0clocalAddress\x12\x1b\n\troute_map\x18\x04 \x01(\tR\x08routeMap\x12U\n\x0bmetric_type\x18\x05 \x01(\x0e\x32\x34.opi_api.network.cloud.v1alpha1.OSPFRedistMetricTypeR\nmetricType\x12\x16\n\x06metric\x18\x06 \x01(\x05R\x06metric\"\xf6\x01\n\x08OSPFArea\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12@\n\x04spec\x18\x02 \x01(\x0b\x32,.opi_api.network.cloud.v1alpha1.OSPFAreaSpecR\x04spec\x12I\n\x05state\x18\x03 \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.OSPFOperStateB\x04\xe2\x41\x01\x03R\x05state:C\xea\x41@\n\'opi_api.network.cloud.v1alpha1/OSPFArea\x12\x15ospfareas/{ospf_area}\"\x8a\x03\n\x0cOSPFAreaSpec\x12S\n\x0c\x61rea_address\x18\x01 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0b\x61reaAddress\x12G\n\x05state\x18\x02 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateR\x05state\x12V\n\x0enetwork_prefix\x18\x03 \x01(\x0b\x32/.opi_api.network.opinetcommon.v1alpha1.IPPrefixR\rnetworkPrefix\x12.\n\x13\x61uth_message_digest\x18\x04 \x01(\tR\x11\x61uthMessageDigest\x12T\n\x0cnetwork_type\x18\x05 \x01(\x0e\x32\x31.opi_api.network.cloud.v1alpha1.OSPFIfNetworkTypeR\x0bnetworkType\"\x8f\x02\n\rOSPFIfNetwork\x12\x18\n\x04name\x18\x01 \x01(\tB\x04\xe2\x41\x01\x08R\x04name\x12\x45\n\x04spec\x18\x02 \x01(\x0b\x32\x31.opi_api.network.cloud.v1alpha1.OSPFIfNetworkSpecR\x04spec\x12I\n\x05state\x18\x03 \x01(\x0e\x32-.opi_api.network.cloud.v1alpha1.OSPFOperStateB\x04\xe2\x41\x01\x03R\x05state:R\xea\x41O\n,opi_api.network.cloud.v1alpha1/OSPFIfNetwork\x12\x1fospfifnetworks/{ospf_ifnetwork}\"\xcd\x02\n\x11OSPFIfNetworkSpec\x12!\n\x0cnetwork_type\x18\x01 \x01(\tR\x0bnetworkType\x12G\n\x05state\x18\x02 \x01(\x0e\x32\x31.opi_api.network.opinetcommon.v1alpha1.AdminStateR\x05state\x12U\n\rlocal_address\x18\x03 \x01(\x0b\x32\x30.opi_api.network.opinetcommon.v1alpha1.IPAddressR\x0clocalAddress\x12-\n\x13\x63ost_or_link_metric\x18\x04 \x01(\x05R\x10\x63ostOrLinkMetric\x12\x46\n\x08md5_auth\x18\x05 \x01(\x0b\x32+.opi_api.network.cloud.v1alpha1.OSPFMD5AuthR\x07md5Auth\"W\n\x0bOSPFMD5Auth\x12,\n\x12message_digest_key\x18\x01 \x01(\x05R\x10messageDigestKey\x12\x1a\n\x08password\x18\x02 \x01(\tR\x08password*S\n\x0bOSPFVersion\x12\x1c\n\x18OSPF_VERSION_UNSPECIFIED\x10\x00\x12\x12\n\x0eOSPF_VERSION_2\x10\x01\x12\x12\n\x0eOSPF_VERSION_3\x10\x02*\x86\x01\n\x11OSPFIfNetworkType\x12$\n OSPF_IF_NETWORK_TYPE_UNSPECIFIED\x10\x00\x12\"\n\x1eOSPF_IF_NETWORK_TYPE_BROADCAST\x10\x01\x12\'\n#OSPF_IF_NETWORK_TYPE_POINT_TO_POINT\x10\x02*}\n\x14OSPFRedistMetricType\x12\'\n#OSPF_REDIST_METRIC_TYPE_UNSPECIFIED\x10\x00\x12\x1d\n\x19OSPF_REDIST_METRIC_TYPE_1\x10\x01\x12\x1d\n\x19OSPF_REDIST_METRIC_TYPE_2\x10\x02*\x89\x01\n\x0eOSPFRedistType\x12 \n\x1cOSPF_REDIST_TYPE_UNSPECIFIED\x10\x00\x12\x1e\n\x1aOSPF_REDIST_TYPE_CONNECTED\x10\x01\x12\x1b\n\x17OSPF_REDIST_TYPE_STATIC\x10\x02\x12\x18\n\x14OSPF_REDIST_TYPE_BGP\x10\x03*\xc0\x01\n\rOSPFOperState\x12\x1f\n\x1bOSPF_OPER_STATE_UNSPECIFIED\x10\x00\x12\x16\n\x12OSPF_OPER_STATE_UP\x10\x01\x12\x18\n\x14OSPF_OPER_STATE_DOWN\x10\x02\x12\x1c\n\x18OSPF_OPER_STATE_GOING_UP\x10\x03\x12\x1e\n\x1aOSPF_OPER_STATE_GOING_DOWN\x10\x04\x12\x1e\n\x1aOSPF_OPER_STATE_ACT_FAILED\x10\x05\x42j\n\x1eopi_api.network.cloud.v1alpha1B\tOSPFProtoP\x01Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/gob\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ospf_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\036opi_api.network.cloud.v1alpha1B\tOSPFProtoP\001Z;github.com/opiproject/opi-api/network/cloud/v1alpha1/gen/go'
  _globals['_OSPFCONFIG'].fields_by_name['name']._options = None
  _globals['_OSPFCONFIG'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_OSPFCONFIG'].fields_by_name['state']._options = None
  _globals['_OSPFCONFIG'].fields_by_name['state']._serialized_options = b'\342A\001\003'
  _globals['_OSPFCONFIG']._options = None
  _globals['_OSPFCONFIG']._serialized_options = b'\352AY\n)opi_api.network.cloud.v1alpha1/OSPFConfig\022\023ospfs/{ospf_config}*\013ospfConfigs2\nospfConfig'
  _globals['_OSPFAREA'].fields_by_name['name']._options = None
  _globals['_OSPFAREA'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_OSPFAREA'].fields_by_name['state']._options = None
  _globals['_OSPFAREA'].fields_by_name['state']._serialized_options = b'\342A\001\003'
  _globals['_OSPFAREA']._options = None
  _globals['_OSPFAREA']._serialized_options = b'\352A@\n\'opi_api.network.cloud.v1alpha1/OSPFArea\022\025ospfareas/{ospf_area}'
  _globals['_OSPFIFNETWORK'].fields_by_name['name']._options = None
  _globals['_OSPFIFNETWORK'].fields_by_name['name']._serialized_options = b'\342A\001\010'
  _globals['_OSPFIFNETWORK'].fields_by_name['state']._options = None
  _globals['_OSPFIFNETWORK'].fields_by_name['state']._serialized_options = b'\342A\001\003'
  _globals['_OSPFIFNETWORK']._options = None
  _globals['_OSPFIFNETWORK']._serialized_options = b'\352AO\n,opi_api.network.cloud.v1alpha1/OSPFIfNetwork\022\037ospfifnetworks/{ospf_ifnetwork}'
  _globals['_OSPFVERSION']._serialized_start=2432
  _globals['_OSPFVERSION']._serialized_end=2515
  _globals['_OSPFIFNETWORKTYPE']._serialized_start=2518
  _globals['_OSPFIFNETWORKTYPE']._serialized_end=2652
  _globals['_OSPFREDISTMETRICTYPE']._serialized_start=2654
  _globals['_OSPFREDISTMETRICTYPE']._serialized_end=2779
  _globals['_OSPFREDISTTYPE']._serialized_start=2782
  _globals['_OSPFREDISTTYPE']._serialized_end=2919
  _globals['_OSPFOPERSTATE']._serialized_start=2922
  _globals['_OSPFOPERSTATE']._serialized_end=3114
  _globals['_OSPFCONFIG']._serialized_start=127
  _globals['_OSPFCONFIG']._serialized_end=396
  _globals['_OSPFSPEC']._serialized_start=399
  _globals['_OSPFSPEC']._serialized_end=685
  _globals['_OSPFREDISTSPEC']._serialized_start=688
  _globals['_OSPFREDISTSPEC']._serialized_end=1085
  _globals['_OSPFAREA']._serialized_start=1088
  _globals['_OSPFAREA']._serialized_end=1334
  _globals['_OSPFAREASPEC']._serialized_start=1337
  _globals['_OSPFAREASPEC']._serialized_end=1731
  _globals['_OSPFIFNETWORK']._serialized_start=1734
  _globals['_OSPFIFNETWORK']._serialized_end=2005
  _globals['_OSPFIFNETWORKSPEC']._serialized_start=2008
  _globals['_OSPFIFNETWORKSPEC']._serialized_end=2341
  _globals['_OSPFMD5AUTH']._serialized_start=2343
  _globals['_OSPFMD5AUTH']._serialized_end=2430
# @@protoc_insertion_point(module_scope)
