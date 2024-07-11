<%--
  User: jrath
  Date: 09-07-2024
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!doctype html>
<html lang="en">
<head>
    <title>Login Page</title>
</head>
<body>

<h2>Login</h2>

<%--<c:if test="${not empty error}">--%>
<%--    <p style="color: red;">${error}</p>--%>
<%--</c:if>--%>

<%--<form action="authenticate" method="post">--%>
<%--    <div>--%>
<%--        <label for="username">Username:</label>--%>
<%--        <input type="text" id="username" name="username" required>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label for="password">Password:</label>--%>
<%--        <input type="password" id="password" name="password" required>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <button type="submit">Login</button>--%>
<%--    </div>--%>
<%--</form>--%>

<c:if test="${not empty param.error}">
    <p style="color: red;">Invalid username or password!</p>
</c:if>

<c:if test="${not empty param.logout}">
    <p style="color: green;">You have been logged out successfully.</p>
</c:if>

<%--Default login processing url in earlier versions of spring 'j_spring_security_check'.
It is now changed to '/login'--%>
<form action="authenticate" method="post">
    <div>
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
    </div>
    <div>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
    </div>
    <div>
        <button type="submit">Login</button>
    </div>
</form>

</body>
</html>

