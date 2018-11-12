package stringAddCalculator;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SplitTest {

    @Test
    public void split() {
        String[] values = "1".split(",");
        assertThat(values).isEqualTo(new String[] {"1"});

        values = "1,2".split(",");
        assertThat(values).isEqualTo(new String[] {"1", "2"});

        values = "1,2:3".split(",");
        assertThat(values).isEqualTo(new String[] {"1", "2:3"});

        values = "1,2:3".split(",|:");
        assertThat(values).isEqualTo(new String[] {"1", "2", "3"});
    }
}
