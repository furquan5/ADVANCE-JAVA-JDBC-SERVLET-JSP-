package test;
import java.io.*;
import javax.servlet.*;
@SuppressWarnings("serial")
public class SecondServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String uname=req.getParameter("uname");
		ServletContext sct=this.getServletContext();
		int a=Integer.parseInt(sct.getInitParameter("a"));
		int b=(Integer)req.getAttribute("b");
		int x=(Integer)sct.getAttribute("x");
		int y=(Integer)req.getAttribute("y");
		
		pw.println("=====SecondServlet ======<br>");
		pw.println("Welcome"+ uname+"<br>");
		pw.println("ServletContext value : "+ a+"<br>");
		pw.println("ServletConfig value :"+ b +"<br>");
		pw.println("Context Attribute :"+ x + "<br>");
		pw.println("ConfigAttribute :"+y + "<br>");
		
		
	}

}
