package commands;

import mvc.DrawingModel;
import shapes.Square;

public class AddSquareCmd implements Command{
	
	private DrawingModel model;
	private Square square;
	
	public AddSquareCmd(DrawingModel model, Square square) {
		this.model = model;
		this.square = square;
	}

	@Override
	public void execute() {
		model.addShape(square);
	}

	@Override
	public void unexecute() {
		model.removeShape(square);
	}
}
