public class Point3d extends Point2d{
    private double Zcoord;

    public Point3d(double x, double y, double z){
        super(x,y);
        Zcoord = z;
    }

    public Point3d(){
        this(0,0,0);
    }

    public void setZ(double z){
        Zcoord = z;
    }

    public double getZ(){
        return Zcoord;
    }

    public boolean compare(Point3d point){
        return (this.getX() == point.getX() && this.getY() == point.getY() && Zcoord == point.getX());
    }

    public double distanceTo(Point3d point){
        return Math.sqrt(Math.pow(this.getX() - point.getX(), 2)
                + Math.pow(this.getY() - point.getY(), 2)
                + Math.pow(Zcoord - point.getZ(), 2));
    }

}
