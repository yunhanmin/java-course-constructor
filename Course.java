/*
 * Project: Course.java
 * Description: A Course constructor
 * Name: Hanmin Yun
 * Date: Sept 30, 2015
 */

public class Course {
  
  private String name; // so it can't be accessed from outside
  
  public Course() {
    this.name = ""; // empty String, set the name later
  }
  
  public Course( String n ) {
    this.name = n;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName( String n ) {
    this.name = n;
  }
  
  public void printName() {
    System.out.println( "Welcome to " + this.name );
  }
  
} // end class