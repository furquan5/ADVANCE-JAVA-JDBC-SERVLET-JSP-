package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet{
       public void doPost(HttpServletRequest req,HttpServletResponse res)throws
       ServletException,IOException{
    	  PrintWriter pw = res.getWriter();
    	  res.setContentType("text/html");
    	  String fName = req.getParameter("fname");
    	  pw.println("WELCOME : "+fName+"<br>");
;       }
}
