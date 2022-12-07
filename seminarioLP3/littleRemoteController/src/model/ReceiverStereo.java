package model;

public class ReceiverStereo {
	
	private String powerStereo=null;
	private String levelOperationStereo=null;
	
	public String action(int levelOperation) {
		
		powerStereo="on";
		
		if(levelOperation==1) {
			levelOperationStereo="[| ]";
			return "Stereo: "+powerStereo+"-> volume som: "+levelOperationStereo;
		}
		
		else if(levelOperation==2) {
			levelOperationStereo="[| |]";
			return "Stereo: "+powerStereo+"-> volume som: "+levelOperationStereo;
		}
	
		else {
			levelOperationStereo="[| | |]";
			return "Stereo: "+powerStereo+"-> volume som: "+levelOperationStereo;
		}
			
		
	}
		
	public String undo() {
		levelOperationStereo="zero";
		powerStereo="off";
		return "Stereo: "+powerStereo+"-> volume som: "+levelOperationStereo;
	}
	
}
