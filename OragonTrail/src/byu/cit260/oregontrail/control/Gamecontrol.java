/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import byui.cit260.oregontrail.Actor;
import byui.cit260.oregontrail.Game;
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
        
        Game game = new Game();
                
        game.setPlayer(player);
        game.SaveGame(game);//Save a reference to the game in the main class
        
        
        Actor actor;
        
        actor = Actor();
        actor.setname();
        game.getPlayer();
        
        Items[] items = createItems();
        //Save the list of items in the game
        
        Gamecontrol map = createMap(noOfRows, noOfColumns);
        if(map == null){  //map == null THEN
        return -1;
                } end if {
                    game.setMap(map);
                }
        
        return 1;
        
    }

    private static Actor Actor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
