package commands;

import mvc.DrawingModel;
import shapes.Square;

public class DeleteSquareCmd implements Command{

	private DrawingModel model;
	private Square square;
	
	public DeleteSquareCmd(DrawingModel model, Square square) {
		this.model = model;
		this.square = square;
	}

	@Override
	public void execute() {
		model.removeShape(square);
	}

	@Override
	public void unexecute() {
		model.addShape(square);
	}
	
}
