/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import byui.cit260.oregontrail.OregonTrail;
import byui.cit260.oregontrail.Player;

/**
 *
 * @author Moose
 */
public class Gamecontrol {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }

        Player player = new Player();
        {
            player.setName(name);

            OregonTrail.setPlayer(player); //save the player

            return player;
        }
    }

    public static int createNewGame(Player player) {
        if (player == null){return -1;}
        /*
        game = create a new Game object
        Save a reference to the Player object in the game
        Save a reference to the game in the main class
        
        Actors[] actor = createActors[];
        Save the list of actors in the Game object
        Assign an actor to the player
        
        Items[] items = createItems()
        Save the list of items in the game
        
        map = createMap(noOfRows, noOfColumns)
        IF map == null THEN
            RETURN -1
        ENDIF
        
        Assign the map to the game 
        
        */
        
        return 1;
        
    }

}
