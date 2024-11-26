/************************
 * Title: Menu Utility
 * Date: 9/26/24
 * Author: Cyrus Gronblom
 * Purpose: Make a reusable class which can display a menu 
 *          from which the user can select an item from.
 * **********************
 */

package hw06_flooring_cgronblom;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu { 
    
    // Create new scanner for user input
    Scanner userInput = new Scanner(System.in);
    
    // Show a menu to user with a cool name and a list of items to choose from
    public int showMenu(String strMenuName, ArrayList<String> lstMenuItems){
        
        // Display Menu -----

        // Print menu name
        System.out.println(strMenuName);
        
        // Show items
        for (int intMenuItem = 1; intMenuItem < lstMenuItems.size() + 1; intMenuItem++) {
            System.out.println(intMenuItem + ". " + lstMenuItems.get(intMenuItem - 1));
        }
        
        // Item selection -----
        
        // Users choice
        int intChoice = 0;
        
        // Keep asking until correct answer from user
        while(intChoice <= 0 || intChoice > lstMenuItems.size()){
            // Prompt user and wait for input
            System.out.print("\nPlease select a menu item: ");
            intChoice = userInput.nextInt();
        }
        
        // Return the selection
        return intChoice - 1;
        
    } // END showMenu()
    
} // END CLASS
