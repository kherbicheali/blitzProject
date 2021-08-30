package fr.wotbdz.app.data;

import java.util.List;
import fr.wotbdz.app.entity.Medium;

public class RunMedium {

	public static void main(String args[]) {
	
		System.out.println("RunMedium.main()");
		
		IDao<String, Medium> mediumDao = new MediumDao();
		Medium medium = new Medium ();
		
		medium.setLabel("T22 Medium");
		medium.setDpm(3450);
		medium.setSpeed(55);
		medium.setFrontalArmor(245);
		medium.setHealthPoints(1800);
		medium.setGunDepression(6);
		medium.setSilverAlpha(310);
		medium.setGoldAlpha(280);
		medium.setHeAlpha(420);
		mediumDao.save(medium);
		
		medium.setLabel("Obj 140");
		medium.setDpm(3450);
		medium.setSpeed(55);
		medium.setFrontalArmor(245);
		medium.setHealthPoints(1800);
		medium.setGunDepression(6);
		medium.setSilverAlpha(310);
		medium.setGoldAlpha(280);
		medium.setHeAlpha(420);
		mediumDao.save(medium);
		
		List<Medium> list = mediumDao.findAll();
		for (int i = 0; i < list.size(); i++) {
			medium = list.get(i);
			System.out.println("findAll: "+ medium.getLabel());
			System.out.println("findAll: "+ medium.getDpm());
			System.out.println("findAll: "+ medium.getSpeed());
			System.out.println("findAll: "+medium.getFrontalArmor());
			System.out.println("findAll: "+medium.getHealthPoints());
			System.out.println("findAll: "+medium.getGunDepression());
			System.out.println("findAll: "+medium.getSilverAlpha());
			System.out.println("findAll: "+medium.getGoldAlpha());
			System.out.println("findAll: "+medium.getHeAlpha());
			System.out.println();
    }
  
  	medium = mediumDao.findById("T62A");
  	System.out.println("findById: "+ medium.getLabel());
		System.out.println("findById: "+medium.getDpm());
		System.out.println("findById: "+medium.getSpeed());
		System.out.println("findById: "+medium.getFrontalArmor());
		System.out.println("findById: "+medium.getHealthPoints());
		System.out.println("findById: "+medium.getGunDepression());
		System.out.println("findById: "+medium.getSilverAlpha());
		System.out.println("findById: "+medium.getGoldAlpha());
		System.out.println("findById: "+medium.getHeAlpha());
		System.out.println();
  	
	
	}
	
	
}
