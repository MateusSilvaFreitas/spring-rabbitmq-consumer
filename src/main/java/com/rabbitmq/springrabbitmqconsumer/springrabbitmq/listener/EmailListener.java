package com.rabbitmq.springrabbitmqconsumer.springrabbitmq.listener;

import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.dto.EmailDTO;
import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.service.EmailService;
import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.utils.MQConfig;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailListener {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = MQConfig.EMAIL_QUEUE)
    public void listenerEmails(EmailDTO email){
        System.out.println("========================");
        System.out.println("Assunto → " + email.getAssunto());
        System.out.println("Conteudo → " + email.getConteudo());
        System.out.println("Destinatario → " + email.getDestinatario());
        System.out.println("========================");
        emailService.enviarEmail(email);
    }
}
