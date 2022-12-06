package model;

public class ReceiverStereo {
	
	private String power=null;
	private String levelOperationStereo=null;
	
	public String action(int levelOperation) {
		
		power="on";
		
		if(levelOperation==1) {
			levelOperationStereo="[| ]";
			return "Stereo: "+power+"-> volume som: "+levelOperationStereo;
		}
		
		else if(levelOperation==2) {
			levelOperationStereo="[| |]";
			return "Stereo: "+power+"-> volume som: "+levelOperationStereo;
		}
	
		else {
			levelOperationStereo="[| | |]";
			return "Stereo: "+power+"-> volume som: "+levelOperationStereo;
		}
			
		
	}
	
	
	public String undo() {
		levelOperationStereo="zero";
		power="off";
		return "Stereo: "+power+"-> volume som: "+levelOperationStereo;
	}
}
