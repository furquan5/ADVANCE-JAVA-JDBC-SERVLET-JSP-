package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/code")
public class CodeServlet extends HttpServlet{
    @Override
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws
    ServletException,IOException{
    	Cookie c[] = req.getCookies();
    	if(c==null){
    		req.getRequestDispatcher("Invalid.jsp").forward(req,res);
    	}else{
    		String fName = c[0].getValue();
    		req.setAttribute("fName",fName);
          	String s2 = req.getParameter("s2");
    	    if(s2.equals("Update")){
                 ProductBean pb = new RetrieveDAO2().retrieve(req);
                 req.setAttribute("pb",pb);
                 req.getRequestDispatcher("Update.jsp").forward(req,res);
    	     }else{
    		    int k = new DeleteDAO().delete(req);
    		    if(k>0){
    		    	req.getRequestDispatcher("DeleteSuccess.jsp").forward(req,res);
    		    }
    	     }
    	}
    }
}
