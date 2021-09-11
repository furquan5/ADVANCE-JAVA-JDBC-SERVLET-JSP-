package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/add")
public class AddProductServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	Cookie c[] = req.getCookies();
    	if(c==null){
    	req.getRequestDispatcher("Invalid.jsp").forward(req,res);	
    	}else{
    	String fName = c[0].getValue();
    	req.setAttribute("fName",fName);
    	int k = new InsertDAO().insert(req);
    	if(k>0){
    		req.getRequestDispatcher("Add.jsp").forward(req,res);
    	 } 
    	}
    }
}
