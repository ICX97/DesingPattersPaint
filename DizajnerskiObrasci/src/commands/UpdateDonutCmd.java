package commands;

import shapes.Donut;

public class UpdateDonutCmd implements Command{

	private Donut firstState, currentState, newState;
	
	public UpdateDonutCmd(Donut firstState, Donut newState) {
		this.firstState = firstState;
		this.newState = newState;
	}

	@Override
	public void execute() {
		currentState = firstState.clone();
		firstState.setCenter(newState.getCenter());
		firstState.setR(newState.getR());
		firstState.setHoleRadius(newState.getHoleRadius());
		firstState.setColor(newState.getColor());
		firstState.setInnerColor(newState.getInnerColor());
	}

	@Override
	public void unexecute() {
		firstState.setCenter(currentState.getCenter());
		firstState.setR(currentState.getR());
		firstState.setHoleRadius(currentState.getHoleRadius());
		firstState.setColor(currentState.getColor());
		firstState.setInnerColor(currentState.getInnerColor());
	}
	
}
