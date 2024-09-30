public class TestCircle{
   public static void main (String[] args){
   Circle a = new Circle();   
   a.setRadius(3);
   System.out.println("Radius of the first circle: " + a.getRadius());
   System.out.println("Diameter of the first circle: " + a.getDiameter());
   System.out.println("Area of the first circle: " + a.getArea());

   Circle b = new Circle();   
   b.setRadius(20);
   System.out.println("\nRadius of the first circle: " + b.getRadius());
   System.out.println("Diameter of the first circle: " + b.getDiameter());
   System.out.println("Area of the first circle: " + b.getArea());


   
   }

}