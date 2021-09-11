package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet{
   @Override
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws
   ServletException,IOException{
	   HttpSession hs = req.getSession(false);
	   if(hs==null){
		   req.setAttribute("msg","Please ! Login first....");
	   }else{
		   hs.invalidate();
		   req.setAttribute("msg","User Logged Out Successfully...");
	   }
	   RequestDispatcher rd = req.getRequestDispatcher("Logout.jsp");
	   rd.forward(req,res);
   }
}
