package model;

public class ReceiverCeilingFan {

	private String powerCeilingFan=null;
	private String levelOperationCeilingFan=null;

	public String action(int levelOperation) {

		powerCeilingFan="on";

		if(levelOperation==1) {
			levelOperationCeilingFan="1";
			return "Ventilador teto: "+powerCeilingFan+ "-> velocidade: "+levelOperationCeilingFan;
		}
		else if(levelOperation==2) {
			levelOperationCeilingFan="2";
			return "Ventilador teto: "+powerCeilingFan+ "-> velocidade: "+levelOperationCeilingFan;
		}

		else {
			levelOperationCeilingFan="3";
			return "Ventilador teto: "+powerCeilingFan+ "-> velocidade: "+levelOperationCeilingFan;
		}

	}

	public String undo() {
		levelOperationCeilingFan="zero";
		powerCeilingFan="off";
		return "Ventilador teto: "+powerCeilingFan+ "-> velocidade: "+levelOperationCeilingFan;		
	}	
}
