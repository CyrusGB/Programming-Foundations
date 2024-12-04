/************************
 * Title: In Class Classes
 * Date: 12/4/24
 * Author: Cyrus Gronblom
 * Purpose: Show how we can use classes and java gui to make cool programs
 * **********************
 */

package inclassclasses_cgronblom;

public class InClassClasses_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("In Class Classes", "we using classes now");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
