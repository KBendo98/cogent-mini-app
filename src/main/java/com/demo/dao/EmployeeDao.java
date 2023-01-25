package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {
	public void register(Employee e);
	public List<Employee> fetch();
}
