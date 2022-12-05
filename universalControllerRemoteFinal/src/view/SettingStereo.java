package view;

import java.util.Scanner;

public class SettingStereo implements Equipment {
	
	private int sound;
	private String power=null;
	private String desc;
	
	Scanner scan = new Scanner(System.in);
	
	public SettingStereo() {

		desc="stereo";
	}
	
	@Override
	public void setFeature(int levelOperation){
	
		sound = levelOperation;
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
		if(f==0)
			sound=0;
	}
	
	@Override
	public int getFeatures() {
		return sound;
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return desc;
	}
}
