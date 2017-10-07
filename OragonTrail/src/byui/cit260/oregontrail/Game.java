/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import java.io.Serializable;

/**
 *
 * @author Vitor
 */
public class Game  implements Serializable{
    
    //class variables
    private int totalTime;
    private int numPeople;
    private Player player;
    
    
    public Game() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
    
    
    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public int getNumPeople() {
        return numPeople;
    }

    public void setNumPeople(int numPeople) {
        this.numPeople = numPeople;
    }
// equals and hash code
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.totalTime;
        hash = 67 * hash + this.numPeople;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (this.totalTime != other.totalTime) {
            return false;
        }
        if (this.numPeople != other.numPeople) {
            return false;
        }
        return true;
    }
// to string
    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numPeople=" + numPeople + '}';
    }
    
    

    
 
    
    
}