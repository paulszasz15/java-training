package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) && pieces[xCoordinate][yCoordinate] == null) {
                pieces[xCoordinate][yCoordinate] = pawn;
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setChessBoard(this);
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);

        }

    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return ((xCoordinate) >=0 && (xCoordinate <7)) && ((yCoordinate >=0) && (yCoordinate <7));
    }

    public boolean isFreePosition(int xCoordinate, int yCoordinate) {
        return IsLegalBoardPosition(xCoordinate, yCoordinate) && pieces[xCoordinate][yCoordinate] == null;
    }
}
