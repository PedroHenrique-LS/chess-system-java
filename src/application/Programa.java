package application;

import chess.ChessMatch;

public class Programa {

	public static void main(String[] args) {
		
		ChessMatch match = new ChessMatch();
		UI.printBoard(match.getPieces());
	}

}
