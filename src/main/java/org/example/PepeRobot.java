package org.example;

public class PepeRobot implements MarsRover {

  private final Grid grid;

  private Position position;

  public PepeRobot(Grid grid) {
    this.grid = grid;
    this.position = new Position(0, 0, Direction.N);
  }

  @Override
  public String execute(String command) {
    return this.position.toString();
  }

  private void move() {
    switch (this.position.getCurrentDirection()) {
        case N -> {

        }
        case E -> {

        }
        case S -> {

        }
        case W -> {

        }
    }
  }
}
