public class Test
{
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint(3, 4);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(6, 7);
        System.out.println(p2);
        System.out.println(p1.distance());
        System.out.println(p1.distance(5, 6));
        System.out.println(p1.distance(p2));

        // Test program to test all constructors and public methods
        MyPoint p3 = new MyPoint();  // Test constructor
        System.out.println(p3);      // Test toString()
        p3.setX(8);   // Test setters
        p3.setY(6);
        System.out.println("x is: " + p3.getX());  // Test getters
        System.out.println("y is: " + p3.getY());
        p3.setXY(3, 0);   // Test setXY()
        System.out.println(p3.getXY()[0]);  // Test getXY()
        System.out.println(p3.getXY()[1]);
        System.out.println(p3);

        MyPoint p4 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p4);
        // Testing the overloaded methods distance()
        System.out.println(p3.distance(p4));    // which version?
        System.out.println(p4.distance(p3));    // which version?
        System.out.println(p3.distance(5, 6));  // which version?
        System.out.println(p3.distance());

        MyPoint[] points = new MyPoint[10];  // Declare and allocate an array of MyPoint
        for (int i = 0; i < points.length; i++)
        {
            points[i] = new MyPoint(i + 1, i + 1);   // Allocate each of MyPoint instances
        }
        for (MyPoint point : points)
        {
            System.out.println(point);  // This will use the toString method from MyPoint class
        }
    }
}
