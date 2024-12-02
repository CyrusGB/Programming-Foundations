/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package utilities;

import java.util.ArrayList;
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
            
            // Create new menu
            Menu menu = new Menu();
            
            // Menu items list
            ArrayList<String> lstMenuItems = new ArrayList<String>();
            lstMenuItems.add("Menu Item 1");
            lstMenuItems.add("Menu Item 2");
            lstMenuItems.add("Menu Item 3");
            lstMenuItems.add("Menu Item 4");
            lstMenuItems.add("Menu Item 5");
            lstMenuItems.add("Menu Item 6");
            
            int intChoice = menu.showMenu("Menu",lstMenuItems);
            
            // Switch statement to determine menu output
            switch(intChoice){
                case 1: // Chose 1st option
                    System.out.println("You chose menu item 1!");
                    break;
                    
                case 2: // Chose 2nd option
                    System.out.println("You chose menu item 2!");
                    break;
                    
                case 3: // Chose 3rd option
                    System.out.println("You chose menu item 3!");
                    break;
                    
                case 4: // Chose 4th option
                    System.out.println("You chose menu item 4!");
                    break;
                    
                case 5: // Chose 5th option
                    System.out.println("You chose menu item 5!"); 
                    break;
                    
                case 6: // Chose 6th option
                    System.out.println("You chose menu item 6!");
                    break;
            }
            
            // --------------------
            // End Source code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
            userInput.close();
            
        } // END while()
        
    } // END goAgain()
    
} // END CLASS