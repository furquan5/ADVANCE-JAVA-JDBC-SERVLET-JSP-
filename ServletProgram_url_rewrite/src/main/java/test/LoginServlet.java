package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String fName=new LoginDAO().login(req);
		if(fName==null) {
			pw.println("Invalid login .......<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
			
		}else {
			pw.println("<a href='Welcome?fname="+fName+"'>display</a>");
			//pw.println("<a href='welcome?fname="+fName+"'>display</a>");
		}
		
	}
	
	
}
