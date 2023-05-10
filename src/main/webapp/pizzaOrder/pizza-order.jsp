<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Pizza...Your Way</title>
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
<jsp:include page="/partials/navbar.jsp" />
<div class="container">
    <h1>Order Form</h1>
<form action="pizza-order" method="post">
    <fieldset>
    <legend>Select Your Size, Crust Type, & Sauce</legend>
        <label for="size">Choose your size</label>
        <select name="size" id="size">
            <option value="">--Please choose an option--</option>
            <option value="personal">Personal</option>
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <br>
        <label for="crust">Pick Your Crust:</label>
        <select name="crust" id="crust">
            <option value="">--Please choose an option--</option>
            <option value="thin">Thin Crust</option>
            <option value="handtossed">Hand-Tossed Crust</option>
            <option value="brooklyn">Brooklyn-Style Crust</option>
            <option value="chicago">Chicago-Style Crust</option>
        </select>
        <br>
        <label for="sauce">Pick Your Sauce:</label>
        <select name="sauce" id="sauce">
            <option value="">--Please choose an option--</option>
            <option value="none">No Sauce</option>
            <option value="marinara">Marinara</option>
            <option value="pesto">Pesto</option>
            <option value="alfredo">Alfredo</option>
            <option value="buffalo">Buffalo</option>
        </select>
        </fieldset>
        <fieldset>
            <legend>Pick Your Toppings:</legend>
            <label for="fresh-basil">Fresh Basil</label>
            <input type="checkbox" name="topping" value="fresh-basil" id="fresh-basil">
            <br>
            <label for="pineapple">Pineapple</label>
            <input type="checkbox" name="topping" value="pineapple" id="pineapple">
            <br>
            <label for="sun-dried">Sun Dried Tomatoes</label>
            <input type="checkbox" name="topping" value="sun-dried" id="sun-dried">
            <br>
            <label for="fresh-mozz">Fresh Mozzarella</label>
            <input type="checkbox" name="topping" value="fresh-mozz" id="fresh-mozz">
            <br>
            <label for="asiago">Asiago Cheese</label>
            <input type="checkbox" name="topping" value="asiago" id="asiago">
            <br>
            <label for="pepperoni">Pepperoni</label>
            <input type="checkbox" name="topping" value="pepperoni" id="pepperoni">
            <br>
            <label for="prosciutto">Prosciutto</label>
            <input type="checkbox" name="topping" value="prosciutto" id="prosciutto">
            <br>
        </fieldset>
        <fieldset>
        <legend>Enter Delivery Address</legend>
        <label for="street">Apt/House Number & Street Name:</label>
        <input type="text" name="street" id="street">
        <label for="city">City:</label>
        <input type="text" name="city" id="city">
        <label for="state">State:</label>
        <input type="text" name="state" id="state">
        <label for="zip">Zip Code:</label>
        <input type="text" name="zip" id="zip">
        </fieldset>
    <input type="submit" value="Submit">
</form>
    <c:if test="${post != null}">
        <h2>Your Pizza Order:</h2>
        <p>${post.size}</p>
        <p>${post.crust}</p>
        <p>${post.sauce}</p>
        <p>Toppings:</p>
        <ul>
            <c:forEach var="topping" items="${post.toppings}">
                <li>${topping}</li>
            </c:forEach>
        </ul>
        <p>Your Delivery Address is: </p>
        <p>${post.street},</p>
        <p>${post.city}, ${post.state} ${post.zip}</p>
    </c:if>
</div>

</body>
</html>

