/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package pflooppractice_cgronblom;

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
            
            // Size of multiplication table
            int intTableSize = 0;
            
            // Ask user for table size
            while (intTableSize <= 0) { // Make sure table size is valid
                System.out.print("How large of a multiplication table would you like? (Input must be greater than 0): ");
                try {
                    intTableSize = userInput.nextInt();
                } catch (Exception e) {
                }
                
            }
            
            // Generate Table
            generateTable(intTableSize);
            
            // --------------------
            // End Source code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
            
        } // END while()
        
    } // END goAgain()
    
    // Generate a table of a given size
    public void generateTable(int size){
        
        for (int intRow = 1; intRow <= size; intRow++) {
            for (int intCol  = 1; intCol <= size; intCol++) {
                System.out.printf(("%4d"), intRow * intCol);
            }
            System.out.println("");
        }
        
    } // END generateTable()
    
} // END CLASS