package test;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
@SuppressWarnings("serial")
@WebServlet("/update")
public class UpdateProductServlet extends HttpServlet{
  @Override
  public void doPost(HttpServletRequest req,HttpServletResponse res)throws
  ServletException,IOException{
	  Cookie c[] = req.getCookies();
	  if(c==null){
		  req.getRequestDispatcher("Invalid.jsp").forward(req,res);
	  }else{
		  String fName = c[0].getValue();
		  req.setAttribute("fName",fName);
		  ProductBean pb = (ProductBean)this.getServletContext().getAttribute("pb");
		  pb.setpPrice(Float.parseFloat(req.getParameter("pprice")));
		  pb.setpQty(Integer.parseInt(req.getParameter("pqty")));
		  int k = new UpdateDAO().update(pb);
		  if(k>0){
			 req.getRequestDispatcher("UpdateSuccess.jsp").forward(req,res); 
		  }
	  }
  }
}
