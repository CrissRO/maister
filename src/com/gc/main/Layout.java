package com.gc.main;

import java.awt.Graphics2D;

public class Layout extends Entity  implements IRenderable,IUpdateable{

	private Tile matrix[][];
	
	public Layout(double x, double y, double width, double height) {
		super(x,y,width,height);
		matrix = new Tile[7][7];
	}
	
	@Override
	public void render(Graphics2D ctx) {
		
	}
	
	@Override
	public void update() {
		
	}
}
