/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import java.io.Serializable;

/**
 *
 * @author Moose
 */
public class Team implements Serializable {
    
    private Actor[] actor;
    
    public Team(){
        
    }
    public Actor[] getActor(){
        return actor;
    }
    public void setActor(Actor[] actor){
        this.actor = actor;
    }
}
