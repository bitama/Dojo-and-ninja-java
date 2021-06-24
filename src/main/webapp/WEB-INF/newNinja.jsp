<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
     <form:form action="/ninjas" method="post" modelAttribute="addNinja">
	      <form:input path="firstName" placeholder="Your fname here..."/>
	      <form:errors path="firstName" class="text-danger" />
	      
	      <form:input path="lastName" placeholder="Your lname here..."/>
	      <form:errors path="lastName" class="text-danger" />
	      
	      <form:input path="age" placeholder="Your age here..."/>
	      <form:errors path="age" class="text-danger" />
	      <select name="dojo">
	            <c:forEach items="${allDojos}" var="tom">
	                 <option value="${tom.id}">${tom.name} ${tom.id}</option>
	            </c:forEach>
	      </select>
	      <input type="submit" value="Add Dojo" class="btn btn-sm btn-primary" />
    </form:form>
    <a href="/">Go Back to Home</a>
     </div>
</body>
</html>