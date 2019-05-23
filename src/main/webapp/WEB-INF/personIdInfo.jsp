<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Person</title>
</head>
<body>
  <div class="container">
    <h1>List of all persons </h1>

      <table>
          <thead>
            <tr>
                <th>Person ID:</th>
                <th>First Name:</th>
                <th>Last Name:</th>
                <th>License:</th>
                <th>State:</th>
                <th>Expires:</th>
                <th>License ID:</th>
                <th>FK:</th>
            </tr>
          </thead>

          <tbody>
          <c:forEach items="${personList}" var="person">
            <tr>
                <td><c:out value="${person.id}"/></td>
                <td><c:out value="${person.firstName}"/></td>
                <td><c:out value="${person.lastName}"/></td>
                <td><c:out value="${person.license.licenseNumber}"/></td>
                <td><c:out value="${person.license.state}"/></td>
                <td><c:out value="${person.license.expirationDate}"/></td>
                <td><c:out value="${person.license.id}"/></td>
                <td><c:out value="${person.license.person.id}"/></td>

            </tr>
          </c:forEach>
          </tbody>
      </table>

     
      <a href="/person">Person Home</a>
      <a href="/person/new">Add a person</a>
      <a href="/license/new"> Add a license</a>





  </div>

</body>
</html>