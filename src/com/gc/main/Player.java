package com.gc.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.List;

public class Player extends Entity implements IRenderable,IUpdateable {

	private String name;
	private Color color;
	private int nrWands;
	private Receipe secretRecipe;
	private List<Ingredient> collectedIngredients;
	private Tile location;
	
	
	public Player(double x, double y, double width, double height,String name,Color color) {
		super(x,y,width,height);
		this.name = name;
		this.color = color;	
	}
	
	public Player(String name,Color color) {
		this(0,0,50,50,name,color);
	}
	
	@Override
	public void render(Graphics2D ctx) {
		ctx.setColor(color);
		ctx.fillOval(getIntX() - getIntWidth() / 2, getIntY() - getIntHeight() / 2, getIntWidth(), getIntHeight());
	}
	
	@Override
	public void update() {
		
	}
	
	public void move() {}
	public void useWand() {}
	
	public void setLocation(Tile location) {
		this.location = location;
		this.location.addVisitor(this);
	}
}
