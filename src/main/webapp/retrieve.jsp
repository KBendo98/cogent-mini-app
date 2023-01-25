<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %> 
<%@ page import = "com.demo.model.Employee" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
    <input type="button" value="Back" onclick="location.href='employeeForm.jsp'" />
</form>
<div style="margin:auto; width:50%">
<%
	List<Employee> list = (ArrayList<Employee>)request.getAttribute("result");
%>

<table border="1" bgcolor="yellow">
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Dept</th>
		<th>Salary</th>
	</tr>
	<%
	for(int i=0; i<list.size(); i++){
		Employee e = list.get(i);
	%>
	<tr>
		<td>&nbsp;<%=e.getId()%>&nbsp;</td>
		<td>&nbsp;<%=e.getName()%>&nbsp;</td>
		<td>&nbsp;<%=e.getDept()%>&nbsp;</td>
		<td>&nbsp;<%=e.getSalary()%>&nbsp;</td>
	</tr>
	<%
	}
	%>
	
</table>
</div>
</body>
</html>