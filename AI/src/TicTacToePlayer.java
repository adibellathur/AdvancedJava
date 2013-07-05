
// Computer is playing as 'O'
public class TicTacToePlayer {
	TicTacToeGame game;
	private final char opponent = 'X';
	
	public TicTacToePlayer(TicTacToeGame g) {
		game = g;
	}
	
	public TicTacToeMove getMove() {
		if(getGameSaver() != null) {
			System.out.println("Found game saver");
			return getGameSaver();
		}
		
		return getFirstMoveFound();
	}
	
	public TicTacToeMove getGameSaver() {
		for(int x = 0 ; x < 3 ; x++) {
			if (game.getPieceAt(x, 0) == opponent && game.getPieceAt(x, 1) == opponent && game.canPlacePieceAt(x, 2)){
				return new TicTacToeMove (game, x, 2);
			}
			if (game.getPieceAt(x, 1) == opponent && game.getPieceAt(x, 2) == opponent && game.canPlacePieceAt(x, 0)){
				return new TicTacToeMove (game, x, 0);
			}
			if (game.getPieceAt(x, 0) == opponent && game.getPieceAt(x, 2) == opponent && game.canPlacePieceAt(x, 1)){
				return new TicTacToeMove (game, x, 1);
			}
		}
		for(int y=0 ; y < 3 ; y++) {
			if (game.getPieceAt(0 , y) == opponent && game.getPieceAt(1, y) == opponent && game.canPlacePieceAt(2, y)){
				return new TicTacToeMove (game, 2, y);
			}
			if (game.getPieceAt(1 , y) == opponent && game.getPieceAt(2, y) == opponent && game.canPlacePieceAt(0, y)){
				return new TicTacToeMove (game, 0, y);
			}
			if (game.getPieceAt(0 , y) == opponent && game.getPieceAt(2, y) == opponent && game.canPlacePieceAt(1 , y)){
				return new TicTacToeMove (game, 1, y);
			}
		}
		for (int x = 0 ; x < 3 ; x++) {
			for(int y = 0 ; y < 3 ; y++) {
				if (game.getPieceAt(0 , 0) == opponent && game.getPieceAt(1, 1) == opponent && game.canPlacePieceAt(2, 2)){
					return new TicTacToeMove (game, 2, 2);
				}
				if (game.getPieceAt(0 , 0) == opponent && game.getPieceAt(2, 2) == opponent && game.canPlacePieceAt(1, 1)){
					return new TicTacToeMove (game, 1, 1);
				}
				if (game.getPieceAt(1 , 1) == opponent && game.getPieceAt(2 , 2) == opponent && game.canPlacePieceAt(0, 0)){
					return new TicTacToeMove (game, 0, 0);
				}
				if (game.getPieceAt(0 , 2) == opponent && game.getPieceAt(1 , 1) == opponent && game.canPlacePieceAt(2 , 0)){
					return new TicTacToeMove (game, 2 , 0);
				}
				if (game.getPieceAt(0 , 2) == opponent && game.getPieceAt(2 , 0) == opponent && game.canPlacePieceAt(1 , 1)){
					return new TicTacToeMove (game, 1 , 1);
				}
				if (game.getPieceAt(1 , 1) == opponent && game.getPieceAt(2 , 0) == opponent && game.canPlacePieceAt(0 , 2)){
					return new TicTacToeMove (game, 0 , 2);
				}
			}
		}
		
		return null;
	}
	
	public TicTacToeMove getFirstMoveFound() {
		for (int x = 0 ; x < 3 ; x++) {
			for (int y = 0 ; y < 3 ; y++) {
				if (game.canPlacePieceAt(x, y)) {
					return new TicTacToeMove(game, x, y);
				}
			}
		}
		return null;
	}
}