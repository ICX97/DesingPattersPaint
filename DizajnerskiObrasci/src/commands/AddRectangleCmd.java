package commands;

import mvc.DrawingModel;
import shapes.Rectangle;

public class AddRectangleCmd implements Command{

	private DrawingModel model;
	private Rectangle rectangle;
	
	public AddRectangleCmd(DrawingModel model, Rectangle rectangle) {
		this.model = model;
		this.rectangle = rectangle;
	}

	@Override
	public void execute() {
		model.addShape(rectangle);
	}

	@Override
	public void unexecute() {
		model.removeShape(rectangle);
	}
	
}
