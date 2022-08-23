package com.example.demo.dto;

public class FileUploadResponse {
	
	private String filename;
	private String contenttype;
	private String url;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getContenttype() {
		return contenttype;
	}
	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public FileUploadResponse(String filename, String contenttype, String url) {
		super();
		this.filename = filename;
		this.contenttype = contenttype;
		this.url = url;
	}
	public FileUploadResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FileUploadResponse [filename=" + filename + ", contenttype=" + contenttype + ", url=" + url + "]";
	}
	

}
