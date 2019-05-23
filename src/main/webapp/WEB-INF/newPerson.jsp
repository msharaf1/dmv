<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-05-16
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create a Person</title>
</head>
<body>
    <div class="container">
        <h1>Add your name!</h1>
        <p><form:errors path="post.*"/></p>
        <form:form action="/person/new" method="POST" modelAttribute="personObj">
            <form:label path="firstName">First Name:</form:label>
            <%-- <form:errors path="firstName" /> --%>
            <form:input path="firstName" />

            <form:label path="lastName">Last Name: </form:label>
            <%-- <form:errors path="lastName"></form:errors> --%>
            <form:input path="lastName"></form:input>

            <%-- <form:label path="license">License: </form:label>
            <form:errors path="license"></form:errors>
            <form:input path="license"></form:input> --%>

            <input type="submit" value="Add a user!">
        </form:form>
    </div>

</body>
</html>
