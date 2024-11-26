/************************
 * Title: Go Again
 * Date: 9/10/24
 * Author: Cyrus Gronblom
 * Purpose: Demonstrates how we can use while loops in future projects.
 * **********************
 */

package hw06_flooring_cgronblom;

import java.util.Scanner;

import java.util.ArrayList;

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

public class GoAgain {

    ArrayList<String> lstRoomsMenu = new ArrayList<String>();
    ArrayList<Room> lstRooms = new ArrayList<Room>();

    // Create new instance of scanner class for user input
    Scanner userInput = new Scanner(System.in);

    Menu roomMenu = new Menu();
    
    // Ask user if they want to continue the loop
    public void goAgain(){
        
        // String to hold user input (y/n)
        String strkeepGoing = "y";
        
        // While loop
        while(strkeepGoing.equalsIgnoreCase("y") || strkeepGoing.equalsIgnoreCase("yes")){
            // Debugging
            //System.err.println("Inside the while loop");
            
            // Add Source code here
            // --------------------

            startEditEstimate(); // Start estimate 
            
            // --------------------
            // End Source Code
            
            // Ask user to run again
            System.out.print("\nWould you like to run again?: ");
            // Read user input
            strkeepGoing = userInput.next();
            System.out.println("");
        }

        // Close user input to resolve resource leak
        userInput.close();

    } // END goAgain()

    

    void startEditEstimate() { // Shows the edit menu for estimate

        /*  Shows all of the rooms which can be edited
         *  add a room
         *  remove a room
         *  See estimate
         *  Save estimate
         */

        lstRoomsMenu.clear(); // Clear the list of menu items

        for (Room room : lstRooms) { // Add each room to the room list
            lstRoomsMenu.add(room.strRoomName);
        }
        
        lstRoomsMenu.add("Add Room (+)");

        if (lstRooms.size() > 0) { // Only add these options if there is a room present
            lstRoomsMenu.add("Remove Room (-)");
            lstRoomsMenu.add("See Full Estimate ($)\n");
            
            lstRoomsMenu.add("Save Estimate");
        } 

        System.out.println("\n ----------- \n");
            
        int intSelection = roomMenu.showMenu("Edit Rooms", lstRoomsMenu); // Selection from room menu

        if (lstRooms.size() > 0) { // Change selection logic based on the items in the menu
            if (intSelection < lstRooms.size()) { // Selected a room
                editRoom(lstRooms.get(intSelection));
            } else { // Selected an option 
                int adder = lstRooms.size();

                if (intSelection == adder) { // Selected add room
                    addRoom();
                } else if (intSelection == adder + 1) { // Selected Remove room
                    removeRoom();
                } else if (intSelection == adder + 2) { // Selected See full estimate
                    // Check if user is done looking at text
                    System.out.println(seeEstimate());  
                    System.out.print("\nDone?: ");
                    userInput.nextLine();

                    startEditEstimate(); // Return to loop
                } else { // Selected save estimate
                    saveEstimate();
                }
            }
        } else { // Selected Add room
            addRoom();
        }
        
    } // End Start Estimate

    void editRoom(Room room) { // Edit room properties
        System.out.println("\n ----------- \n");

        // Create menu
        ArrayList<String> lstEditMenu = new ArrayList<String>();
        Menu editMenu = new Menu();

        // Add menu options
        lstEditMenu.add("Change name \n\tCurrently: " + room.strRoomName);
        lstEditMenu.add("Change material \n\tCurrently: " + room.matMaterial.name() + " ($" + String.format("%,3.2f", getMaterialCost(room.matMaterial)) + ")");
        lstEditMenu.add("Change square footage \n\tCurrently: " + room.intSquareFootage + "sqFt");
        lstEditMenu.add("Finish");
    
        int intEditWhat = editMenu.showMenu("Editing: " + room.strRoomName, lstEditMenu); // Edit menu selection

        switch (intEditWhat) { // Change what is being edited based on selection
            case 0: // Change Name
                System.out.print("Enter new room name: ");
                String strNew = userInput.nextLine();
                room.strRoomName = strNew;
                System.out.println("Changed room name to:" + strNew);

                System.out.println("\n ----------- \n");

                editRoom(room); // Return to the loop                    
                break;

            case 1: // Change Material
                Material matNew = chooseMaterial();
                room.matMaterial = matNew;
                System.out.println("Changed room material to:" + matNew.name());    

                System.out.println("\n ----------- \n");

                editRoom(room); // Return to the loop               
                break;

            case 2: // Change SqrFt
            System.out.print("Insert dimensions (width x height): ");
            String[] arrDimensions = userInput.nextLine().split("x");
            int intSquareFootage = Integer.parseInt(arrDimensions[0]) * Integer.parseInt(arrDimensions[1]);
            room.intSquareFootage = intSquareFootage;
            System.out.println("Changed room square footage to:" + intSquareFootage);

            System.out.println("\n ----------- \n");

            editRoom(room); // Return to the loop       
            break;
            
            default: // Finish
                startEditEstimate();
                break;  // Return to the room screen 
        }

    } // End Edit Room

    void addRoom() { // Add a room
        System.out.println("\n ----------- \n");

        // Name of room
        System.out.print("Insert name of new room: ");
        String strRoomName = userInput.nextLine();

        System.out.println("\n ----------- \n");

        // Flooring material
        Material matRoomMaterial = chooseMaterial();

        System.out.println("\n ----------- \n");

        // Room dimensions
        System.out.print("Insert dimensions (width x height): ");
        String[] arrDimensions = userInput.nextLine().split("x");
        int intSquareFootage = Integer.parseInt(arrDimensions[0].strip()) * Integer.parseInt(arrDimensions[1].strip());

        // Add room to list
        Room roomNew = new Room(strRoomName, matRoomMaterial, intSquareFootage, getMaterialCost(matRoomMaterial));
        lstRooms.add(roomNew);

        startEditEstimate(); // Return to loop
    } // End Add Room

    // Material selection
    public Material chooseMaterial() {
        // Material menu
        Menu matMenu = new Menu();
        ArrayList<String> lstMatItems = new ArrayList<String>(); 

        // Add materials to menu
        for (Material mat : Material.values()) {
            lstMatItems.add(mat.name());
        }

        // Get selected material
        Material selectedMaterial = Material.values()[matMenu.showMenu("Choose a material: ", lstMatItems)];

        return selectedMaterial;
    } // End Choose Material

    // Get the cost of a material 
    public float getMaterialCost(Material mat) { 
        switch (mat) { // Material cost based on material
            case Tile:
                return 12.0f;
            case Stone:
                return 24.0f;
            case Hardwood:
                return 7.0f;
            case Carpet:
                return 4.0f;
            case Linoleum:
                return 2.5f;
            default: // Not a material? Need to have a default it seems
                return 1;
        }
    } // End Material Cost

    // Remove room from list
    public void removeRoom() {
        System.out.println("\n ----------- \n");

        // Remove room menu
        ArrayList<String> lstDelRoomsMenu = new ArrayList<String>(); 
        Menu delRoomsMenu = new Menu();

        // Add rooms to menu
        for (Room room : lstRooms) {
            lstDelRoomsMenu.add(room.strRoomName);
        }

        // Remove the selection
        int intSelection = delRoomsMenu.showMenu("Delete Room:", lstDelRoomsMenu);
        String strDeletedRoomName = lstRooms.get(intSelection).strRoomName;
        lstRooms.remove(intSelection);

        System.out.println("Removed: " + strDeletedRoomName);

        startEditEstimate(); // Return to loop
    } // End Remove Room

    // ESTIMATES

    // See estimate draft
    public String seeEstimate() {
        String strEstimate = ""; // String to store the estimate text
        float fltTotal = 0.0f; // Total cost

        strEstimate += "Estimate:\n Rooms: \n ----------- \n\n";

        // Add each of the rooms to the text
        for (Room room : lstRooms) {
            strEstimate += room.toString();
            strEstimate += "\n ----------- \n";
            fltTotal += room.fltRoomTotal;
        }

       return strEstimate += "Total: $" + String.format("%,3.2f", fltTotal);

    } // End See Estimate

    // Makes a text file for the user
    public void saveEstimate() {        
        String strEstimate = seeEstimate(); // Gets the estimate draft

        try { // Attempt to create an empty file
            File newFile = new File("FlooringEstimate.txt"); // New File
            if (newFile.createNewFile()) { // Success
                System.out.println("File created: " + newFile.getName());
            } else { // Not success :(
                System.out.println("File already exists.");
            }
        } catch (IOException e) { // Catch exception so program doesnt crash
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try { // Attempt to write to file
            FileWriter writer = new FileWriter("FlooringEstimate.txt"); // Linked to file
            writer.write(strEstimate);
            writer.close(); // Success
            System.out.println("Saved estimate to FlooringEstimate.txt");
        } catch (IOException e) { // Not success :(
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        
        // Check if user is done looking at text
        System.out.print("\nDone?: ");
        userInput.nextLine();

        startEditEstimate(); // Return to loop

    } // End Save Estimate

} // END CLASS