<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pick Your Color</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <style>
        #title {
            font-size: 16px;
        <c:if test="${font != null}">
            font-size: ${font}px;
        </c:if>
        }
    </style>
</head>
<body>
<div class="container">
    <h1>Color Picker!</h1>
    <form action="viewcolor.jsp" method="post">
        <label for="favcolor">What is Your Favorite Color?</label>
        <input type="text" name="favcolor" id="favcolor">
        <input type="submit" value="Submit">
    </form>
</div>

</body>
</html>
