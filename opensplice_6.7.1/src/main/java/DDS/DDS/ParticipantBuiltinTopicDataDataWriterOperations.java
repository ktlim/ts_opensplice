package DDS;

public interface ParticipantBuiltinTopicDataDataWriterOperations extends
    DDS.DataWriterOperations
{

    long register_instance(
            DDS.ParticipantBuiltinTopicData instance_data);

    long register_instance_w_timestamp(
            DDS.ParticipantBuiltinTopicData instance_data, 
            DDS.Time_t source_timestamp);

    int unregister_instance(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long handle);

    int unregister_instance_w_timestamp(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int write(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long handle);

    int write_w_timestamp(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long handle, 
            DDS.Time_t source_timestamp);

    int dispose(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long instance_handle);

    int dispose_w_timestamp(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);
    
    int writedispose(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long instance_handle);

    int writedispose_w_timestamp(
            DDS.ParticipantBuiltinTopicData instance_data, 
            long instance_handle, 
            DDS.Time_t source_timestamp);

    int get_key_value(
            DDS.ParticipantBuiltinTopicDataHolder key_holder, 
            long handle);
    
    long lookup_instance(
            DDS.ParticipantBuiltinTopicData instance_data);

}
