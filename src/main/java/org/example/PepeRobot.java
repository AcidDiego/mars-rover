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
      command.chars().forEach(c -> {
          String commandString = Character.toString((char) c);
          if (commandString.equals("L")) {
              this.position.rotateLeft();
          }

          if (commandString.equals("R")) {
              this.position.rotateRight();
          }

          if (commandString.equals("M")) {
              this.move();
          }
      });

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
