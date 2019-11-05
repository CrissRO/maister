package com.gc.main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Tile extends Entity implements IRenderable,IUpdateable{

	
	public enum Type{
		T_FORM, STRAIGHT, CORNER;
	}
	
	private double rotation;
	private Type type;
	
	public Tile(double x, double y, double width, double height,double rotation, Type type) {
		super(x,y,width,height);
		this.rotation = rotation;
		this.type = type;
	}
	
	@Override
	public void render(Graphics2D ctx) {
		if(type == Type.T_FORM) {
			ctx.setColor(new Color(153,255,255));
			ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
			ctx.setColor(new Color(229,204,255));
			ctx.fillRect(0,10, getIntWidth()/4,getIntHeight());
			ctx.fillRect(0,getIntHeight()/2, getIntWidth(),getIntHeight()/4);
			
		}
		else if(type == Type.CORNER) {
			ctx.setColor(new Color(153,255,255));
			ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
			ctx.setColor(new Color(229,204,255));
			ctx.fillRect(0,getIntHeight(), getIntWidth(),getIntHeight()/4);
			ctx.fillRect(0,10, getIntWidth()/4,getIntHeight());
		}
		else{
			ctx.setColor(new Color(153,255,255));
			ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
			ctx.setColor(new Color(229,204,255));
			ctx.fillRect(0,getIntHeight()/2+getIntHeight()/4, getIntWidth(),getIntHeight()/4);
			
		}
		
	}
	
	@Override
	public void update() {
		
	}

	public double getRotation() {
		return rotation;
	}

	public void setRotation(double rotation) {
		this.rotation = rotation;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
	
	
	
}
