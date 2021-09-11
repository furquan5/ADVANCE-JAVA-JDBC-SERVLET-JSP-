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
     		Cookie ck = new Cookie("fname",fName);//creating cookie
     		pw.println("WELCOME : "+fName+"<br>");
     		res.addCookie(ck);//Adding cookie to the response
     		RequestDispatcher rd = req.getRequestDispatcher("link.html");
     		rd.include(req,res);
    	}
    }
}
