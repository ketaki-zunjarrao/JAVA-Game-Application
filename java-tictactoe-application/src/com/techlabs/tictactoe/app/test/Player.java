package com.techlabs.tictactoe.app.test;

import java.util.Scanner;

public abstract class Player {
	Board b = new Board();
	Scanner keyboard = new Scanner(System.in);
	static int i;
	char sign;

	public Player(char sign) {
		this.sign = sign;
	}

	public void getSign() {
		System.out.println("Player one Enter your sign");
	}

	public boolean play(char sign) {
		try {
			if (this.isWon(this) == false) {
				int x = 0;
				int y = 0;
				System.out.println(this+"'s Turn");
				System.out.println("enter x and y co-ordinate of grid");
				x = keyboard.nextInt();
				y = keyboard.nextInt();
				i++;
				boolean isMark = b.isMarked(x, y);
				if (isMark == false) {
					b.markCell(x, y, sign);
					b.viewGrid();
				} else {
					System.out.println("This cell is already marked");
					play(sign);
				}
				return true;
			} else
			return false;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isWon(Player p) {
		try {
			if ((Board.grid[0][0] == p.sign && Board.grid[0][1] == p.sign && Board.grid[0][2] == p.sign)
					|| (Board.grid[0][1] == p.sign
							&& Board.grid[1][1] == p.sign && Board.grid[2][1] == p.sign)
					|| (Board.grid[0][2] == p.sign
							&& Board.grid[1][2] == p.sign && Board.grid[2][2] == p.sign)
					|| (Board.grid[0][0] == p.sign
							&& Board.grid[0][1] == p.sign && Board.grid[0][2] == p.sign)
					|| (Board.grid[0][1] == p.sign
							&& Board.grid[1][1] == p.sign && Board.grid[2][1] == p.sign)
					|| (Board.grid[0][2] == p.sign
							&& Board.grid[1][2] == p.sign && Board.grid[2][2] == p.sign)
					|| (Board.grid[0][0] == p.sign
							&& Board.grid[1][1] == p.sign && Board.grid[2][2] == p.sign)
					|| (Board.grid[2][0] == p.sign
							&& Board.grid[1][1] == p.sign && Board.grid[0][2] == p.sign)) {
				System.out.println(this + " Wins");
				return true;
			} else
				return false;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

}
