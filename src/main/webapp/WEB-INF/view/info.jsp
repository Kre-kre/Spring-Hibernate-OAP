<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info</title>
</head>
<body>
<h2> INFO </h2>
<br>

<form:form action="saveEmployee" modelAttribute="employee">



  <form:hidden path="id"/>

  Name <form:input path="name"/>
  <br>
  Surname <form:input path="surname"/>
  <br>
  Department <form:input path="department"/>
  <br>
  Salary <form:input path="salary"/>
  <br>
  <input type="submit" value="Ok">

</form:form>

</body>
</html>