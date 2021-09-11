package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		HttpSession hs=req.getSession(false);
		if(hs==null){
			pw.println("Please ! Login first...<br>");
		}else{
			hs.invalidate();
			pw.println("User LoggedOut Successfully...<br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.include(req, res);
	}
}