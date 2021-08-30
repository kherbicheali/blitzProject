package fr.wotbdz.app.data;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;
 
public class ConnectionBlitz {
	private static String  driver = "org.h2.Driver" ;
	private static String url = "jdbc:h2:/opt/blitzDb";	
	private static String user = "sa";
	private static String passwd = "";
	private static Connection connect;
	
	public static Connection getInstance(){
		if(connect == null){
			try {
				Class.forName(driver);
				connect =  DriverManager.getConnection(url, user, passwd);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}	
		System.out.println("l'objet Connection a ete cree");
		return connect;	
	}	
}
