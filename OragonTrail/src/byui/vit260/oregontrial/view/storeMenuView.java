/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;


import java.util.Scanner;

/**
 *
 * @author Wilson
 */
public class storeMenuView extends View{
    //private final String menu;

    public storeMenuView(){
        super("\n"
                +"\n------------------------------------"
                +"\n|   Store Menu                      |"
                +"\n The store sells the following supplies"
                +"\n Oxen,"
                +"\n Wagons,"
                +"\n Food,"
                +"\n Spare wheels,"
                +"\n Ammunition."
                +"\n------------------------------------"
                +"\nV - View current supplies"
                +"\nB - Buy"
                +"\nS - Sell"
                +"\nQ - Exit the store"
                +"\n------------------------------------");
    }
    /*
    public void displaystoreMenuView(){
        
        
    }
    
    public storeMenuView(String menu) {
        this.menu = menu;
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in);//get infile for keyboard
        String value = ""; //value to be returned
        boolean valid = false; //initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            
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
        */

     @Override
     public boolean doAction(String choice) {
         
         choice = choice.toUpperCase(); //convert choice to upper case
         
          switch (choice){
            case "V": //shows how much of items currently in inventory
                this.ViewCurrentSupplies();
                break;
            case "B": //choose items to purchase
                this.Buy();
                break;
            case "S": //enter what to sell
                this.Sell();
                break;
            case "Q": //return from store
                this.ExitTheStore();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
          return false;
     }

    private void ViewCurrentSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Buy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Sell() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ExitTheStore() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     

}