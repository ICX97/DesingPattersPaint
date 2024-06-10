package frames;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JColorChooser;

public class SideFrame extends JPanel {

	private GridBagLayout gridBagLayout = new GridBagLayout();

	private JButton undoBtn, redoBtn, moveUpBtn, moveDownBtn, moveToTopBtn, moveToBottomBtn, saveLogBtn, loadLogBtn, saveSerBtn,
			loadSerBtn, redoLogBtn, colorBtn, innerBtn, modifyBtn, deleteBtn;

	public SideFrame() {
		this.setLayout(new GridBagLayout());

		undoBtn = new JButton("Undo");
		undoBtn.setEnabled(false);
		GridBagConstraints gbc_undoBtn = new GridBagConstraints();
		gbc_undoBtn.insets = new Insets(0, 0, 5, 0);
		gbc_undoBtn.gridx = 14;
		gbc_undoBtn.gridy = 0;
		add(undoBtn, gbc_undoBtn);

		redoBtn = new JButton("Redo");
		redoBtn.setEnabled(false);
		GridBagConstraints gbc_redoBtn = new GridBagConstraints();
		gbc_redoBtn.insets = new Insets(0, 0, 5, 0);
		gbc_redoBtn.gridx = 14;
		gbc_redoBtn.gridy = 1;
		add(redoBtn, gbc_redoBtn);

		moveUpBtn = new JButton("Move Up");
		moveUpBtn.setEnabled(false);
		GridBagConstraints gbc_moveUpBtn = new GridBagConstraints();
		gbc_moveUpBtn.insets = new Insets(0, 0, 5, 0);
		gbc_moveUpBtn.gridx = 14;
		gbc_moveUpBtn.gridy = 2;
		add(moveUpBtn, gbc_moveUpBtn);

		moveDownBtn = new JButton("Move Down");
		moveDownBtn.setEnabled(false);
		GridBagConstraints gbc_moveDownBtn = new GridBagConstraints();
		gbc_moveDownBtn.insets = new Insets(0, 0, 5, 0);
		gbc_moveDownBtn.gridx = 14;
		gbc_moveDownBtn.gridy = 3;
		add(moveDownBtn, gbc_moveDownBtn);

		moveToTopBtn = new JButton("To Top");
		moveToTopBtn.setEnabled(false);
		GridBagConstraints gbc_moveToTopBtn = new GridBagConstraints();
		gbc_moveToTopBtn.insets = new Insets(0, 0, 5, 0);
		gbc_moveToTopBtn.gridx = 14;
		gbc_moveToTopBtn.gridy = 4;
		add(moveToTopBtn, gbc_moveToTopBtn);

		moveToBottomBtn = new JButton("To Bottom");
		moveToBottomBtn.setEnabled(false);
		GridBagConstraints gbc_bottomBtn = new GridBagConstraints();
		gbc_bottomBtn.insets = new Insets(0, 0, 5, 0);
		gbc_bottomBtn.gridx = 14;
		gbc_bottomBtn.gridy = 5;
		add(moveToBottomBtn, gbc_bottomBtn);

		saveLogBtn = new JButton("Save Log");
		GridBagConstraints gbc_saveLogBtn = new GridBagConstraints();
		gbc_saveLogBtn.insets = new Insets(0, 0, 5, 0);
		gbc_saveLogBtn.gridx = 14;
		gbc_saveLogBtn.gridy = 6;
		add(saveLogBtn, gbc_saveLogBtn);

		loadLogBtn = new JButton("Load log");
		GridBagConstraints gbc_loadLogBtn = new GridBagConstraints();
		gbc_loadLogBtn.insets = new Insets(0, 0, 5, 0);
		gbc_loadLogBtn.gridx = 14;
		gbc_loadLogBtn.gridy = 7;
		add(loadLogBtn, gbc_loadLogBtn);

		saveSerBtn = new JButton("Save Serialization");
		GridBagConstraints gbc_saveBtn = new GridBagConstraints();
		gbc_saveBtn.insets = new Insets(0, 0, 5, 0);
		gbc_saveBtn.gridx = 14;
		gbc_saveBtn.gridy = 8;
		add(saveSerBtn, gbc_saveBtn);

		loadSerBtn = new JButton("Load Serialization");
		GridBagConstraints gbc_loadBtn = new GridBagConstraints();
		gbc_loadBtn.insets = new Insets(0, 0, 5, 0);
		gbc_loadBtn.gridx = 14;
		gbc_loadBtn.gridy = 9;
		add(loadSerBtn, gbc_loadBtn);

		redoLogBtn = new JButton("Redo log");
		redoLogBtn.setEnabled(false);
		GridBagConstraints gbc_redoLogBtn = new GridBagConstraints();
		gbc_redoLogBtn.insets = new Insets(0, 0, 5, 0);
		gbc_redoLogBtn.gridx = 14;
		gbc_redoLogBtn.gridy = 10;
		add(redoLogBtn, gbc_redoLogBtn);

		colorBtn = new JButton("Color");
		colorBtn.setBackground(Color.red);
		colorBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				colorBtn.setBackground(chooseColor(colorBtn.getBackground()));
			}
		});
		GridBagConstraints gbc_colorBtn = new GridBagConstraints();
		gbc_colorBtn.insets = new Insets(0, 0, 5, 0);
		gbc_colorBtn.gridx = 14;
		gbc_colorBtn.gridy = 11;
		add(colorBtn, gbc_colorBtn);

		innerBtn = new JButton("Inner Color");
		innerBtn.setBackground(Color.WHITE);
		innerBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				innerBtn.setBackground(chooseColor(innerBtn.getBackground()));
			}
		});
		GridBagConstraints gbc_innerBtn = new GridBagConstraints();
		gbc_innerBtn.insets = new Insets(0, 0, 5, 0);
		gbc_innerBtn.gridx = 14;
		gbc_innerBtn.gridy = 12;
		add(innerBtn, gbc_innerBtn);

		modifyBtn = new JButton("Modify");
		modifyBtn.setEnabled(false);
		GridBagConstraints gbc_modifyBtn = new GridBagConstraints();
		gbc_modifyBtn.insets = new Insets(0, 0, 5, 0);
		gbc_modifyBtn.gridx = 14;
		gbc_modifyBtn.gridy = 13;
		add(modifyBtn, gbc_modifyBtn);

		deleteBtn = new JButton("Delete");
		deleteBtn.setEnabled(false);
		GridBagConstraints gbc_deleteBtn = new GridBagConstraints();
		gbc_deleteBtn.gridx = 14;
		gbc_deleteBtn.gridy = 14;
		add(deleteBtn, gbc_deleteBtn);
		gridBagLayout.columnWidths = new int[] { 0 };
		gridBagLayout.rowHeights = new int[] { 0 };
		gridBagLayout.columnWeights = new double[] { Double.MIN_VALUE };
		gridBagLayout.rowWeights = new double[] { Double.MIN_VALUE };
	}
	
	public Color chooseColor(Color previous) {
		Color newC = JColorChooser.showDialog(null, "Choose color", previous);
		if (newC != null)
			return newC;
		else
			return previous;
	}
	
	public void stackButtonEnabler(int undoSize, int redoSize) {
		if (undoSize > 0) {
			undoBtn.setEnabled(true);
		}else {
			undoBtn.setEnabled(false);
		}
		
		if (redoSize>0) {
			redoBtn.setEnabled(true);
		}else {
			redoBtn.setEnabled(false);
		}
	}

	public GridBagLayout getGridBagLayout() {
		return gridBagLayout;
	}

	public JButton getUndoBtn() {
		return undoBtn;
	}

	public JButton getRedoBtn() {
		return redoBtn;
	}

	public JButton getMoveUpBtn() {
		return moveUpBtn;
	}

	public JButton getMoveDownBtn() {
		return moveDownBtn;
	}

	public JButton getMoveToTopBtn() {
		return moveToTopBtn;
	}

	public JButton getMoveToBottomBtn() {
		return moveToBottomBtn;
	}

	public JButton getSaveLogBtn() {
		return saveLogBtn;
	}

	public JButton getLoadLogBtn() {
		return loadLogBtn;
	}

	public JButton getSaveSerBtn() {
		return saveSerBtn;
	}

	public JButton getLoadSerBtn() {
		return loadSerBtn;
	}

	public JButton getRedoLogBtn() {
		return redoLogBtn;
	}

	public JButton getColorBtn() {
		return colorBtn;
	}

	public JButton getInnerBtn() {
		return innerBtn;
	}

	public JButton getModifyBtn() {
		return modifyBtn;
	}

	public JButton getDeleteBtn() {
		return deleteBtn;
	}

	

}
