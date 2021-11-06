package chess;

public class Queen extends ChessItem {

  @Override
  public void draw() {
    System.out.println("draw queen");
  }

  public void queenSpecialAction() {
    System.out.println("queenSpecialAction");
  }
}
