package model;

public class ConcreteStereo implements Command {

	private ReceiverStereo stereo;

	public ConcreteStereo(ReceiverStereo stereo) {
		// TODO Auto-generated constructor stub
		this.stereo=stereo;
	}
	@Override
	public String execute(int levelOperation) {

		return stereo.action(levelOperation);
	}
	
	
	@Override
	public String undo() {

		return stereo.undo();
	}
}
