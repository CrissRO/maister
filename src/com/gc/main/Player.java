package com.gc.main;

import java.util.List;

public class Player {

	private String name;
	private String color;
	private int nrWands;
	private Receipe secretRecipe;
	private List<Ingredient> collectedIngredients;
	private Tile location;
	
	
	public Player(String name,String color) {
		this.name = name;
		this.color = color;
	}
	
	public void move() {}
	public void useWand() {}
}
