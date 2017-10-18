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
     * Test 1 of dropSupplies method, of class riverCrossingControl.
     */
    @Test
    public void testDropSupplies() {
        System.out.println("dropSupplies #1");
        double cartWeight = 250;
        double suppliesDropped = 175;
        riverCrossingControl instance = new riverCrossingControl();
        double expResult = -1;
        double result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
     /**
        *Test Case #2
        **/
    System.out.println("dropSupplies #2");
        cartWeight = 395 ;
        suppliesDropped = 146;
       
        expResult = 249;
        result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
     /**
        *Test Case #3
        **/
    System.out.println("dropSupplies #3");
        cartWeight = 400 ;
        suppliesDropped = 98;
       
        expResult = 302;
        result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    
    /**
        *Test Case #4
        **/
    System.out.println("dropSupplies #4");
        cartWeight = 206 ;
        suppliesDropped = 110;
       
        expResult = -1;
        result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        *Test Case #5
        **/
    System.out.println("dropSupplies #5");
        cartWeight = 304 ;
        suppliesDropped = 35;
       
        expResult = 269;
        result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        /**
        *Test Case #6
        **/
    System.out.println("dropSupplies #6");
        cartWeight = 275;
        suppliesDropped = 182;
       
        expResult = -1;
        result = instance.dropSupplies(cartWeight, suppliesDropped);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    }

