import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addition_works() {
        int result = 2 + 2;
        assertEquals(4, result);   // if this is false → test FAILS (red)
        assertTrue(result==4);

    }
}