package commands;

import mvc.DrawingModel;
import shapes.Rectangle;

public class DeleteRectangleCmd implements Command{

	private DrawingModel model;
	private Rectangle rectangle;
	
	public DeleteRectangleCmd(DrawingModel model, Rectangle rectangle) {
		this.model = model;
		this.rectangle = rectangle;
	}

	@Override
	public void execute() {
		model.removeShape(rectangle);
	}

	@Override
	public void unexecute() {
		model.addShape(rectangle);
	}
	
}
