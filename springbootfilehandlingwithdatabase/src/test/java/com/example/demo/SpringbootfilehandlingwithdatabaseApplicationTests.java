package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertSame;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Document;
import com.example.demo.Repository.DocumentRepository;
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)

class SpringbootfilehandlingwithdatabaseApplicationTests {
	@Autowired
	private DocumentRepository repository;
	
	@Autowired
	private TestEntityManager entityManager;

	@Test
	void contestDocument() throws IOException {
		File file=new File("/home/tectoro/Downloads/laptop.jpg");
		
		
		
		Document document=new Document();
		document.setName(file.getName());
		
		byte[] bytes = Files.readAllBytes(file.toPath());
		document.setContent(bytes);
		long filesize = bytes.length;
		document.setSize(filesize);
		document.setUploadtime(new Date());
		Document saveDoc = repository.save(document);
		Document existDoc=entityManager.find(Document.class, saveDoc.getId());
		
		((Object) assertThat(existDoc.getSize())).isequalTo(filesize);
	}

	private Object assertThat(long size) {
		// TODO Auto-generated method stub
		return null;
	}

}
