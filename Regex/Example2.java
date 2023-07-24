import java.util.regex.*;
class Example2{
  public static void main(String[] args){
    //Pattern pattern = Pttern.compile();
    System.out.println(Pattern.matches("[ayz]+", "aaaa"));
    String s = "This is not it";
    System.out.println(Pattern.matches("W", "This is not it"));
    System.out.println(Pattern.matches("d","444"));
  }
}
