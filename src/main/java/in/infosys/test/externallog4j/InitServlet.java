package in .infosys.test.externallog4j;
import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import org.apache.log4j.*;
public class InitServlet extends HttpServlet {
    private Logger log;
    public void init(ServletConfig config) throws ServletException {
        String path = config.getInitParameter("log4jpath");
        PropertyConfigurator.configure(path);
        log = Logger.getLogger(getClass());
        log.info("Log4j initialized");
    }
}