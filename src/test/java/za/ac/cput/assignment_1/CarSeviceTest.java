/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;
//import junit.framework.*;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Admin
 */
public class CarSeviceTest {
    
      
    private CarSevice car1;
    private CarSevice car2;
     private CarSevice car3;
    private CarSevice car4;
    
    public CarSeviceTest() {
    }
    
  @Before
    public void setUp() {
        car1 = new CarSevice();
        car2 = new CarSevice();
        car3=car4;
        
    }
    
     @Test
    public void runEquality(){
        assertEquals(car3,car4);
    }
    
    @Test
    public void runIdentity(){
        assertSame(car1,car1);
    }
    
    @Test
    public void runFail(){
        try{
            fail("Failing test");
        }
        catch(RuntimeException e){
            System.out.println(e);
        }
    }
   

 @Test(timeout = 5000)
public void testInfiniteTametakingLoop() throws InterruptedException 
{
    while (true)
    {
        Thread.currentThread().sleep(1000);
    }
}
  
    
    @Disabled("Stop this method")
    @Test
    public void ignoreMethod(){
         System.out.println("Method disabled");
    }
    

    /**
     * Test of getQuotePrice method, of class CarSevice.
     */
    @Test
    public void testGetQuotePrice() {
        System.out.println("getQuotePrice");
        CarSevice instance = new CarSevice();
        double expResult = 0.0;
        double result = instance.getQuotePrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuotePrice method, of class CarSevice.
     */
    @Test
    public void testSetQuotePrice() {
        System.out.println("setQuotePrice");
        double quotePrice = 0.0;
        CarSevice instance = new CarSevice();
        instance.setQuotePrice(quotePrice);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarModel method, of class CarSevice.
     */
    @Test
    public void testGetCarModel() {
        System.out.println("getCarModel");
        CarSevice instance = new CarSevice();
        String expResult = "";
        String result = instance.getCarModel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarModel method, of class CarSevice.
     */
    @Test
    public void testSetCarModel() {
        System.out.println("setCarModel");
        String carModel = "";
        CarSevice instance = new CarSevice();
        instance.setCarModel(carModel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarName method, of class CarSevice.
     */
    @Test
    public void testGetCarName() {
        System.out.println("getCarName");
        CarSevice instance = new CarSevice();
        String expResult = "";
        String result = instance.getCarName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarName method, of class CarSevice.
     */
    @Test
    public void testSetCarName() {
        System.out.println("setCarName");
        String carName = "";
        CarSevice instance = new CarSevice();
        instance.setCarName(carName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumOfDeleallers method, of class CarSevice.
     */
    @Test
    public void testGetNumOfDeleallers() {
        System.out.println("getNumOfDeleallers");
        CarSevice instance = new CarSevice();
        int expResult = 0;
        int result = instance.getNumOfDeleallers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfDeleallers method, of class CarSevice.
     */
    @Test
    public void testSetNumOfDeleallers() {
        System.out.println("setNumOfDeleallers");
        int numOfDeleallers = 0;
        CarSevice instance = new CarSevice();
        instance.setNumOfDeleallers(numOfDeleallers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumPlate method, of class CarSevice.
     */
    @Test
    public void testGetNumPlate() {
        System.out.println("getNumPlate");
        CarSevice instance = new CarSevice();
        long expResult = 0L;
        long result = instance.getNumPlate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumPlate method, of class CarSevice.
     */
    @Test
    public void testSetNumPlate() {
        System.out.println("setNumPlate");
        long numPlate = 0L;
        CarSevice instance = new CarSevice();
        instance.setNumPlate(numPlate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class CarSevice.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        CarSevice instance = new CarSevice();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
