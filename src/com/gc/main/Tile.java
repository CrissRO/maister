package com.gc.main;

import java.awt.Graphics2D;

public class Tile extends Entity{

	
	public enum Type{
		T_FORM, STRAIGHT, CORNER;
	}
	
	private double rotation;
	private Type type;
	
	public Tile(double x, double y, double width, double height,double rotation, Type type) {
		super(x,y,width,height);
		this.rotation = rotation;
		this.type = type;
	}
	
	@Override
	public void render(Graphics2D ctx) {
		
	}
	
	@Override
	public void update() {
		
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
