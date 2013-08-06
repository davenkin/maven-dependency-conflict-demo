package goodbye;

import projectB.GoodByeService;
import projectC.GoodByeAdapter;
import projectcommon.HelloWorld;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with IntelliJ IDEA.
 * User: davenkin
 * Date: 8/7/13
 * Time: 12:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class GoodByeServlet extends HttpServlet {
    private GoodByeService goodByeService;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>" + goodByeService.sayGoodBye() + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }

    public void init() {
        goodByeService = new GoodByeService(new GoodByeAdapter(new HelloWorld()));
    }
}
