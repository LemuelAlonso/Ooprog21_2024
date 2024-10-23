import java.util.Scanner;

public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        int ascending;
        
        if (num1 > num2) {
            ascending = num1;
            num1 = num2;
            num2 = ascending;
        }
        
        if (num2 > num3) {
            ascending = num2;
            num2 = num3;
            num3 = ascending;
        }
        

        System.out.println("Numbers in ascending order: " + num1 + " " + num2 + " " + num3);

    }
}