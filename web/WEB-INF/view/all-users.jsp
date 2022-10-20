<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>

<h2>All Users</h2>
<br>

<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>operations</th>
        <tr/>

        <c:forEach var="emp" items="${allUsers}">
            <c:url var="updateButtom" value="/updateInfo">
                <c:param name="empId" value="${emp.id}">

                </c:param>

            </c:url>
            <tr>
                <td> ${emp.id}</td>
                <td> ${emp.name}</td>
                <td> ${emp.surname}</td>
                <td>
                    <input type="button" value="Update"
                    onClick="window.location.href= '${updateButtom}'">
                </td>
            </tr>

        </c:forEach>


    </tr>
</table>

<br>
<input type="button" value="add"
  onclick="window.location.href='addNewEmployee'"/>


</body>