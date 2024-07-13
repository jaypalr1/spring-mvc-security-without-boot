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

<c:if test="${not empty param.error}">
    <p style="color: red;">Invalid username or password!</p>
</c:if>

<c:if test="${not empty param.logout}">
    <p style="color: green;">You have been logged out successfully.</p>
</c:if>


<%--Default login processing url in earlier versions of spring 'j_spring_security_check'.
It is now changed to '/login'--%>
<div class="container">
    <form class="form-signin" method="post" action="login/authenticate">
        <h2 class="form-signin-heading">Please sign in</h2>
        <p>
            <label for="username" class="sr-only">Username</label>
            <input type="text" id="username" name="username" class="form-control"
                   placeholder="Username" required="" autofocus="" fdprocessedid="t043x8">
        </p>
        <p>
            <label for="password" class="sr-only">Password</label>
            <input type="password" id="password" name="password" class="form-control"
                   placeholder="Password" required="" fdprocessedid="zff1y">
        </p>
        <input name="_csrf" type="hidden"
               value="hagiDTM_ic5_5oYHDYyshz6K0w0gu4GCl5y7ZJDUzRzY_Pn2sJpAawMJva9S0bBkPqGY4V28_jQQiLKvp6XZBfXn-3_sy86V">
        <button class="btn btn-lg btn-primary btn-block" type="submit" fdprocessedid="pdel88">
            Sign in
        </button>
    </form>
</div>

</body>
</html>

