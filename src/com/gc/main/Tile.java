package com.gc.main;

import java.awt.Color;
import java.awt.Graphics2D;

public class Tile extends Entity implements IRenderable,IUpdateable{

	
	public enum Type{
		T_FORM, STRAIGHT, CORNER;
	}
	
	private double rotation;
	private Type type;
	private Color tileColor;
	
	public Tile(double x, double y, double width, double height,double rotation, Type type,Color color) {
		super(x,y,width,height);
		this.rotation = rotation;
		this.type = type;
		this.tileColor = color;
	}
	
	@Override
	public void render(Graphics2D ctx) {
		
		
		
		if(type == Type.T_FORM) {
			ctx.setColor(tileColor);
			ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
			ctx.setColor(new Color(229,204,255));
			ctx.fillRect(getIntX()+0,getIntY(), getIntWidth()/4,getIntHeight());
			ctx.fillRect(getIntX()+0,getIntY()+getIntHeight()/2-5,(int)(getIntWidth()),getIntHeight()/4);
			
		}
		else if(type == Type.CORNER) {
			ctx.setColor(tileColor);
			ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
			ctx.setColor(new Color(229,204,255));
			ctx.fillRect(getIntX()+0,getIntY()+getIntHeight()-getIntHeight()/4, getIntWidth(),getIntHeight()/4);
			ctx.fillRect(getIntX()+0,getIntY(), getIntWidth()/4,getIntHeight());
		}
		else if(type == Type.STRAIGHT){
			ctx.setColor(tileColor);
			ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
			ctx.setColor(new Color(229,204,255));
			ctx.fillRect(getIntX()+0,getIntY()+getIntHeight()/2+getIntHeight()/4, getIntWidth(),getIntHeight()/4);
			
		}
		
		
		
		if(rotation == 0) {
			ctx.setColor(new Color(0,0,0));
			ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
		}
		else if(rotation == 90) {
			ctx.setColor(new Color(0,0,0));
			ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
			ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
		}
		else if(rotation == 180) {
			ctx.setColor(new Color(0,0,0));
			ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
			ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
			ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.60*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
		}
		else if(rotation == 270) {
			ctx.setColor(new Color(0,0,0));
			ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
			ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
			ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.60*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));
			ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.60*getIntHeight()),(int)(0.20*getIntWidth()),(int)(0.20*getIntHeight()));

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
