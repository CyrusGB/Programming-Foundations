/************************
 * Title: Users
 * Date: 9/19/24
 * Author: Cyrus Gronblom
 * Purpose: Create new user accounts with a random password
 * **********************
 */

package hw03_users_cgronblom;

public class HW03_Users_cgronblom {
    // Driver method, main
    public static void main(String[] args) {
        
        // Create new instances of title and go again
        Title title = new Title();
        GoAgain goAgain = new GoAgain();
        
        // Print Title
        title.printTitle("Users", "Create new user account with a random password!");

        // Start the loop and ask user if they want to go again after
        goAgain.goAgain();

    } // END MAIN

} // END CLASS
