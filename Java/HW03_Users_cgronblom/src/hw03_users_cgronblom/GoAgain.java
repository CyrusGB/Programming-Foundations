/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package hw03_users_cgronblom;

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
            
            // Ask user for first name
            System.out.print("Please insert your first name: ");
            String strFirstName = userInput.next();
            
            // Ask user for last name
            System.out.print("Please insert your last name: ");
            String strLastName = userInput.next();
            
            // Generate username
            String strUsername = strFirstName.toLowerCase().charAt(0) + strLastName.toLowerCase();
            
            // Generated Password
            String strPassword = "";
            
            // Generate the password using a for loop
            for (int length = 0; length < 7; length++) {
                // Add the random number to the string
                strPassword += (int)(Math.floor(Math.random() * 10));
            }
            
            // Print friendly message
            System.out.println("\nHello welcome to Cyrus' Shoppe!\n"
                             + "-------------------------------");
            
            //Print username and password
            System.out.println("Username: " + strUsername);
            System.out.println("Password: " + strPassword);
            
            // Print suggestion
            System.out.println("-------------------------------\n"
                             + "It is recommended that you change your password to something memorable as soon as possible :).");
            
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