package commands;

import adapter.HexagonAdapter;
import mvc.DrawingModel;

public class DeleteHexagonCmd implements Command{

	private DrawingModel model;
	private HexagonAdapter hexagon;
	
	public DeleteHexagonCmd(DrawingModel model, HexagonAdapter hexagon) {
		this.model = model;
		this.hexagon = hexagon;
	}
	
	@Override
	public void execute() {
		model.removeShape(hexagon);
	}

	@Override
	public void unexecute() {
		model.addShape(hexagon);
	}
	
}
