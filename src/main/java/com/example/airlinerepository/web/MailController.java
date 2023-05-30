package com.example.airlinerepository.web;

import com.example.airlinerepository.service.EmailService;
import com.example.airlinerepository.web.requesr.MailReq;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/sendMail")
    public void sendEmail(@RequestBody MailReq request) throws MessagingException {
        emailService.sendEmail(request);
    }
}
