package observer;

import frames.SideFrame;

public class ButtonEnabler implements Observer{

	private SideFrame sideFrame;

	public ButtonEnabler(SideFrame sideFrame) {
		this.sideFrame = sideFrame;
	}

	@Override
	public void update(int i, int firstLast) {
		if (i == 0) {
			sideFrame.getDeleteBtn().setEnabled(false);
			sideFrame.getMoveToTopBtn().setEnabled(false);
			sideFrame.getMoveToBottomBtn().setEnabled(false);
			sideFrame.getMoveDownBtn().setEnabled(false);
			sideFrame.getMoveUpBtn().setEnabled(false);
			sideFrame.getModifyBtn().setEnabled(false);
		}
		if (i == 1) {
			if(firstLast == 0) {
				sideFrame.getDeleteBtn().setEnabled(true);
				sideFrame.getMoveToTopBtn().setEnabled(true);
				sideFrame.getMoveToBottomBtn().setEnabled(true);
				sideFrame.getMoveDownBtn().setEnabled(true);
				sideFrame.getMoveUpBtn().setEnabled(true);
				sideFrame.getModifyBtn().setEnabled(true);
			}
			else if (firstLast == 1){
				sideFrame.getDeleteBtn().setEnabled(true);
				sideFrame.getMoveToTopBtn().setEnabled(true);
				sideFrame.getMoveToBottomBtn().setEnabled(false);
				sideFrame.getMoveDownBtn().setEnabled(false);
				sideFrame.getMoveUpBtn().setEnabled(true);
				sideFrame.getModifyBtn().setEnabled(true);
			}
			else if (firstLast == 2){
				sideFrame.getDeleteBtn().setEnabled(true);
				sideFrame.getMoveToTopBtn().setEnabled(false);
				sideFrame.getMoveToBottomBtn().setEnabled(true);
				sideFrame.getMoveDownBtn().setEnabled(true);
				sideFrame.getMoveUpBtn().setEnabled(false);
				sideFrame.getModifyBtn().setEnabled(true);
			}
		}
		if (i > 1) {
			sideFrame.getDeleteBtn().setEnabled(true);
			sideFrame.getMoveToTopBtn().setEnabled(false);
			sideFrame.getMoveToBottomBtn().setEnabled(false);
			sideFrame.getMoveDownBtn().setEnabled(false);
			sideFrame.getMoveUpBtn().setEnabled(false);
			sideFrame.getModifyBtn().setEnabled(false);
		}
	}
}
