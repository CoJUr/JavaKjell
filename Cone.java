

public class Cone
{
  private double radius;  // radius of the base
  private double height;  // height of the cone
  
  public Cone( double radius, double height )
  {
    this.radius = radius;
    this.height = height;
  }
  
  public double area()
  {
    return Math.PI*radius*(radius + Math.sqrt(height*height + radius*radius) );
  }
  
  public double volume()
  {
    return Math.PI*radius*radius*height/3.0;
  }
  
  public void setHeight( double height )
  {
    if ( height >= 0 )
      this.height = height ;
  }
  
  public void setRadius( double radius )
  {
    if ( radius >= 0 )
      this.radius = radius ;
  }
  
  public double getHeight( )
  {
    return height ;
  }
  
  public double getRadius( )
  {
    return radius ;
  }
  
}