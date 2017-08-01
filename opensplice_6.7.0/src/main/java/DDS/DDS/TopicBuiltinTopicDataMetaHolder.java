package DDS;

public final class TopicBuiltinTopicDataMetaHolder
{

    public static java.lang.String metaDescriptor[] = { "<MetaData version=\"1.0.0\"><Module name=\"DDS\"><TypeDef name=\"BuiltinTopicKey_t\"><Array size=\"3\"><Long/></Array></TypeDef><Enum name=\"DurabilityQosPolicyKind\"><Element name=\"VOLATILE_DURABILITY_QOS\" value=\"0\"/><Element name=\"TRANSIENT_LOCAL_DURABILITY_QOS\" value=\"1\"/><Element name=\"TRANSIENT_DURABILITY_QOS\" value=\"2\"/><Element name=\"PERSISTENT_DURABILITY_QOS\" value=\"3\"/></Enum><Struct name=\"Duration_t\"><Member name=\"sec\"><Long/></Member><Member name=\"nanosec\"><ULong/></Member></Struct><Enum name=\"HistoryQosPolicyKind\"><Element name=\"KEEP_LAST_HISTORY_QOS\" value=\"0\"/><Element name=\"KEEP_ALL_HISTORY_QOS\" value=\"1\"/></Enum><Enum name=\"LivelinessQosPolicyKind\"><Element name=\"AUTOMATIC_LIVELINESS_QOS\" value=\"0\"/><Element name=\"MANUAL_BY_PARTICIPANT_LIVELINESS_QOS\" value=\"1\"/><Element name=\"MANUAL_BY_TOPIC_LIVELINESS_QOS\" value=\"2\"/></Enum><Enum name=\"ReliabilityQosPolicyKind\"><Element name=\"BEST_EFFORT_RELIABILITY_QOS\" value=\"0\"/><Element name=\"RELIABLE_RELIABILITY_QOS\" value=\"1\"/></Enum><Struct name=\"TransportPriorityQosPolicy\"><Member name=\"value\"><Long/></Member></Struct><Enum name=\"DestinationOrderQosPolicyKind\"><Element name=\"BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS\" value=\"0\"/><Element name=\"BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS\" value=\"1\"/></Enum><Struct name=\"ResourceLimitsQosPolicy\"><Member name=\"max_samples\"><Long/></Member><Member name=\"max_instances\"><Long/></Member><Member name=\"max_samples_per_instance\"><Long/></Member></Struct><Enum name=\"OwnershipQosPolicyKind\"><Element name=\"SHARED_OWNERSHIP_QOS\" value=\"0\"/><Element name=\"EXCLUSIVE_OWNERSHIP_QOS\" value=\"1\"/></Enum><TypeDef name=\"octSeq\"><Sequence><Octet/></Sequence></TypeDef><Struct name=\"DurabilityQosPolicy\"><Member name=\"kind\"><Type name=\"DurabilityQosPolicyKind\"/></Member></Struct><Struct name=\"LifespanQosPolicy\"><Member name=\"duration\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"LatencyBudgetQosPolicy\"><Member name=\"duration\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"DeadlineQosPolicy\"><Member name=\"period\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"HistoryQosPolicy\"><Member name=\"kind\"><Type name=\"HistoryQosPolicyKind\"/></Member><Member name=\"depth\"><Long/></Member></Struct><Struct name=\"DurabilityServiceQosPolicy\"><Member name=\"service_cleanup_delay\"><Type name=\"Duration_t\"/></Member><Member name=\"history_kind\"><Type name=\"HistoryQosPolicyKind\"/></Member><Member name=\"history_depth\"><Long/></Member><Member name=\"max_samples\"><Long/></Member><Member name=\"max_instances\"><Long/></Member><Member name=\"max_samples_per_instance\"><Long/></Member></Struct><Struct name=\"LivelinessQosPolicy\"><Member name=\"kind\"><Type name=\"LivelinessQosPolicyKind\"/></Member><Member name=\"lease_duration\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"ReliabilityQosPolicy\"><Member name=\"kind\"><Type name=\"ReliabilityQosPolicyKind\"/></Member><Member name=\"max_blocking_time\"><Type name=\"Duration_t\"/></Member><Member name=\"synchronous\"><Boolean/></Member></Struct><Struct name=\"DestinationOrderQosPolicy\"><Member name=\"kind\"><Type name=\"DestinationOrderQosPolicyKind\"/></Member></Struct><Struct name=\"OwnershipQosPolicy\"><Member name=\"kind\"><Type name=\"OwnershipQosPolicyKind\"/></Member></Struct><Struct name=\"TopicDataQosPolicy\"><Member name=\"value\"><Type name=\"octSeq\"/></Member></Struct><Struct name=\"TopicBuiltinTopicData\"><Member name=\"key\"><Type name=\"BuiltinTopicKey_t\"/></Member><Member name=\"name\"><String/></Member><Member name=\"type_name\"><String/></Member><Member name=\"durability\"><Type name=\"DurabilityQosPolicy\"/></Member><Member name=\"durability_service\"><Type name=\"DurabilityServiceQosPolicy\"/></Member><Member name=\"deadline\"><Type name=\"DeadlineQosPolicy\"/></Member><Member name=\"latency_budget\"><Type name=\"LatencyBudgetQosPolicy\"/></Member><Member name=\"liveliness\"><Type name=\"LivelinessQosPolicy\"/></Member><Member name=\"reliability\"><Type name=\"ReliabilityQosPolicy\"/></Member><Member name=\"transport_priority\"><Type name=\"TransportPriorityQosPolicy\"/></Member><Member name=\"lifespan\"><Type name=\"LifespanQosPolicy\"/></Member><Member name=\"destination_order\"><Type name=\"DestinationOrderQosPolicy\"/></Member><Member name=\"history\"><Type name=\"HistoryQosPolicy\"/></Member><Member name=\"resource_limits\"><Type name=\"ResourceLimitsQosPolicy\"/></Member><Member name=\"ownership\"><Type name=\"OwnershipQosPolicy\"/></Member><Member name=\"topic_data\"><Type name=\"TopicDataQosPolicy\"/></Member></Struct></Module></MetaData>" };

    public TopicBuiltinTopicDataMetaHolder()
    {
    }

}