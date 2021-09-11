package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class FirstServlet extends GenericServlet{
	public void service(ServletRequest req, ServletResponse res)throws ServletException,IOException{
		ServletContext sct=this.getServletContext();  //Accesing Servlet context respone
		ServletConfig sc=this.getServletConfig();  //Accessing servlet config reference
		sct.setAttribute("x", 100);
		req.setAttribute("y", 200);
		int b=Integer.parseInt(sc.getInitParameter("b"));
		req.setAttribute("b", b);
		RequestDispatcher rd=req.getRequestDispatcher("second");
		rd.forward(req, res);
	}

}
