package org.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PepeRobotTest {

  @Test
  void shouldInitWith00N() {
    PepeRobot pepe = new PepeRobot(new Grid());
    assertEquals("0:0:N", pepe.execute(""));
  }
}