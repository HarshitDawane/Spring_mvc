package com.capg.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capg.repository.EmployeeDao;
import com.capg.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Transactional
	public int save(Employee emp) {
		
		return dao.create(emp);
		
	}

}