package stringAddCalculator;

<<<<<<< HEAD
public class StringAddCalc {

    public int addText(String text) {

        return 0;
=======
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalc {

    public int addString(String text) {
        if(isNotExistInput(text)) {
            return 0;
        }

        return add(split(text));
    }

    public boolean isNotExistInput(String text) {
        return text == null || text.isEmpty();
    }

    public int add(String[] strValues) {
        int result = 0;
        for(String strValue : strValues){
            result += isPositive(strValue);
        }
        return result;
    }

    public int isPositive(String strValue) {
        int num = parserInt(strValue);
        if(num < 0){
            throw new RuntimeException();
        }
        return num;
    }

    public int parserInt(String strValue) {
        return Integer.parseInt(strValue);
    }

    public String[] split(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        if (m.find()) {
            return customSplit(m, text);
        }

        return text.split(",|:");
    }

    public String[] customSplit(Matcher m, String text) {
        String customDelimiter = m.group(1);
        return m.group(2).split(customDelimiter);
>>>>>>> step3
    }
}
