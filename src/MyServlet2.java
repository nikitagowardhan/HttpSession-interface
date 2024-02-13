

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/MyServlet2")
public class MyServlet2 extends HttpServlet {
	
    
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("/text.html");
		PrintWriter out = response.getWriter();
		
		//method to get  existing session 
				HttpSession session =  request.getSession(false);
				
				//to get value in object
				String uname = (String) session.getAttribute("name");
				
				out.print("Welcome to Servlet2 "+uname);
	}

}
