package com.demo.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get parameters
		Integer id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dept = request.getParameter("department");
		Float salary = Float.parseFloat(request.getParameter("salary"));
						
		// Create employee object, and set its fields
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setDept(dept);
		e.setSalary(salary);
						
		// Update 
		EmployeeService eService = new EmployeeServiceImpl();
		int result = eService.update(e);
		
		if(result == 1)
			response.sendRedirect("updateSuccess.jsp");
		else {
			response.sendRedirect("deleteIssue.jsp");
		}
	}

}
