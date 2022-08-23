package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Mail1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull(message = "from field should not be null")
	@Column(name = "_from")
	private String from;

	@NotNull(message = "to field should not be null")
	@Column(name = "_to")
	private String to;

	@NotNull(message = "cc field should not be null")
	@Column(name = "_cc")
	private String cc;

	@NotNull(message = "subject field should not be null")
	@Column(name = "_subject")
	private String subject;
	
	@NotNull(message = "textbody field should not be null")
	@Column(name = "_textbody")
	private String textbody;
	
	private String filepath;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTextbody() {
		return textbody;
	}

	public void setTextbody(String textbody) {
		this.textbody = textbody;
	}

	public String getFilepath() {
		return filepath;
	}

	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}

	public Mail1(int id, String from, String to, String cc, String subject, String textbody,String filepath) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.cc = cc;
		this.subject = subject;
		this.textbody = textbody;
		this.filepath=filepath;
	}

	public Mail1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mail1 [id=" + id + ", from=" + from + ", to=" + to + ", cc=" + cc + ", subject=" + subject
				+ ", textbody=" + textbody + ", filepath=" + filepath + "]";
	}

	

}
