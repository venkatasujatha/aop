package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Company;
import com.example.demo.Repository.CompanyRepository;
import com.example.demo.vo.Employee;
import com.example.demo.vo.ResponseTemplateVo;

@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyRepository companyRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Object saveCmp(Company company) {
		
		return companyRepository.save(company);
	}

	@Override
	public ResponseTemplateVo getCompanyWithEmployee(int cmpid) {
		
		ResponseTemplateVo templateVo=new ResponseTemplateVo();
		Company company = companyRepository.findById(cmpid).get();
		Employee employee=restTemplate.getForObject("localhost:9091/getbyid"+company.getEmpid(),Employee.class);
		templateVo.setCompany(company);
		templateVo.setEmployee(employee);
		return templateVo;
	}

}
