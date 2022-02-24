package com.rabbitmq.springrabbitmqconsumer.springrabbitmq.service;

import com.rabbitmq.springrabbitmqconsumer.springrabbitmq.dto.EmailDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void enviarEmail(EmailDTO email) {

        try {
            MimeMessage mimeMessage = emailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");

            helper.setText(email.getConteudo(), true);
            helper.setTo(email.getDestinatario());
            helper.setSubject(email.getAssunto());
            helper.setFrom("eduardobacananoreply@gmail.com");

            emailSender.send(mimeMessage);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
