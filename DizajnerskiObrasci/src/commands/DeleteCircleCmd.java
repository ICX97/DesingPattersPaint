package commands;

import mvc.DrawingModel;
import shapes.Circle;

public class DeleteCircleCmd implements Command{
	
	private DrawingModel model;
	private Circle circle;
	
	public DeleteCircleCmd(DrawingModel model, Circle circle) {
		this.model = model;
		this.circle = circle;
	}
	
	@Override
	public void execute() {
		model.removeShape(circle);
	}

	@Override
	public void unexecute() {
		model.addShape(circle);
	}
}
