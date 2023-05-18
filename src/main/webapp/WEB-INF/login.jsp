<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Please Log In"/>
    </jsp:include>
</head>
<body>
<div class="page-wrapper">
    <jsp:include page="/WEB-INF/partials/navbar.jsp"/>
    <div class="container grow justify-center">
        <div class="row justify-center">
            <div class="column shrink gap-10">
                <h1>Please Log In</h1>
                <form action="/login" method="POST" class="d-flex flex-column gap-10">
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input id="username" name="username" class="form-control" type="text">
                    </div>
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input id="password" name="password" class="form-control" type="password">
                    </div>
                    <button type="submit" class="btn btn-primary big">Login</button>
                    <span>Don't have an account? <a class="link" href="/register">Register for Free</a></span>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
