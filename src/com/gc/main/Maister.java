package com.gc.main;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import com.gc.graphics.Window;

public class Maister {

	private static Window window;
	private static Layout board;
	private static List<Player> players;
	
	public static void initGame() {
		window = new Window(600,600,"Das Labirinth der Meister");
		board = new Layout(50,50,75,75); 
		players = new ArrayList<>();
		
		
		players.add(new Player("cici",new Color(255,255,0)));
		players.add(new Player("giuli",new Color(255,0,255)));
		players.add(new Player("cici",new Color(0,255,255)));
		players.add(new Player("giuli",new Color(0,0,255)));
		
		board.addPlayers(players);
		
		
		window.addEntity(board);
		for(Player p : players)
			window.addEntity(p);
		
	}
	
	public static void main(String[] args) {
		 		initGame();
	}

}
