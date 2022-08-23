package com.example.demo.service;

import javax.mail.MessagingException;

import com.example.demo.model.Mail1;

public interface EmailService1 {

	public String sendMail();

	public String sendMailWithAttachment();

	public Mail1 sendEmailWithoutattachments(Mail1 mail1);

	public Object sendEmailWithAttachments(Mail1 mail2) throws MessagingException;

}
