package model;

public interface Command {
	
	public abstract String execute(int levelOperation);
	public abstract String undo();
}
