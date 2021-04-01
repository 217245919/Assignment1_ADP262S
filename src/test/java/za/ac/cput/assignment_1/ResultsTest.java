/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Thulisile Goso - 214321204
 */
public class ResultsTest {
    
    
    public ResultsTest() {
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
    
    //Test Equality
    @Test
    public void testEqual1(){
        TrailTest eq = new TrailTest();
        assertEquals(12, eq.equals(5,5)); 
    }
    
    //Test Identity
    public void testEqual2(){
        TrailTest eq = new TrailTest();
        assertSame(12, eq.equals(6,6));
    }
    
    //Failing Test
    public void testEqual3(){
        TrailTest eq = new TrailTest();
        assertEquals(16, eq.equals(8,8));
    }
    
    //Timeout test for 3 seconds
    public void testEqual(){
        TrailTest eq = new TrailTest();
        assertSame(10, eq.equals(1,1));
    }
    
    //Disabled the test
    public void testEqual5(){
        TrailTest eq = new TrailTest();
        assertSame(6, eq.equals(12,12));
    }

    
}
