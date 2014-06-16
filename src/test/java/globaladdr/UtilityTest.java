package globaladdr;

import static org.junit.Assert.assertEquals;
import globaladdr.util.Utility;

import org.junit.Test;

public class UtilityTest {
    @Test
    public void testPadString() {
        assertEquals(Utility.padString("abc", 6, '_', true), "___abc");
        assertEquals(Utility.padString("abc", 6, '*', false), "abc***");
        assertEquals(Utility.padString(null, 3, 'a', true), null);
        assertEquals(Utility.padString("", 4, '?', false), "????");
        assertEquals(Utility.padString("123.45", 1, '$', true), "123.45");
        assertEquals(Utility.padString("123.45", 7, '$', true), "$123.45");
    }

}
