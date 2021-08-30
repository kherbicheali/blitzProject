package fr.wotbdz.app.entity;

import java.util.List;
		
public class Medium {
	private String label;
	private int dpm;
	private int speed;
	private int frontalArmor;
	private int healthPoints;
	private int gunDepression;
	private int silverAlpha;
	private int goldAlpha;
	private int heAlpha;
	
	public String getLabel(){
		return label;
	}
	public int getDpm(){
		return dpm;
	}
	public int getSpeed(){
		return speed;
	}
	public int getFrontalArmor(){
		return frontalArmor;
	}
	public int getHealthPoints(){
		return healthPoints;
	}
	public int getGunDepression(){
		return gunDepression;
	}
	public int getSilverAlpha(){
		return silverAlpha;
	}
	public int getGoldAlpha(){
		return goldAlpha;
	}
	public int getHeAlpha(){
		return heAlpha;
	}
	
	public void setLabel(String label){
		this.label = label;
	}
	public void setDpm(int dpm){
		this.dpm = dpm;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setFrontalArmor(int frontalArmor){
		this.frontalArmor = frontalArmor;
	}
	public void setHealthPoints(int healthPoints){
		this.healthPoints = healthPoints;
	}
	public void setGunDepression(int gunDepression){
		this.gunDepression = gunDepression; 
	}
	public void setSilverAlpha(int silverAlpha){
		this.silverAlpha = silverAlpha;
	}
	public void setGoldAlpha(int goldAlpha){
		this.goldAlpha = goldAlpha;
	}
	public void setHeAlpha(int heAlpha){
		this.heAlpha = heAlpha;		
	}
}
