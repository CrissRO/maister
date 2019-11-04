package com.gc.main;

import java.awt.Graphics2D;
import java.util.List;

public class Player extends Entity {

	private String name;
	private String color;
	private int nrWands;
	private Receipe secretRecipe;
	private List<Ingredient> collectedIngredients;
	private Tile location;
	
	
	public Player(double x, double y, double width, double height,String name,String color) {
		super(x,y,width,height);
		this.name = name;
		this.color = color;
		
	}
	
	@Override
	public void render(Graphics2D ctx) {
		
	}
	
	@Override
	public void update() {
		
	}
	
	public void move() {}
	public void useWand() {}
}
