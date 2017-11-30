/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byu.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.OregonTrail;
import java.util.Scanner;

/**
 *
 * @author Moose
 */
public class MainMenuView extends View {

    //private String menu;

    public MainMenuView() {
                super("\n"
                + "\n------------------------------------"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n------------------------------------");
    }


    @Override
    public boolean doAction(String choice) {

        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "N": //creat and start new game
                this.startNewGame();
                break;
            case "G": //get and start and existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void startNewGame() {
        GameControl.createNewGame(OregonTrail.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();

    }

    private void startExistingGame() {
        this.console.println("\n\nEnter the file path for file where the game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start a saved game
            GameControl.getSavedGame(filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.display();
    }

    private void saveGame() {
        this.console.println("\n\nEnter the file path for the file where the game is to be saved.");
        String filePath = this.getInput();
        
        try {
            //saveGame
            GameControl.saveGame(OregonTrail.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }
}
