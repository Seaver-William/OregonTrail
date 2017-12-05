/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byui.cit260.oregontrail.OregonTrail;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author blake
 */
public abstract class View implements ViewInterface {
    
      private String displayMessage; 
      
      protected final BufferedReader keyboard = OregonTrail.getInfile();
      protected final PrintWriter console = OregonTrail.getOutFile();
      
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
          
        //Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = null; //value to be returned
        boolean valid = false; //initialize to not valid

        while (!valid) { 

            //loop while an invalid value is entered
            this.console.println("\n" + this.displayMessage);

            try {
                value = this.keyboard.readLine(); //get next line typed on keyboard
            } catch (IOException ex) {
                Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
            }
            value = value.trim(); //trim off leadinga dn trailing blanks

            if (value.length() < 1) { //value is blank
                ErrorView.display(this.getClass().getName(),"Value can not be blank");
                continue;
            }

            break; //end the loop
        }
        return value; //return the value entered
    }
}
