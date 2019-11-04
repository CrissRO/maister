package com.gc.main;

import java.awt.Graphics2D;

public class Entity{

	protected double x;
	protected double y;
	protected double width;
	protected double height;
	
	public Entity(double x, double y, double width,double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
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


	public int getIntX() {
		return (int)x;
	}
	
	public int getIntY() {
		return (int)y;
	}
	
	public int getIntWidth() {
		return (int)width;
	}
	
	public int getIntHeight() {
		return (int)height;
	}
	
	
	
}
