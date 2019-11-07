package com.gc.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.HashMap;
import java.util.Random;

public class Layout extends Entity  implements IRenderable,IUpdateable{

	private Tile matrix[][];
	private HashMap<String,Color> colors;
	private HashMap<String,Tile.Type> types;
	
	public Layout(double x, double y, double width, double height) {
		super(x,y,width,height);
		matrix = new Tile[7][7];
		
		colors = new HashMap<>();
		types = new HashMap<>();
		colors.put("blue", new Color(0,0,255));
		colors.put("red", new Color(255,0,0));
		colors.put("green", new Color(0,255,0));
		types.put("corner", Tile.Type.CORNER);
		types.put("straight", Tile.Type.STRAIGHT);
		types.put("tform",Tile.Type.T_FORM);
		
		generateMap(width,height);
		//colors.keySet()
	}
	public void generateMap(double w, double h) {
		Random randomGen = new Random();
		
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++)
				matrix[i][j]= new Tile(j*w,i*h,w,h,randomGen.nextInt(4)*90,types.get(types.keySet().toArray()[randomGen.nextInt(types.size())]),colors.get(colors.keySet().toArray()[randomGen.nextInt(colors.size())]));
	}
	
	@Override
	public void render(Graphics2D ctx) {
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++)
				matrix[i][j].render(ctx);
	}
	
	@Override
	public void update() {
		
	}
}
