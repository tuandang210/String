import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

    RegularExpression() {
    }

    private static final String PHONENUMBER_REGEX = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";

    public static final String[] abc = new String[]{"(84)-(0978489648)"};
    public static final String[] abc1 = new String[]{"(a8)-(22222222)"};

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public static void main(String[] args) {
        RegularExpression regularExpression = new RegularExpression();
        for (String i : abc) {
            boolean isTrue = regularExpression.validate(i);
            System.out.println(i + isTrue);
        }

        for (String x : abc1) {
            boolean isTrue = regularExpression.validate(x);
            System.out.println(x + isTrue);
        }
    }
}
