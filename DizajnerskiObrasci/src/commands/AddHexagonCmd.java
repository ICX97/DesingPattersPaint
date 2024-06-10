package commands;

import adapter.HexagonAdapter;
import mvc.DrawingModel;

public class AddHexagonCmd implements Command{

	private DrawingModel model;
	private HexagonAdapter hexagon;
	
	public AddHexagonCmd(DrawingModel model, HexagonAdapter hexagon) {
		this.model = model;
		this.hexagon = hexagon;
	}

	@Override
	public void execute() {
		model.addShape(hexagon);
	}

	@Override
	public void unexecute() {
		model.removeShape(hexagon);
	}
}
