import java.util.Scanner;
public class ATM{
  Scanner scan = new Scanner(System.in);
  int accno = 111;
  int password = 2222;
  void verify() throws Exception{  //throws will stop the execution and will search for try and catch if not found then it will look for deafult exception
    System.out.println("Enter Account number:");
    int x = scan.nextInt();
    if(x==accno){
      System.out.println("Collect money");
    }
    else {
      InvalidInputException ie = new InvalidInputException();
      System.out.println(ie.getMessage());
      throw ie;
    }
  }
  public static void main(String[] args){
    ATM a = new ATM();
    try{
      a.verify();
    }
    catch(Exception e){
      e.printStackTrace(); //Traces the exception in the stack

    }
  }
}
