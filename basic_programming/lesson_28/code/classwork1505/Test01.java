package classwork1505;

import org.junit.jupiter.api.*;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Test01 {

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("This code executes before all tests!");
    }

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This code executes before each test!");
    }

    @Test
    @Disabled
    public void test() {
        System.out.println("test");
        assertTrue(2 > 1);
    }

    @Test
    @DisplayName("Test for null reference")
    public void testNull() {
        Random random = null;
        assertNull(random);
    }

    @Test
    public void concatenatingStringsResultIsOfCombinedLength() {
        String s1 = "111";
        String s2 = "2222";
        String res = s1 + s2;

        int expected = s1.length() + s2.length();
        int actual = res.length();
        assertEquals(expected, actual);

    }

    @Test
    public void indexOfReturnsRangedBetweenZeroAndLenMinusOne() {
        String s = "hello";
        for (int i = 0; i < s.length(); i++) {
            int v = s.indexOf(s.charAt(i));
            if (v < 0 || v >= s.length()) {
                fail();
            }
            if (v != i) {
                fail();
            }
        }
    }

    @Test
    public void testStrings() {
        String s = "";
        assumeTrue(s.length() != 0);
        s += "Hello";
        assertTrue(s.length() > 0);

    }

}
