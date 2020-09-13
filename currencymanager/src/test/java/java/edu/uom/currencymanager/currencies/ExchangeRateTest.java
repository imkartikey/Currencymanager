/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.s
 */
package edu.uom.currencymanager.currencies;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kartikey Saxena
 */
public class ExchangeRateTest {
    
    Currency currency1;
    Currency currency2;
    Currency currency3;    
    public ExchangeRateTest() {
    }
    
    @Before
    public void setUp() {
    currency1 = new Currency("EUR","Euro",true);
    currency2 = new Currency("GBP","British Pound",true);
    currency3 = new Currency("TRY","Turkish Lira",true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of toString method, of class ExchangeRate.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ExchangeRate instance = new ExchangeRate(currency1, currency2, 0.93);
        String expResult = "EUR" + " 1 = " + "GBP" + " " + Util.formatAmount(0.93);
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    @Test
    public void testToString1() {
        System.out.println("toString");
        ExchangeRate instance = new ExchangeRate(currency1, currency3, 8.86);
        String expResult = "EUR" + " 1 = " + "TRY" + " " + Util.formatAmount(8.86);
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
