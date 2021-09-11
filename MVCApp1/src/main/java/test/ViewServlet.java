package test;
import java.io.*;
import javax.servlet.*;
import java.util.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewServlet extends HttpServlet{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	Cookie c[] = req.getCookies();
    	if(c==null){
    	  RequestDispatcher rd = req.getRequestDispatcher("Invalid.jsp");
    	  rd.forward(req,res);
    	}else{
    	String fName = c[0].getValue();
    	req.setAttribute("fName",fName);
    	ArrayList<ProductBean> al = new RetrieveDAO().retrieve();
    	req.setAttribute("al", al);
    	RequestDispatcher rd = req.getRequestDispatcher("ViewProducts.jsp");
    	rd.forward(req,res);
    	}
    }
}
