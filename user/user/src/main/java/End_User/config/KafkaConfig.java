package End_User.config;

import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {

    private Logger logger= LoggerFactory.getLogger(KafkaConfig.class);
    @KafkaListener(topics = AppConstants.LOCATION_UPDATE_TOPIC, groupId =AppConstants.GROUP_ID)
    public  void updatedLocation(String value){
        System.out.println(value);

    }
}
