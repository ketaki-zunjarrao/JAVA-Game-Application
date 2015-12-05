package com.techlabs.tictactoe1;

import com.techlabs.tictactoe.app.test.GameRunner;

public class TestGame {

	public static void main(String[] args) throws Exception {
		try {
			GameRunner g = new GameRunner();
			// g.startGame();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
