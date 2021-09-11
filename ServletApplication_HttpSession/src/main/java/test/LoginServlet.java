package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res)throws ServletException ,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		UserBean ub=new LoginDAO().login(req);
		if(ub==null) {
			pw.println("Invalid Login....<br>");
			RequestDispatcher rd=req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}else {
			HttpSession hs=req.getSession();
			hs.setAttribute("fname",ub.getfName());
			hs.setAttribute("bean", ub);
			pw.println("Welcome "+ub.getfName()+"<br>");
			RequestDispatcher rd=req.getRequestDispatcher("link.html");
			rd.include(req, res);
			
		}
		
	}
}
