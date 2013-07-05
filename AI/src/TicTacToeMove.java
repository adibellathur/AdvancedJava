import java.util.ArrayList;


public class TicTacToeMove {
	TicTacToeGame game;			// The game after the move has been made
	int moveX;
	int moveY;
	ArrayList <TicTacToeMove> moves;
	
	public TicTacToeMove(TicTacToeGame g, int x, int y) {
		game = g.copy();
		moveX = x;
		moveY = y;
		//game.placePieceAt(x, y);
	}
}