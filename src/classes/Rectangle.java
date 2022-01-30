package classes;

public class Rectangle implements Comparable<Rectangle> {
  double height;
  double length;

  public Rectangle(final double height, final double length) {
    setHeight(height);
    setLength(length);
  }

  public Rectangle(double height) {
    this(height, height);
  }

  public Rectangle() {
    this(0, 0);
  }

  public static double getPerimeter(double height, double length) {
    return (height + length) * 2;
  }

  public static double getSquare(double height, double length) {
    return height * length;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getPerimeter() {
    return (this.height + this.length) * 2;
  }

  public double getSquare() {
    return this.height * this.length;
  }

  @Override
  public int compareTo(Rectangle rectangle) {
    double square_1 = getSquare();
    double square_2 = rectangle.getSquare();
    if (square_1 == square_2) {
      return 0;
    } else if (square_1 > square_2) {
      return 1;
    }
    return -1;
  }

  @Override
  public boolean equals(Object o) {
    return getSquare() == ((Rectangle) o).getSquare();
  }
}
