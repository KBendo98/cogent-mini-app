<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 1px solid black;
        padding: 10px;
    }
    th {
        background-color: #f2f2f2;
    }
</style>
</head>
<body>

<!-- Create -->
<form action="RegisterServlet" method="post">
<table>
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>Department</th>
    <th>Salary</th>
    <th>Actions</th>
  </tr>
  <tr>
    <td><input type="text" id="firstId" name="id"></td>
    <td><input type="text" name="name"></td>
    <td><input type="text" name="department"></td>
    <td><input type="text" name="salary"></td>
    <td>
        <input type="submit" value="Register">
    </td>
  </tr>
</table>
</form>
<br>
<!-- Delete -->
<form action="DeleteServlet" method="post">
    <tr>
    	<th>ID</th>
    	<td><input type="text" name="id" value="${param.id}"></td>
    </tr>
    <input type="submit" value="Delete"/>
</form>
<br>

<!-- Update -->
<form action="UpdateServlet" method="post">
  <table>
    <tr>
      <td>ID:</td>
      <td><input type="text" name="id"></td>
    </tr>
    <tr>
      <td>Name:</td>
      <td><input type="text" name="name"></td>
    </tr>
    <tr>
      <td>Department:</td>
      <td><input type="text" name="department"></td>
    </tr>
    <tr>
      <td>Salary:</td>
      <td><input type="text" name="salary"></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Update"></td>
    </tr>
  </table>
</form>
<br>

<!-- Retrieve -->
<form>
    <input type="button" value="Retrieve Data" onclick="location.href='FetchServlet'" />
</form>

</body>
</html>