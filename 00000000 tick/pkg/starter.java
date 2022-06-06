//import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	          Scanner sc = new Scanner(System.in);

		char[][] board = new char[3][3];
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				board[x][y] = '-';
			}
		}

		Scanner in = new Scanner(System.in);
		System.out.print("Player numERO UNOO, what art thoust name? ");
		String p1 = in.nextLine();
		System.out.print("Player two,  what is your name? ");
		String p2 = in.nextLine();

		boolean player1 = true;

		boolean end = false;
		
		while(!end) {

			drawBoard(board);

			if(player1) {
				System.out.println(p1 + "'s Turn (x):");
			} else {
				System.out.println(p2 + "'s Turn (o):");
			}

			char a = '-';
			if(player1) {
				a = 'x';
			} else {
				a = 'o';
			}

			int row = 0;
			int col = 0;

			while(true) {
				
				System.out.print("Enter a row number (0, 1, or 2): ");
				row = in.nextInt();
				System.out.print("Enter a  olumn number (0, 1, or 2): ");
				col = in.nextInt();

				if(row < 0 || col < 0 || row > 2 || col > 2) {
					System.out.println("Thats not even on the board Try again.");
				
				} else if(board[row][col] != '-') {
					System.out.println("Your opponent is alreay here! Try again.");
				
				} else {
					break;
				}
			
			}

			board[row][col] = a;

			if(playerHasWon(board) == 'x') {
				System.out.println(p1 + " has won!");
				end = true;
			} else if(playerHasWon(board) == 'o') {
				System.out.println(p2 + " has won!");
				end = true;
			} else {

				if(boardIsFull(board)) {
					System.out.println("It's a tie!");
					end = true;
				} else {
					player1 = !player1;
				}

			}

		}
		
		drawBoard(board);

  }

	public static void drawBoard(char[][] board) {
		System.out.println("Board:");
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}

	public static char playerHasWon(char[][] board) {
		
		for(int i = 0; i < 3; i++) {
			if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
				return board[i][0];
			}
		}

		for(int j = 0; j < 3; j++) {
			if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
				return board[0][j];
			}
		}

		if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != '-') {
			return board[0][0];
		}
		if(board[2][0] == board[1][1] && board[1][1] ==  board[0][2] && board[2][0] != '-') {
			return board[2][0];
		}

		return ' ';

	}

	public static boolean boardIsFull(char[][] board) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(board[i][j] == '-') {
					return false;
				}
			}
		}
		return true;
	}
}
	    
	
	
