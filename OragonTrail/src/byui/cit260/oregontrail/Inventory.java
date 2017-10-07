/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ben
 */
public class Inventory implements Serializable {
    
    //variables
    private String inventoryType;
    private String qualityAvail;

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public String getQualityAvail() {
        return qualityAvail;
    }

    public void setQualityAvail(String qualityAvail) {
        this.qualityAvail = qualityAvail;
    }

    public Inventory() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.inventoryType);
        hash = 23 * hash + Objects.hashCode(this.qualityAvail);
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
        final Inventory other = (Inventory) obj;
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        if (!Objects.equals(this.qualityAvail, other.qualityAvail)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inventory{" + "inventoryType=" + inventoryType + ", qualityAvail=" + qualityAvail + '}';
    }
    
               
    
}
