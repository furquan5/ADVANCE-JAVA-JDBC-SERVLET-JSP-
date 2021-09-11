package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet{
   @Override
   public void doGet(HttpServletRequest req,HttpServletResponse res)throws
   ServletException,IOException{
	  HttpSession hs = req.getSession(false);
	  if(hs==null){
		  req.setAttribute("msg","Please ! Login First...");
		  RequestDispatcher rd = req.getRequestDispatcher("Logout.jsp");
		  rd.forward(req,res);
	  }else{
		  RequestDispatcher rd = req.getRequestDispatcher("View.jsp");
		  rd.forward(req,res);
	  }
   }
}
