<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<<<<<<< HEAD
  <jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="All Ads" />
  </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
  <h1>Ads</h1>

  <c:forEach var="ad" items="${ads}">
    <div class="ad">
      <h3>${ad.title}</h3>
      <p>${ad.description}</p>
    </div>
  </c:forEach>
</div>

</body>
</html>
=======
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>

</body>
</html>
>>>>>>> sessions-and-cookies-lecture
