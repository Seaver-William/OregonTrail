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
public class riverCrossingControl {
    
    public double dropSupplies(double cartWeight, double suppliesDropped){

        if (cartWeight < 200){
            return -1;}
    
        if (suppliesDropped > cartWeight){
            return -1;}
    
        double totalCartWeight = (cartWeight - suppliesDropped);
       
       if (totalCartWeight < 200){
           return -1;}
       
           return totalCartWeight;
    }
}
