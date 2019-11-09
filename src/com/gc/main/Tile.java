package com.gc.main;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

public class Tile extends Entity implements IRenderable,IUpdateable{

	
	public enum Type{
		T_FORM, STRAIGHT, CORNER;
	}
	
	private double rotation;
	private Type type;
	private Color tileColor;
	private static final boolean SHOW_FORM = false;
	private static final boolean SHOW_ROTATION = false;
	
	private List<Player> visitors;
	
	private final double[][] playerPositions = {   {getX() + getWidth() / 2,getY() + getHeight() / 2},
			
												   {getX() + getWidth() / 2 - getWidth()/4,getY() + getHeight() / 2,
													getX() + getWidth() / 2 + getWidth()/4,getY() + getHeight() / 2},
												 
												   {getX() + getWidth() / 2 - getWidth() / 4,getY() + getHeight() / 2 - getHeight() / 4,
													getX() + getWidth() / 2 + getWidth() / 4,getY() + getHeight() / 2 - getHeight() / 4,
													getX() + getWidth() / 2,getY() + getHeight() / 2 + getHeight()/4},
												   
												   {getX() + getWidth() / 2 - getWidth() / 4,getY() + getHeight() / 2 - getHeight() / 4,
													getX() + getWidth() / 2 + getWidth() / 4,getY() + getHeight() / 2 - getHeight() / 4,
													getX() + getWidth() / 2 - getWidth() / 4,getY() + getHeight() / 2 + getHeight()/4,
													getX() + getWidth() / 2 + getWidth() / 4,getY() + getHeight() / 2 + getHeight()/4}};
	
	private final double[] playerSize = {getWidth()/3,getHeight()/3};
	
	
	
	public Tile(double x, double y, double width, double height,double rotation, Type type,Color color) {
		super(x,y,width,height);
		this.rotation = rotation;
		this.type = type;
		this.tileColor = color;
		visitors = new ArrayList<>();
	}
	
	@Override
	public void render(Graphics2D ctx) {
		ctx.setColor(tileColor);
		ctx.fillRect(getIntX(),getIntY(),getIntWidth(),getIntHeight());
		
		if(SHOW_FORM) {
			ctx.setColor(new Color(229,204,255));
			int xForm,yForm,wForm,hForm;
			
			if(type == Type.T_FORM) {
				xForm = (int)(getIntX()+0.25 * getIntWidth());
				yForm = getIntY()+getIntHeight()/2;
				wForm = getIntWidth()/2;
				hForm = (int)(getIntHeight()*0.25);
				
				ctx.fillRect(xForm,yForm,wForm ,hForm);
				ctx.fillRect((int)(getIntX()+0.4 * getIntWidth()),getIntY()+getIntHeight()/2,(int)(getIntWidth()*0.2),(int)(getIntHeight()*0.40));
				
			}
			else if(type == Type.CORNER) {
				ctx.fillRect((int)(getIntX()+0.25 * getIntWidth()),getIntY()+getIntHeight()/2, getIntWidth()/2,(int)(getIntHeight()*0.25));
				ctx.fillRect((int)(getIntX()+0.25 * getIntWidth()),getIntY()+getIntHeight()/2,(int)(getIntWidth()*0.2),(int)(getIntHeight()*0.40));
			}
			else if(type == Type.STRAIGHT){
				
				ctx.fillRect((int)(getIntX()+0.25 * getIntWidth()),getIntY()+getIntHeight()/2, getIntWidth()/2,(int)(getIntHeight()*0.25));
			}
		}
		
		if(SHOW_ROTATION) {		
			ctx.setColor(new Color(0,0,0));
			
			if(rotation == 0) {
				ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
			}
			else if(rotation == 90) {
				ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
				ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
			}
			else if(rotation == 180) {
				ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
				ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
				ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.60*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
			}
			else if(rotation == 270) {
				ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
				ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.30*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
				ctx.fillRect((int)(getIntX()+0.30*getIntWidth()),(int)(getIntY()+0.60*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
				ctx.fillRect((int)(getIntX()+0.60*getIntWidth()),(int)(getIntY()+0.60*getIntHeight()),(int)(0.10*getIntWidth()),(int)(0.10*getIntHeight()));
			}	
		}
		
		
		for(int i=0;i<visitors.size();i++){	
			visitors.get(i).setX(playerPositions[visitors.size()-1][i*2]);
			visitors.get(i).setY(playerPositions[visitors.size()-1][i*2+1]);
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
	
	public void addVisitor(Player p) {
		if(!visitors.contains(p)) {
			p.setWidth(playerSize[0]);
			p.setHeight(playerSize[1]);
			visitors.add(p);
		}
			
	}
	
	
	
}
