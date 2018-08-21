package DDS;

import org.opensplice.dds.dcps.Utilities;

public class HistoryQosPolicyKind {

    private int __value;
    private static int __size = 2;
    private static DDS.HistoryQosPolicyKind[] __array = new DDS.HistoryQosPolicyKind[__size];

    public static final int _KEEP_LAST_HISTORY_QOS = 0;
    public static final DDS.HistoryQosPolicyKind KEEP_LAST_HISTORY_QOS = new DDS.HistoryQosPolicyKind(_KEEP_LAST_HISTORY_QOS);

    public static final int _KEEP_ALL_HISTORY_QOS = 1;
    public static final DDS.HistoryQosPolicyKind KEEP_ALL_HISTORY_QOS = new DDS.HistoryQosPolicyKind(_KEEP_ALL_HISTORY_QOS);

    public int value ()
    {
        return __value;
    }

    public static DDS.HistoryQosPolicyKind from_int (int value)
    {
        if (value >= 0 && value < __size) {
            return __array[value];
        }
        throw Utilities.createException(Utilities.EXCEPTION_TYPE_BAD_OPERATION, null);
    }

    protected HistoryQosPolicyKind (int value)
    {
        __value = value;
        __array[__value] = this;
    }
}
