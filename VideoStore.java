

class Video
{
  private String  title;    // name of the item
  private int     length;   // number of minutes
  private boolean avail;    // is the video in the store?

  // constructor
  public Video( String ttl )
  {
    title = ttl; length = 90; avail = true; 
  }

  
  public Video( String ttl, int lngth ) // constructor
  {
    title = ttl; length = lngth; avail = true; 
  } // end of constructors

  // toString method
  public String toString()
  {
    return title + ", " + length + " min. available:" + avail ;
  }
  
  // Video class member functions 
  public String getTitle() { return title; }
  public void setTitle( String ttl ) { title = ttl; }
  public int getLength() { return length; }
  public void setLength( int lng ) { length = lng; }
  public boolean getAvailable() { return avail;}
  public void setAvailable( boolean avl ) { avail = avl;}
}



// MOVIE CLASS 
class Movie extends Video
{
  private String  director;     // name of the director
  private String  rating;       // G, PG, R, or X
  

  // constructor
  public Movie( String ttl, int lngth, String dir, String rtng )
  {
    super( ttl, lngth );      // use the base class's constructor to initialize members inherited from it
    director = dir;           // initialize what's new to Movie
    rating = rtng;      
  }

  public String getDirector() { return director; }
  public String getRating() { return rating; }
}  // END OF MOVIE CLASS




public class VideoStore
{
  public static void main ( String args[] )
  {
    Video item1 = new Video("Jaws", 120 );
    Video item2 = new Video("Star Wars" );

    Movie item3 = new Movie("The Godfather", 180, "Francis Ford Coppola", "R" );

    System.out.println( item1.toString() );
    System.out.println( item2.toString() );     
    System.out.println(item3); // calls the toString method of the Movie class automatically
  }
}

