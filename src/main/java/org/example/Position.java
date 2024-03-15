package org.example;

public class Position {

  private Integer x;
  private Integer y;
  private Direction direction;

  public Position(Integer x, Integer y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  @Override
  public String toString() {
    return x + ":" + y + ":" + direction.name();
  }
}
