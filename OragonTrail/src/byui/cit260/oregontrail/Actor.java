/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

/**
 *
 * @author Moose
 */
public enum Actor {
    Frank("Frank"),
    Patti("patti"),
    Martha("Martha"),
    Joseph("Joseph"),
    Jack("Jack");
    
    
    private String Name;

    private Actor(String Name) {
        this.Name = Name;
    }

    public static Actor getFrank() {
        return Frank;
    }

    public static Actor getPatti() {
        return Patti;
    }

    public static Actor getMartha() {
        return Martha;
    }

    public static Actor getJoseph() {
        return Joseph;
    }

    public static Actor getJack() {
        return Jack;
    }

    public String getName() {
        return Name;
    }

    @Override
    public String toString() {
        return "Actor{" + "Name=" + Name + '}';
    }

    
    }

    
        
        
    

    
    
    
    
    
    
            
           

    
    
            
            
    

