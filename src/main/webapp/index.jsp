<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cal.ms.com</title>
<body bgcolor="white">
<form method="get" action="./CalculateServlet">

Number 1 : <input type="text" name="no1"> <br>
Number 2 : <input type="text" name="no2"> <br>


<select name="opt">
<option value="1" selected="selected"> + </option>
<option value="2"> - </option>
<option value="3"> * </option>
<option value="4"> / </option>
</select>

<br>
<input type="submit" value="Go">
</form>
</body>
</html>