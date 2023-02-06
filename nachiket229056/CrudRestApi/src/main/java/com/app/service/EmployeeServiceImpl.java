package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entities.Employee;
import com.app.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	public Employee addEmployeeDetails(Employee emp) {
		return empRepo.save(emp);
	}

	@Override
	public Employee getEmployeeDetails(String email,String password) {
		// TODO Auto-generated method stub
		return empRepo.findByEmailAndPassword(email,password);
	}

	@Override
	public Employee updateEmployeeDetails(Employee emp) {
		// TODO Auto-generated method stub
		return empRepo.save(emp);
	}

	@Override
	public String deleteEmployeeDetails(Long id) {
		// TODO Auto-generated method stub
		 empRepo.deleteById(id);
		 return "Deleted Successfully";
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return empRepo.findById(id).get();
	}
}
