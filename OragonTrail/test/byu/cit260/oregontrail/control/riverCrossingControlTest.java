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
public class riverCrossingControlTest {
    
    public riverCrossingControlTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of dropSupplies method, of class riverCrossingControl.
     */
    @Test
    public void testDropSupplies() {
        System.out.println("dropSupplies");
        double cartWeight = 395;
        double suppliesDropped = 146;
        riverCrossingControl instance = new riverCrossingControl();
        double expResult = 249;
        double result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
