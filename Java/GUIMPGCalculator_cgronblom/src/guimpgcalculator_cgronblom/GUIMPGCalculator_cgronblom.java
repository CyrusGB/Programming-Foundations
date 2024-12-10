/************************
 * Title:
 * Date:
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 */

package guimpgcalculator_cgronblom;

public class GUIMPGCalculator_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("Example Title", "Example Tagline");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
