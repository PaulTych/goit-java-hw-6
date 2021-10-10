public class PalindromeDetector {
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverse(word));
    }

    private String reverse(String word) {
        StringBuilder result = new StringBuilder(word);
        return result.reverse().toString();
    }
}
