package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/first")
public class FirstServlet implements Servlet{
	public void init(javax.servlet.ServletConfig sc)
			throws javax.servlet.ServletException
	{

		//No Code

	}

	public void service(ServletRequest req,ServletResponse res)
			throws javax.servlet.ServletException, java.io.IOException

	{
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("WELCOME to Servlet Programming....");
	}
	public void destroy()
	{

		//NoCode
	}
	

	public javax.servlet.ServletConfig getServletConfig()
	{
		return this.getServletConfig();
	}
	public java.lang.String getServletInfo()
	{
		return "FisrtServlet";
	}
}