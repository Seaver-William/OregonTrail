/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ben
 */
public class weightAfterPurchaseTest {

    public weightAfterPurchaseTest() {
    }

    /**
     * Test of buySupplies method, of class weightAfterPurchase.
     */
    @Test
    public void testBuySupplies() {
        System.out.println("buySupplies");
        double currentSupplyWeight = 500.0;
        double weightBought = 200.0;
        weightAfterPurchase instance = new weightAfterPurchase();
        double expResult = 700.0;
        double result = instance.buySupplies(currentSupplyWeight, weightBought);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
