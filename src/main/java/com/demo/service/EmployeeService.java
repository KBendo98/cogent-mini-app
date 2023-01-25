package com.demo.service;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeService {
	public void register(Employee e);
	public List<Employee> fetch();
}
