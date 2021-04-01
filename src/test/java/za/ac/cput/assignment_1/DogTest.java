/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment_1;

import static java.time.Duration.ofMillis;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;

/**
 *
 * @author Lyle Haines - 217245919
 */
public class DogTest {
    
    private Dog dog1;
    private Dog dog2;
    private Dog dog3;



    
    public DogTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        dog1 = new Dog();
        dog2 = new Dog();
        dog3 = dog1;  
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    //i. Object Equality;
    @Test
    public void testEquality(){
        assertEquals(dog1,dog3);
    }
    
    //ii. Object Identity;
    @Test
    public void testIdendity(){
        assertSame(dog1,dog3);
    }
    
    //iii. Failing Test;
    @Test
    public void failingTest(){
        assertNotSame(dog1,dog2);
        fail("This is a failing tets");
    }
    
    //iv. Timeouts;
    @Test
    public void timeoutExceeded(){
        assertTimeout(ofMillis(10), () -> {
            Thread.sleep(100);
            System.out.println("This method will timeout");
        
    });
    }   
    
    //v. Disabling Test
     
    @Test
    @Disabled
    public void skippedTest(){
        assertNotEquals(dog1,dog2);
    }
}
