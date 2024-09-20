/************************
 * Title: Christmas Tree
 * Date: 9/20/24
 * Author: Cyrus Gronblom
 * Purpose: Generate any size tree a user asks for using for loops!
 * **********************
 */

package hw05_christmastree_cgronblom;

public class HW05_ChristmasTree_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("Christmas Tree", "You get a tree! And you get a tree! And you get a tree!");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
