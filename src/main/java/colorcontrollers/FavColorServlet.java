package colorcontrollers;

import colormodels.PostColor;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pickcolor")
public class FavColorServlet extends HttpServlet {

    @Override
    protected void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/colorPicker/pickcolor.jsp").forward(req, resp);
    }

    @Override
    protected void  doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String favcolor = req.getParameter("favcolor");
        resp.sendRedirect("/viewcolor?favcolor=" + favcolor);



        PostColor submittedColor = new PostColor(favcolor);
        req.setAttribute("favcolor", submittedColor);
        req.getRequestDispatcher("/colorPicker/viewcolor.jsp").forward(req, resp);
    }
}
