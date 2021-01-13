package day17;

import java.util.List;

public class ChessBoard {
    List<List<ChessPiece>> board;

    public ChessBoard(List<List<ChessPiece>> board) {
        this.board = board;
    }

    public void print(){
        for (int i = 0; i < board.size(); i++) {
            String line = "";
            for (int j = 0; j < board.get(i).size(); j++) {
                line+= board.get(i).get(j).getTranslate();
            }
            System.out.println(line);
            line = "";
        }
    }

    public void getBoard() {
        System.out.println(board);
    }
}
