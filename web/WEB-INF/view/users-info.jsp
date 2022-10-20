<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2> User Info</h2>
<br>

<%--@elvariable id="user" type=""--%>
<form:form action="saveUser" modelAttribute="user">
  Id <form:input path="id"/>
  <br><br>
  Name <form:input path="name"/>
  <br><br>
  Surname <form:input path="surname"/>
  <br><br>
  <input type="submit" value="ok">


</form:form>

</body>

</html>
