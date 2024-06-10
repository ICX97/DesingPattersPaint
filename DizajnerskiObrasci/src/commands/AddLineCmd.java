package commands;

import mvc.DrawingModel;
import shapes.Line;

public class AddLineCmd implements Command{

	private DrawingModel model;
	private Line line;
	
	public AddLineCmd(DrawingModel model, Line line) {
		this.model = model;
		this.line = line;
	}
	
	@Override
	public void execute() {
		model.addShape(line);
	}

	@Override
	public void unexecute() {
		model.removeShape(line);
	}
	
}
