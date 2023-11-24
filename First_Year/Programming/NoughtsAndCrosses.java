import java.util.Scanner;

public class NoughtsAndCrosses
{
	public char[][] boots;
	NoughtsAndCrosses() {}
    public void clearBoard(char[][] Board)
    {
    	for(int i = 0; i < Board.length; i++) {
    		for(int j = 0; j < Board[i].length; j++) {
        		Board[i][j] = ' ';
        	}
    	}
    	this.boots = Board;
    }
	
    public void printBoard(char[][] Board)
    {
    	System.out.println("A " + Board[0][0] + " | "+ Board[0][1] + " | "+ Board[0][2]);
    	System.out.println(" ---|---|---");
    	System.out.println("B " + Board[1][0] + " | "+ Board[1][1] + " | "+ Board[1][2]);
    	System.out.println(" ---|---|---");
    	System.out.println("C " + Board[2][0] + " | "+ Board[2][1] + " | "+ Board[2][2]);
    	System.out.println("  1   2   3");
    }
	
    public boolean canMakeMove(char[][] Board, int X, int Y)
    {
    	if(X > 2 || Y > 2) return false;
    	if(Board[X][Y] == ' ') return true;
    	else return false;
    }
	
    public void makeMove(char[][] board, char player, int x, int y)
    {
    	if (canMakeMove(board, x, y)) {
    		board[x][y] = player;
    		this.boots = board;
    	}

    }
	
    public boolean isBoardFull(char[][] board)
    {
    	for(int i = 0; i < board.length; i++) {
    		for(int j = 0; j < board[i].length; j++) {
        		if (board[i][j] == ' ') return false;
        	}
    	}
    	return true;
    }
	
    public char winner(char[][] board)
    {
    	for(int i = 0; i < board.length; i++) {
    		if (board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][0] != ' ') return board[i][0];
    	}
    	for(int i = 0; i < board[0].length; i++) {
    		if (board[0][i] == board[1][i] && board[0][i] == board[2][i] && board[0][i] != ' ') return board[0][i];
    	}
    	if(board[0][0] == board[1][1] && board[2][2] == board[0][0] && board[0][0] != ' ') return board[0][0];
    	if(board[0][2] == board[1][1] && board[2][0] == board[0][0] && board[0][2] != ' ') return board[0][2];
    	return ' ';
    }

    public static void main(String[] args)
    {
    	NoughtsAndCrosses game = new NoughtsAndCrosses();
    	char[][] numbers = new char[3][3];
    	game.clearBoard(numbers);
    	char player = 'X';
    	Scanner input = new Scanner( System.in );
    	
    	while (game.winner(numbers) == ' ' || game.isBoardFull(numbers)) {
    		game.printBoard(numbers);
    		System.out.print("Enter move for " + player + ": ");
    		String play = input.nextLine();
    		System.out.println(play);
    		char x = play.charAt(0);
    		char y = play.charAt(1);
    		int X, Y;
    		if (x == 'A' || x == 'a') X = 0;
    		else if (x == 'B' || x == 'b') X = 1;
    		else if (x == 'C' || x == 'c') X = 2;
    		else X = 6;
    		if (y == '1') Y = 0;
    		else if (y == '2') Y = 1;
    		else if (y == '3') Y = 2;
    		else Y = 6;
    		game.makeMove(numbers, player, X, Y);
    		if (player == 'X') player = 'O';
    		else player = 'X';
    	}
    }

}