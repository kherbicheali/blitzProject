package myServlets;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.*;
import fr.wotbdz.app.data.IDao; 
import fr.wotbdz.app.data.MediumDao;
import fr.wotbdz.app.entity.Medium;

public class ListMedium extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		System.out.println("GET LIST TANK");
		String mth = request.getParameter("mth");
		System.out.println("mth: "+mth);
		IDao mediumdao = new MediumDao();
		
		if(mth.equals("listTank")){
			System.out.println("if listTank");
			String json = new Gson().toJson(mediumdao.findAll());
			response.setContentType("application/json");
    	response.setCharacterEncoding("UTF-8");
			response.getWriter().write(json);
		}	
		
		if(mth.equals("removeTank")){
			System.out.println("If removeTank");
			String id = request.getParameter("tankID");
			System.out.println("tankID: "+ id);
			mediumdao.remove(id);
		}
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		System.out.println("LIST POST TANK");
		
		Medium medium = new Medium();
		medium.setLabel(request.getParameter("label"));
		medium.setDpm(Integer.parseInt(request.getParameter("dpm")));
		medium.setSpeed(Integer.parseInt(request.getParameter("speed")));
		medium.setGunDepression(Integer.parseInt(request.getParameter("gunDepression")));
		medium.setHealthPoints(Integer.parseInt(request.getParameter("healthPoints")));
		medium.setFrontalArmor(Integer.parseInt(request.getParameter("frontalArmor")));
		medium.setSilverAlpha(Integer.parseInt(request.getParameter("silverAlpha")));
		medium.setGoldAlpha(Integer.parseInt(request.getParameter("goldAlpha")));
		medium.setHeAlpha(Integer.parseInt(request.getParameter("heAlpha")));	
		
		IDao mediumdao = new MediumDao();
		mediumdao.save(medium);
	}
}	
