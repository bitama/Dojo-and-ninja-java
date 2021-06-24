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
      <div class="container">
          <h1>Tke a look at this Dojo and their student!!</h1>
          <h3>${thisDojo.name}</h3>
          <ul>
             <c:forEach items="${thisDojo.ninjas}" var="nin">
                 <li>${nin.firstName} ${nin.lastName}</li>
             </c:forEach>
          </ul>
          <a href="/">Go back to home</a>
      </div>
</body>
</html>