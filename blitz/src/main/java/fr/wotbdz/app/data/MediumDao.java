package fr.wotbdz.app.data;

import java.util.List;
import fr.wotbdz.app.entity.Medium;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
		
public class MediumDao implements IDao<String, Medium>{

	private ConnectionBlitz con;

	public Medium save(Medium entity){
		try {
			PreparedStatement ps = con.getInstance().prepareStatement("INSERT INTO MediumTable VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, entity.getLabel());
			ps.setInt(2, entity.getDpm());
			ps.setInt(3, entity.getSpeed());
			ps.setInt(4, entity.getFrontalArmor());
			ps.setInt(5, entity.getHealthPoints());
			ps.setInt(6, entity.getGunDepression());
			ps.setInt(7, entity.getSilverAlpha());
			ps.setInt(8, entity.getGoldAlpha());
			ps.setInt(9, entity.getHeAlpha());
			
			ps.executeUpdate();
		} catch (SQLException e1) {
			
		}
		return null;
	};

	public Medium update(Medium entity){
		return null;
	};

	public void remove(String id){
		System.out.println("DAO remove id= "+ id);
		try {
			PreparedStatement ps = con.getInstance().prepareStatement("DELETE FROM MediumTable WHERE (label = ?)");
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e1) {}
	};

	public Medium findById(String id){
	
		Medium medium = new Medium();
	
		try {
		
			PreparedStatement ps = con.getInstance().prepareStatement(" SELECT * FROM MediumTable WHERE (label = ?) ");
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs != null) {
				while (rs.next()){
					System.out.println("rs != null");
					medium.setLabel(rs.getString("label"));
					medium.setDpm(rs.getInt("dpm"));
					medium.setSpeed(rs.getInt("speed"));
					medium.setFrontalArmor(rs.getInt("frontalArmor"));
					medium.setHealthPoints(rs.getInt("healthPoints"));
					medium.setGunDepression(rs.getInt("gunDepression"));
					medium.setSilverAlpha(rs.getInt("silverAlpha"));
					medium.setGoldAlpha(rs.getInt("goldAlpha"));
					medium.setHeAlpha(rs.getInt("heAlpha"));
				}
				return medium;
			} else {
				System.out.println("try : rs == null");
				return null;
			}
		} catch (SQLException e1){
							System.out.println("catch : rs == null");
			return null;
		}
	};

	public List<Medium> findAll(){
		List<Medium> list = new ArrayList<Medium>();
		try {
			PreparedStatement ps = con.getInstance().prepareStatement("SELECT * FROM MediumTable ");
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				Medium medium = new Medium();
				medium.setLabel(rs.getString("label"));
				medium.setDpm(rs.getInt("dpm"));
				medium.setSpeed(rs.getInt("speed"));
				medium.setFrontalArmor(rs.getInt("frontalArmor"));
				medium.setHealthPoints(rs.getInt("healthPoints"));
				medium.setGunDepression(rs.getInt("gunDepression"));
				medium.setSilverAlpha(rs.getInt("silverAlpha"));
				medium.setGoldAlpha(rs.getInt("goldAlpha"));
				medium.setHeAlpha(rs.getInt("heAlpha"));
				list.add(medium);
			}
			//return list;
		} catch (SQLException e1) {
			//return null;
		}
		return list;
	};

	public void closeResource(){
		
	};
}


