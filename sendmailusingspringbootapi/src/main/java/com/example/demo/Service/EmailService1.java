package com.example.demo.Service;

import com.example.demo.Model.Mail1;

public interface EmailService1 {
	
	public String sendMail();
	public String sendMailWithAttachment();
	public Object sendEmailWithoutattachments(Mail1 mail1);
	public Object sendEmailWithAttachments(Mail1 mail1);

}
