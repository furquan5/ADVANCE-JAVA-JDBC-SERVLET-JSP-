package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/choice")
public class ChoiceServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	String s1 = req.getParameter("s1");
    	this.getServletContext().setAttribute("s1", s1);
    	if(s1.equals("AdminLogin")){
    		RequestDispatcher rd = req.getRequestDispatcher("login2.html");
    		rd.include(req,res);
    	}else{
    		RequestDispatcher rd = req.getRequestDispatcher("login.html");
    		rd.include(req,res);
    	}
    }
}
