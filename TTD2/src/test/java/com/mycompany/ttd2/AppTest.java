package com.mycompany.ttd2;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;



/**
 * Unit test for simple App.

=======
 * Creator Ethan George
 * 218008430

 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
     public AppTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    //Test for Equality
    @Test
    public void testEqual1() {
    App eq = new App (){};
    
    assertEquals(10, eq.equal(7.1, 7.1));
    
    }
    //Test Identity
    @Test
    public void testEqual2 (){
   
        App eq = new App (){};
        
        assertSame(10, eq.equal(8.1, 8.1));
    }
        
    //Failing test
    @Test
    public void testEqual3 () {
    App eq = new App(){};
    
    assertEquals(10, eq.equal(10.1, 4.0));
    
    }
    //Timeout test for 5 seconds
    @Timeout (5)
    @Test
    public void testEqual4 () {
    App eq = new App (){};
    
    assertEquals(10, eq.equal(6.0, 6.0));
    
    }
 
    //Disabling the test
    @Disabled
    @Test
    public void testEqual5 () {
    App eq = new App(){};
    
    assertEquals(10, eq.equal(12.0, 12.0));
    
    }
  
    
}
