import static org.junit.Assert.assertEquals;

import com.lylechristine.Main;
import org.junit.Test;

public class MinOrZeroTest {

    @Test
    public void testEqualValues() {
        assertEquals(0, Main.getMinOrZero(5, 5));
    }

    @Test
    public void testFirstLessThanSecond() {
        assertEquals(3, Main.getMinOrZero(3, 7));
    }

    @Test
    public void testSecondLessThanFirst() {
        assertEquals(4, Main.getMinOrZero(10, 4));
    }

    @Test
    public void testNegativeValuesEqual() {
        assertEquals(0, Main.getMinOrZero(-3, -3));
    }

    @Test
    public void testNegativeValuesFirstLess() {
        assertEquals(-5, Main.getMinOrZero(-5, -2));
    }

    @Test
    public void testNegativeValuesSecondLess() {
        assertEquals(-8, Main.getMinOrZero(-2, -8));
    }
}
