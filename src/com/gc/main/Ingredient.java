package com.gc.main;

import java.awt.Graphics2D;

public class Ingredient extends Entity {

	private String name;
	private String description;
	private int nrPoints;
	
	public Ingredient(double x, double y, double width, double height, String name, int nrPoints) {
		super(x,y,width,height);
		this.name = name;
		this.description = "default";
		this.nrPoints = 0;
	}
	
	@Override
	public void render(Graphics2D ctx) {
		
	}
	
	@Override
	public void update() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNrPoints() {
		return nrPoints;
	}

	public void setNrPoints(int nrPoints) {
		this.nrPoints = nrPoints;
	}
	
}
