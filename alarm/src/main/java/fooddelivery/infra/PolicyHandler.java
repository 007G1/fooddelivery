package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StartedCook'")
    public void wheneverStartedCook_AlarmKakaotalk(@Payload StartedCook startedCook){

        StartedCook event = startedCook;
        System.out.println("\n\n##### listener AlarmKakaotalk : " + startedCook + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CompletedCook'")
    public void wheneverCompletedCook_AlarmKakaotalk(@Payload CompletedCook completedCook){

        CompletedCook event = completedCook;
        System.out.println("\n\n##### listener AlarmKakaotalk : " + completedCook + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_AlarmKakaotalk(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener AlarmKakaotalk : " + rejected + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='StartedDelivery'")
    public void wheneverStartedDelivery_AlarmKakaotalk(@Payload StartedDelivery startedDelivery){

        StartedDelivery event = startedDelivery;
        System.out.println("\n\n##### listener AlarmKakaotalk : " + startedDelivery + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='CompletedDelivery'")
    public void wheneverCompletedDelivery_AlarmKakaotalk(@Payload CompletedDelivery completedDelivery){

        CompletedDelivery event = completedDelivery;
        System.out.println("\n\n##### listener AlarmKakaotalk : " + completedDelivery + "\n\n");


        

        // Sample Logic //

        

    }

}


