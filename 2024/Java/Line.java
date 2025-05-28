public class Line {
    private Point start;
    private Point end;

    // Loaded constructor
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Getter for start point
    public Point getStart() {
        return start;
    }

    // Setter for start point
    public void setStart(Point start) {
        this.start = start;
    }

    // Getter for end point
    public Point getEnd() {
        return end;
    }

    // Setter for end point
    public void setEnd(Point end) {
        this.end = end;
    }

    // Method to calculate the length of the line segment
    public double length() {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        return Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) * 100.0) / 100.0;
    }

    // Method to calculate the gradient (slope) of the line
    public double gradient() {
        double x1 = start.getX();
        double y1 = start.getY();
        double x2 = end.getX();
        double y2 = end.getY();
        return Math.round((y2 - y1) / (x2 - x1) * 100.0) / 100.0;
    }

    // Method to calculate the midpoint of the line segment
    public Point midpoint() {
        double midX = (start.getX() + end.getX()) / 2;
        double midY = (start.getY() + end.getY()) / 2;
        return new Point(midX, midY);
    }

    // Method to return the equation of the line in the form y = mx + b
    public String equation() {
        double m = gradient();
        double b = start.getY() - (m * start.getX());
        return "y = " + m + "x + " + b;
    }
}
