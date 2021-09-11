package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
@SuppressWarnings("serial")
@WebServlet("/login")
public class LoginServlet extends HttpServlet{
   public void doPost(HttpServletRequest req,HttpServletResponse res)throws
   ServletException,IOException
   {
	   String fName = new LoginDAO().login(req);
	   if(fName==null){
		   RequestDispatcher rd = req.getRequestDispatcher("Invalid.jsp");
		   rd.forward(req,res);
	   }else{	
		  Cookie ck = new Cookie("fName",fName);
		  res.addCookie(ck);//adding cookie to response
	      this.getServletContext().setAttribute("fName",fName);
	      RequestDispatcher rd = req.getRequestDispatcher("Valid.jsp");
	      rd.forward(req,res);
	   }
   }
}
