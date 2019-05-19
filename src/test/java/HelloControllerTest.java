import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {

    @Test
    public void rightTest() {
        Integer a = 1;
        Integer b = 2;
        assertEquals(a == b, false);
    }

    @Test
    public void wrongTest() {
        Integer a = 1;
        Integer b = 2;
        assertEquals(a == b, true);
    }
}