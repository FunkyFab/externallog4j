package in .infosys.test.externallog4j;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.apache.log4j.*;
public class OtherServlet extends HttpServlet {
    private Logger log;
    public void init(ServletConfig config) throws ServletException {
        log = Logger.getLogger(getClass());
        log.info("Servlet initializing");
    }
    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        res.setContentType("text/html"); //setting the content type  
        PrintWriter pw = res.getWriter(); //get the stream to write the data  

        //writing html in the stream  
        pw.println("<html><body>");
        pw.println("Log4j says hello");
        pw.println("</body></html>");

        pw.close(); //closing the stream  
        log.info("There was request");
    }
}