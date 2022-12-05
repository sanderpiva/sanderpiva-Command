package view;

import java.util.Scanner;

import command.Command;
import model.ConcreteCommandCeilingFan;
import model.ConcreteCommandStereo;

public class UniversalRemoteController {
	
	int cont=0;
	int result=0;
	String featureType=null;
	Scanner scan = new Scanner(System.in);
	
	public UniversalRemoteController() {
		// TODO Auto-generated constructor stub
		int operationChoiceButton=1;
		
		Equipment ceilingFan = new SettingCeiling();
		Equipment stereo = new SettingStereo();
		
		
		while(operationChoiceButton>0) {
			System.out.println("\n");
			do {
			System.out.println("Menu: "+"\n"
								+ "| Ventilador de teto [1]     |"+"\n"
								+ "| Stereo [2]                 |"+"\n"
								+ "| Desativar equipamentos [3] |"+"\n"
								+ "| Sair [0]                   |"+"\n"+"->");
			
			operationChoiceButton = scan.nextInt();
			}while(operationChoiceButton!=1 && operationChoiceButton!=2 && operationChoiceButton!=3 && operationChoiceButton!=0);
			
			switch (operationChoiceButton) {
			case 1: {
				System.out.println("Ventilador de teto");
				
				ceilingFan.setPower("on");
				featureType="Velocidade do ventilador";
				ceilingFan.setFeature(feature(featureType));
				invokeCommand(operationChoiceButton, ceilingFan);
				break;
			}
			case 2: {
				System.out.println("Stereo");
			    stereo.setPower("on");
			    featureType="Volume do stereo";
				stereo.setFeature(feature(featureType));
				invokeCommand(operationChoiceButton, stereo);
				break;
			}
			case 3: {
				System.out.println("Desativando...");
				desative();
				if(result == 1 && ceilingFan.getPower().equals("on") ) {
					ceilingFan.setPower("off");
					ceilingFan.setUndoFeatures(0);
					undoCommand(1, ceilingFan);
				}else if (result == 2 && stereo.getPower().equals("on") ) {
					stereo.setPower("off");
					stereo.setUndoFeatures(0);
					undoCommand(2, stereo);
				}
					
				break;
			}
			
			case 0: {
				System.out.println("Desligando controle remoto :D");
				undoCommand(operationChoiceButton, ceilingFan);
				undoCommand(operationChoiceButton, stereo);
				scan.close();
				break;
			}
		}
	  }	
	}	
	
	private int feature(String f) {
		
		int levelOperation=0;
		do {
			System.out.println(f+"->Nível operação [1] [2] [3]");
			levelOperation = scan.nextInt();
		}while(levelOperation<1 || levelOperation>3);
		
		return levelOperation;
	}
	
	private int desative() {
		
		
		do {
		System.out.println("Qual aparelho desativar? ventilador [1] stereo [2] ");
		result = scan.nextInt();
		
		}while(result!=1 && result !=2);
			
		return result;			
	}
	
	private void invokeCommand(int i, Equipment e) {
		
		if (i==1) {
			Command c = new ConcreteCommandCeilingFan();
			System.out.println(c.execute(e));
		}
		else if(i==2) {
			Command c = new ConcreteCommandStereo();
			System.out.println(c.execute(e));	
		}		
	}
	
	private void undoCommand(int i, Equipment e) {

	    if (i==1) {
			Command c = new ConcreteCommandCeilingFan();
			System.out.println(c.undo(e));
		}
		else if(i==2) {
			Command c = new ConcreteCommandStereo();
			System.out.println(c.undo(e));	
		}		
		else {
			cont++;
			System.out.println("Aparelho "+cont+"->desativado ");
			return;
		}
	}
  }
