public class Main {
    public static void main(String[] args)
{
    Polygon triangle = new Triangle(5, 10, 5, 12, 13);
    System.out.println("Triangle Area: " + triangle.area());
    System.out.println("Triangle Perimeter: " + triangle.perimeter());
    Polygon rectangle = new Rectangle(4, 8);
    System.out.println("Rectangle Area: " + rectangle.area());
    System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
}
}
