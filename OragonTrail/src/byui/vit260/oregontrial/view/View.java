/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import java.util.Scanner;

/**
 *
 * @author blake
 */
public abstract class View implements ViewInterface {
    
      protected String displayMessage; 
      
      public View(String message) {
          this.displayMessage = message;
      }
      
      @Override
      
      public void display() {

        boolean done = false; // set the flag to done
        do {
            // prompt for and get players input
            String menuOption = this.getInput();
            if (menuOption.toUpperCase().equals("Q"))//user wants to quit
            {
                return; //exit the game
            }
            //do the requested action and display the next view
            done = this.doAction(menuOption);

        } while (!done);
      }
      
      @Override
      
      public String getInput() {
          
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { 

            //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);

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
}
