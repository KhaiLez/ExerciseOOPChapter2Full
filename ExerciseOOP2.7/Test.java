public class Test
{
    public static void main(String[] args)
    {
        MyLine line1 = new MyLine(0, 0, 3, 4);
        System.out.println(line1);
        System.out.println("Length: " + line1.getLength());
        System.out.println("Gradient: " + line1.getGradient());

        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(5, 6);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());

        line2.setBegin(new MyPoint(0, 0));
        line2.setEnd(new MyPoint(4, 3));
        System.out.println(line2);
        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());
    }
}
