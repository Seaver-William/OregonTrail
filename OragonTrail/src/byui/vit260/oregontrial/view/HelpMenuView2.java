/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

/**
 *
 * @author Moose
 */
public class HelpMenuView2 extends View {
    



    public String helpMenu;

    /**
     *
     */
    public HelpMenuView2() {
       super("\n"
                + "\n------------------------------------"
                + "\n| Help Menu                        |"
                + "\n------------------------------------"
                + "\nO - Game Objective"
                + "\nM - How to move"
                + "\nT - Tips"
                + "\nR - Return"
                + "\n------------------------------------");
    }

  

    @Override
    public boolean doAction(String choice) {
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
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();
    }
}