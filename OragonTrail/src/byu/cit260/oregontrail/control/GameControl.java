/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import byui.cit260.oregontrail.Actor;
import byui.cit260.oregontrail.Game;
import byui.cit260.oregontrail.Map;
import byui.cit260.oregontrail.OregonTrail;
import byui.cit260.oregontrail.Player;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Moose
 */
public class GameControl {

    private static Object game;

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
        if (player == null) {
            return -1;
        }

        Game game = new Game();

        game.setPlayer(player);
        OregonTrail.setCurrentGame(game);//Save a reference to the game in the main class
       

        Map map = MapControl.createMap();
        game.setMap(map);
        return 1;
        
        

        /**
         * Actor actor;
         *
         * actor = Actor(); actor.setname(); game.getPlayer();
         *
         *
         * Items[] items = createItems(); //Save the list of items in the game
         *
         * /**
         * Gamecontrol map = createMap(noOfRows, noOfColumns); if(map == null){
         * //map == null THEN return -1; } end if { game.setMap(map); }
         *
         * return 1;
         *
         * }
         *
         *
         * }
         *
         * public Gamecontrol() { }
         *
         * private static Actor Actor() { throw new
         * UnsupportedOperationException("Not supported yet."); //To change body
         * of generated methods, choose Tools | Templates. }
*
         */
    }

    public static void saveGame(Game currentGame, String filePath) 
        throws GameControlException {
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
    }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }

    public static void getSavedGame(String filePath) 
        throws GameControlException {
        Game game = null;
        
        try( FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            try {
                throw new GameControlException(e.getMessage());
            } catch (GameControlException ex) {
                Logger.getLogger(GameControl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        OregonTrail.setCurrentGame(game);
    }

    
    

    public static class GameControlException extends Exception {

        public GameControlException() {
        }

        public GameControlException(String message) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    public static void saveHotelLyrics(OregonTrail hotelTunes, String filePath) 
            throws GameControlException {
        
        try( FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(hotelTunes);
    }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
    }
}

