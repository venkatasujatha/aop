package com.example.demo.controller;

import java.io.File;

import javax.mail.MessagingException;
import javax.validation.Valid;

import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Mail1;
import com.example.demo.service.EmailService;

@RestController
public class MailController {

	@Autowired
	private EmailService emailService;

	private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(MailController.class);

	@GetMapping("/sendmailwithout")
	@Scheduled(cron = "0 0 */1 * * *")
	public String sendMail() {

		LOGGER.info("this is info message");
		return emailService.sendMail();
	}

	@Scheduled(fixedRateString = "PT01H", initialDelay = 10000)
	@GetMapping("/sendmailwithattachment")
	public String sendMailWithAttachment() {
		return emailService.sendMailWithAttachment();
	}

	// @Scheduled(cron="*/1 * * * * *")

	@PostMapping("/save")

	public ResponseEntity<?> sendEmailWithoutattachments(@Valid @RequestBody Mail1 mail1) {

		return ResponseEntity.ok(emailService.sendEmailWithoutattachments(mail1));
	}

	// @Scheduled(fixedRateString = "PT01S")

	@PostMapping("/save1")
	public ResponseEntity<?> sendEmailWithAttachments(@Valid @RequestBody Mail1 mail2) throws MessagingException {
		
		return ResponseEntity.ok(emailService.sendEmailWithAttachments(mail2));
	}

}
