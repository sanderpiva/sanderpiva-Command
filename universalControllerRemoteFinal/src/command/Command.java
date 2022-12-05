package command;

import view.Equipment;

public interface Command {
	public abstract String execute(Equipment e);
	public abstract String undo(Equipment e);
	//public abstract String save(Equipaments e);
}
