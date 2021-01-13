package day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        ChessPiece chessPiece1 = ChessPiece.PAWN_WHITE;
        ChessPiece chessPiece2 = ChessPiece.ROOK_BLACK;

        List<String> chessPieces = new ArrayList<>();
        chessPieces.add(chessPiece1.getTranslate());
        chessPieces.add(chessPiece1.getTranslate());
        chessPieces.add(chessPiece1.getTranslate());
        chessPieces.add(chessPiece1.getTranslate());
        chessPieces.add(chessPiece2.getTranslate());
        chessPieces.add(chessPiece2.getTranslate());
        chessPieces.add(chessPiece2.getTranslate());
        chessPieces.add(chessPiece2.getTranslate());

        String result = String.join(" ", chessPieces);

        System.out.print(result + " ");
    }
}