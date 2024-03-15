package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PepeRobotTest {

  @Test
  void shouldInitWith00N() {
    PepeRobot pepe = new PepeRobot(new Grid());
    assertEquals("0:0:N", pepe.execute(""));
  }

  @Test
  void shouldRotateOnce() {
    PepeRobot pepe = new PepeRobot(new Grid());
    assertEquals("0:0:W", pepe.execute("L"));
  }

  @Test
  void shouldRotateOnceToRight() {
    PepeRobot pepe = new PepeRobot(new Grid());
    assertEquals("0:0:E", pepe.execute("R"));
  }

  @Test
  void shouldMoveTo23W() {
    PepeRobot pepe = new PepeRobot(new Grid());
    assertEquals("2:3:W", pepe.execute("MMRMMMLL"));
  }

  @Test
  void shouldMoveOnX() {
    PepeRobot pepe = new PepeRobot(new Grid());

    String result = pepe.execute("M");

    assertEquals("1:0:N", result);
  }

  @Test
  void shouldMoveOnY() {}

  @Test
  void shouldNotOverflowOnX() {}

  @Test
  void shouldNotOverflowOnY() {}
}