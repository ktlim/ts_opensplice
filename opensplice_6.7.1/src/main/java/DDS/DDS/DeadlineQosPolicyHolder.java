package DDS;

public final class DeadlineQosPolicyHolder
{

    public DDS.DeadlineQosPolicy value = null;

    public DeadlineQosPolicyHolder () { }

    public DeadlineQosPolicyHolder (DDS.DeadlineQosPolicy initialValue)
    {
        value = initialValue;
    }

}
