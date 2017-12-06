/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byu.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.Actor;
import byui.cit260.oregontrail.Game;
import java.io.FileWriter;
import static java.lang.System.console;
import java.util.Scanner;

/**
 *
 * @author Moose
 */
public class TeamStatus extends View {

    private String teamStatus;

    public TeamStatus() {
        super("\n"
                + "\n------------------------------------"
                + "\n*** Everyone is Alive!"
                + "\nE - Return to Menu"
                + "\nP - Print team status to file"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "E": //display team status
                this.returnTo();
                break;
            case "P": //Print a team list to file
                this.printTeam();
                break;
            default:
                ErrorView.display(this.getClass().getName(), "*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void returnTo() {
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();
    }

    private void printTeam() {
        this.console.println("\n\nEnter the file path for the file where the team info is to be saved.");
        String filePath = this.getInput();

        try {
            //saveGame
            GameControl.printTeam(Actor., filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    public void viewActors() {
        Enum actor = Game.getActors();
        Actor actors = Game.getActors();
        Actor[] actor = Game.getActors();

        for (int i = 0; i < Actor.length; i++) {
            System.out.println(actor[i].getActors());
        }

        //for (Location location : locations) {
        //    System.out.println(location.getName());
        //}
    }
}
