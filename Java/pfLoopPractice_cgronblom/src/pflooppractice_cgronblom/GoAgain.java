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
            
            // -----
            // List multiplication
            // -----

            // Get number from user
            System.out.print("Please input a number to get the multiples of: ");
            int number = userInput.nextInt();

            // Print multiples up to 12x
            for (int i = 0; i < 12; i++) {
                System.out.print(String.valueOf((i+1) * number) + " ");
            }

            // Add return
            System.out.println();
            
            // -----
            // Reverse Number
            // -----

            // Reset input
            number = 0;
            
            // Keep asking for 5 digit number
            while(String.valueOf(number).length() != 5){
                // Get number from user
                System.out.print("\nPlease insert a 5 digit number to reverse: ");
                number = userInput.nextInt();
            }
            
            // Reverse the number
            System.out.println("That number reversed is: " + reverse(String.valueOf(number)));

            // -----
            // Multiplication Table
            // -----

            // Size of multiplication table
            int intTableSize = 0;
            
            // Ask user for table size
            while (intTableSize <= 0) { // Make sure table size is valid
                // Get table size from user
                System.out.print("How large of a multiplication table would you like? (Input must be greater than 0): ");
                intTableSize = userInput.nextInt();
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
        
        // Close user input to avoid resource leak
        userInput.close();

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

    public String reverse(String str){
        String reversed = "";
        for(int i = 0; i < str.length(); i++){
            reversed += str.charAt(str.length()-1-i);
        }
        return reversed;
    }
    
} // END CLASS