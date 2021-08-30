package myServlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//@webServlet("/ali") // servlet 3.0 with annotations, sans passer par web.xml ou (descripteur de deploiement). Ici web.xml est créé mais n'est pas visible

public class Simple extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		System.out.println("Mehenna Rebout GET");
		this.getServletContext().getRequestDispatcher( "/WEB-INF/ali.html" ).forward( request, response );
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String username = request.getParameter("username");
        	String password = request.getParameter("password");
		System.out.println("Mehenna Rebout POST " + username + " " + password);
		this.getServletContext().getRequestDispatcher( "/index.jsp" ).forward( request, response );
	}
}
