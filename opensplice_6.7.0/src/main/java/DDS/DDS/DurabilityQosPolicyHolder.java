package DDS;

public final class DurabilityQosPolicyHolder
{

    public DDS.DurabilityQosPolicy value = null;

    public DurabilityQosPolicyHolder () { }

    public DurabilityQosPolicyHolder (DDS.DurabilityQosPolicy initialValue)
    {
        value = initialValue;
    }

}
