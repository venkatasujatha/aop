package com.mail.service;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

public class MailService implements MailInterface{

	@Autowired
	JavaMailSender mailSender;
	
	
	public Object sendEmailWithoutAttach(String from,String to,String cc,String subject,String body) throws MessagingException
	{
		SimpleMailMessage mailMessage=new SimpleMailMessage();
		mailMessage.setFrom(from);
		mailMessage.setTo(to);
		mailMessage.setCc(cc);
		mailMessage.setSubject(subject);
		mailMessage.setText(body);
			mailSender.send(mailMessage);
		System.out.println("mail is send");
		return "mail is send";
		
	}
}
