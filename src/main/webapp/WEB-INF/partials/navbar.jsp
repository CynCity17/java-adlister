<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">I'm the NAV BAR</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
<<<<<<< HEAD:src/main/webapp/partials/navbar.jsp
            <c:if test="${empty username}">
                <li><a href="/login">Login</a> </li>
            </c:if>
            <c:if test="${not empty username}">
                <li><a href="/logout">Logout</a></li>
            </c:if>
=======
            <li><a href="/login">Login</a></li>
            <li><a href="/logout">Logout</a></li>
>>>>>>> jdbc-lecture:src/main/webapp/WEB-INF/partials/navbar.jsp
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
