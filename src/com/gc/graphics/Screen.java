package com.gc.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import com.gc.main.IRenderable;

public class Screen extends JPanel{

	
	private List<IRenderable> entities;
	
	public Screen() {
		entities = new ArrayList<>();
			
	}
	
	public void addEntity(IRenderable e) {
		if(!entities.contains(e)) {
			System.out.println("Added...");
			entities.add(e);
		}
			
			
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D ctx = (Graphics2D)g;
		ctx.clearRect(0, 0, getWidth(), getHeight());
		
		ctx.setColor(new Color(255,0,0));
		ctx.fillRect(100, 199, 100, 100);
		
		for(IRenderable e : entities)
			e.render(ctx);
		
		ctx.dispose();
		g.dispose();
	}
			
	
	
}
