package com.example.demo.exercise;

public abstract class Shape implements Drawable{
	
	private String color;

	public abstract double calculateArea();
	public abstract double calculatePerimeter();
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public Shape(String color) {
		super();
		this.color = color;
	}
	
			
}
