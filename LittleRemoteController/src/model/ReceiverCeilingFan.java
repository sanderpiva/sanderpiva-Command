package model;

public class ReceiverCeilingFan {
	
	public String action(int levelOperation) {
		//return "Ventilador teto ligado-> velocidade medio";
		if(levelOperation==1)
			return "Ventilador teto ligado-> velocidade 1";
		
		else if(levelOperation==2)
			return "Ventilador teto ligado-> velocidade 2";
		
		else
			return "Ventilador teto ligado-> velocidade 3";	
		
	}
	
	
	
	public String undo() {
		return "Ventilador teto desligado-> velocidade zerada";
	}
}
