/************************
 * Title: Miles Per Gallon
 * Date: 9/12/24
 * Author: Cyrus Gronblom
 * Purpose: Calculate miles per gallon (mpg) and
 *          Liters per kilometer (L/100KM)
 * **********************
 */

package hw02_mpg_cgronblom;

public class HW02_MPG_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("MPG Calculator", "Calculate miles per gallon (mpg) and\n" +
                                           "\t   Liters per kilometer (L/100KM)");
        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();
        
    } // END MAIN

} // END CLASS
