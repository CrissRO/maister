package com.gc.graphics;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import org.w3c.dom.Entity;

public class Screen extends JPanel{

	
	private List<Entity> entities;
	
	public Screen() {
		entities = new ArrayList<>();
			
	}
	
	public void addEntity(Entity e) {
		if(!entities.contains(e))
			entities.add(e);
	}
	
	@Override
	public void paint(Graphics g) {
		Graphics2D ctx = (Graphics2D)g;
		
		for(Entity e : Entity)
			e.render(ctx);
		
		ctx.dispose();
		g.dispose();
	}
			
	
	
}
