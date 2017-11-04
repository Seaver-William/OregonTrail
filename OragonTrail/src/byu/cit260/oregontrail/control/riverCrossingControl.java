/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import byui.cit260.oregontrail.Player;

/**
 *
 * @author Moose
 */
public class riverCrossingControl {

    public static void totalCartWeight(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void viewSurroundings(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double dropSupplies(double cartWeight, double suppliesDropped) {
    double totalCartWeight = (cartWeight - suppliesDropped);
        if (cartWeight < 200) {
            return -1;
        }

        else if (suppliesDropped > cartWeight) {
            return -1;
        }

        else if (totalCartWeight < 200) {
            return -1;
        }

        return totalCartWeight;
    }
}
