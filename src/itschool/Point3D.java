package itschool;

public class Point3D extends Point {
    public int z;

    public Point3D(int x, int y)
    {
        super(x, y);
    }

    public Point3D(int x, int y, int z)
    {
        this(x, y);
        this.z = z;
    }
}
