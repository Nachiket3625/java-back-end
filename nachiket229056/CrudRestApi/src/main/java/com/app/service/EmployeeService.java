package com.app.service;

import com.app.entities.Employee;

public interface EmployeeService {
	public Employee addEmployeeDetails(Employee emp);
	public Employee getEmployeeDetails(String email,String password);
	public Employee updateEmployeeDetails(Employee emp);
	public String deleteEmployeeDetails(Long id);
	public Employee getEmployeeById(Long id);
}
