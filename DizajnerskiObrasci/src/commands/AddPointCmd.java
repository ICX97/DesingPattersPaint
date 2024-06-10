package commands;

import mvc.DrawingModel;
import shapes.Point;

public class AddPointCmd implements Command{

	private DrawingModel model;
	private Point point;
	
	public AddPointCmd (DrawingModel model, Point point) {
		this.model = model;
		this.point = point;
	}

	@Override
	public void execute() {
		model.addShape(point);
	}

	@Override
	public void unexecute() {
		model.removeShape(point);
	}
	
}
