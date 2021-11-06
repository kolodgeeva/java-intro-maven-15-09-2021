package chess;

import lombok.Getter;

@Getter
public abstract class ChessItem implements Drawable {

  int x, y;
  int value;

}
