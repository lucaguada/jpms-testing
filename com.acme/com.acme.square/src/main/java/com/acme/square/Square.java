package com.acme.square;

import com.acme.api.Shape;

public final class Square implements Shape {
  private final double side = 12;

  @Override
  public double area() {
    return Math.pow(side, 2.0);
  }
}
