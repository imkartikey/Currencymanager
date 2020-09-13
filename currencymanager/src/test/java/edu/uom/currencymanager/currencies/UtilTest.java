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
public class UtilTest {
    
    public UtilTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of formatAmount method, of class Util.
     */
    @Test
    public void testFormatAmount() {
        System.out.println("formatAmount");
        double amount = 46555423.4652312;
        String expResult = "46,555,423.47";
        String result = Util.formatAmount(amount);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testFormatAmount_1() {
        System.out.println("formatAmount");
        double amount = 542315.24210;
        String expResult = "542,315.24";
        String result = Util.formatAmount(amount);
        assertEquals(expResult, result);
        
    }
}
