/************************
 * Title:
 * Date:
 * Author: Cyrus Gronblom
 * Purpose:
 * **********************
 * https://keene.instructure.com/courses/2289958/assignments/33878306
 */

package hw07_arrays_cgronblom;

public class HW07_Arrays_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("Months of the Year", "You should know this by now!");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
