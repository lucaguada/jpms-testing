package com.acme.rectangle;

import com.acme.api.Shape;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.util.ServiceLoader.load;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {
  @Test
  void shouldComputeArea() {
    load(Shape.class)
      .findFirst()
      .ifPresentOrElse(
        it -> assertEquals(it.area(), 32),
        () -> Assertions.fail("Can't find shape")
      );
  }
}
