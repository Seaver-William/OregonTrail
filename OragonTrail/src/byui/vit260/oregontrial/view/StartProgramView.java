/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byu.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.Player;
import java.util.Scanner;

/**
 *
 * @author Moose
 */
public class StartProgramView {

    private String promptMessage;

    public StartProgramView() {

        this.promptMessage = "\nPlease Enter your name: ";
        //displays the banner when view is created
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println(
                "\n**********************************************"
                + "\n*Welcome to the Oregon Trial, A game of survial and chance*"
                + "\n*You will need to choose your traveling companions*"
                + "\n*choose what supplied you will need in order to start your journy*"
                + "\n*Make your choices and hit the Trail, Good luck*"
                + "\n**********************************************"
        );
    }

    public void displayStartProgramView() {

        boolean done = false; //set flag to not done
        do {
            //prompt for an get players name
            String playersName = this.getPlayersName();
            if (playersName.toUpperCase().equals("Q"))//user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(playersName);

        } while (!done);
    }

    private String getPlayersName() {

        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.promptMessage);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leadinga dn trailing blanks

            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(),"aInvalid value: value can not be blank");
                continue;
            }

            break; //end the loop
        }
        return value; //return the value entered
    }

    private boolean doAction(String playersName) {

        if (playersName.length() < 2) {
            System.out.println("\ninvalid players name:"
                    + "The name must be greater than on character in length");
            return false;
        }

        // call createPlayer() control function
        Player player = GameControl.createPlayer(playersName);

        if (player == null) { //if unsuccessful
            System.out.println("\nError creating the player.");
            return false;
        }

        // display next view
        this.displayNextView(player);

        return true; //success !

    }

    private void displayNextView(Player player) {
        System.out.println("\n================= "
                + "\n Welcom to the Game " + player.getName()
                + "\n We hope you have a lot of fun!"
                + "\n=============== ");

        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //display the main menu
        mainMenuView.display();
    }
}
