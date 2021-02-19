import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {
    String option;
    int firstEntry;
    int secondEntry;
    int resultOperation;

    @Test
    public void shouldReturn4WhileSumming1And3Test() {
        option = "soma";
        firstEntry = 1;
        secondEntry = 3;
        resultOperation = Main.operationChooser(option, firstEntry, secondEntry);

        assertThat(resultOperation).isEqualTo(4);
    }
}
