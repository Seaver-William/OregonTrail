/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

/**
 *
 * @author Moose
 */
public class storeMenuControl {
    
    public double sellSupplies(double currentSupplyWeight, double weightToSell){
        
        if (currentSupplyWeight < 0){
            return -1;}
        
        if (currentSupplyWeight - weightToSell < 0){
            return -1;}
        
        double newSupplyWeight = (currentSupplyWeight - weightToSell);
        
            return newSupplyWeight;
        
    }  
    
}
