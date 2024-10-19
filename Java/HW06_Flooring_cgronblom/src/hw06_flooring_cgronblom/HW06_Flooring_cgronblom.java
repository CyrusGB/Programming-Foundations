/************************
 * Title:
 * Date:
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 */

package hw06_flooring_cgronblom;

public class HW06_Flooring_cgronblom {
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
