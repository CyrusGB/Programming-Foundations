/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package hw05_christmastree_cgronblom;

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
            
            // Ask user for number of rows
            System.out.print("Hello and welcome to the christmas tree shop!\nHow big of a tree would you like?: ");
            
            // Generate tree using the user input
            generateTree(userInput.nextInt());
            
            // --------------------
            // End Source code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
            
        } // END while()
        
    } // END goAgain()
    
    // Generate a tree made of stars using the number of rows to get the size
    public void generateTree(int rows){ // generateTree()
        
        // Add space in between size prompt
        System.out.println("");
        
        // Generate Pines / Triangle Part
        for (int currentRow = 0; currentRow < rows; currentRow++) {
            
            int intSpaces = rows - currentRow; // Number of spaces to place before the stars
            int intStars = currentRow; // Number of stars to place
            
            String strTreeRow = ""; // Current line to be printed
            
            // Add spaces
            for (int spaces = 0; spaces < intSpaces + 1; spaces++) {
                strTreeRow += " ";
            }
            
            // Add stars
            for (int stars = 0; stars < intStars + currentRow + 1; stars++) {
                strTreeRow += "*";
            }
            
            // Print out finished line
            System.out.println(strTreeRow); // 1st Print method
        }
        
        // Trunk 
        
        int intTrunkHeight = rows / 4; // Height of trunk
        int intTrunkWidth = rows / 4; // Width of trunk
        
        String strTrunkRow = ""; // Row to be printed
        
        // Add spaces
        for (int spaces = 0; spaces < (rows + 1) - (intTrunkWidth / 2); spaces++) {
            strTrunkRow += " ";
        }
        
        // Add Stars
        for (int stars = 0; stars < intTrunkWidth + 1; stars++) {
            strTrunkRow += "*";
        }
        
        // Print out finished trunk
        for (int trunkRow = 0; trunkRow < intTrunkHeight + 1; trunkRow++) {
            System.out.println(strTrunkRow); // 2nd Print Method
        }
        
    } // END generateTree()
    
} // END CLASS