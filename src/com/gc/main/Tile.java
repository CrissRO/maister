package com.gc.main;

public class Tile {

	
	public enum Type{
		T_FORM, STRAIGHT, CORNER;
	}
	
	private double rotation;
	private Type type;
	
	public Tile(double rotation, Type type) {
		this.rotation = rotation;
		this.type = type;
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
