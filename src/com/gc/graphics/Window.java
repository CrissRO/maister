package com.gc.graphics;

import javax.swing.JFrame;

public class Window {

	private final JFrame FRAME;
	private final int WIDTH;
	private final int HEIGHT;
	private final Screen SCREEN;
	
	public Window() {this(100,100,"");}
	
	public Window(int width,int height,String title) {
		WIDTH = width;
		HEIGHT = height;
		SCREEN = new Screen();
		FRAME = new JFrame(title);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.setLocationRelativeTo(null);
		FRAME.add(SCREEN);
		FRAME.setVisible(true);
	}
	
	public void addEntity(Entity e) {
		SCREEN.addEntity(e);
	}
	
	
}
