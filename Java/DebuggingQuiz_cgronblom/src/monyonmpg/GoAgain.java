/****************************************
 *   Title: GoAgain * Reusable Class
 *   Author: Mick M. Mouse
 *   Date: September, 2024
 *   Purpose: GoAgain allows the use to
 *   re-execute a program without it
 *   shutting down when it's finished.
 *  ************************************ */

package monyonmpg;

import java.util.Scanner;

public class GoAgain 
{
    // Instantiation of an instance of the Scanner class.
    Scanner stan = new Scanner(System.in);
    String strKeepGoing = "y";
    int intGallons;
    int intMiles;

    // Beginning of goAgain method.
    public void goAgain() 
    {           
        
        while (strKeepGoing.equalsIgnoreCase("y")) {
            // Simple debugging line.  Will be deleted.
            // System.out.println("Inside the while loop");
            
            //*****************************************************
            // Get input from the user.
            System.out.print("Enter Miles: ");
            intMiles = stan.nextInt();
            System.out.print("Enter Gallons: ");
            intGallons = stan.nextInt();
            
            // Process the data
            int intMPG = intMiles / intGallons;
            
            // Program output
            System.out.println("Your MPG is: " + intMPG);
            
            //*****************************************************
            // Metric Conversion;
            double dblL100km = 235.214583/intMPG;
            System.out.println("Liters per 100 Kilometers: " + dblL100km);
                  
            //*****************************************************
            System.out.print("Would you like to run again? (y or n)?: ");
            strKeepGoing = stan.next();
        } // END OF while() LOOP.

    } // END OF goAgain() METHOD
} // END OF CLASS. 
