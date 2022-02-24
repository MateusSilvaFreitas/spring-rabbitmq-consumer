package com.rabbitmq.springrabbitmqconsumer.springrabbitmq.listener;

import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.dto.EmailDTO;
import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.utils.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @RabbitListener(queues = MQConfig.EMAIL_QUEUE)
    public void listenerEmails(EmailDTO customMessage){
        System.out.println(customMessage);
    }
}
