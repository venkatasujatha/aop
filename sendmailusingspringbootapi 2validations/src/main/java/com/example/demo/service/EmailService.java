package com.example.demo.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.example.demo.model.Mail1;
import com.example.demo.repository.EmailRepository;

@Service
public class EmailService implements EmailService1 {

	@Autowired
	JavaMailSender mailSender;

	@Autowired
	private EmailRepository emailRepository;

	public String sendMail() {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom("sujatha.valluru@tectoro.com");
		mailMessage.setTo("valluru.1sujatha@gmail.com");
		mailMessage.setCc("valluru.1sujatha@gmail.com");
		mailMessage.setSubject("Hi");
		mailMessage.setText("i am sending test mail");

		mailSender.send(mailMessage);

		return "mail sent successfully";
	}

	public String sendMailWithAttachment() {
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
			messageHelper.setFrom("sujatha.valluru@tectoro.com");
			messageHelper.setTo("valluru.1sujatha@gmail.com");
			messageHelper.setCc("valluru.1sujatha@gmail.com");
			messageHelper.setText("i am sending test mail");
			messageHelper.setSubject("Hi");
			File file = new File("/home/tectoro/Downloads/laptop.jpg");
			messageHelper.addAttachment(file.getName(), file);
			mailSender.send(mimeMessage);

			return "mail send successfully";
		} catch (Exception e) {
			return "mail send failed";
		}
	}

	public Mail1 sendEmailWithoutattachments(Mail1 mail1) {

		SimpleMailMessage mailMessage = new SimpleMailMessage();

		mailMessage.setFrom(mail1.getFrom());
		mailMessage.setTo(mail1.getTo());
		mailMessage.setCc(mail1.getCc());

		mailMessage.setSubject(mail1.getSubject());
		mailMessage.setText(mail1.getTextbody());
		mailSender.send(mailMessage);
		emailRepository.save(mail1);
		return mail1;
	}

	public Mail1 sendEmailWithAttachments(Mail1 mail2) throws MessagingException {

		MimeMessage mimeMessage = mailSender.createMimeMessage();
		
			MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);

			messageHelper.setFrom(mail2.getFrom());
			messageHelper.setTo(mail2.getTo());
			messageHelper.setCc(mail2.getCc());
			messageHelper.setSubject(mail2.getSubject());
			messageHelper.setText(mail2.getTextbody());
			File file = new File(mail2.getFilepath());
			messageHelper.addAttachment(file.getName(), file);

			mailSender.send(mimeMessage);
			emailRepository.save(mail2);
			return mail2;

		
	}

	public Object sendEmailAttachment(String from, String to, String cc, String subject, String body, String attachment)
			throws MessagingException {
		MimeMessage mimeMessage = mailSender.createMimeMessage();
		MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
		mimeMessageHelper.setFrom(from);
		mimeMessageHelper.setTo(to);
		mimeMessageHelper.setCc(cc);
		mimeMessageHelper.setSubject(subject);
		mimeMessageHelper.setText(body);

		FileSystemResource fileSystemResource = new FileSystemResource(new File(attachment));
		mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
		mailSender.send(mimeMessage);
		System.out.println("email with attachment send successfully");

		return "email with attachment send successfully";
	}

	public Object sendEmailWithoutAttach(String from, String to, String cc, String subject, String body)
			throws MessagingException {
		SimpleMailMessage mailMessage = new SimpleMailMessage();
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
