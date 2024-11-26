/************************
 * Title: Room
 * Date: 11/26/24
 * Author: Cyrus Gronblom
 * Purpose: Stores the data for a room 
 * **********************
 */


package hw06_flooring_cgronblom;

public class Room {
    String strRoomName = "";
    Material matMaterial = null;
    int intSquareFootage = 0;
    float fltMaterialCost = 0;
    float fltRoomTotal = 0.0f;

    public Room(String strRoomName, Material matMaterial, int intSquareFootage, float fltMaterialCost) {
        this.strRoomName = strRoomName;
        this.matMaterial = matMaterial;
        this.intSquareFootage = intSquareFootage;
        this.fltMaterialCost = fltMaterialCost;
        this.fltRoomTotal = fltMaterialCost * intSquareFootage;
    }

    public String toString(){
        return " Room name: " + strRoomName + "\n Flooring material: " + matMaterial.name() + " ($" + String.format("%,3.2f", fltMaterialCost) + ")" + 
               "\n Square footage: " + intSquareFootage + "sqrFt" + "\n Room total: $" + String.format("%,3.2f", fltRoomTotal);
    }    

    
}
