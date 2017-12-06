/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byu.cit260.oregontrail.control.GameControl;
import byui.cit260.oregontrail.Actor;
import byui.cit260.oregontrail.Game;
import byui.cit260.oregontrail.OregonTrail;
import byui.cit260.oregontrail.Team;
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
                + "\nV -  View Team"
                + "\nE - Return to Menu"
                + "\nP - Print team status to file"
                + "\n------------------------------------");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "V"://display team status
                this.viewActors();
                break;
            case "E": //return to menu
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
            GameControl.printTeam( filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    public void viewActors() {
        Game game = OregonTrail.getCurrentGame();
        Team team = game.getTeam();
        Actor[] actor = team.getActor();

        for (int i = 0; i < actor.length; i++) {
            System.out.println(actor[i].getName());
        }

        //for (Location location : locations) {
        //    System.out.println(location.getName());
        //}
    }
}
