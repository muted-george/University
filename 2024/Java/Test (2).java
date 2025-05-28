public class Test {

    public static void main(String[] args)
    {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(4, 6);
        Point p3 = new Point (1,1);
        Point p4 = new Point(10,10);
        Point p5 = new Point(-4, 6);

        System.out.println("Consider 5 points on the X-Y plane...");
        System.out.println("p1(" + p1.getX_coord()+ ", " + p1.getY_coord()+ ")");
        System.out.println("p2(" + p2.getX_coord()+ ", " + p2.getY_coord()+ ")");
        System.out.println("p3(" + p3.getX_coord()+ ", " + p3.getY_coord()+ ")");
        System.out.println("p4(" + p4.getX_coord()+ ", " + p4.getY_coord()+ ")");
        System.out.println("p5(" + p5.getX_coord()+ ", " + p5.getY_coord()+ ")");

        System.out.println();
        System.out.println("Now, let's perform some tests...");

        try {
            double grad1 = p2.gradient(p5);
            System.out.println("Gradient between p2 and p5: " + grad1);
            double grad2 = p3.gradient(p4);
            System.out.println("Gradient between p3 and p4: " + grad2);
            double dist1 = p1.distance(p5);
            System.out.println("Distance between p1 and p5: " + dist1);
            double dist2 = p3.distance(p4);
            System.out.println("Distance between p3 and p4: " + dist2);
            Point mid1 = p1.midpoint(p2);
            System.out.println("Midpoint between p1 and p2: (" + mid1.getX_coord()+ ", " + mid1.getY_coord()+ ")");
            Point mid2 = p3.midpoint(p4);
            System.out.println("Midpoint between p3 and p4: (" + mid2.getX_coord()+ ", " + mid2.getY_coord()+ ")");
            System.out.println("p1.is_equal(p3): " + p1.isEqual(p3)); // true
            System.out.println("p3.is_equal(p4): " + p3.isEqual(p4)); // false
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("----end-of-program----");
    }
}