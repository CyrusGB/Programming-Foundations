/************************
 * Title: Craps Player
 * Date: November 2024
 * Author: Cyrus Gronblom
 * Purpose: Player data for craps
 * **********************
 */

package craps_cgronblom;


public class CrapsPlayer {
    
    String playerName;
    float currentMoney;
    
    public CrapsPlayer(String playerName, float startingMoney){
        this.playerName = playerName;
        currentMoney = startingMoney;
    }
    
    public String toString(){
        return "----------\n"
             + "Player Name: " + playerName + "\n"
             + "Money: $" + String.format("%,3.2f", currentMoney) + "\n"
             + "----------";
    }
}
