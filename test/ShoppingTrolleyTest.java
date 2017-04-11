/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author A
 */
public class ShoppingTrolleyTest {
    
    public ShoppingTrolleyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getItemName method, of class ShoppingTrolley.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        ShoppingTrolley instance = null;
        String expResult = "";
        String result = instance.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemProducer method, of class ShoppingTrolley.
     */
    @Test
    public void testGetItemProducer() {
        System.out.println("getItemProducer");
        ShoppingTrolley instance = null;
        String expResult = "";
        String result = instance.getItemProducer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemDescription method, of class ShoppingTrolley.
     */
    @Test
    public void testGetItemDescription() {
        System.out.println("getItemDescription");
        ShoppingTrolley instance = null;
        String expResult = "";
        String result = instance.getItemDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItemPrice method, of class ShoppingTrolley.
     */
    @Test
    public void testGetItemPrice() {
        System.out.println("getItemPrice");
        ShoppingTrolley instance = null;
        double expResult = 0.0;
        double result = instance.getItemPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemName method, of class ShoppingTrolley.
     */
    @Test
    public void testSetItemName() {
        System.out.println("setItemName");
        String itemName = "";
        ShoppingTrolley instance = null;
        instance.setItemName(itemName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemProducer method, of class ShoppingTrolley.
     */
    @Test
    public void testSetItemProducer() {
        System.out.println("setItemProducer");
        String itemProducer = "";
        ShoppingTrolley instance = null;
        instance.setItemProducer(itemProducer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemDescription method, of class ShoppingTrolley.
     */
    @Test
    public void testSetItemDescription() {
        System.out.println("setItemDescription");
        String itemDescription = "";
        ShoppingTrolley instance = null;
        instance.setItemDescription(itemDescription);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setItemPrice method, of class ShoppingTrolley.
     */
    @Test
    public void testSetItemPrice() {
        System.out.println("setItemPrice");
        double itemPrice = 0.0;
        ShoppingTrolley instance = null;
        instance.setItemPrice(itemPrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ShoppingTrolley.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ShoppingTrolley instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
