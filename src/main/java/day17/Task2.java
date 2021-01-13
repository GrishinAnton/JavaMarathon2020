package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece rookWhite = ChessPiece.ROOK_WHITE;
        ChessPiece bishopWhite = ChessPiece.BISHOP_WHITE;
        ChessPiece pawnWhite = ChessPiece.PAWN_WHITE;
        ChessPiece queenWhite = ChessPiece.QUEEN_WHITE;
        ChessPiece kingWhite = ChessPiece.KING_WHITE;

        ChessPiece empty = ChessPiece.EMPTY;

        ChessPiece rookBlack = ChessPiece.ROOK_BLACK;
        ChessPiece kingBlack = ChessPiece.KING_BLACK;
        ChessPiece pawnBlack = ChessPiece.PAWN_BLACK;
        ChessPiece knightBlack = ChessPiece.KNIGHT_BLACK;
        ChessPiece queenBlack = ChessPiece.QUEEN_BLACK;
        ChessPiece bishopBlack = ChessPiece.BISHOP_BLACK;


        List<ChessPiece> line1 = new ArrayList<>(Arrays.asList(rookBlack,empty,empty,empty,empty,rookBlack, kingBlack,empty));
        List<ChessPiece> line2 = new ArrayList<>(Arrays.asList(empty,rookWhite,empty,empty,pawnBlack,pawnBlack, empty,pawnBlack));
        List<ChessPiece> line3 = new ArrayList<>(Arrays.asList(pawnBlack,empty,knightBlack,empty,empty,empty, pawnBlack,empty));
        List<ChessPiece> line4 = new ArrayList<>(Arrays.asList(queenBlack,empty,empty,bishopWhite,empty,empty, empty,empty));
        List<ChessPiece> line5 = new ArrayList<>(Arrays.asList(empty,empty,empty,bishopBlack,pawnWhite,empty, empty,empty));
        List<ChessPiece> line6 = new ArrayList<>(Arrays.asList(empty,empty,empty,empty,bishopWhite,pawnWhite, empty,empty));
        List<ChessPiece> line7 = new ArrayList<>(Arrays.asList(pawnWhite,empty,empty,queenWhite,empty,pawnWhite, empty,pawnWhite));
        List<ChessPiece> line8 = new ArrayList<>(Arrays.asList(empty,empty,empty,empty,empty,rookWhite, kingWhite,empty));

        List<List<ChessPiece>> board = new ArrayList<>();
        board.add(line1);
        board.add(line2);
        board.add(line3);
        board.add(line4);
        board.add(line5);
        board.add(line6);
        board.add(line7);
        board.add(line8);

        ChessBoard chessBoard = new ChessBoard(board);
        chessBoard.print();
    }
}
