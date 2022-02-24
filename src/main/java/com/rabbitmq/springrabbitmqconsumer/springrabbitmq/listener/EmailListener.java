package com.rabbitmq.springrabbitmqconsumer.springrabbitmq.listener;

import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.dto.EmailDTO;
import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.utils.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @RabbitListener(queues = MQConfig.EMAIL_QUEUE)
    public void listenerEmails(EmailDTO email){
        System.out.println("========================");
        System.out.println("Email → " + email.getAssunto());
        System.out.println("Conteudo → " + email.getConteudo());
        System.out.println("Destinatario → " + email.getDestinatario());
        System.out.println("========================");
    }
}
