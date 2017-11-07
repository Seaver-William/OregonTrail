
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
public class GameMenuView extends View {

    private String gameMenu;

    public GameMenuView() {
        super("\n"
                + "\n------------------------------------"
                + "\n| Game Menu                        |"
                + "\n------------------------------------"
                + "\nT - Team Status"
                + "\nS - Supplies"
                + "\nP-  Set Team Pace"
                + "\nR - Scene Menu"
                + "\nV - View the map"
                + "\nH - Help Menu"
                + "\nM - Main Menu"
                + "\nE - Exit Menu"
                + "\n------------------------------------");
    }

    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "T": //display team status
                this.teamStatus();
                break;
            case "S": //display team supplies
                this.supplies();
                break;
            case "P": //set the team pace
                this.setPace();
                break;
            case "R": //view the scene menu
                this.sceneMenu();
                break;
            case "V": //view the map
                this.viewMap();
                break;
            case "H": //display the help menu
                this.helpMenu();
                break;
            case "M": //display the main menu
                this.mainMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void teamStatus() {
        TeamStatus teamStatus = new TeamStatus();

        teamStatus.display();

    }

    private void supplies() {
        System.out.println("\n*** gameObjective() *** Try again");
    }

    private void setPace() {
        System.out.println("\n*** gameObjective() *** Try again");
    }

    private void sceneMenu() {
        System.out.println("\n*** gameObjective() *** Try again");
    }

    private void viewMap() {
        System.out.println("\n*** gameObjective() *** Try again");
    }

    private void mainMenu() {
        //create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();

        //display the main menu
        mainMenuView.display();
    }

    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();

        helpMenuView.display();
    }

}
