package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/dis")
public class Assignment implements Servlet{
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
		String uName = req.getParameter("uName");
		long mNo = Long.parseLong(req.getParameter("mNo"));
		long age = Long.parseLong(req.getParameter("age"));
		long cDuration = Long.parseLong(req.getParameter("cDuration"));
		String addr = req.getParameter("addr");
		

		pw.println("===The Details of Book Product is as follows===<br>");
		pw.println("The Book Name is :" +uName+"<br>");
		pw.println("The Book Code is :"+mNo+"<br>");
		pw.println("The Book Price is :"+age+"<br>");
		pw.println("The Book Quantity is :"+cDuration+"<br>");
		pw.println("The address is :"+addr+"<br>");
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
