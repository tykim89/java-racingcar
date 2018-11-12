package stringAddCalculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ContainsTest {

    @Test
    public void contains() {
        assertThat(true).isEqualTo("1,2,3".contains(","));
        assertThat(true).isEqualTo("1:2,3;4".contains(","));
        assertThat(false).isEqualTo("1,2,3;4".contains(":"));
        assertThat(true).isEqualTo("//;\n1;2;3".contains("\n"));
    }
}
