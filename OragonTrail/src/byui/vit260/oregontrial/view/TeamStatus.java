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
public class TeamStatus extends View {

    private String teamStatus;

    public TeamStatus() {
        super("\n"
                + "\n------------------------------------"
                + "\n*** Everyone is Alive!"
                + "\nE - Return to Menu"
                + "\n------------------------------------");
    }

    
    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "E": //display team status
                this.returnTo();
                break;
            default:
                ErrorView.display(this.getClass().getName(),"*** Invalid selection *** Try again");
                break;
        }
        return false;
    }

    private void returnTo() {
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();
    }

}
