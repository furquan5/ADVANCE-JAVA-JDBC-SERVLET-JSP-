package test;
import java.io.*;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/display")
public class SelectServlet extends GenericServlet{
	public void service(ServletRequest req,ServletResponse res)throws 
													ServletException,IOException{
		try {
			PrintWriter pw=res.getWriter();
			res.setContentType("text/html");
			ResultSet rst=new RetrieveDAO().retrieve(req);
			if(rst.next()) {
				pw.println("======Display Details=======");
				pw.println("BookCode :"+rst.getString(1)+"<br>");
				pw.println("BookName:"+rst.getString(2)+"<br>");
				pw.println("BookQty:"+rst.getInt(3)+"<br>");
				pw.println("BookPrice: "+rst.getInt(4));
				
			}
		}catch(Exception e){e.printStackTrace();}
		
		
	}
	

}
