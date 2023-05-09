<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int count = 0; %>
<% count += 1; %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<%-- This is a JSP comment, you will NOT see this in the html --%>
<!-- this is an HTML comment, you WILL see this in the HTML -->
<h1>Implicit Objects in action:</h1>
<p>Path: <%= request.getRequestURL()%></p>
<p>Query String: <%= request.getQueryString()%></p>
<p>"name" parameter: <%= request.getParameter("name")%> </p>
<p>"method" attribute: <%= request.getMethod()%></p>
<h1> The current count is <%= count %></h1>

<h2>EL / Expression Language</h2>
<p>"name" parameter: ${param["name"]}</p>

<p>${"2.2 + 2.2"}</p>

<% request.setAttribute("numbers", new int[]{222, 777, 21, 7, 14, 3}); %>

<ul>
    <c:forEach items="${numbers}" var="number">
        <li>${number}</li>
    </c:forEach>
</ul>

<c:choose>
    <c:when test="${true}">
        <p>Expression 1 is true</p>
    </c:when>
    <c:when test=""></c:when>
</c:choose>


<c:if test="false">
    <h1>Variable names should be very descriptive</h1>
</c:if>
<c:if test="true">
    <h1>single letter variable names are good</h1>
</c:if>


</body>
</html>
