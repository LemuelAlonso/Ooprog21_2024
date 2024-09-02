import java.util.Scanner;

public class CarlysEventPrice{
    public static void main(String[] args){
        
      System.out.println("****************************************");
      System.out.println(" * Carly's makes the food that makes  *");
      System.out.println("*               it a party             *");
      System.out.println("*****************************************");
        
     
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of guest: ");
      int numGuest = input.nextInt();
      
    
      final int PRICE_PER_GUEST = 35;
      int totalPrice = PRICE_PER_GUEST * numGuest;
       System.out.println("Number of Guest :" +numGuest);
       System.out.println("Price per Guest is: $35");
       System.out.println("The total price is : $" + totalPrice);
      
      if(numGuest >= 50){
          System.out.println("Is it a large event? True");
      }else{
          System.out.println("Is it a large event? False");
      }
      
    }
}
