

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet1 extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("/text.html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		out.print("welcome "+uname);
	
	
	
	}

}
