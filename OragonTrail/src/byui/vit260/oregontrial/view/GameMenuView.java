
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
public class GameMenuView {
    private String gameMenu;

    public GameMenuView(){
        this.gameMenu = "\n"
                +"\n------------------------------------"
                +"\n| Game Menu                        |"
                +"\n------------------------------------"
                +"\nT - Team Status"
                +"\nS - Supplies"
                +"\nP-  Set Team Pace"
                +"\nR - Scene Menu"
                +"\nV - View the map"
                +"\nH - Help Menu"
                +"\nM - Main Menu"
                +"\nE - Exit Menu"
                +"\n------------------------------------";
    }
    public void displayMenu() {
        boolean done = false; // set the flag to done
       do{
           // prompt for and get players input
           String menuOption = this.getMenuOption2();
           if (menuOption.toUpperCase().equals("E")) {//user wants to quit else {
           } else {
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
            System.out.println("\n" + this.gameMenu);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leadinga dn trailing blanks
            
            if (value.length() <1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
            }
           return value; //return the value entered
        }
        private boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
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
        System.out.println("\n*** teamStatus() *** Try again");
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
       mainMenuView.displayMainMenuView();
    }

    private void helpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        
       helpMenuView.displayHelpMenuView();
    }

    
        

    
       
   

    

   
        
    }




   

    
    

