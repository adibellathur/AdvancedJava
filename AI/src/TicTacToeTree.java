import java.util.ArrayList;


public class TicTacToeTree {
	TicTacToeGame game;
	int moveX;
	int moveY;

	public TicTacToeTree(TicTacToeGame g , int x , int y) {
		game = g.copy();
		moveX = x;
		moveY = y;
		game.placePieceAt(x, y);
	
	}
	
}
