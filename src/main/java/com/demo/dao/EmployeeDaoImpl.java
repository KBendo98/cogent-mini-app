package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;
import com.demo.utility.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void register(Employee e) {
		Connection connection = DBConnection.getConnection();
		
		try {
			PreparedStatement pStatement=connection.prepareStatement(
					"insert into employee values(?, ?, ?, ?)");
			pStatement.setInt(1, e.getId());
			pStatement.setString(2, e.getName());
			pStatement.setString(3, e.getDept());
			pStatement.setFloat(4, e.getSalary());
			
			int x = pStatement.executeUpdate();
			
			if(x!=0)
				System.out.println("Data inserted.");
			else {
				System.out.println("Query issue.");
			}
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> fetch() {
		Connection connection = DBConnection.getConnection();
		List<Employee> list = new ArrayList<>();
		
		try {
			PreparedStatement pStatement=connection.prepareStatement(
					"select * from employee");
			ResultSet rSet = pStatement.executeQuery();
			
			while(rSet.next()) {
				Employee e = new Employee();
				e.setId(rSet.getInt(1));
				e.setName(rSet.getString(2));
				e.setDept(rSet.getString(3));
				e.setSalary(rSet.getFloat(4));
				list.add(e);
			}
			
		} catch (SQLException e1) {
			System.out.println(e1.getMessage());
		}
		
		// Close connection
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
