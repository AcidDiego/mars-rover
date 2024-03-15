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

  public Boolean isFacing(Direction direction) {
      return this.direction.equals(direction);
  }

  public void moveXPosition(Integer newPosition) {
      this.x = newPosition;
  }

  public Direction getCurrentDirection() {
      return this.direction;
  }

  public void rotateLeft() {
    switch (this.direction) {
        case N -> {
          this.direction = Direction.W;
        }
        case E -> {
          this.direction = Direction.N;
        }
        case S -> {
          this.direction = Direction.E;
        }
        case W -> {
          this.direction = Direction.S;
        }
    }
  }

  public void rotateRight() {
      switch (this.direction) {
          case N -> {
              this.direction = Direction.E;
          }
          case E -> {
              this.direction = Direction.S;
          }
          case S -> {
              this.direction = Direction.W;
          }
          case W -> {
              this.direction = Direction.N;
          }
      }
  }
}
