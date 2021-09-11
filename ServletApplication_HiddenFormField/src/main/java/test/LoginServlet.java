package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	PrintWriter pw = res.getWriter();
    	res.setContentType("text/html");
    	String fName = new LoginDAO().login(req);
    	if(fName==null){
    		pw.println("Invalid Login...<br>");
    		RequestDispatcher rd = req.getRequestDispatcher("login.html");
    		rd.include(req,res);
    	}else{
     		pw.println("<form action='welcome' method='post'>");
     		pw.println("<input type='hidden' name='fname' value='"+fName+"'><br>");
     		pw.println("<input type='submit' value='Display'>");
     		pw.println("</form>");
    	}
    }
}
