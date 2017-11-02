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
public class RiverCrossingMenuView {
    private final String menu;
    
    public RiverCrossingMenuView(){
        this.menu = "\n"
                +"\n------------------------------------"
                +"\n| Cross the river                        |"
                +"\n------------------------------------"
                +"\nI - Check your inventory"
                +"\nL - Look around"
                +"\nD - Drop inventory"
                +"\nC - Cross the river"
                +"\n------------------------------------";
    }
   public void displayRiverCrossingMenuView(){
       
   }

    public RiverCrossingMenuView(String menu) {
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

    public boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice){
            case "I": //checks current inventory
                this.totalCartWeight();
                break;
            case "L": //gets description of crossing
                this.viewSurroundings();
                break;
            case "D": //enter amount ot supplies to discard
                this.dropSupplies();
                break;
            case "C": //use formula to cross river
                this.crossRiver();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
            return false;
    }    
  private void totalCartWeight() {
    
        DisgardWeightMenuView disgardWeightMenu = new DisgardWeightMenuView();
        disgardWeightView.displayMenu();
            }

  private void viewSurroundings() {

        ViewSurroundingsMenuView viewSurroundingsMenu = new ViewSurroundingsMenuView();
        ViewSurroundingsMenuView.displayViewSurroundingsMenuView();
            }       

    private void droppSupplies() {

        DroppSuppliesMenuView droppSuppliesMenu = new DroppSuppliesMenuView();
        DroppSuppliesMenuView.droppSuppliesMenu();
            }
  
        private void crossRiver() {

        CrossRiverMenuView crossRiverMenu = new CrossRiverMenuView();
        CrossRiverMenuView.crossRiverMenu();
            }
    
    private void dropSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void crossTheRiver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class DiscgardWeightMenuView {

        public DiscgardWeightMenuView() {
        }
    }
                
            
        }

    

    

