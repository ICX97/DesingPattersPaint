package commands;

import mvc.DrawingModel;
import shapes.Point;

public class DeletePointCmd implements Command{

	private DrawingModel model;
	private Point point;
	
	public DeletePointCmd(DrawingModel model, Point point) {
		this.model = model;
		this.point = point;
	}

	@Override
	public void execute() {
		model.removeShape(point);
	}

	@Override
	public void unexecute() {
		model.addShape(point);
	}
	
}
