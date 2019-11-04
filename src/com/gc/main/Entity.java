package com.gc.main;

import java.awt.Graphics2D;

public class Entity implements IRenderable, IUpdateable {

	private double x;
	private double y;
	private double width;
	private double height;
	
	public Entity(double x, double y, double width,double height) {
		this.x = x;
		this.y = y;
		this.width = width;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics2D ctx) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
