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
    
    public static Player createPlayer(String name){
       
        if (name == null){
            return null;
        }
        
        Player player = new Player();{
        player.setName(name);
        
        OregonTrail.setPlayer(player); //save the player
        
        return player;
        }
    }  

    public static void createNewGame(Player player) {
        System.out.println("*** creatNewGame function called ***");
    }
    

    
    }

   

        
    
