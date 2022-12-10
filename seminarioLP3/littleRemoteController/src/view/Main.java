package view;

import java.util.Scanner;

import model.ConcreteCeilingFan;
import model.ConcreteStereo;
import model.ReceiverCeilingFan;
import model.ReceiverStereo;

public class Main {

	static int result=0;
	static int levelOperation=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Bem vindo ao sistema do controle doméstico universal :D "+"\n");
		menu();
	}

	public static void menu() {
		Scanner scan = new Scanner(System.in);
		int resultOperation=1;


		SimpleRemoteControl s = new SimpleRemoteControl();//invocador
		ReceiverCeilingFan receiverCeilingFan = new ReceiverCeilingFan();//receptor
		ConcreteCeilingFan ceilingCommands = new ConcreteCeilingFan(receiverCeilingFan);//classe concreta
		ReceiverStereo receiverStereo = new ReceiverStereo();//receptor
		ConcreteStereo stereoCommands = new ConcreteStereo(receiverStereo);//classe concreta


		while(resultOperation>=1) {
			do {
			System.out.println("\nMenu: "+"\n"

					+ "[ Ligar ventilador teto [1]    ]"+"\n"
					+ "[       stero           [2]    ]"+"\n"
					+ "[       -----                  ]"+"\n"
					+ "[ Desligar              [3]    ]"+"\n"
					+ "[ Sair                  [0]    ]"+"\n"+"->");
			resultOperation = scan.nextInt();	
			}while(resultOperation<0 || resultOperation>3);
			
			if(resultOperation==1) {
				System.err.println("Ventilador teto");
				configure();
				s.setCommand(ceilingCommands);
				System.err.println(s.buttonExecute(levelOperation));
				
			}

			else if(resultOperation==2) {
				System.err.println("Stereo");
				configure();
				s.setCommand(stereoCommands);
				System.err.println(s.buttonExecute(levelOperation));
			}
			
			else if(resultOperation==3){

				desative();
						
				if(result==1) {

					s.setCommand(ceilingCommands);
					System.err.println(s.buttonUndo());
				}

				else if(result==2) {
					s.setCommand(stereoCommands);
					System.err.println(s.buttonUndo());
				}
								
			}

			else {
				System.out.println("Desligando controle... Volte sempre! :D");	
				s.setCommand(ceilingCommands);
				System.err.println(s.buttonUndo());
				s.setCommand(stereoCommands);
				System.err.println(s.buttonUndo());
				scan.close();
			}
		}
	}
	public static int desative() {
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Qual aparelho desativar? ventilador [1] stereo [2] ");
			result = scan.nextInt();

		}while(result!=1 && result !=2);

		return result;			
	}

	public static int configure() {
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Nível operação [1] [2] [3]");
			levelOperation = scan.nextInt();
		}while(levelOperation<1 || levelOperation>3);

		return levelOperation;
	}
}
