package com.demo.dao;

import java.util.List;

import com.demo.model.Employee;

public interface EmployeeDao {
	public void register(Employee e);
	public int delete(Integer id);
	public List<Employee> fetch();
	public int update(Employee e);
}
