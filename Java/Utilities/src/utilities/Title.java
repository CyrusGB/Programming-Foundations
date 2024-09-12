/************************
 * Title: Title printer-anator
 * Date: 9/5/24
 * Author: Cyrus Gronblom
 * Purpose: Prints the title of any program using inputted arguments
 ************************
 */

package utilities;

public class Title {
    
    // Title to print
    String strTitle;
    
    // Constructor required for title, needs a string arg for the title
    public Title(String title) {
        this.strTitle = title; // Set local variable to argument
    } // END CONSTRUCTOR
    
    // Prints the title
    public void printTitle(){
        System.out.println(strTitle);
    } // END PRINT TITLE
    
} // END CLASS
