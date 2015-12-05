package com.techlabs.tictactoe.app.test;

public class Board {
	public static char[][] grid = new char[3][3];

	public Board() {

		grid[0][0] = '-';
		grid[0][1] = '-';
		grid[0][2] = '-';
		grid[1][0] = '-';
		grid[1][1] = '-';
		grid[1][2] = '-';
		grid[2][0] = '-';
		grid[2][1] = '-';
		grid[2][2] = '-';
	}

	public boolean isMarked(int x, int y) {
		if (grid[x][y] == '-') {
			return false;
		} else {
			return true;
		}
	}

	public void markCell(int x, int y, char sign) {

		grid[x][y] = sign;
	}

	public void viewGrid() {
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				System.out.print(grid[i][j]);

			}
			System.out.println();

		}
	}
}
