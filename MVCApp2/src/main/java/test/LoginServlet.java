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
	   UserBean ub = new LoginDAO().login(req);
	   if(ub==null){
		   RequestDispatcher rd = req.getRequestDispatcher("Invalid.jsp");
		   rd.forward(req,res);
	   }else{	
		  HttpSession hs = req.getSession();//Creating Session
		  hs.setAttribute("fName",ub.getfName());//adding variable fName
		  hs.setAttribute("ub", ub);//adding variable uBean
	      RequestDispatcher rd = req.getRequestDispatcher("Valid.jsp");
	      rd.forward(req,res);
	   }
   }
}
