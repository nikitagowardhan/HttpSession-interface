

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class MyServlet1 extends HttpServlet {
	
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("/text.html");
		PrintWriter out = response.getWriter();
		
		String uname = request.getParameter("uname");
		String upass = request.getParameter("upass");
		
		out.print("welcome "+uname);
		
		
		//method to get session 
		HttpSession session =  request.getSession();
		
		//store value in object
		session.setAttribute("name", "uname");
	
		out.print("<a href='MyServlet2'>Click to visit</a>");
		out.close();
	
	
	}

}
