package mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import frames.BottomFrame;
import frames.LogFrame;
import frames.SideFrame;

public class DrawingFrame extends JFrame {

	private DrawingView view = new DrawingView();
	private DrawingController controller;
	
	private BottomFrame bottomFrame = new BottomFrame();
	private LogFrame logFrame = new LogFrame();
	private SideFrame sideFrame = new SideFrame();
	
	public DrawingFrame() {
		setTitle("Igor Caran IT72-2016");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		getContentPane().setLayout(new BorderLayout(0, 0));
		view.setBackground(Color.WHITE);
		
		getContentPane().add(view, BorderLayout.CENTER);
		getContentPane().add(bottomFrame, BorderLayout.NORTH);
		getContentPane().add(logFrame, BorderLayout.SOUTH);
		getContentPane().add(sideFrame, BorderLayout.EAST);
		
		view.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				controller.mouseClicked(e);
			}
		});
		
		sideFrame.getDeleteBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				controller.deleteShapes();
			}
		});
		
		sideFrame.getModifyBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.modifyShape();
			}
		});
		
		sideFrame.getUndoBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.undoClicked();
			}
		});
		
		sideFrame.getRedoBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.redoClicked();
			}
		});
		
		sideFrame.getMoveUpBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.moveUp();
			}
		});
		
		sideFrame.getMoveDownBtn().addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.moveDown();		
			}
		});
		
		sideFrame.getMoveToTopBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.moveTop();
			}
		});
		
		sideFrame.getMoveToBottomBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.moveBottom();
			}
		});
		
		sideFrame.getSaveSerBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.saveSerialization();
			}
		});
		
		sideFrame.getLoadSerBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.loadSerialization();
				
			}
		});
		
		sideFrame.getSaveLogBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.saveLog();
			}
		});
		
		sideFrame.getLoadLogBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.loadLog();
			}
		});
		
		sideFrame.getRedoLogBtn().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.redoLog();
			}
		});
		
	}
	
	public BottomFrame getBottomFrame() {
		return bottomFrame;
	}

	public SideFrame getSideFrame() {
		return sideFrame;
	}

	public LogFrame getLogFrame() {
		return logFrame;
	}

	public DrawingView getView() {
		return view;
	}
	public void setController(DrawingController controller) {
		this.controller = controller;
	}
	
}
