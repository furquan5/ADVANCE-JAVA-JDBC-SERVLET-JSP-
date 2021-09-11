package servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@WebServlet("/dis")
public class DisServlet implements Servlet{
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
		long phNo = Long.parseLong(req.getParameter("phNo"));
		String mailId = req.getParameter("mid");

		pw.println("===UserDetails===<br>");
		pw.println("UserName:"+uName+"<br>");
		pw.println("PhoneNo:"+phNo+"<br>");
		pw.println("MailId:"+mailId+"<br>");
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