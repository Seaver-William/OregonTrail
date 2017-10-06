/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

/**
 *
 * @author Vitor
 */
public class OregonTrail {
    
    /**
     * The program starts in the main function
     * @param args the command line arguments
     */
    
     public static void main(String[] args) {
         
         Player playerName = new Player();
         
         playerName.setName("Bill");
         playerName.setProfession("woodworker");
         
        String playerOneName = playerName.getName();
       
        System.out.println("Name = " + playerOneName);
        
        
        //Test Classes Location and Stops
        Location place = new Location();
        
        place.setMillageEnd(120);
        place.setMillageStop(55.5);
        place.setMillageTotal(170.5);
        //This is a way to print the information that I sent to the Class Location.
        System.out.println(place.toString());
        
        Stops stop = new Stops();
        
        stop.setObstacle("Wagon broke");
        stop.setTown("Fort York");
        stop.setLandMark("bbb");
        stop.setTraidingPost("aaa");
        //This is a way to print the information that I sent to the Class Stop.
        System.out.println(stop.toString());        

       
     }
    
}
