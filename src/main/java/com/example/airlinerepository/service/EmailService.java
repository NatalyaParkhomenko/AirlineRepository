package com.example.airlinerepository.service;

import com.example.airlinerepository.web.requesr.MailReq;
import jakarta.mail.MessagingException;
import jakarta.validation.constraints.Email;

public interface EmailService {
    void sendEmail(MailReq request) throws MessagingException;
}
