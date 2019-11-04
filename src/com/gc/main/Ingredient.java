package com.gc.main;

public class Ingredient {

	private String name;
	private String description;
	private int nrPoints;
	
	public Ingredient(String name, int nrPoints) {
		this.name = name;
		this.description = "default";
		this.nrPoints = 0;
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
