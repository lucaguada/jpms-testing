package com.acme.rectangle;

import com.acme.api.Shape;

public final class Rectangle implements Shape {
  private final Sides sides = new Sides(4, 8);

  @Override
  public double area() {
    return sides.a() * sides.b();
  }
}

record Sides(double a, double b) {}
