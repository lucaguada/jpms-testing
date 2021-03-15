package com.acme.app;

import com.acme.api.Shape;

import java.util.ServiceLoader;

import static java.lang.System.out;

public enum App {
  ;

  public static void main(String... args) {
    for (final var shape : ServiceLoader.load(Shape.class)) {
      final var area = (int) shape.area();

      out.println(
        switch (area) {
          case 144 -> "I'm a square with area %d.".formatted(area);
          case 32 -> "I'm a rectangle with area %d.".formatted(area);
          default -> "I'm nothing! I'm not a shape!";
        }
      );
    }
  }
}
