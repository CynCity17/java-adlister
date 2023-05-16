<<<<<<< HEAD
=======
<<<<<<<< HEAD:src/main/java/LogoutServlet.java
========
>>>>>>> jdbc-exercise
package controllers;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
<<<<<<< HEAD
import java.io.IOException;

<<<<<<<< HEAD:src/main/java/pizzacontrollers/CounterServlet.java
<<<<<<< HEAD:src/main/java/pizzacontrollers/CounterServlet.java
@WebServlet(name = "controllers.CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

=======
@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
>>>>>>> sessions-and-cookies-lecture:src/main/java/HelloWorldServlet.java
========
@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
>>>>>>>> jdbc-lecture:src/main/java/controllers/LogoutServlet.java
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("user");
        request.getSession().invalidate();
        response.sendRedirect("/login");
=======
>>>>>>>> jdbc-exercise:src/main/java/controllers/LogoutServlet.java
import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "LogoutServlet", urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet  {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// Get the user from the session
        HttpSession session = request.getSession();
        session.invalidate();

// Redirect to the login page
        response.sendRedirect("/login");

>>>>>>> jdbc-exercise
    }
}
