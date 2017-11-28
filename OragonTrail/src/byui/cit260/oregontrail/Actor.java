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

    private String name;

    private Actor(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Actor{" + "Name=" + name + '}';
    }

    public void saveActor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setname() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
    //Array of Actors
    String[] Actors = {
        "Bat Masterson",
        "Belle Starr",
        "Big Jim Courtright",
        "Oliver Loving",
        "Pat Garrett",
        "StagecoachMary",
        "Ruth Roach",
        "Texas JohnSlaughter"   
    };**/
    
   


    }

