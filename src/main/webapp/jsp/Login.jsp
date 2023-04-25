<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1 style="text-align:center;padding:2%">LOGIN</h1>
    <form:form action="/loginUser" method="post" modelAttribute="login">
        
        <div class="form-data">
            <label class="form-label" for="email">Email : </label>
            <form:input type="text" path="email" id="email" class="form-control-input" required="required"/>
        </div>
        <div class="form-data">
            <label class="form-label" for="password">Password: </label>
            <form:input type="text" path="password" id="password" class="form-control-input" required="required"/>
        </div>
        
        <button type="submit">LOGIN</button> 
    </form:form>

</body>
</html>