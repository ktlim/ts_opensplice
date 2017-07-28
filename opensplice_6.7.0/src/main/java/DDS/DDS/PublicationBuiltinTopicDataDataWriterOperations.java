package DDS;

public interface PublicationBuiltinTopicDataDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            DDS.PublicationBuiltinTopicData instance_data);

    long register_instance_w_timestamp(
            DDS.PublicationBuiltinTopicData instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            DDS.PublicationBuiltinTopicData instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            DDS.PublicationBuiltinTopicData instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            DDS.PublicationBuiltinTopicData instance_data, 
            long handle);

    int write_w_timestamp(
            DDS.PublicationBuiltinTopicData instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            DDS.PublicationBuiltinTopicData instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            DDS.PublicationBuiltinTopicData instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            DDS.PublicationBuiltinTopicData instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            DDS.PublicationBuiltinTopicData instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            DDS.PublicationBuiltinTopicDataHolder key_holder, 
            long handle);
    
    long lookup_instance(
            DDS.PublicationBuiltinTopicData instance_data);

}
