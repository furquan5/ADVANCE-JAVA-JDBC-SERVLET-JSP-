package test;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProductsServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	PrintWriter pw = res.getWriter();
    	res.setContentType("text/html");
    	Cookie c[] = req.getCookies();//getting the cookie from request object
    	if(c==null){
    		pw.println("Please ! Login first...<br>");
    		RequestDispatcher rd = req.getRequestDispatcher("login.html");
    		rd.include(req,res);
    	}else{
    		String fName = c[0].getValue();
    		pw.println("Page of "+fName+"<br>");
    		RequestDispatcher rd = req.getRequestDispatcher("link.html");
    		rd.include(req,res);
    		pw.println("<br>");
    		ArrayList<ProductBean> al = new RetrieveDAO().retrieve();
    		if(al.size()==0){
    			pw.println("Products Not Available...<br>");
    		}else{
    			Iterator<ProductBean> it = al.iterator();
    			while(it.hasNext()){
    				ProductBean pb = (ProductBean)it.next();
    				pw.println(pb.getpCode()+"&nbsp&nbsp"+pb.getpName()+
    						"&nbsp&nbsp"+pb.getpPrice()+"&nbsp&nbsp"+
    						pb.getpQty()+"<br>");
    			}//end of loop
    		}
    	}
    }
}
