/************************
 * Title: Menu Utility
 * Date: 9/26/24
 * Author: Cyrus Gronblom
 * Purpose: Make a reusable class which can display a menu 
 *          from which the user can select an item from.
 * **********************
 */

package hw07_arrays_cgronblom;

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
        System.out.println(strName);
        
        // Show items
        String strOut = "";

        for (int i = 0; i < lstItems.size(); i++) {
            if(i % intNumColumns == 0){
                strOut +="\n" + String.format("%-25s", i+1+ ". " + lstItems.get(i));
            }else{
                strOut += String.format("%-25s", i+1 + ". " + lstItems.get(i));
            }

        }
        
        System.out.println(strOut);

        // Item selection -----
        
        // Users choice
        int intChoice = 0;
        
        // Keep asking until correct answer from user
        // while(intChoice <= 0 || intChoice > lstMenuItems.size()){
        //     // Prompt user and wait for input
        //     System.out.print("\n" + strPrompt);
        //     intChoice = userInput.nextInt();
        // }
        
        // Return the selection
        return intChoice;
        
    } // END showMenu()
    
} // END CLASS
