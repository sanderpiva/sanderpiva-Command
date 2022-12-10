package view;

import model.Command;

public class SimpleRemoteControl {

	private Command slot;

	public void setCommand(Command c) {

		slot = c;
	}

	public String buttonExecute(int levelOperation) {

		return slot.execute(levelOperation);
	}
	
	public String buttonUndo() {

		return slot.undo();
	}
	
	
}
