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
class TeamStatus {

    private String teamStatus;

    public TeamStatus() {
        this.teamStatus = "\n"
                + "\n------------------------------------"
                + "\n*** Everyone is Alive!"
                + "\nE - Return to Menu"
                + "\n------------------------------------";
    }

    public void displayMenu() {
        boolean done = false; // set the flag to done
        do {
            // prompt for and get players input
            String menuOption = this.getMenuOption2();
            if (menuOption.toUpperCase().equals("E")) {

                //user wants to quit else {
                return; //exit the game
            } //exit the game
            //exit the game

            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
    }

    private String getMenuOption2() {

        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.teamStatus);

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

    private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "T": //display team status
                this.returnTo();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void returnTo() {
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.displayMenu();
    }

}
