<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
    <script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <div class="container mt-4">
     <h1> View All Dojos </h1>
       <ul>
           <c:forEach items="${allDojos}" var="tom">
           <li><a href="/showDojo/${tom.id}">${tom.name}</a></li>
           </c:forEach>
       </ul>
       <a href="/newDojo">Add a New Dojo</a><br>
       <a href="/ninjas">Add a New Ninja</a>
    </div>
     
</html>