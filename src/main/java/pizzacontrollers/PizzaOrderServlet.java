package pizzacontrollers;

import pizzamodels.PostPizzaOrder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pizza-order")
public class PizzaOrderServlet extends HttpServlet {

    @Override
    protected void  doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        req.getRequestDispatcher("/pizzaOrder/pizza-order.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String size = req.getParameter("size");
        String crust = req.getParameter("crust");
        String sauce = req.getParameter("sauce");
        String[] toppings = req.getParameterValues("topping");
        String street = req.getParameter("street");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String zip = req.getParameter("zip");
        PostPizzaOrder submittedPizza = new PostPizzaOrder(size, crust, sauce, toppings, street, city, state, zip);
        String fontSizeRequested = req.getParameter("font-size");
        System.out.println(fontSizeRequested);
        req.setAttribute("post", submittedPizza);
        req.setAttribute("font", fontSizeRequested);
        req.getRequestDispatcher("/pizzaOrder/pizza-order.jsp").forward(req, resp);
    }


}
