package com.rabbitmq.springrabbitmqconsumer.springrabbitmq.service;

import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public boolean enviarEmail(EmailDTO email){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("mateus.freitas7589@gmail.com");
        message.setTo(email.getDestinatario());
        message.setSubject(email.getAssunto());
        message.setText(email.getConteudo());
        emailSender.send(message);
        return true;
    }
}
