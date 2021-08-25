<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h2>
    <h2> show all employees</h2>
    <table>
        <tr><th>name </th>
            <th>surname </th>
            <th>department </th>
            <th>salary </th>
            <th>Options </th>
            <th>Delete </th>
        </tr>

        <c:forEach var="emp" items="${emlpList}">


            <c:url var="updateButton" value="/updateInfo">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>
            <c:url var="deleteButton" value="/deleteInfo">
                <c:param name="empId" value="${emp.id}"/>
            </c:url>

            <tr>
                <td>${emp.name}</td>
                <td>${emp.surname}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
                <td>
                    <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
                </td>
                <td>
                    <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'">
                </td>
            </tr>

        </c:forEach>
    </table>
    <br><br>
    <input type="button" value="Add"
    onclick ="window.location.href='imployeeInfo'">
</h2>
</body>
</html>