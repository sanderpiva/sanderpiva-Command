package view;

import java.util.Scanner;

public class SettingCeiling implements Equipment {
	
	private int speed=0;
	private String desc;
	private String power=null;
	
	Scanner scan = new Scanner(System.in);

	public SettingCeiling() {
		
		desc="Ventilador de teto";
	}
	@Override
	public void setFeature(int levelOperation) {
		speed = levelOperation;
	}
	
	@Override
	public void setPower(String p) {
		power=p;
	}
	
	@Override
	public String getPower() {
		return power;
	}
	
	@Override
	public void setUndoFeatures(int f) {
		speed=f;
	}
	@Override
	public int getFeatures() {
		return speed;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
		
}
