package view;

public interface Equipment {
	
	public abstract void setFeature(int f);
	public abstract void setPower(String p);
	public abstract String getPower();
	public abstract void setUndoFeatures(int f);
	public abstract int getFeatures();
	public abstract String getDesc();
	
}
