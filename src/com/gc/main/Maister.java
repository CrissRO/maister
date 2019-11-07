package com.gc.main;

import java.awt.Color;
import java.util.Random;

import com.gc.graphics.Window;

public class Maister {

	public static void main(String[] args) {
		
		Random randomGenerator = new Random();
		
		///afisare nr intreg la limita maxima
		System.out.println(randomGenerator.nextInt(10));
		
		String[] names = {"Giuli","Cici","Fabi","Teo"};
		
		System.out.println(names[randomGenerator.nextInt(names.length)]);
		
		
		Color[] colors = {new Color(0,0,255),new Color(0,255,255)};
		
		System.out.println(colors[randomGenerator.nextInt(colors.length)]);
		
		Layout l = new Layout(0,0,75,75);
		
		Window w = new Window(600,600,"Das Labirinth der Meister");
		
		
		w.addEntity(l);
		
		
		while(true) {
			w.getSCREEN().repaint();
		}
		
		

	}

}
