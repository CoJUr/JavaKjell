public class Tree
{
  // instance variables
  private double x, y, z;
  private Cone branches;
  private Cylinder trunk;  
  
  // constructor
  public Tree( double trRad, double trHeight, double brRad, double brHeight, double x, double y, double z)
  {
    trunk = new Cylinder( trRad, trHeight );
    branches = new Cone( brRad, brHeight );
    this.x = x; this.y = y; this.z = z;
  }
  
  // methods
  public String toString()
  {
    double totalHeight = branches.getHeight() + trunk.getHeight();
    double width = branches.getRadius();
    return "Tree. Height: "  + totalHeight + ", width: " + width ;
  }
  
  // more methods to come ...
  public double volume()
  {
    return branches.volume() + trunk.volume();
  }

    public double area()
    {
        // return the sum of the two areas, minus twice the area of the trunk's circular top
        double total = trunk.area() + branches.area();
        double rad = trunk.getRadius();
        double circle = Math.PI*rad*rad;
        return total - 2*circle;

    }

    public void grow ( double rate )
    // increase all dimensions by rate
    {
        // trunk.setHeight( trunk.getHeight() + rate );
        // branches.setHeight( branches.getHeight() + rate );
        // branches.setRadius( branches.getRadius() + rate );
        double bHeight = branches.getHeight();
        branches.setHeight(bHeight * (1.0 + rate));

        double bRadius = branches.getRadius();
        branches.setRadius(bRadius * (1.0 + rate));

        double tHeight = trunk.getHeight();
        trunk.setHeight(tHeight * (1.0 + rate));

        double tRadius = trunk.getRadius();
        trunk.setRadius(tRadius * (1.0 + rate));

    }
  
}
