package commands;

import mvc.DrawingModel;
import shapes.Line;

public class DeleteLineCmd implements Command{

	private DrawingModel model;
	private Line line;
	
	public DeleteLineCmd(DrawingModel model, Line line) {
		this.model = model;
		this.line = line;
	}
	
	@Override
	public void execute() {
		model.removeShape(line);
	}

	@Override
	public void unexecute() {
		model.addShape(line);
	}
	
}
