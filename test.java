import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FailingTest {

    @Test
    public void shouldFail() {
        assertTrue(false, "This test should fail");
    }
}
