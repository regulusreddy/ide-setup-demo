import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Demoservlet")
public class Demoservlet extends HttpServlet {

	

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		  resp.setContentType("text/html");
	        PrintWriter printWriter  = resp.getWriter();
	        printWriter.println("<h1>"+((patient_info_Demo.main()).toString())+"</h1>");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		/*resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		
		pw.println("<h1>"+patient_info_Demo.main().toString()+"</h1>");*/
		
	}

	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
		/*arg1.setContentType("text/html");
		PrintWriter pw = arg1.getWriter();
		
		pw.println("<h1>"+patient_info_Demo.main().toString()+"</h1>");*/
	
	}

}
