package itschool;

public class Point {
    private static int x;
    private static int y;
    public static int count;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point(String user2, int y) {
        this.x = 1;
        this.y = 1;
    }

    public Point(Point p)
    {
        this(p.x, p.y);
    }

    public Point(int x, int y) {
       this.x = x;
       this.y = y;
       count++;
    }

    public Point(int x)
    {
        this(x, 1);

    }
    public static double distance(int x2, int y2)
    {
        return Math.sqrt((x2-x)*(x2-x)+(y2-y)*(y2-y));
    }
    public static double distance(Point p)
    {
        return Math.hypot(p.x - x, p.y - y);
    }

}
