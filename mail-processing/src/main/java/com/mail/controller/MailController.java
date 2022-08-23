package com.mail.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mail.service.MailInterface;

@RestController
public class MailController {
	@Autowired
	MailInterface mailInterface;
	
	
	public Object sendMail(@RequestBody String from,@RequestBody String to,@RequestBody String cc,@RequestBody String subject,@RequestBody String body) throws MessagingException {
		
		mailInterface.sendEmailWithoutAttach(from, to, cc, subject, body);
		return "";
	}

}
