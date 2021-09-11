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
		Cookie c[] = req.getCookies();
		if(c==null){
			pw.println("Please ! Login first...<br>");
		}else{
			c[0].setMaxAge(0);//Cookie object is destroyed(Invalidated)
			pw.println("User LoggedOut Successfully...<br>");
		}
		RequestDispatcher rd=req.getRequestDispatcher("login.html");
		rd.include(req, res);
	}
}