package com.demo.service;

import java.util.List;

import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	EmployeeDao dao = new EmployeeDaoImpl();
	
	@Override
	public void register(Employee e) {
		dao.register(e);
	}

	@Override
	public List<Employee> fetch() {
		return dao.fetch();
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dao.delete(id);
	}

	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return dao.update(e);
	}

}
