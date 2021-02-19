import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OperationTest {
    private Operation op;

    @BeforeEach
    public void setup() {
         op = new Operation();
    }

    @Test
    public void sumTest() {
        int resultSum = op.sum(3, 0);
        assertThat(resultSum).isEqualTo(3);
    }

    @Test
    public void subtractionTest() {
        int resultSub = op.subtraction(3, 1);
        assertThat(resultSub).isEqualTo(2);
    }
}
