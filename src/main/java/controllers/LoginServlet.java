package controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
<<<<<<< HEAD:src/main/java/LoginServlet.java
        HttpSession session = request.getSession();
        boolean isLoggedIn = session.getAttribute("username") != null;
        if (isLoggedIn){
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/login.jsp").forward(request, response);
        HttpSession session = request.getSession();
        String language = (String) session.getAttribute("language");
        System.out.println("Language preference: " + language);
=======
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
>>>>>>> jdbc-lecture:src/main/java/controllers/LoginServlet.java
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password") || username.equals("cynthia") && password.equals("password");

        if (validAttempt) {
<<<<<<< HEAD:src/main/java/LoginServlet.java
            session.setAttribute("username", username);
<<<<<<< HEAD
            session.removeAttribute("language");
=======
>>>>>>> sessions-and-cookies-exercise
=======
            request.getSession().setAttribute("user", username);
>>>>>>> jdbc-lecture:src/main/java/controllers/LoginServlet.java
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}
