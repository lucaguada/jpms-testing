package com.acme.square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
  @Test
  public void shouldComputeArea() {
    final var shape = new Square();

    assertEquals(shape.area(), 144);
  }
}
