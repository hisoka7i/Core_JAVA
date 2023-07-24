import java.util.regex.*;
public class ValidEmailAdd{
  public static void main(String[] args){
    Pattern pattern;
    Matcher matcher;
    private static final String email_pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,}))$";
    pattern = Pattern.compile(email_pattern);
    //matcher = pattern.matches()
    matcher = pattern.matcher("rohit7i@outlook.com");
    System.out.println(matcher.matches());
  }
}
