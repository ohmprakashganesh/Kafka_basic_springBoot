package deliveryBoy.service;

import deliveryBoy.config.AppConstants;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    private Logger logger= LoggerFactory.getLogger(KafkaService.class);
    @Autowired
    private KafkaTemplate<String , String> kafkaTemplate;

    public  boolean updateLocation(String location){
        this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME,location );
        this.logger.info("messaged produced");
         return  true;
    }
}
