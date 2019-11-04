package com.gc.main;

import java.awt.Color;
import java.awt.Graphics2D;

import com.gc.graphics.Window;

public class Maister {

	public static void main(String[] args) {
		
		Tile t = new Tile(10,10,100,100,0,Tile.Type.STRAIGHT);
		
		Window w = new Window(500,500,"Das Labirinth der Meister");
		
		w.addEntity(t);
		
		while(true) {
			w.getSCREEN().repaint();
		}
		
		

	}

}
