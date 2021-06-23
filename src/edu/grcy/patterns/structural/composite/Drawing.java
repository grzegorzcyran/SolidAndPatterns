package edu.grcy.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape{
	private String name;

	public Drawing(String name) {
		this.name = name;
	}

	//collection of Shapes
	private List<Shape> shapes = new ArrayList<>();

	@Override
	public void draw(String fillColor) {
		System.out.println("Drawing all subparts of " + this.name);
		for(Shape sh : shapes)
		{
			sh.draw(fillColor);
		}
	}

	//adding shape to drawing
	public void add(Shape s){
		this.shapes.add(s);
	}

	//removing shape from drawing
	public void remove(Shape s){
		shapes.remove(s);
	}

	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all the shapes from drawing");
		this.shapes.clear();
	}
}
