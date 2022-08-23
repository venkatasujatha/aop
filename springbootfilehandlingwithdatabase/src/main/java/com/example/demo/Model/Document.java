package com.example.demo.Model;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Document {
	@Id
	private int id;
	
	@Column(length = 512,nullable = false,unique = true)
	private String name;
	
	private long size;
	private Date uploadtime;
	private byte[] content;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size = size;
	}
	public Date getUploadtime() {
		return uploadtime;
	}
	public void setUploadtime(Date uploadtime) {
		this.uploadtime = uploadtime;
	}
	public byte[] getContent() {
		return content;
	}
	public void setContent(byte[] content) {
		this.content = content;
	}
	public Document(int id, String name, long size, Date uploadtime, byte[] content) {
		super();
		this.id = id;
		this.name = name;
		this.size = size;
		this.uploadtime = uploadtime;
		this.content = content;
	}
	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Document [id=" + id + ", name=" + name + ", size=" + size + ", uploadtime=" + uploadtime + ", content="
				+ Arrays.toString(content) + "]";
	}
	
	

}
