package model;

import command.Command;
import view.Equipment;

public class ConcreteCommandCeilingFan implements Command  {
	
	private Equipment commandObject;
	private ReceiverCommandCeilingFan rCeilingFan;
	
	@Override
	public String execute(Equipment e) {
		commandObject=e;
		rCeilingFan = new ReceiverCommandCeilingFan();
		rCeilingFan.action(commandObject);
		return "Comando executado: Aparelho: "+rCeilingFan.getRceilingDesc()+"-> status: "+
		rCeilingFan.getrCeilingPower()+"-> velocidade: "+rCeilingFan.getrCeilingSpeed();
	}
	
	@Override
	public String undo(Equipment e){
		commandObject=e;
		rCeilingFan = new ReceiverCommandCeilingFan();
		rCeilingFan.undo(commandObject);
		return "Comando desfeito: Aparelho: "+rCeilingFan.getRceilingDesc()+"-> status: "+
		rCeilingFan.getrCeilingPower()+"-> velocidade: "+rCeilingFan.getrCeilingSpeed();
		
	}
		
}
