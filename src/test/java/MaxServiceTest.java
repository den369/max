import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaxServiceTest {

    @Test
    public void shouldFindMax() {
        MaxService servise = new MaxService();

        int a = 5;
        int b = 3;

        int expected = a;
        int actual = servise.max(a, b);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxIfB() {
        MaxService servise = new MaxService();

        int a = 3;
        int b = 5;

        int expected = b;
        int actual = servise.max(a, b);

        Assertions.assertEquals(expected, actual);
    }
}
