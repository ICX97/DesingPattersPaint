package mvc;

import java.util.ArrayList;
import observer.Observable;
import observer.Observer;

import shapes.Shape;

public class DrawingModel implements Observable{

	private ArrayList<Shape> shapes = new ArrayList<Shape>();
	private ArrayList<Observer> observers = new ArrayList<Observer>();

	public DrawingModel() {

	}

	public ArrayList<Shape> getAll(){
		return shapes;
	}
	
	public void addMultiple(ArrayList<Shape> shapes) {
		this.shapes.addAll(shapes);
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

	public void addShape(Shape s) {
		shapes.add(s);
	}

	public void removeShape(Shape s) {
		shapes.remove(s);
	}

	public Shape getShape(int index) {
		return shapes.get(index);
	}
	
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		int i=0; 
		int firstLast = 0; // first = 1, last = 2
		for(int j=0; j<shapes.size(); j++) {
			if (shapes.get(j).isSelected()) {
				i++;				
				if(j==0) {
					firstLast=1;
				}
				else if(j == shapes.size()-1) {
					firstLast=2;
				}
			}
		}
		for (Observer observer: observers) {
			observer.update(i,firstLast);
		}
	}
	
}
