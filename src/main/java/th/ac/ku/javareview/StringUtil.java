package th.ac.ku.javareview;

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
}
