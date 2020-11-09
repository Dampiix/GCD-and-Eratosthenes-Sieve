package MyJavaProg;

import org.junit.Test;

import static org.junit.Assert.*;

public class GCDTest {

    GCD gcd = new GCD();
///////////////////////////////Substraction Recursion Tests///////////////////////////////////////////////////////////////
    @Test
    public void euclidSubRec_positive_Numbers_1(){
        assertEquals(3,gcd.calcEuclidSubtractionRecursive(3, 33));
    }

    @Test
    public void euclidSubRec_negative_Numbers_1(){ assertEquals(3, gcd.calcEuclidSubtractionRecursive(-3, 33));}

    @Test
    public void euclidSubRec_negative_Numbers_2(){ assertEquals(3, gcd.calcEuclidSubtractionRecursive(3, -33));}

    @Test
    public void euclidSubRec_negative_Numbers_3(){ assertEquals(3, gcd.calcEuclidSubtractionRecursive(-3, -33));}

    @Test
    public void euclidSubRec_one_Zero_1(){ assertEquals(1234, gcd.calcEuclidSubtractionRecursive(1234, 0));}

    @Test
    public void euclidSubRec_one_Zero_2(){ assertEquals(1234, gcd.calcEuclidSubtractionRecursive(0, 1234));}

    @Test
    public void euclidSubRec_two_Zeros(){ assertEquals(0, gcd.calcEuclidSubtractionRecursive(0, 0));}


//////////////////////////////Substraction Iteration Tests///////////////////////////////////////////////////////////////
    @Test
    public void euclidSubIte_positive_Numbers_1(){ assertEquals(5, gcd.calcEuclidSubtractionIterative(45, 125)); }

    @Test
    public void euclidSubIte_negative_Numbers_1(){ assertEquals(5, gcd.calcEuclidSubtractionIterative(-45, 125)); }

    @Test
    public void euclidSubIte_negative_Numbers_2(){ assertEquals(5, gcd.calcEuclidSubtractionIterative(45, -125)); }

    @Test
    public void euclidSubIte_negative_Numbers_3(){ assertEquals(5, gcd.calcEuclidSubtractionIterative(-45, -125)); }

    @Test
    public void euclidSubIte_one_Zero_1(){ assertEquals(848, gcd.calcEuclidSubtractionIterative(0, 848));}

    @Test
    public void euclidSubIte_one_Zero_2(){ assertEquals(848, gcd.calcEuclidSubtractionIterative(848, 0));}

    @Test
    public void euclidSubIte_two_Zeros(){ assertEquals(0, gcd.calcEuclidSubtractionIterative(0, 0));}



//////////////////////////////Division Recursion Tests///////////////////////////////////////////////////////////////////
    @Test
    public void euclidDivRec_positive_Numbers_1(){ assertEquals(40, gcd.calcEuclidDivisionRestRecursive(40, 120)); }

    @Test
    public void euclidDivRec_negative_Numbers_1(){ assertEquals(40, gcd.calcEuclidDivisionRestRecursive(-40, 120)); }

    @Test
    public void euclidDivRec_negative_Numbers_2(){ assertEquals(40, gcd.calcEuclidDivisionRestRecursive(40, -120)); }

    @Test
    public void euclidDivRec_negative_Numbers_3(){ assertEquals(40, gcd.calcEuclidDivisionRestRecursive(-40, -120)); }

    @Test
    public void euclidDivRec_one_Zero_1(){ assertEquals(78123, gcd.calcEuclidDivisionRestRecursive(78123, 0));}

    @Test
    public void euclidDivRec_one_Zero_2(){ assertEquals(78123, gcd.calcEuclidDivisionRestRecursive(0, 78123));}

    @Test
    public void euclidDivRec_two_Zeros(){ assertEquals(0, gcd.calcEuclidDivisionRestRecursive(0, 0));}



//////////////////////////////Division Iteration Tests///////////////////////////////////////////////////////////////////
    @Test
    public void euclidDivIte_positive_Numbers_1(){
        assertEquals(21, gcd.calcEuclidDivisionRestIterative(147, 777));
    }

    @Test
    public void euclidDivIte_negative_Numbers_1(){
        assertEquals(21, gcd.calcEuclidDivisionRestIterative(-147, 777));
    }

    @Test
    public void euclidDivIte_negative_Numbers_2(){
        assertEquals(21, gcd.calcEuclidDivisionRestIterative(147, -777));
    }

    @Test
    public void euclidDivIte_negative_Numbers_3(){
        assertEquals(21, gcd.calcEuclidDivisionRestIterative(-147, -777));
    }

    @Test
    public void euclidDivIte_one_Zero_1(){ assertEquals(913, gcd.calcEuclidDivisionRestIterative(0, 913));}

    @Test
    public void euclidDivIte_one_Zero_2(){ assertEquals(913, gcd.calcEuclidDivisionRestIterative(913, 0));}

    @Test
    public void euclidDivIte_two_Zeros(){ assertEquals(0, gcd.calcEuclidDivisionRestIterative(0, 0));}

}
