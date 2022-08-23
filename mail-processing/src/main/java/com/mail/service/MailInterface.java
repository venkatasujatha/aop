package com.mail.service;

import javax.mail.MessagingException;

public interface MailInterface {
	public Object sendEmailWithoutAttach(String from,String to,String cc,String subject,String body)throws MessagingException;

}
