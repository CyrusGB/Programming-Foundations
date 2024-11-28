/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package hw07_arrays_cgronblom;

import java.util.Scanner;

import java.util.ArrayList;

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

            // List of months
            ArrayList<String> lstMonths = new ArrayList<String>();
            lstMonths.add("January");
            lstMonths.add("Feburary");
            lstMonths.add("March");
            lstMonths.add("April");
            lstMonths.add("May");
            lstMonths.add("June");
            lstMonths.add("July");
            lstMonths.add("August");
            lstMonths.add("September");
            lstMonths.add("October");
            lstMonths.add("November");
            lstMonths.add("December");

            // Create menu
            MultiColumnMenu monthsMenu = new MultiColumnMenu("Months of The Year", "Select a Month: ", lstMonths, 2);
            // Selection
            int intSelection = monthsMenu.showMenu();
            
            // Print response
            System.out.println("You chose " + lstMonths.get(intSelection) + ", the " + String.valueOf(intSelection + 1) + getSuffix(intSelection + 1) + " month of the year.");

            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
        }

        // Close user input to resolve resource leak
        userInput.close();

    } // END goAgain()

    // Get the suffix for a number (1 -> st / 2 -> nd / etc.)
    String getSuffix(int intNumber){
        // "For the cases between 11 and 13 return th"
        if (intNumber >= 11 && intNumber <= 13) { 
            return "th";
        }

        // Return suffix otherwise
        switch (intNumber % 10) {
            case 1:  return "st";
            case 2:  return "nd";
            case 3:  return "rd";
            default: return "th";
        }
    } // End Get Suffix

} // END CLASS