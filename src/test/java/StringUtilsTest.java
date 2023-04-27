import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    public void shouldReturnFalseIfIsNotBlank() {
        char[] charArray = new char[]{'a', 'b', 'c'};
        boolean ifBlank = StringUtils.isBlank(charArray);
        assertFalse(ifBlank);
    }

    @Test
    public void shouldReturnTrueIfBlank() {
        char[] charArray = new char[]{};
        boolean ifBlank = StringUtils.isBlank(charArray);
        assertTrue(ifBlank);
    }

    @Test
    public void shouldReturnTrueIfContainsJustSpaces() {
        char[] charArray = new char[]{,
        };
        boolean ifBlank = StringUtils.isBlank(charArray);
        assertTrue(ifBlank);
    }


    @Test
    public void shouldBeRussian() {
        char[] charArray = new char[]{'а', 'б', 'в'};
        boolean isRussian = StringUtils.isRussian(charArray);
        assertTrue(isRussian);
    }

    @Test
    public void shouldReturnFalseIfNotRussian() {
        char[] charArray = new char[]{'c', '2', 'в'};
        boolean isRussian = StringUtils.isRussian(charArray);
        assertFalse(isRussian);
    }

    @Test
    public void shouldReturnTrueIfYoInputted() {
        char[] charArray = new char[]{'р', 'щ', 'ё'};
        boolean isRussian = StringUtils.isRussian(charArray);
        assertTrue(isRussian);
    }

    @Test
    public void shouldReturnTrueIfUpperCase() {
        char[] charArray = new char[]{'А', 'В', 'К'};
        boolean isRussian = StringUtils.isRussian(charArray);
        assertTrue(isRussian);
    }

    @Test
    public void shouldReturnTrueIfInTheBeginning() {
        char[] charArray = new char[]{'а', 'б', 'в'};
        char[] charArray2 = new char[]{'а', 'б'};
        boolean isContains = StringUtils.ifContains2(charArray2, charArray);
        assertTrue(isContains);
    }

    @Test
    public void shouldReturnTrueIfInTheMiddle() {
        char[] charArray = new char[]{'а', 'б', 'в', 'е'};
        char[] charArray2 = new char[]{'б', 'в'};
        boolean isContains = StringUtils.ifContains2(charArray2, charArray);
        assertTrue(isContains);
    }

    @Test
    public void shouldReturnFalseIfNotContains() {
        char[] charArray = new char[]{'а', 'б', 'в', 'е'};
        char[] charArray2 = new char[]{'h', 'в'};
        boolean isContains = StringUtils.ifContains2(charArray2, charArray);
        assertFalse(isContains);
    }


    @Test
    public void shouldParseIntoInt() {
        char[] charArray = new char[]{'3', '2', '1'};
        int expectedNum = StringUtils.parseInt(charArray);
        assertEquals(expectedNum, 321);
    }

    @Test
    public void shouldFailIfContainsNotOnlyNumbers() {
        char[] charArray = new char[]{'3', 'n', '1'};
        Assertions.assertThrows(IllegalArgumentException.class, () -> StringUtils.parseInt(charArray));
    }
    @Test
    public void should() {
        char[] charArray = new char[]{'3', '2', '1'};
        int expectedNum = StringUtils.parseInt(charArray);
        assertEquals(expectedNum, 321);
    }
}
