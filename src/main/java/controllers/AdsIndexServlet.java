package controllers;

import dao.DaoFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
public class AdsIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        request.setAttribute("ads", DaoFactory.getAdsDao().all());
<<<<<<< HEAD:src/main/java/AdsIndexServlet.java
        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
        session.setAttribute("language", "en-us");
        session.invalidate();
=======
        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
>>>>>>> jdbc-lecture:src/main/java/controllers/AdsIndexServlet.java
    }
}
