/**
 * The rectangle shape data class.
 */
public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Evaluates the area of the rectangle.
     * @return The area of the rectangle, namely width multiplies height.
     */
    public double area() {
        return width * height;
    }

    /**
     * Scaling the rectangle based on the factor given.
     * @param factor The multiplier applying to each sides of the rectangle.
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    /**
     * Comparing the size with another Rectangle and return if this rectangle
     * is larger than the other.
     * @param other The other rectangle to compare with this rectangle.
     * @return Returns true if this rectangle is larger than the given rectangle,
     * otherwise, return false.
     */
    public boolean isLargerThan(Rectangle other) {
        return area() > other.area();
    }

}
