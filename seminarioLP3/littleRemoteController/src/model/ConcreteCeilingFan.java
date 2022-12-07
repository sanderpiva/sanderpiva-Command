package model;

public class ConcreteCeilingFan implements Command {
	
	private ReceiverCeilingFan ceilingFan;
	
	public ConcreteCeilingFan(ReceiverCeilingFan ceilingFan) {

		this.ceilingFan=ceilingFan;
	}
	@Override
	public String execute(int levelOperation) {
		
		return ceilingFan.action(levelOperation);
	}
		
	@Override
	public String undo() {
		
		return ceilingFan.undo();
	}
	
	
}
