package chess;

import chess.ChessItem;
import chess.King;
import chess.Queen;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<ChessItem> chessItems = new ArrayList<>();

    chessItems.add(new Queen());
    chessItems.add(new King());
    chessItems.add(new Queen());

    ChessItem i = new Queen();
    if (i instanceof Queen) {
      ((Queen) i).queenSpecialAction();
    }
    i.draw();
    System.out.println(i.getValue());

    Queen q = new Queen();
    q.queenSpecialAction();
    q.draw();

    for (ChessItem item: chessItems) {
      item.draw();
    }

    ChessBoard board = new ChessBoard();
    board.draw();
    board.clear();

    Drawable board2 = new ChessBoard();
    board2.draw();
    if (board2 instanceof ChessBoard) {
      ((ChessBoard) board2).clear();
    }


  }

}
