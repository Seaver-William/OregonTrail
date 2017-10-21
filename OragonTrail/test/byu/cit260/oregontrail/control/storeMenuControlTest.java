/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Moose
 */
public class storeMenuControlTest {
    
    public storeMenuControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of sellSupplies method, of class storeMenuControl.
     */
    @Test
    public void testSellSupplies() {
        System.out.println("sellSupplies");
        double currentSupplyWeight = 180;
        double weightToSell = 75;
        storeMenuControl instance = new storeMenuControl();
        double expResult = 105;
        double result = instance.sellSupplies(currentSupplyWeight, weightToSell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
     /**
        *Test Case #2
        **/
        System.out.println("sellSupplies #2");
        currentSupplyWeight = 200;
        weightToSell = 146;
        
        expResult = 54;
        result = instance.sellSupplies(currentSupplyWeight, weightToSell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        *Test Case #3
        **/
        System.out.println("sellSupplies #3");
        currentSupplyWeight = 150;
        weightToSell = 98;
        
        expResult = 52;
        result = instance.sellSupplies(currentSupplyWeight, weightToSell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        *Test Case #4
        **/
        System.out.println("sellSupplies #4");
        currentSupplyWeight = 50;
        weightToSell = 110;
        
        expResult = -1;
        result = instance.sellSupplies(currentSupplyWeight, weightToSell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        *Test Case #5
        **/
        System.out.println("sellSupplies #5");
        currentSupplyWeight = 70;
        weightToSell = 35;
        
        expResult = 35;
        result = instance.sellSupplies(currentSupplyWeight, weightToSell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
       /**
        *Test Case #6
        **/
        System.out.println("sellSupplies #6");
        currentSupplyWeight = 10;
        weightToSell = 182;
        
        expResult = -1;
        result = instance.sellSupplies(currentSupplyWeight, weightToSell);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
