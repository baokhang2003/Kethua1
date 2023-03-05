/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kethua;

/**
 *
 * @author TH
 */
public class Cylinder extends Circle {
   private double height;

   public Cylinder() {
      super();  
      this.height = 1.0;
      System.out.println("Constructed a Cylinder with Cylinder()"); 
   }
   public Cylinder(double height) {
      super();  
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height)"); 
   }
   public Cylinder(double height, double radius) {
      super(radius);  
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius)"); 
   }
   public Cylinder(double height, double radius, String color) {
      super(radius, color);  
      this.height = height;
      System.out.println("Constructed a Cylinder with Cylinder(height, radius, color)"); 
   }

   public double getHeight() {
      return this.height;
   }
   public void setHeight(double height) {
      this.height = height;
   }

   /** Returns the volume of this Cylinder
     * @return  */
   public double getVolume() {
      return getArea()*height;   // Use Circle's getArea()
   }

   /** Returns a self-descriptive String
     * @return  */
   @Override
   public String toString() {
      return "This is a Cylinder";  // to be refined later
   }
}    

