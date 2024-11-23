import java.util.Scanner;

public class IT24400067Lab5Q3 {

       public static void main(String[] args) {

       // Declare and initialize constants
       final double ROOM_CHARGE_PER_DAY = 48000.0;
       final double DISCOUNT_3_TO_4_DAYS = 0.1;
       final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

       // Declare variables
       int startDate, endDate, numberOfDaysReserved;
       double totalAmountBeforeDiscount, discountAmount, totalAmountToBePaid;

       // Declare and initialize variables
       double discountRate = 0;


       // Create a Scanner object as input
       Scanner input = new Scanner(System.in);

       // Input start and end dates

       System.out.print("Enter Start Date (1-31): ");
       startDate = input.nextInt();
       System.out.print("Enter End Date (1-31): ");
       endDate = input.nextInt();

       // Validate inputs

       if (startDate < 1 || startDate > 31 || endDate <1 || endDate > 31) {
          System.out.print("Error: Days must be between 1 and 31");
          return;
       }
       
       if (startDate >= endDate) {
          System.out.print("Error: Start Date must be less than End Date");
          return;
       }

       // Calculate the number of days reserved
       
       numberOfDaysReserved = endDate - startDate;

       // Calculate the discount rate

       if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
           discountRate = 0.10;
       }
       else if (numberOfDaysReserved >=5) {
           discountRate = 0.20;
       }

       // Calculate the total amount to be paid

       totalAmountBeforeDiscount = ROOM_CHARGE_PER_DAY * numberOfDaysReserved;
       discountAmount = totalAmountBeforeDiscount * discountRate;
       totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

       //Display the results
 
       System.out.println("Room Charges Per Day is: " + (ROOM_CHARGE_PER_DAY) + "/=");
       System.out.println("Number of Days Reserved: " + numberOfDaysReserved);
       System.out.println("Discount: " + (discountRate * 100) + "%");
       System.out.println("Total Amount to be Paid: " + totalAmountToBePaid);
       
  }
}
       
       

       

