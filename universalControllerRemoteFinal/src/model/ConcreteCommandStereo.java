package model;


import command.Command;
import view.Equipment;

public class ConcreteCommandStereo implements Command  {
	private ReceiverCommandStereo rStereo;
	private Equipment commandObject;
	private String soundSymbol=null;
	
	@Override
	public String execute(Equipment e) {
		commandObject=e;
		rStereo = new ReceiverCommandStereo();
		rStereo.action(commandObject);
		if (rStereo.getrStereoSoundVolume()==1)
			soundSymbol="[| ]";
		else if(rStereo.getrStereoSoundVolume()==2)
			soundSymbol="[| | ]";
		else
			soundSymbol="[| | |]";
		return "Comando executado: Aparelho: "+rStereo.getrStereoDesc()+"-> status: "+
		rStereo.getrStereoPower()+"-> volume do som: "+soundSymbol;

		
	}
	
	@Override
	public String undo(Equipment e){
		commandObject=e;
		rStereo = new ReceiverCommandStereo();
		rStereo.action(commandObject);
		if (rStereo.getrStereoSoundVolume()==0)
			soundSymbol="[ ]";
		
		return "Comando desfeito: Aparelho: "+rStereo.getrStereoDesc()+"-> status: "+
		rStereo.getrStereoPower()+"-> volume do som: "+soundSymbol;		
	}
	
	
}
