/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

/**
 *
 * @author Ben
 */
public class weightAfterPurchase {

    public double buySupplies(double currentSupplyWeight, double weightBought) {

        if (currentSupplyWeight + weightBought > 800) {

            return -1;
        }

        double newSupplyWeight = (currentSupplyWeight + weightBought);

        return newSupplyWeight;

    }
}
