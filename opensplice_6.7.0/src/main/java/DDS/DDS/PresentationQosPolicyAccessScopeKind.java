package DDS;

import org.opensplice.dds.dcps.Utilities;

public class PresentationQosPolicyAccessScopeKind {

    private int __value;
    private static int __size = 3;
    private static DDS.PresentationQosPolicyAccessScopeKind[] __array = new DDS.PresentationQosPolicyAccessScopeKind[__size];

    public static final int _INSTANCE_PRESENTATION_QOS = 0;
    public static final DDS.PresentationQosPolicyAccessScopeKind INSTANCE_PRESENTATION_QOS = new DDS.PresentationQosPolicyAccessScopeKind(_INSTANCE_PRESENTATION_QOS);

    public static final int _TOPIC_PRESENTATION_QOS = 1;
    public static final DDS.PresentationQosPolicyAccessScopeKind TOPIC_PRESENTATION_QOS = new DDS.PresentationQosPolicyAccessScopeKind(_TOPIC_PRESENTATION_QOS);

    public static final int _GROUP_PRESENTATION_QOS = 2;
    public static final DDS.PresentationQosPolicyAccessScopeKind GROUP_PRESENTATION_QOS = new DDS.PresentationQosPolicyAccessScopeKind(_GROUP_PRESENTATION_QOS);

    public int value ()
    {
        return __value;
    }

    public static DDS.PresentationQosPolicyAccessScopeKind from_int (int value)
    {
        if (value >= 0 && value < __size) {
            return __array[value];
        }
        throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_OPERATION, null);
    }

    protected PresentationQosPolicyAccessScopeKind (int value)
    {
        __value = value;
        __array[__value] = this;
    }
}
