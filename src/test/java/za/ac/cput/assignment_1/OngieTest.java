package za.ac.cput.assignment_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.junit.jupiter.api.Assertions.*;

class OngieTest {

    private Ongie ongieFirst;
    private Ongie ongieSecond;
    @BeforeEach
    void setUp() {
        ongieFirst = new Ongie();
        ongieSecond = new Ongie();
    }

    @Test
    void addition() {

    }
    @Test
    void Equality(){
        assertNotEquals(ongieFirst,ongieSecond);
    }
    @Test
    void identity(){
        assertNotSame(ongieFirst,ongieSecond);
    }
    @Test
    void failing(){
        assertEquals(ongieFirst,ongieSecond);
    }
    @Test
    @Timeout(20)
    void timeOut(){
        assertEquals(ongieFirst.addition(19090,8),98237847);
    }

    @Test
    @Disabled
    void ignore(){
        assertEquals(ongieFirst.addition(190,8),98237847);
    }
}