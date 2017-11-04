/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import java.util.Scanner;

/**
 *
 * @author Moose
 */
public class HelpMenuView {

    public String helpMenu;

    /**
     *
     */
    public HelpMenuView() {
        this.helpMenu = "\n"
                + "\n------------------------------------"
                + "\n| Help Menu                        |"
                + "\n------------------------------------"
                + "\nO - Game Objective"
                + "\nM - How to move"
                + "\nT - Tips"
                + "\nR - Return"
                + "\n------------------------------------";
    }

    public void displayHelpMenuView() {
        boolean done = false; // set the flag to done
        do {
            // prompt for and get players input
            String menuOption = this.getMenuOption1();
            if (menuOption.toUpperCase().equals("R"))//user wants to quit
            {
                return; //exit the game1
            }
            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption1() {

        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.helpMenu);

            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks

            if (value.length() < 1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }

            break; //end the loop
        }
        return value; //return the value entered
    }

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "O": //game objective
                this.gameObjective();
                break;
            case "M": //gmae controls
                this.howToMove();
                break;
            case "T": //display tips
                this.tips();
                break;
            case "R": //return to main menu
                this.returnTo();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void gameObjective() {
        System.out.println("\n*** gameObjective() *** Try again");
    }

    private void howToMove() {
        System.out.println("\n*** howToMove() *** Try again");
    }

    private void tips() {
        System.out.println("\n*** tips() *** Try again");
    }

    private void returnTo() {
        System.out.println("\n*** returnTo() *** Try again");
    }
}
