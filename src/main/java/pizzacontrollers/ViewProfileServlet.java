package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.ViewProfileServlet", urlPatterns = "/profile")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
<<<<<<< HEAD:src/main/java/pizzacontrollers/ViewProfileServlet.java
        String username = (String) session.getAttribute("username");
        System.out.println(username + " just logged in.");
=======
        boolean isLoggedIn = session.getAttribute("username") != null;
        if (!isLoggedIn){
            response.sendRedirect("/login");
            return;
        }
>>>>>>> sessions-and-cookies-exercise:src/main/java/ViewProfileServlet.java
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }
}
