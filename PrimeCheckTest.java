import static org.junit.Assert.*;
import org.junit.Test;

public class PrimeCheckTest {

    // Testing the isPrime method
    @Test
    public void testIsPrime() {
        assertTrue(PrimeCheck.isPrime(2));   // 2 is prime
        assertTrue(PrimeCheck.isPrime(3));   // 3 is prime
        assertTrue(PrimeCheck.isPrime(5));   // 5 is prime
        assertTrue(PrimeCheck.isPrime(7));   // 7 is prime
        assertFalse(PrimeCheck.isPrime(1));  // 1 is not prime
        assertFalse(PrimeCheck.isPrime(4));  // 4 is not prime
        assertFalse(PrimeCheck.isPrime(9));  // 9 is not prime
        assertFalse(PrimeCheck.isPrime(10)); // 10 is not prime
        assertTrue(PrimeCheck.isPrime(11));  // 11 is prime
        assertFalse(PrimeCheck.isPrime(-7)); // Negative numbers are not prime
    }

    @Test
    public void testIsPrimeLargeNumbers() {
        assertTrue(PrimeCheck.isPrime(7919)); // 7919 is prime
        assertFalse(PrimeCheck.isPrime(8000)); // 8000 is not prime
    }
}