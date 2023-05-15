<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>
<body>
    <jsp:include page="/WEB-INF/partials/navbar.jsp" />

    <div class="container">
<<<<<<< HEAD:src/main/webapp/profile.jsp
<<<<<<< HEAD
        <h1>Welcome to your profile, ${username}!</h1>
        <p>Your language preference is: ${language}</p>
=======
        <h1>Welcom to your profile ${username}!</h1>
>>>>>>> sessions-and-cookies-exercise
=======
        <h1>Welcome, ${sessionScope.user}!</h1>
>>>>>>> jdbc-lecture:src/main/webapp/WEB-INF/profile.jsp
    </div>

</body>
</html>
