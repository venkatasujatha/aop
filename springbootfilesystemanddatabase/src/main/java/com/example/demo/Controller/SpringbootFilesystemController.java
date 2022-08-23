package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.Service.ServiceImpl;
import com.example.demo.dto.FileUploadResponse;

public class SpringbootFilesystemController {
	
	
	@Autowired
	private ServiceImpl impl;
	
	
	public SpringbootFilesystemController(ServiceImpl impl) {
		super();
		this.impl = impl;
	}


	@PostMapping("/single/upload")
	public ResponseEntity<FileUploadResponse> singleFileUpload(@RequestParam("file") MultipartFile multipartFile)
	{
		String fileName=impl.storeFile(multipartFile);
		FileUploadResponse response=new FileUploadResponse(filename, contenttype, url);
		return null;
		
	}

}
