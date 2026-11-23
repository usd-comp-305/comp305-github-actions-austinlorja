package edu.sandiego.comp305;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {

    @Test
    void returnsReversedHello() {
        assertEquals("olleh", StringUtils.reverseString("hello"));
    }

    @Test
    void returnsEmptyString() {
        assertEquals("", StringUtils.reverseString(""));
    }

    @Test
    void returnsSingleCharacter() {
        assertEquals("a", StringUtils.reverseString("a"));
    }
}
