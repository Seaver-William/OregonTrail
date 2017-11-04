/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import byui.vit260.oregontrial.view.GameMenuView;
import byui.vit260.oregontrial.view.StartProgramView;

/**
 *
 * @author Vitor
 */
public class OregonTrail {

    /**
     * The program starts in the main function
     *
     * @param args the command line arguments
     */
    private static Game currentGame = null;
    private static Player player = null;

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();

    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }

}
