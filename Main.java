// Import the required Java library for input
import java.util.Scanner;
// Define the main method to start the program
public class Main
{
   public static void main(String[] args)
   {
     // Create a Scanner object to read user input
      Scanner sc = new Scanner(System.in);
     // Prompt the user to enter a year
      System.out.println("Please enter any year: ");
     // Declare variables to store user input and result
      int year = sc.nextInt();
      boolean temp = false;
     // Check if the year is a leap year 
     //Check for remainder when divided by 400
      if(year % 400 == 0)
      {
         temp = true;
      }
     //Check for remainder when divided by 100
      else if(year % 100 == 0)
      {
         temp = false;
      }
      //Check for remainder when divided by 4
      else if(year % 4 == 0)
      {
         temp = true;
      }
      //Return false if not a leap year
      else
      {
         temp = false;
      }
     // Display the result based on whether it's a leap year or not
      if(temp)
      {
         System.out.println("Year " + year + " is a Leap Year");
      }
      else
      {
         System.out.println("Year " + year + " is not a Leap Year");
      }
     // Close the Scanner object to release resources
      sc.close();
   }
}