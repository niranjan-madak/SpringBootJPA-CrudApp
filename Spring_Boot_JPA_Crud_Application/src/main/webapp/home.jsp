<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addalien">
<table>
<tr><th>ID   :<input type="text" name="aid"><br></th></tr>
<tr><th>NAME :<input type="text" name="aname"><br></th></tr>

<tr><th><input type="submit" value="Add New Alien"><br></th></tr>

</table>
</form>
<form action="getAlien">
<input type="text" name="aid">
<input type="submit" value="View Alien">

</form>
</body>
</html>