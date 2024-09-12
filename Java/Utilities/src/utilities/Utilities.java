/************************
 * Title: Utilities
 * Date: 9/5/24
 * Author: Cyrus Gronblom
 * Purpose: Provide a group of reusable classes to be used in projects
 ************************
 */

package utilities;

public class Utilities {
    
    // Driver method, main
    public static void main(String[] args) {
        // Create new title object
        Title title = new Title("title hehe");
        // Print title
        title.printTitle();
        
        // Go Again
        GoAgain goAgain = new GoAgain();
        goAgain.goAgain();
        
    } // END MAIN METHOD

} // END CLASS
