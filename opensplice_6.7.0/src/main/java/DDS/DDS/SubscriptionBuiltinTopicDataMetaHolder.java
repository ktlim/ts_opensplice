package DDS;

public final class SubscriptionBuiltinTopicDataMetaHolder
{

    public static java.lang.String metaDescriptor[] = { "<MetaData version=\"1.0.0\"><Module name=\"DDS\"><TypeDef name=\"BuiltinTopicKey_t\"><Array size=\"3\"><Long/></Array></TypeDef><Enum name=\"DurabilityQosPolicyKind\"><Element name=\"VOLATILE_DURABILITY_QOS\" value=\"0\"/><Element name=\"TRANSIENT_LOCAL_DURABILITY_QOS\" value=\"1\"/><Element name=\"TRANSIENT_DURABILITY_QOS\" value=\"2\"/><Element name=\"PERSISTENT_DURABILITY_QOS\" value=\"3\"/></Enum><Struct name=\"Duration_t\"><Member name=\"sec\"><Long/></Member><Member name=\"nanosec\"><ULong/></Member></Struct><Enum name=\"LivelinessQosPolicyKind\"><Element name=\"AUTOMATIC_LIVELINESS_QOS\" value=\"0\"/><Element name=\"MANUAL_BY_PARTICIPANT_LIVELINESS_QOS\" value=\"1\"/><Element name=\"MANUAL_BY_TOPIC_LIVELINESS_QOS\" value=\"2\"/></Enum><Enum name=\"ReliabilityQosPolicyKind\"><Element name=\"BEST_EFFORT_RELIABILITY_QOS\" value=\"0\"/><Element name=\"RELIABLE_RELIABILITY_QOS\" value=\"1\"/></Enum><Enum name=\"OwnershipQosPolicyKind\"><Element name=\"SHARED_OWNERSHIP_QOS\" value=\"0\"/><Element name=\"EXCLUSIVE_OWNERSHIP_QOS\" value=\"1\"/></Enum><Enum name=\"DestinationOrderQosPolicyKind\"><Element name=\"BY_RECEPTION_TIMESTAMP_DESTINATIONORDER_QOS\" value=\"0\"/><Element name=\"BY_SOURCE_TIMESTAMP_DESTINATIONORDER_QOS\" value=\"1\"/></Enum><TypeDef name=\"octSeq\"><Sequence><Octet/></Sequence></TypeDef><Enum name=\"PresentationQosPolicyAccessScopeKind\"><Element name=\"INSTANCE_PRESENTATION_QOS\" value=\"0\"/><Element name=\"TOPIC_PRESENTATION_QOS\" value=\"1\"/><Element name=\"GROUP_PRESENTATION_QOS\" value=\"2\"/></Enum><TypeDef name=\"StringSeq\"><Sequence><String/></Sequence></TypeDef><Struct name=\"DurabilityQosPolicy\"><Member name=\"kind\"><Type name=\"DurabilityQosPolicyKind\"/></Member></Struct><Struct name=\"TimeBasedFilterQosPolicy\"><Member name=\"minimum_separation\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"LatencyBudgetQosPolicy\"><Member name=\"duration\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"DeadlineQosPolicy\"><Member name=\"period\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"LivelinessQosPolicy\"><Member name=\"kind\"><Type name=\"LivelinessQosPolicyKind\"/></Member><Member name=\"lease_duration\"><Type name=\"Duration_t\"/></Member></Struct><Struct name=\"ReliabilityQosPolicy\"><Member name=\"kind\"><Type name=\"ReliabilityQosPolicyKind\"/></Member><Member name=\"max_blocking_time\"><Type name=\"Duration_t\"/></Member><Member name=\"synchronous\"><Boolean/></Member></Struct><Struct name=\"OwnershipQosPolicy\"><Member name=\"kind\"><Type name=\"OwnershipQosPolicyKind\"/></Member></Struct><Struct name=\"DestinationOrderQosPolicy\"><Member name=\"kind\"><Type name=\"DestinationOrderQosPolicyKind\"/></Member></Struct><Struct name=\"GroupDataQosPolicy\"><Member name=\"value\"><Type name=\"octSeq\"/></Member></Struct><Struct name=\"TopicDataQosPolicy\"><Member name=\"value\"><Type name=\"octSeq\"/></Member></Struct><Struct name=\"UserDataQosPolicy\"><Member name=\"value\"><Type name=\"octSeq\"/></Member></Struct><Struct name=\"PresentationQosPolicy\"><Member name=\"access_scope\"><Type name=\"PresentationQosPolicyAccessScopeKind\"/></Member><Member name=\"coherent_access\"><Boolean/></Member><Member name=\"ordered_access\"><Boolean/></Member></Struct><Struct name=\"PartitionQosPolicy\"><Member name=\"name\"><Type name=\"StringSeq\"/></Member></Struct><Struct name=\"SubscriptionBuiltinTopicData\"><Member name=\"key\"><Type name=\"BuiltinTopicKey_t\"/></Member><Member name=\"participant_key\"><Type name=\"BuiltinTopicKey_t\"/></Member><Member name=\"topic_name\"><String/></Member><Member name=\"type_name\"><String/></Member><Member name=\"durability\"><Type name=\"DurabilityQosPolicy\"/></Member><Member name=\"deadline\"><Type name=\"DeadlineQosPolicy\"/></Member><Member name=\"latency_budget\"><Type name=\"LatencyBudgetQosPolicy\"/></Member><Member name=\"liveliness\"><Type name=\"LivelinessQosPolicy\"/></Member><Member name=\"reliability\"><Type name=\"ReliabilityQosPolicy\"/></Member><Member name=\"ownership\"><Type name=\"OwnershipQosPolicy\"/></Member><Member name=\"destination_order\"><Type name=\"DestinationOrderQosPolicy\"/></Member><Member name=\"user_data\"><Type name=\"UserDataQosPolicy\"/></Member><Member name=\"time_based_filter\"><Type name=\"TimeBasedFilterQosPolicy\"/></Member><Member name=\"presentation\"><Type name=\"PresentationQosPolicy\"/></Member><Member name=\"partition\"><Type name=\"PartitionQosPolicy\"/></Member><Member name=\"topic_data\"><Type name=\"TopicDataQosPolicy\"/></Member><Member name=\"group_data\"><Type name=\"GroupDataQosPolicy\"/></Member></Struct></Module></MetaData>" };

    public SubscriptionBuiltinTopicDataMetaHolder()
    {
    }

}
