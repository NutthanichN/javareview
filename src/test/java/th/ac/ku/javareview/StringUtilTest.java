package th.ac.ku.javareview;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilTest {

    StringUtil stringUtil;

    @BeforeEach
    void setup() {
        stringUtil = new StringUtil();
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtil.isPalindrome("noon"));
    }

    @Test
    void testIsNotPalindrome() {
        assertFalse(stringUtil.isPalindrome("cat"));
    }

    @Test
    void testIsPalindromeEmpty() {
        boolean result = stringUtil.isPalindrome("");
        assertTrue(result, "Empty string should be palindrome");
    }

    @Test
    void testHasLowerCase() {
        assertTrue(stringUtil.hasLowerCase("THis"));
    }

    @Test
    void testHasLowerCaseWithSpace() {
        assertTrue(stringUtil.hasLowerCase("THIS HAS Lowercase"));
    }

    @Test
    void testDoesNotHaveLowerCase() {
        assertFalse(stringUtil.hasLowerCase("LOWERCASE"));
    }

    @Test
    void testDoesNotHaveLowerCaseWithSpace() {
        assertFalse(stringUtil.hasLowerCase("NO LOWERCASE AT ALL"));
    }
}
