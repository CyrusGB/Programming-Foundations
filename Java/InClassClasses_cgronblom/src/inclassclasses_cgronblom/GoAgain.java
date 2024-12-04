/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package inclassclasses_cgronblom;

import java.util.Scanner;

import java.util.ArrayList;

public class GoAgain {
    
    // Create new instance of scanner class for user input
    Scanner userInput = new Scanner(System.in);

    // Ask user if they want to continue the loop
    public void goAgain(){
        
        // String to hold user input (y/n)
        String strkeepGoing = "y";
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            // Debugging
            //System.err.println("Inside the while loop");
            
            // Add Source code here
            // --------------------

           

            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to trade in another?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");

        } // End while loop

        // Close user input to resolve resource leak
        userInput.close();

    } // END goAgain()
    
} // End Class