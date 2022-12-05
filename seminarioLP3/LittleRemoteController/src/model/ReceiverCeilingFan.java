package model;

public class ReceiverCeilingFan {

	private String power=null;
	private String levelOperationCeilingFan=null;

	public String action(int levelOperation) {

		power="on";

		if(levelOperation==1) {
			levelOperationCeilingFan="1";
			return "Ventilador teto: "+power+ "-> velocidade: "+levelOperationCeilingFan;
		}
		else if(levelOperation==2) {
			levelOperationCeilingFan="2";
			return "Ventilador teto: "+power+ "-> velocidade: "+levelOperationCeilingFan;
		}

		else {
			levelOperationCeilingFan="3";
			return "Ventilador teto: "+power+ "-> velocidade: "+levelOperationCeilingFan;
		}

	}



	public String undo() {
		levelOperationCeilingFan="zero";
		power="off";
		return "Ventilador teto: "+power+ "-> velocidade: "+levelOperationCeilingFan;		
	}
}
