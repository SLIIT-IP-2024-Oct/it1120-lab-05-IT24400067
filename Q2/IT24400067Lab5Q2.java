import java.util.Scanner;

public class IT24400067Lab5Q2 {

       public static void main(String[] args) {

       // Declare variables
       int newMembers;

       // Creating a scanner object as input
       Scanner input = new Scanner(System.in);

       // Input and validate the number of new members introduced
       System.out.print("Enter the number of new members introduced: ");
         newMembers = input.nextInt();
         
         if (newMembers < 0) {
             System.out.println("Input must be a number 0 or greater");
         }
         
         else
         {
         switch (newMembers) {
             case 0:
                System.out.println("No Prize");
                break;
             case 1:
                System.out.println("Prize is a : Pen");
                break;
             case 2:
                System.out.println("Prize is an : Umbrella");
                break;
             case 3:
                System.out.println("Prize is a : Bag");
                break;
             case 4:
                System.out.println("Prize is a : Travelling Chair");
                break;
             default:
                System.out.println("Prize is a : Headphone");
                break;
         }
         }
     }
}
