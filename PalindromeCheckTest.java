import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeCheckTest {

    // Testing the isPalindrome method
    @Test
    public void testIsPalindrome() {
        assertTrue(PalindromeCheck.isPalindrome("A man a plan a canal Panama")); // Palindrome
        assertTrue(PalindromeCheck.isPalindrome("racecar")); // Palindrome
        assertTrue(PalindromeCheck.isPalindrome("madam")); // Palindrome
        assertFalse(PalindromeCheck.isPalindrome("hello")); // Not a palindrome
        assertFalse(PalindromeCheck.isPalindrome("Java")); // Not a palindrome
        assertTrue(PalindromeCheck.isPalindrome("")); // Empty string is a palindrome
        assertTrue(PalindromeCheck.isPalindrome("   ")); // Spaces only is a palindrome
    }
}