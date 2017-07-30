package certification.dino;

public class Rectangle { 
 
  public Rectangle(String n) { 
     name = n; 
  } 
  public static void main(String[] args) { 
    Rectangle one = new Rectangle("g1"); 
    Rectangle two = new Rectangle("g2"); 
    one = two; 
    two = null;
   one = null;  
 } 
   private String name; 
 

}
