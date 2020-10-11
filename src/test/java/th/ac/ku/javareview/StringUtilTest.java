package th.ac.ku.javareview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    @Test
    void testIsPalindrome() {
        StringUtil stringUtil = new StringUtil();
        assertTrue(stringUtil.isPalindrome("noon"));
    }

    @Test
    void testIsNotPalindrome() {
        StringUtil stringUtil = new StringUtil();
        assertFalse(stringUtil.isPalindrome("cat"));
    }

    @Test
    void testIsPalindromeEmpty() {
        StringUtil stringUtil = new StringUtil();
        boolean result = stringUtil.isPalindrome("");
        assertTrue(result, "Empty string should be palindrome");
    }
}
