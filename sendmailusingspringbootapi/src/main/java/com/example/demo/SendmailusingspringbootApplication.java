package com.example.demo;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Mail1;
import com.example.demo.Service.EmailService;

@SpringBootApplication
@EnableScheduling
public class SendmailusingspringbootApplication {

	/*
	 * @Autowired private EmailService emailService;
	 */
	public static void main(String[] args) {
		SpringApplication.run(SendmailusingspringbootApplication.class, args);
	}
	
	/*
	 * @EventListener(ApplicationReadyEvent.class)
	 * 
	 * @Scheduled(fixedRateString = "PT01H", initialDelay = 10000)
	 * 
	 * @Order(1) public Object triggerEmail() throws MessagingException {
	 * System.out.println("working with attachment"); return
	 * emailService.sendEmailAttachment("sujatha.valluru@tectoro.com",
	 * "valluru.1sujatha@gmail.com",
	 * "valluru.1sujatha@gmail.com","this is test mail"
	 * ,"Hai","/home/tectoro/Desktop/Untitled Folder/sujatha.jpg"); }
	 * 
	 * 
	 * @EventListener(ApplicationReadyEvent.class)
	 * 
	 * @Scheduled(fixedRateString = "PT01H", initialDelay = 10000)
	 * 
	 * @Order(2) public Object triggerEmail1() throws MessagingException {
	 * System.out.println("working without attachment"); return
	 * emailService.sendEmailWithoutAttach("sujatha.valluru@tectoro.com",
	 * "valluru.1sujatha@gmail.com", "valluru.1sujatha@gmail.com",
	 * "Hi sujatha this is test mail", "Hi sujatha"); }
	 */
}
     