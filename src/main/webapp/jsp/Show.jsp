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
    <h1 style="text-align:center;padding:2%">ADD SHOW</h1>
    <form:form action="/saveShow" method="post" modelAttribute="show">
        
        <div class="form-data">
            <label class="form-label" for="id">Movie Id : </label>
            <form:input type="text" path="movieId" id="movieId" class="form-control-input" required="required"/>
        </div>
        <div class="form-data">
            <label class="form-label" for="date">Date: </label>
            <form:input type="text" path="date" id="date" class="form-control-input" required="required"/>
        </div>
        <div class="form-data">
            <label class="form-label" for="startTime">Start Time : </label>
            <form:input type="text" path="startTime" id="startTime" class="form-control-input" required="required"/>
        </div>
        <div class="form-data">
            <label class="form-label" for="endTime">End Time: </label>
            <form:input type="text" path="endTime" id="endTime" class="form-control-input" required="required"/>
        </div>
        <div class="form-data">
            <label class="form-label" for="seatMatrixID">Show Matrix To be Allocated : </label>
            <form:input type="text" path="seatMatrixID" id="seatMatrixID" class="form-control-input" required="required"/>
        </div>

        <button type="submit">ADD SHOW</button>
    </form:form>
</body>
</html>