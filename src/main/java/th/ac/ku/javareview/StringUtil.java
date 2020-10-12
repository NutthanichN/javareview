package th.ac.ku.javareview;

import static java.lang.Character.isLowerCase;

public class StringUtil {
    public boolean isPalindrome(String s) {
        int n = s.length();
        if (n == 0) return true;
        for (int i = 0; i < (n/2); i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean hasLowerCase(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (isLowerCase(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
