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
	   Cookie c[] = req.getCookies();
	   if(c==null){
		   RequestDispatcher rd = req.getRequestDispatcher("Invalid.jsp");
		   rd.forward(req,res);
	   }else{
		   c[0].setMaxAge(0);
	   }
	   RequestDispatcher rd = req.getRequestDispatcher("Logout.jsp");
	   rd.forward(req,res);
   }
}
