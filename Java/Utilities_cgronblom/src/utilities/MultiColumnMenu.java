/************************
 * Title: Menu Utility
 * Date: 9/26/24
 * Author: Cyrus Gronblom
 * Purpose: Make a reusable class which can display a menu 
 *          from which the user can select an item from.
 * **********************
 */

package utilities;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiColumnMenu { 
    
    String strName = "";
    String strPrompt = "";
    ArrayList<String> lstItems = new ArrayList<String>();
    int intNumColumns = 0;

    public MultiColumnMenu(String strName, String strPrompt, ArrayList<String> lstItems, int intNumColumns) {
        this.strName = strName;
        this.strPrompt = strPrompt;
        this.lstItems = lstItems;
        this.intNumColumns = intNumColumns;
    }

    // Create new scanner for user input
    Scanner userInput = new Scanner(System.in);
    
    // Show a menu to user with a cool name and a list of items to choose from
    public int showMenu(){
        
        // Display Menu -----

        // Print menu name

        // Have menu name be printed in the center of 
        String strSpaces = ""; // Padding
        for (int intSpaces = 0; intSpaces < (25 * intNumColumns / 2) - ((strName.length() / 2)) + (intNumColumns - 1 * 3); intSpaces++) { // Add padding
            strSpaces += " ";
        }

        // Print Name
        System.out.println(" | " + strSpaces + strName + strSpaces + " | ");
        
        // Show items
        String strOut = ""; // String to be printed

        for (int i = 0; i < lstItems.size(); i++) { // Add items as formatted list
            if(i % intNumColumns == 0){ // New row
                strOut +="\n" + String.format("%-25s", i+1+ ". " + lstItems.get(i));
            }else{ // Continue Row
                strOut += " | " + String.format("%-25s", i+1 + ". " + lstItems.get(i));
            }
        }
        
        System.out.println(strOut); // Prints all the items

        // Item selection -----
        
        // Users choice
        int intChoice = 0;
        
        // Keep asking until correct answer from user
        while(intChoice <= 0 || intChoice > lstItems.size()){
            // Prompt user and wait for input
            System.out.print("\n" + strPrompt);
            intChoice = userInput.nextInt();
        }
        
        // Return the selection
        return intChoice - 1;
        
    } // END showMenu()
    
} // END CLASS
