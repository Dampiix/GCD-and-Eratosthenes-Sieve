package MyJavaProg;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    GCD gcd = new GCD();

    @Test
    public void euclidSubRec_positive(){
        assertEquals(3,gcd.calcEuclidSubtractionRecursive(3, 33));
    }

    @Test
    public void euclidSubIte_positive(){
        assertEquals(5, gcd.calcEuclidSubtractionIterative(45, 125));
    }

    @Test
    public void euclidDivRec_positive(){
        assertEquals(40, gcd.calcEuclidDivisionRestRecursive(40, 120));
    }

    @Test
    public void euclidDivIte_positive(){
        assertEquals(21, gcd.calcEuclidDivisionRestIterative(147, 777));
    }

}
