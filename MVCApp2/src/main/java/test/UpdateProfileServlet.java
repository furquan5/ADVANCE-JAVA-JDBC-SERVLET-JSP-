package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProfileServlet extends HttpServlet{
  @Override
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws
  ServletException,IOException{
	  HttpSession hs = req.getSession(false);
	  if(hs==null){
		  req.setAttribute("msg","Please ! Login first...");
		  RequestDispatcher rd = req.getRequestDispatcher("Logout.jsp");
		  rd.forward(req,res);
	  }else{
		 UserBean ub = (UserBean)hs.getAttribute("ub");
		 ub.setAddr(req.getParameter("addr"));
		 ub.setPhNo(Long.parseLong(req.getParameter("phno")));
		 ub.setmId(req.getParameter("mid"));
		 int k = new UpdateDAO().update(ub);
		 if(k>0){
			 RequestDispatcher rd = req.getRequestDispatcher("Update.jsp");
			 rd.forward(req,res);
		 }
	  }
  }
}
