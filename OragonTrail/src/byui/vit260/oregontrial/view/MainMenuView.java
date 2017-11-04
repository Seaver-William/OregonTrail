/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byu.cit260.oregontrail.control.Gamecontrol;
import byui.cit260.oregontrail.OregonTrail;
import java.util.Scanner;

/**
 *
 * @author Moose
 */
public class MainMenuView {

    private String menu;

    public MainMenuView() {
        this.menu = "\n"
                + "\n------------------------------------"
                + "\n| Main Menu                        |"
                + "\n------------------------------------"
                + "\nN - Start new game"
                + "\nG - Get and start saved game"
                + "\nH - Get help on how to play the game"
                + "\nS - Save game"
                + "\nQ - Quit"
                + "\n------------------------------------";
    }

    public void displayMainMenuView() {

        boolean done = false; // set the flag to done
        do {
            // prompt for and get players input
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))//user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.menu);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leadinga dn trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break; //end the loop
        }
        return value; //return the value entered
    }

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
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void startNewGame() {
        Gamecontrol.createNewGame(OregonTrail.getPlayer());

        //display the game menu
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();

    }

    private void startExistingGame() {
        System.out.println("*** startExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.displayHelpMenuView();
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }
}
