/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uom.currencymanager.currencies;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Vicky Yadav
 */
public class CurrencyTest {
    
    public CurrencyTest() {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }
    


    /**
     * Test of fromString method, of class Currency.
     */
    @org.junit.Test
    public void testFromString() throws Exception {
        System.out.println("fromString");
        String currencyString = "kartikey,saxena,yes";
        Currency expResult = new Currency("kartikey","saxena",true);
        Currency result = Currency.fromString(currencyString);
        assertEquals(expResult.toString(), result.toString());
    }

    /**
     * Test of toString method, of class Currency.
     */
    
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        Currency instance = new Currency("kartikey","saxena",true);
        String expResult = "kartikey - saxena";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }
    
}
