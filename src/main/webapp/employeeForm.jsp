<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Form</title>
</head>
<body>
<form action="RegisterServlet" method="post">
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
    <td><input type="submit" value="Submit"></td>
  </tr>
</table>
</form>
<br>
<form>
    <input type="button" value="Retrieve Data" onclick="location.href='FetchServlet'" />
</form>
</body>
</html>