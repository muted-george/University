//polygon interface with two methods: area and perimeter
interface Polygon {
    double area();
    double perimeter();
}

// triangle
class Triangle implements Polygon {
    private final double base;
    private final double height;
    private final double sideA;
    private final double sideB;
    private final double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // area of the Triangle
    public double area() {
        return base * height;
    }

    //perimeter of the Triangle
    public double perimeter() {
        return sideA + sideB + sideC;
    }
}

// Rectangle
class Rectangle implements Polygon {
    private final double width;
    private final double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //area of the Rectangle
    public double area() {
        return width * height;
    }

    //perimeter of the Rectangle
    public double perimeter() {
        return (2 * width)+ (2 * height);
    }
}