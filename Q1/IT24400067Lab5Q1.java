import java.util.Scanner;

public class IT24400067Lab5Q1 {

       public static void main(String[] args) {

       // Declare variables
       int num1, num2, num3;
       int smallest, largest;

       // Create a scanner object as input
       Scanner input = new Scanner(System.in);
        
       // Enter the user inputs

       System.out.print("Enter the first integer: ");
       num1 = input.nextInt();

       System.out.print("Enter the second integer: ");
       num2 = input.nextInt();

       System.out.print("Enter the third integer: ");
       num3 = input.nextInt();

       System.out.println("User entered numbers are: " + num1 +" " + num2 +" " + num3);

       // Finding the largest number

       if (num1 >= num2 && num1 >= num3)
       {
       largest = num1; 
       }
       
       else if (num2 >= num3 && num2 >= num1)
       {
       largest = num2;
       }

       else 
       {
       largest = num3;  
       }
       System.out.println("The largest number is: " + largest);
       
       // Finding the smallest number

       if (num1 <= num2 && num1 <= num3)
       {
       smallest = num1;
       }

       else if (num2 <= num3 && num2 <= num1)
       {
       smallest = num2;
       }

       else
       {
       smallest = num3;
       }
       System.out.println("The smallest number is: " + smallest);
    }
}