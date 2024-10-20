public class Test
{
    public static void main(String[] args)
    {
        MyPoint p1= new MyPoint(1,2);
        System.out.println(p1);

        MyCircle c1= new MyCircle(2, 3, 4);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Circumference: " + c1.getCircumference());
        MyPoint p2= new MyPoint(6, 7);
        MyCircle c2=new MyCircle(p2, 5);
        System.out.println(c2);

        System.out.println("Distance between circle1 and circle2: " + c1.distance(c2));

        c1.setRadius(4);
        c1.setCenterXY(7, 8);
        System.out.println(c1);
        System.out.println("Updated Area: " + c1.getArea());
        System.out.println("Updated Circumference: " + c1.getCircumference());
    }
}
