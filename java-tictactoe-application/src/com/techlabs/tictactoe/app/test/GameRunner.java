package com.techlabs.tictactoe.app.test;

public class GameRunner {

	Player p1 = new PlayerOne('X');
	Player p2 = new PlayerTwo('O');
	boolean isOver = true;

	public GameRunner() {
		while (Player.i < 9 && isOver == true) {
			if (Player.i % 2 == 0) {
				isOver = p1.play(p1.sign);
			} else {
				isOver = p2.play(p2.sign);
			}
		}
		if (Player.i == 9)
			System.out.println(".....No moves possible....\nGame Over");
	}
}
