<%--
  User: jrath
  Date: 09-07-2024
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!doctype html>
<html lang="en">
<head>
    <title>Logout Page</title>
</head>
<body>

<div class="container">
    <form class="form-signin" method="post" action="logout">
        <h2 class="form-signin-heading">Are you sure you want to log out?</h2>
        <input name="_csrf" type="hidden"
               value="jBOF0jpTJcX8ZDjIkkrsloh9GpRLzZZqIxAebhK7wXimMnNavCC3tg8yE_TRVAitqmfY8L9EN6xzq6FHEyUsWHeOohmVCkZu">
        <button class="btn btn-lg btn-primary btn-block" type="submit">Log Out</button>
    </form>
</div>

</body>
</html>
