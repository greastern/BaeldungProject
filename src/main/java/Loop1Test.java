import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.*;

class Loop1Test {

    Loop1 obj = new Loop1();
    @Test
    void outputLine() {
        String s = obj.outputLine(18,8);
        assertEquals("18 x 8 = 144", s);

    }
}



