public class MyPoint
{
    private int x;
    private int y=0;

    public MyPoint(){}

    public MyPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public int[] getXY()
    {
        return new int[] {x, y};
    }

    public void setXY(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return "("+x+","+y+")";
    }

    public double distance(int x, int y)
    {
        int xDiff = this.x-x;
        int yDiff = this.y-y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }

    public double distance(MyPoint another)
    {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distance()
    {
        return Math.sqrt(x * x + y * y);
    }
}