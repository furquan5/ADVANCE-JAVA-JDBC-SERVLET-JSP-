package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/insert")
public class InsertServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws 
								ServletException,IOException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		int k=new InsertDAO().insert(req);
		if(k>0) {
			pw.println("Book Details Inserted Successfully");
		}
	}
								

}
