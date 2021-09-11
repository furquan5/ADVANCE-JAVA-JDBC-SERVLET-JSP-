package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/Welcome")
public class WelcomeServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fName=req.getParameter("fname");
		pw.println("Welcome :"+fName);
	}
}
