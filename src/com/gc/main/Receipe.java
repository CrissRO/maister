package com.gc.main;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Receipe extends Entity{

	private List<Ingredient> ingredients;
	
	public Receipe(double x, double y, double width, double height,List<Ingredient> ingredients) {
		super(x,y,width,height);
		ingredients = new ArrayList();
	}
	
	@Override
	public void render(Graphics2D ctx) {
		
	}
	
	@Override
	public void update() {
		
	}

	private void addIngredient(Ingredient i) throws Exception {
		if(ingredients.contains(i))
			throw new Exception("Ingredient already on the receipe! There cannot be two ingredients of the same type!");
		else
			ingredients.add(i);
		
	}
}
