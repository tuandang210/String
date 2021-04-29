import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate11 {
    private static final String NAMECLASS_REGEX = "^[CAP]\\d{4}[GHIKLM]$";

    public static final String[] abc = new String[]{"C03.8G"};
    public static final String[] abc1 = new String[]{"M0318G"};

    public Validate11(){
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAMECLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public static void main(String[] args) {
         Validate11 validate11 = new Validate11();
        for (String x: abc){
            boolean isTrue = validate11.validate(x);
            System.out.println(x+isTrue);
        }

        for (String x: abc1){
            boolean isTrue = validate11.validate(x);
            System.out.println(x+isTrue);
        }
    }
}
