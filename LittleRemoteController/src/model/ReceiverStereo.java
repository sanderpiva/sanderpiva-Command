package model;

public class ReceiverStereo {
	
	public String action(int levelOperation) {
		//return "Stereo ligado-> som volume medio";
		if(levelOperation==1)
			return "Stereo ligado-> velocidade [| ]";
		else if(levelOperation==2)
			return "Stereo ligado-> velocidade [| |]";
		else
			return "Stereo ligado-> velocidade [| | |]";
		
	}
	
	
	public String undo() {
		return "Stereo desligado-> som zerado";
	}
}
