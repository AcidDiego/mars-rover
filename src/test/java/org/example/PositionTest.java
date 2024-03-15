package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    @ParameterizedTest
    @MethodSource("arguments")
    void shouldRotateToLeft(Direction direction, Direction expectedDirection) {
        Position position = new Position(0, 0, direction);
        position.rotateLeft();
        assertTrue(position.isFacing(expectedDirection));
    }

    @ParameterizedTest
    @MethodSource("argumentsForRight")
    void shouldRotateToRight(Direction direction, Direction expectedDirection) {
        Position position = new Position(0, 0, direction);
        position.rotateRight();
        assertTrue(position.isFacing(expectedDirection));
    }

    private static Stream<Arguments> arguments() {
        return Stream.of(Arguments.of(Direction.N, Direction.W),
                Arguments.of(Direction.E, Direction.N),
                Arguments.of(Direction.S, Direction.E),
                Arguments.of(Direction.W, Direction.S));
    }

    private static Stream<Arguments> argumentsForRight() {
        return Stream.of(Arguments.of(Direction.N, Direction.E),
                Arguments.of(Direction.E, Direction.S),
                Arguments.of(Direction.S, Direction.W),
                Arguments.of(Direction.W, Direction.N));
    }
}