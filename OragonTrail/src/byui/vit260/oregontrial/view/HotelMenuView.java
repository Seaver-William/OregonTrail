/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import java.util.Scanner;

/**
 *
 * @author Theo
 */
public class HotelMenuView extends View {
     public String hotelMenu;
     
     /**
      * Notes if need be
      */
     public HotelMenuView(){
         super("\n"
                +"\n|-----------------------------------|"
                +"\n| Hotel Menu                        |"
                +"\n|-----------------------------------|"
                +"\n|S - Stay the night                 |"
                +"\n|B - Buy some supplies              |"
                +"\n|L - Look around                    |"
                +"\n|E - Leave the Hotel                |"
                +"\n------------------------------------|");
     }
     /*
public void displayHotelMenuView() {
    boolean done = false; // set the flag to done
    do{
           // prompt for and get players input
           String menuOption = this.getMenuOption1();
           if (menuOption.toUpperCase().equals("E"))//user wants to quit
               return; //exit the game1
           
           //do the requested action and display the next view
           done = this.doAction(menuOption);
           
       } while (!done);
       }
private String getMenuOption1() {
        
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.hotelMenu);
            
            value = keyboard.nextLine(); //get next line typed on keyboard
            value = value.trim(); //trim off leading and trailing blanks
            
            if (value.length() <1) { //value is blank
                System.out.println("\nInvalid value: value can not be blank");
                continue;
            }
            
            break; //end the loop
            }
           return value; //return the value entered
        }*/
     
     @Override
    public boolean doAction(String choice) {
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "S": //stay the night
                this.stayTheNight();
                break;
            case "B": //buy food
                this.buyFood();
                break;
            case "L": //look around
                this.lookAround();
                break;
            case "E": //return to main menu
                this.leaveHotel();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
            return false;
                
               
                
            
        }

    private void stayTheNight() {
        System.out.println("\n*** stayTheNight() *** Try again");
    }

    private void buyFood() {
        System.out.println("\n*** buyFood() *** Try again");
    }

    private void lookAround() {
        System.out.println("\n*** lookAround() *** Try again");
    }

    private void leaveHotel() {
        System.out.println("\n*** leaveHotel() *** Try again");
    }
    }
