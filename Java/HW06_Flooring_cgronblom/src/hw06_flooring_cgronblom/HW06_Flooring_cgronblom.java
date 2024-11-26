/************************
 * Title: Flooring
 * Date: 11/26/24
 * Author: Cyrus Gronblom
 * Purpose: Create a program for a client who wants be a flooring contractor
 * **********************
 * https://keene.instructure.com/courses/2289958/assignments/33878302
 */

package hw06_flooring_cgronblom;

public class HW06_Flooring_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("Flooring", "Get some flooring redone!");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
