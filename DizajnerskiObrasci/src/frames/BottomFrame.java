package frames;

import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.ButtonGroup;

public class BottomFrame  extends JPanel{
	
	private JToggleButton pointBtn, lineBtn, circleBtn, donutBtn, squareBtn, rectangleBtn, hexBtn,
	selectBtn, selectMultipleBtn;
	private ButtonGroup toggleButtonsGroup = new ButtonGroup();
	
	public BottomFrame() {
		
		pointBtn = new JToggleButton("Point");
		toggleButtonsGroup.add(pointBtn);
		add(pointBtn);
		
		lineBtn = new JToggleButton("Line");
		toggleButtonsGroup.add(lineBtn);
		add(lineBtn);
		
		circleBtn = new JToggleButton("Circle");
		toggleButtonsGroup.add(circleBtn);
		add(circleBtn);
		
		donutBtn = new JToggleButton("Donut");
		toggleButtonsGroup.add(donutBtn);
		add(donutBtn);
		
		squareBtn = new JToggleButton("Square");
		toggleButtonsGroup.add(squareBtn);
		add(squareBtn);
		
		rectangleBtn = new JToggleButton("Rectangle");
		toggleButtonsGroup.add(rectangleBtn);
		add(rectangleBtn);
		
		hexBtn = new JToggleButton("Hexagon");
		toggleButtonsGroup.add(hexBtn);
		add(hexBtn);
		
		selectBtn = new JToggleButton("Select ");
		toggleButtonsGroup.add(selectBtn);
		add(selectBtn);
		
		selectMultipleBtn = new JToggleButton("Select more");
		toggleButtonsGroup.add(selectMultipleBtn);
		add(selectMultipleBtn);
	}
	
	public String returnSelectedButton() {

		if (pointBtn.isSelected())
			return "point";

		if (lineBtn.isSelected())
			return "line";

		if (squareBtn.isSelected())
			return "square";

		if (circleBtn.isSelected())
			return "circle";

		if (rectangleBtn.isSelected())
			return "rectangle";

		if (hexBtn.isSelected())
			return "hexagon";
		
		if (donutBtn.isSelected())
			return "donut";

		if (selectBtn.isSelected())
			return "select";

		if (selectMultipleBtn.isSelected())
			return "multiple";
		
		return null;
	}

}
