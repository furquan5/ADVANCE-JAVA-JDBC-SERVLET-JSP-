package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/login")

public class LoginServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws
	ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		String fName = new LoginDAO().login(req);
		if(fName==null){
			pw.println("Invalid UserName or Password...<br>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
			rd.include(req,res);
		}else{
			pw.println("Login Successfull...<br>");
			pw.println("WELCOME "+fName);
		}
	}
}