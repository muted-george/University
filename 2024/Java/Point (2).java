public class Point {
    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x coordinate
    public double getX() {
        return x;
    }

    // Getter for y coordinate
    public double getY() {
        return y;
    }

    // Optional: ToString method for easy debugging
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
