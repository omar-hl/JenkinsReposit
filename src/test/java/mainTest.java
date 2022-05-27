import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class mainTest {
    @Test
    public void whenEmptyString_thenAccept() {
        main test1 = new main();
        assertTrue(test1.isPalindrome("madam"));
    }
}
