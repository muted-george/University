public class Rectangle {
    private Point topLeft; //coordinate of top-left corner
    private Point bottomRight; // coordinate of bottom-right corner

    //loaded constructor: initialises instance variables topLeft and bottomRight
    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;

    }
    //getter
    public Point getTopLeft() {
        return topLeft;
    }
    //setter
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }
    //getter
    public Point getBottomRight() {
        return bottomRight;
    }
    //setter
    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    //double area(): calculates and returns the area of the rectangle

    public double area(double width, double height) {
        return width * height;

    }

    public double perimeter(double width, double height) {
        return ((2 * width) + (2 * height));
    }
    //boolean contains(Point p): checks if a point p lies within or on the boundaries
    //of the rectangle
    public boolean contains(Point p) {
        return (p.getX() >= topLeft.getX() && p.getX() <= bottomRight.getX())
                &&
                (p.getY() <= topLeft.getY() && p.getY() >= bottomRight.getY());
    }
    //boolean equals(Rectangle r1, Rectangle r2): checks if two Rectangle
    //objects are equal based on their based on their attributes
    public boolean equals(Rectangle r1) {
        return this.topLeft.equals(r1.getTopLeft()) && this.bottomRight.equals(r1.getBottomRight());

    }

    public static void main (String[] args) {

        //create points for the rectangle
        Point topLeft = new Point(1.0, 4.0);
        Point bottomRight = new Point(5.0, 6.0);

        //create a rectangle object
        Rectangle rect = new Rectangle(topLeft, bottomRight);

        //test area
        double area = rect.area(3,4);
        System.out.println("Area of rectangle: " + area);

        //test perimeter
        double perimeter = rect.perimeter(5, 6);
        System.out.println("Perimeter of rectangle: " + perimeter);

        //Test contains
        Point pointInside = new Point(3.0, 2.0);
        Point pointOutside = new Point(6.0, 5.0);
        System.out.println("Contains (3,2): " + rect.contains(pointInside)); //should be true
        System.out.println("Contains (6,5): " + rect.contains(pointOutside)); //should be false

        //test equals
        Rectangle anotherRect = new Rectangle(new Point(1.0,4.0), new Point(5.0,1.0));
        boolean areEquals = rect.equals(anotherRect);
        System.out.println("Rectangles are equals: " + areEquals);


    }
}



