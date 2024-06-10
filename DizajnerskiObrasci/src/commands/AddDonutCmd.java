package commands;

import mvc.DrawingModel;
import shapes.Donut;

public class AddDonutCmd implements Command {
	
	private DrawingModel model;
	private Donut donut;
	
	public AddDonutCmd(DrawingModel model, Donut donut) {
		this.model = model;
		this.donut = donut;
	}

	@Override
	public void execute() {
		model.addShape(donut);
	}

	@Override
	public void unexecute() {
		model.removeShape(donut);
	}
	
}
