package stringAddCalculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalcTest {
    private StringAddCalc carc;

    @Before
    public void setUp() throws Exception {
        carc = new StringAddCalc();
    }

<<<<<<< HEAD
    @Test
    public  void 리턴_0_NULL() {
        String str = "";
        int n = carc.StringToNumber(str);
        assertThat(n).isEqualTo(0);
    }

    @Test
    public  void 숫자하나입력() {
        String str = "1";
        int n = carc.StringToNumber(str);
        assertThat(n).isEqualTo(1);
    }

    @Test
    public void 구분자_쉼표or콜론_덧셈() {
        String str = "1,2:3";
        int n = carc.StringToNumber(str);
        assertThat(n).isEqualTo(6);
    }

    @Test
    public void 커스텀구분자() {
        String str = "//;\1;2;3";
        int n = carc.StringToNumber(str);
        assertThat(n).isEqualTo(6);
=======
    // 빈문자열 or NULL 일 경우 0 리턴
    // 숫자 하나를 입력할 경우 해당 숫자 반환
    // (,) 구분자의 경우 숫자 합 계산
    // (, || :) 구분자의 경우 숫자 합 계산
    // (//_\) //와 \사이에 있는 구분자의 경우 숫자 합 계산
    // 숫자 이외의 값 or 음수가 있을 경우 RuntimeException 예외 발생

    @Test
    public void 빈문자열_NULL_경우() {
        assertThat(carc.addString("")).isEqualTo(0);
        assertThat(carc.addString(null)).isEqualTo(0);
    }

    @Test
    public void 숫자하나_입력할경우() {
        assertThat(carc.addString("1")).isEqualTo(1);
    }

    @Test
    public void 쉼표_구분자의경우() {
        assertThat(carc.addString("1,2")).isEqualTo(3);
    }

    @Test
    public void 쉼표_콜론_구분자의경우() {
        assertThat(carc.addString("1,2:3")).isEqualTo(6);
    }

    @Test
    public void 커스텀_구분자의경우() {
        assertThat(carc.addString("//;\n1;2;3")).isEqualTo(6);
    }

    @Test(expected = RuntimeException.class)
    public void 숫자이외_음수의경우() throws Exception {
        carc.addString("-1,2:3");
>>>>>>> step3
    }
}
