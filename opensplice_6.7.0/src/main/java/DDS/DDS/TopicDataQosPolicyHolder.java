package DDS;

public final class TopicDataQosPolicyHolder
{

    public DDS.TopicDataQosPolicy value = null;

    public TopicDataQosPolicyHolder () { }

    public TopicDataQosPolicyHolder (DDS.TopicDataQosPolicy initialValue)
    {
        value = initialValue;
    }

}
