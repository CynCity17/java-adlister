import javax.servlet.ServletException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name="HelloWorldServlet", urlPatterns = "/hello")

public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        String name = req.getParameter("name");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        if (name != null) {
            out.println("<h3>Hello " + name + "!</h3>");
        } else {
            out.println("<h3>Hello, World!</h3>");
        }
    }
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.println("<h1>Hello, World!</h1>");
//    }
}
