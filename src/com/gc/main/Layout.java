package com.gc.main;

import static com.gc.main.Tile.Type.CORNER;
import static com.gc.main.Tile.Type.STRAIGHT;
import static com.gc.main.Tile.Type.T_FORM;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.gc.main.Tile.Type;

public class Layout extends Entity  implements IRenderable,IUpdateable{

	private Tile matrix[][];
	private Color[] colors = {new Color(102, 102, 255),new Color(255, 77, 77),new Color(128, 255, 128)};
	private Type[] types = {CORNER,STRAIGHT,T_FORM};
	private List<Player> players;
	private static final int[][] START_POSITIONS = {{2,2},{2,4},{4,2},{4,4}};
	
	public Layout(double x, double y, double width, double height) {
		super(x,y,width,height);
		matrix = new Tile[7][7];
		players = new ArrayList<>();
		generateMap(width,height);
		
	}
	
	
	
	public void generateMap(double w, double h) {
		Random randomGen = new Random();
		for(int i=0;i<matrix.length;i++)
			for(int j=0;j<matrix[0].length;j++)
				matrix[i][j]= new Tile(x + j*(w+1),y + i*(h+1),w,h,randomGen.nextInt(4)*90,types[randomGen.nextInt(types.length)],colors[randomGen.nextInt(colors.length)]);
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
	
	public void addPlayers(List<Player> players) {
		this.players.addAll(players);
		
		for(int i = 0;i < this.players.size() && i < 4;i++) {
			int[] position = START_POSITIONS[i];
			this.players.get(i).setLocation(matrix[position[0]][position[1]]);
		}
			
	}

	public Tile[][] getMatrix() {
		return matrix;
	}



	public void setMatrix(Tile[][] matrix) {
		this.matrix = matrix;
	}
	
	
}
