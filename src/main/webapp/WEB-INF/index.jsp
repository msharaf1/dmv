
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<!DOCType html>
<html>
	<head>
		<title>Index</title>
	</head>
	<body>
		<h1>People and License</h1>
		
		<form action="/add" method="post">
			<select name="license" >
				<c:forEach items="${allls}" var="license">
					<option value="${ license.id }" > ${license.state} </option>
				</c:forEach>
			</select>

			<select name="person">
				<c:forEach items="${allps}" var="person">
					<option value="${person.id }" > ${person.firstName} ${person.lastName} </option>
				</c:forEach>
			</select>
			
			<input type="submit" value="Add" />
		</form>

	
	</body>
</html>