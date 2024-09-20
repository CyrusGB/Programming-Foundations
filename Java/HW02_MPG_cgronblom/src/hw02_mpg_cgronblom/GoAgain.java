/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package hw02_mpg_cgronblom;

import java.util.Scanner;


public class GoAgain {
    
    // Ask user if they want to continue the loop
    public void goAgain(){
        
        // Create new instance of scanner class for user input
        Scanner userInput = new Scanner(System.in);
        
        // String to hold user input (y/n)
        String strkeepGoing = "y";
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            // Debugging
            //System.err.println("Inside the while loop");
            
            // Add Source code here
            // --------------------
            
            // Get input from user
            System.out.print("Enter Miles: ");
            // Miles traveled
            float miles = userInput.nextFloat();
            // KM's traveled
            float kilometers = miles * 1.609344f;
            
            System.out.print("Enter Gallons: ");
            
            // Gallons used
            float gallons = userInput.nextFloat();
            // Liters used
            float liters = gallons * 3.785f;
            
            // Calculate miles per gallon
            float mPG = miles / gallons;
            // Calculate liters per 100 kilometers
            float lP100km = liters / kilometers * 100;
            
            // Print out fuel efficiency
            System.out.println("\nYour car achieved a fuel efficiency of " + (int) mPG + " MPG and " + (int) lP100km + " L/100KM.");
            
            // --------------------
            // End Source code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
            
        } // END while()
        
    } // END goAgain()
    
} // END CLASS
