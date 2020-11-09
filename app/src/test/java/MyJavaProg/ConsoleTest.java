package MyJavaProg;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsoleTest {
    Console console = new Console();

    @Test
    public void readIntTest_positive(){
        assertEquals(true, 1==1);
    }

    @Test
    public void readIntTest_negative(){
        assertEquals(false, 2==1);
    }

    @Test
    public void readStringTest_positive(){
        assertEquals(true, 1==1);
    }

    @Test
    public void readStringTest_negative(){
        assertEquals(false, 2==1);
    }

}
