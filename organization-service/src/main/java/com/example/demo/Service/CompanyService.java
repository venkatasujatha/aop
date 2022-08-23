package com.example.demo.Service;

import com.example.demo.Model.Company;
import com.example.demo.vo.ResponseTemplateVo;

public interface CompanyService {

	Object saveCmp(Company company);

	ResponseTemplateVo getCompanyWithEmployee(int empid);

}
