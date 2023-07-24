import java.util.regex.*;
import java.util.Scanner;
class Example3{
  public static void main(String[] args){
    Pattern pattern = Pattern.compile("[a-g]*");
    Matcher matcher = pattern.matcher("this is not it");

    System.out.println(matcher.find());
  }
}
