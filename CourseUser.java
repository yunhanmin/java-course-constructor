/*
 * Project: CourseUser.java
 * Description: A Course constructor
 * Name: Hanmin Yun
 * Date: Sept 30, 2015
 */

public class CourseUser {
  
  public static void main( String[] args) {
    
    Course algebra = new Course();
    algebra.printName();
    
    algebra.setName( "Algebra I" );
    algebra.printName();
    
    Course geo = new Course( "Geometry" );
    geo.printName();
    
    Course trig = new Course( "Trigonometry" );
    Course calc = new Course();
    calc.setName( "Calculus I" );
    
    System.out.println( "You must do " + algebra.getName() + ", " + geo.getName() + ", and " + trig.getName() + " before doing " + calc.getName() + "." );
    
    /*
     * Calculator later
     * public Calculator() { ... }
     * public double mult() { ... }
     * public double divide() { ... }
     * calc.divide( 4, 8 );
     */
    
  } // end main method
  
} // end class