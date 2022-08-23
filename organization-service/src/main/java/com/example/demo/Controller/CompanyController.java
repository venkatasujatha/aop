package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Company;
import com.example.demo.Service.CompanyService;
import com.example.demo.vo.ResponseTemplateVo;

@RestController
@RequestMapping("/company")
public class CompanyController {
	
	@Autowired
	private CompanyService companyService;
	
	@PostMapping("/add")
	public Object saveCmp(@RequestBody Company company)
	{
		return companyService.saveCmp(company);
	}
	
	@GetMapping("/get/{cmpid}")
	public ResponseTemplateVo getCompanyWithEmployee(@PathVariable int cmpid)
	{
		return companyService.getCompanyWithEmployee(cmpid);
	}

}
