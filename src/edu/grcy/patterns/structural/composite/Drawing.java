package edu.grcy.patterns.structural.composite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Serializable jest jednym z interfejsów tzw. znacznikowych
 * czyli nie wymagających implementacji żadnej metody
 * Służy to tylko do włączania / wyłączania dodatkowej funkcjonalności na klasie
 *
 * konkretnie Serializable służy do zamiany obiektów na strumień danych
 * które przesyła się np siecią, komunikacją asynchroniczną, czy jeszcze jakoś
 *
 * i po stronie odbiorcy odszyfrowuje do postaci obiektu
 *
 */
public class Drawing implements Shape, Comparable<Shape>, Serializable {
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

	@Override
	public int compareTo(Shape o) {
		//jakaś metoda porównania obiektów
		return 0;
	}
}
