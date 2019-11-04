package com.gc.main;

import java.util.ArrayList;
import java.util.List;

public class Receipe {

	private List<Ingredient> ingredients;
	
	public Receipe(List<Ingredient> ingredients) {
		ingredients = new ArrayList();
	}

	private void addIngredient(Ingredient i) throws Exception {
		if(ingredients.contains(i))
			throw new Exception("Ingredient already on the receipe! There cannot be two ingredients of the same type!");
		else
			ingredients.add(i);
		
	}
}
