package controllers;

import dao.DaoFactory;
import models.Ad;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "controllers.CreateAdServlet", urlPatterns = "/ads/create")
public class CreateAdServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/ads/create.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Ad ad = new Ad(
                1, // for now we'll hardcode the user id
                request.getParameter("title"),
                request.getParameter("description")
        );
        try {
            DaoFactory.getAdsDao().insert(ad);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        response.sendRedirect("/ads");
    }
}
