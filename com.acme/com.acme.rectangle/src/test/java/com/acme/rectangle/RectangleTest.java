package com.acme.rectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
  @Test
  public void shouldComputeArea() {
    final var shape = new Rectangle();

    assertEquals(shape.area(), 32);
  }
}
