package myServlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;

public class Medium extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		System.out.println("TANK GET");	
		this.getServletContext().getRequestDispatcher( "/WEB-INF/lyes.html" ).forward( request, response );
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		System.out.println("TANK POST ");
	}
}	
