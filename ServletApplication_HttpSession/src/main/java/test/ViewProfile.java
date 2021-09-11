package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfile extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	PrintWriter pw = res.getWriter();
    	res.setContentType("text/html");
    	HttpSession hs = req.getSession(false);
    			//Access existing Session object without creating new object
    	if(hs==null){
    		pw.println("Please ! Login first...<br>");
    		RequestDispatcher rd = req.getRequestDispatcher("login.html");
    		rd.include(req,res);
    	}else{
    		String fName = (String)hs.getAttribute("fname");
    		UserBean ub = (UserBean)hs.getAttribute("bean");
    		pw.println("Page of "+fName+"<br>");
    		RequestDispatcher rd = req.getRequestDispatcher("link.html");
    		rd.include(req,res);
    		pw.println("<br>");
    		pw.println("====User Details====<br>");
    		pw.println(ub.getfName()+"&nbsp&nbsp"+ub.getlName()+"&nbsp&nbsp"+
    		ub.getAddr()+"&nbsp&nbsp"+ub.getPhNO()+"&nbsp&nbsp"+ub.getmId());
    	}
    }
}
