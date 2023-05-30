package com.example.airlinerepository.service;

import com.example.airlinerepository.web.requesr.MailReq;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    private final JavaMailSender javaMailSender;
    @Value("$spring.mail.username")
    private String username;

    @Autowired
    public EmailServiceImpl(@Qualifier("getJavaMailSender") JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public void sendEmail(MailReq request) {
        try {
            MimeMessage message = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setFrom(username);
            helper.setTo(request.getTo());
            helper.setSubject(request.getSubject());
            helper.setText(request.getMessage());
            javaMailSender.send(message);
        } catch (MessagingException e){
            e.getMessage();
            System.out.println(e.getMessage());
        }
    }
}
