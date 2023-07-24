import java.util.regex.*;
class Example1{
  public static void main(String[] args){
    Pattern pattern = Pattern.compile(".xx.");
    Matcher matcher = pattern.matcher("AxxB");
    String s = "this is not it";
    //Pattern pattern = Pattern.compile("[a-z]");
    //Matcher matcher = pattern.matcher(s);
    System.out.println("String matches the given Regex:"+matcher.matches());
  }
}
