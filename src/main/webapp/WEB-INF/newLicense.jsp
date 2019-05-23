<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-05-17
  Time: 04:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>New License</title>

</head>
<body>
    <div clas="container">
        <h1>Register License</h1>

       <%-- <form:form action="/license/new" method="POST" modelAttribute="licenseObj">
           <form:label path="${number}" >License Number: </form:label>
           <form:errors path="${number}" />
           <form:input path="${number}" />

           <p>
           <form:label path="${state}">State: </form:label>
           <form:errors path="${state}"/>
           <form:input path="${state}"/>
           </p>
           <p>
           <form:label path="${expirationDate}">Expires: </form:label>
           <form:errors path="${expirationDate}"/>
           <form:input path="${expirationDate}"/>
           </p>
           <input type="submit" value="Create">

       </form:form> --%>

        <form:form action="/license/new" method="post" modelAttribute="licenseObj">
            
            <form:select path="person">
                <c:forEach items="${allPs}" var="person">
                    <form:option value="${person.id}">${ person.firstName }</form:option>
                </c:forEach>
            </form:select>

            <form:label path="state">State:
                <form:errors path="state"></form:errors>
                <form:input path="state"></form:input>
            </form:label>

            <form:label path="expirationDate">Expires:
                <form:errors path="expirationDate"></form:errors>
                <form:input path="expirationDate"></form:input>
            </form:label>

            <input type="submit" value="Create" />
        </form:form>


<%-- 	<h1>License</h1>

		<form:form action="/home/license/new" method="post" modelAttribute="licenseObj">
		
			<form:label path="state">State:
                <form:errors path="state"></form:errors>
                <form:input path="state"></form:input>
            </form:label>
			<form:label path="state">State: </label>
			<form:errors path="state"/>
			<form:input path="state" />

            <form:label path="expirationDate">Expires:
                <form:errors path="expirationDate"></form:errors>
                <form:input path="expirationDate"></form:input>
            </form:label>
		</form:form>

		<h1>New Person</h1>
 

   <div class="container">
        <h1>Add your name!</h1>
        <form:form action="/home/person/new" method="POST" modelAttribute="personObj">
            <form:label path="firstName">First Name:</form:label>
            <form:errors path="firstName"/>
            <form:input path="firstName" />

            <form:label path="lastName">Last Name: </form:label>
            <form:errors path="lastName"></form:errors>
            <form:input path="lastName"></form:input>

            <form:label path="license">License: </form:label>
            <form:errors path="license"></form:errors>
            <form:input path="license"></form:input>

            <input type="submit" value="Add a user!">
        </form:form>
    </div> --%>


    </div>

</body>
</html>
