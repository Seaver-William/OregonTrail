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
public class SetPace extends View {

    public SetPace() {
        super("\n"
                + "\n|-----------------------------------|"
                + "\n| Team Pace Menu                    |"
                + "\n|-----------------------------------|"
                + "\n|F - Fast Pace                      |"
                + "\n|M - Medium Pace                    |"
                + "\n|L - Leisurely Pace                 |"
                + "\n|C - Crawl Pace                     |"
                + "\n|P - Previous Menu                  |"
                + "\n------------------------------------|");
    }

    @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice) {
            case "F": //fast pave
                this.fastPace();
                break;
            case "M": //Medium pace
                this.mediumPace();
                break;
            case "L": //Leisurely pace
                this.leisurelyPace();
                break;
            case "C": //Crawl Pace
                this.crawlPace();
                break;
            case "P": //previous menu
                this.previousMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        return false;

    }

    private void fastPace() {
        System.out.println("\n*** Pace set to fast");
    }

    private void mediumPace() {
        System.out.println("\n*** Pace set to Medium");
    }

    private void leisurelyPace() {
        System.out.println("\n*** pace set to Leisure");
    }

    private void crawlPace() {
        System.out.println("\n*** pace set to crawl");
    }

    private void previousMenu() {
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();

    }

}
